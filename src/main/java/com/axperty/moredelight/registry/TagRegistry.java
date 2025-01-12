package com.axperty.moredelight.registry;

import com.axperty.moredelight.MoreDelight;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;

public class TagRegistry {
    public static final TagKey<Block> NEEDS_EXAMPLE_TOOL = tag("needs_example_tool");

    private static TagKey<Block> tag(String name) {
        return BlockTags.create(new ResourceLocation(MoreDelight.MODID, name));
    }
}
