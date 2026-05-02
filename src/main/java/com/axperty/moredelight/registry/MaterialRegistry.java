package com.axperty.moredelight.registry;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;

public class MaterialRegistry {

    public static final ToolMaterial WOOD_MATERIAL = new ToolMaterial(
            BlockTags.INCORRECT_FOR_STONE_TOOL, // inverse tag
            59,                                  // durability
            8.0F,                                // mining speed
            .7F,                                // attack damage bonus
            10,                                  // enchantability
            ItemTags.WOODEN_TOOL_MATERIALS       // repair item tag
    );

    public static final ToolMaterial STONE_MATERIAL = new ToolMaterial(
            BlockTags.INCORRECT_FOR_WOODEN_TOOL,
            131,
            8.0F,
            1.3F,
            10,
            ItemTags.STONE_TOOL_MATERIALS
    );
}
