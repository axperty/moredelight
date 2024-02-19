package com.axperty.moredelight.client.screen;

import com.axperty.moredelight.MoreDelight;
import com.axperty.moredelight.menu.DrawerMenu;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.player.Inventory;
import org.jetbrains.annotations.NotNull;

public class DrawerMenuScreen extends AbstractContainerScreen<DrawerMenu> {
    private static final ResourceLocation TEXTURE =
            new ResourceLocation(MoreDelight.MODID, "textures/gui/drawer.png");

    public DrawerMenuScreen(DrawerMenu menu, Inventory playerInv, Component title) {
        super(menu, playerInv, title);

        this.imageWidth = 176;
        this.imageHeight = 166;
    }

    @Override
    protected void renderBg(@NotNull GuiGraphics guiGraphics, float partialTicks, int mouseX, int mouseY) {
        renderBackground(guiGraphics);
        guiGraphics.blit(TEXTURE, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight);
    }

    @Override
    public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
        super.render(guiGraphics, mouseX, mouseY, partialTicks);
        renderTooltip(guiGraphics, mouseX, mouseY);
    }
}