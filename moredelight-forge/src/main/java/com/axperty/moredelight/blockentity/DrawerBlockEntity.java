package com.axperty.moredelight.blockentity;

import com.axperty.moredelight.MoreDelight;
import com.axperty.moredelight.block.DrawerBlock;
import com.axperty.moredelight.init.BlockEntityInit;
import com.axperty.moredelight.menu.DrawerMenu;
import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.world.MenuProvider;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.ForgeCapabilities;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.items.ItemStackHandler;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class DrawerBlockEntity extends BlockEntity implements MenuProvider {

    private static final Component TITLE =
            Component.translatable("container." + MoreDelight.MODID + ".drawer_block");

    private final ItemStackHandler inventory = new ItemStackHandler(27) {
        @Override
        protected void onContentsChanged(int slot) {
            super.onContentsChanged(slot);
            DrawerBlockEntity.this.setChanged();
        }
    };

    private final LazyOptional<ItemStackHandler> optional = LazyOptional.of(() -> this.inventory);

    public DrawerBlockEntity(BlockPos pos, BlockState state) {
        super(BlockEntityInit.DRAWER_BLOCK_ENTITY.get(), pos, state);
    }

    @Override
    public CompoundTag getUpdateTag() {
        CompoundTag tag = super.getUpdateTag();
        return tag;
    }

    @Override
    public void load(@NotNull CompoundTag nbt) {
        super.load(nbt);
        CompoundTag moredelightData = nbt.getCompound(MoreDelight.MODID);
        this.inventory.deserializeNBT(moredelightData.getCompound("DrawerInventory"));
    }

    @Override
    protected void saveAdditional(@NotNull CompoundTag nbt) {
        super.saveAdditional(nbt);
        var moredelightData = new CompoundTag();
        moredelightData.put("DrawerInventory", this.inventory.serializeNBT());
        nbt.put(MoreDelight.MODID, moredelightData);
    }

    public void updateBlockState(boolean open) {
        DrawerBlock.setOpenState(level, worldPosition, level.getBlockState(worldPosition), open);
    }

    @Override
    public @NotNull <T> LazyOptional<T> getCapability(@NotNull Capability<T> cap) {
        return cap == ForgeCapabilities.ITEM_HANDLER ? this.optional.cast() : super.getCapability(cap);
    }

    @Override
    public void invalidateCaps() {
        super.invalidateCaps();
        this.optional.invalidate();
    }

    public LazyOptional<ItemStackHandler> getOptional() {
        return this.optional;
    }

    public ItemStackHandler getInventory() {
        return this.inventory;
    }

    @Override
    public @NotNull Component getDisplayName() {
        return TITLE;
    }

    @Nullable
    @Override
    public AbstractContainerMenu createMenu(int pContainerId, @NotNull Inventory pPlayerInventory, Player pPlayer) {
        updateBlockState(false);
        return new DrawerMenu(pContainerId, pPlayerInventory, this);
    }
}