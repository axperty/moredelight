package com.axperty.moredelight.item;

import com.axperty.moredelight.MoreDelight;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.versions.forge.ForgeVersion;

public class ModTags {
    public static TagKey<Block> NEEDS_EXAMPLE_TOOL;
    public static TagKey<Item> BREAD_SLICES;
    public static TagKey<Item> BREAD_SLICES_WHEAT;

    public static void register() {
        NEEDS_EXAMPLE_TOOL = blockTag("needs_example_tool");
        BREAD_SLICES = itemTag(ForgeVersion.MOD_ID, "bread_slices");
        BREAD_SLICES_WHEAT = itemTag(ForgeVersion.MOD_ID, "bread_slices/wheat");
    }

    private static TagKey<Block> blockTag(String name) {
        return BlockTags.create(new ResourceLocation(MoreDelight.MOD_ID, name));
    }

    private static TagKey<Item> itemTag(String modId, String path) {
        return TagKey.create(Registry.ITEM_REGISTRY, new ResourceLocation(modId, path));
    }
}