package com.axperty.moredelight.menu;

import com.axperty.moredelight.blockentity.DrawerBlockEntity;
import com.axperty.moredelight.init.BlockInit;
import com.axperty.moredelight.init.MenuInit;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.ContainerLevelAccess;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraftforge.items.SlotItemHandler;
import org.jetbrains.annotations.NotNull;

public class DrawerMenu extends AbstractContainerMenu {
    private final DrawerBlockEntity blockEntity;
    private final ContainerLevelAccess levelAccess;
    private boolean menuOpen;

    public DrawerMenu(int containerId, Inventory playerInv, FriendlyByteBuf additionalData) {
        this(containerId, playerInv, playerInv.player.level().getBlockEntity(additionalData.readBlockPos()));
        this.menuOpen = true;
    }

    public DrawerMenu(int containerId, Inventory playerInv, BlockEntity blockEntity) {
        super(MenuInit.DRAWER_MENU.get(), containerId);
        if(blockEntity instanceof DrawerBlockEntity be) {
            this.blockEntity = be;
        } else {
            throw new IllegalStateException("nothing to see here"
                    .formatted(blockEntity.getClass().getCanonicalName()));
        }

        this.levelAccess = ContainerLevelAccess.create(blockEntity.getLevel(), blockEntity.getBlockPos());
        this.menuOpen = true;

        createPlayerHotbar(playerInv);
        createPlayerInventory(playerInv);
        createBlockEntityInventory(be);
    }

    @Override
    public void removed(Player player) {
        super.removed(player);
        if (menuOpen) {
            menuOpen = false;
            blockEntity.updateBlockState(false);
            blockEntity.getLevel().playSound(
                    null,
                    blockEntity.getBlockPos(),
                    SoundEvents.WOODEN_TRAPDOOR_CLOSE,
                    SoundSource.BLOCKS,
                    1.0F,
                    1.0F
            );
        }
    }

    private void createBlockEntityInventory(DrawerBlockEntity be) {
        be.getOptional().ifPresent(inventory -> {
            for (int row = 0; row < 3; row++) {
                for (int column = 0; column < 9; column++) {
                    addSlot(new SlotItemHandler(inventory,
                            column + (row * 9),
                            8 + (column * 18),
                            18 + (row * 18)));
                }
            }
        });
    }

    private void createPlayerInventory(Inventory playerInv) {
        for (int row = 0; row < 3; row++) {
            for (int column = 0; column < 9; column++) {
                addSlot(new Slot(playerInv,
                        9 + column + (row * 9),
                        8 + (column * 18),
                        84 + (row * 18)));
            }
        }
    }

    private void createPlayerHotbar(Inventory playerInv) {
        for (int column = 0; column < 9; column++) {
            addSlot(new Slot(playerInv,
                    column,
                    8 + (column * 18),
                    142));
        }
    }

    @Override
    public @NotNull ItemStack quickMoveStack(@NotNull Player pPlayer, int pIndex) {
        Slot fromSlot = getSlot(pIndex);
        ItemStack fromStack = fromSlot.getItem();

        if(fromStack.getCount() <= 0)
            fromSlot.set(ItemStack.EMPTY);

        if(!fromSlot.hasItem())
            return ItemStack.EMPTY;

        ItemStack copyFromStack = fromStack.copy();

        if(pIndex < 36) {
            if(!moveItemStackTo(fromStack, 36, 63, false))
                return ItemStack.EMPTY;
        } else if (pIndex < 63) {
            if(!moveItemStackTo(fromStack, 0, 36, false))
                return ItemStack.EMPTY;
        } else {
            System.err.println("Invalid slot index: " + pIndex);
            return ItemStack.EMPTY;
        }

        fromSlot.setChanged();
        fromSlot.onTake(pPlayer, fromStack);

        return copyFromStack;
    }

    @Override
    public boolean stillValid(@NotNull Player pPlayer) {
        return stillValid(this.levelAccess, pPlayer, BlockInit.DRAWER_BLOCK.get());
    }
}
