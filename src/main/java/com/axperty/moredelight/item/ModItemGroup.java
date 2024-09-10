package com.axperty.moredelight.item;

import com.axperty.moredelight.MoreDelight;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup CREATIVE_MODE_TAB = FabricItemGroupBuilder.build(
            new Identifier(MoreDelight.MOD_ID, "title"), () -> new ItemStack(ItemRegistry.CHICKEN_SANDWICH_WITH_EGG_AND_TOMATO));
}
