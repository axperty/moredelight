package com.axperty.moredelight.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class ModTiers {
    public static final ForgeTier WOOD = new ForgeTier(
            4,
            59,
            1,
            0.7f,
            10,
            ModTags.NEEDS_EXAMPLE_TOOL,
            () -> Ingredient.of(ModItems.WOODEN_KNIFE::get)
    );

    public static final ForgeTier STONE = new ForgeTier(
            3,
            131,
            1,
            1.3f,
            10,
            ModTags.NEEDS_EXAMPLE_TOOL,
            () -> Ingredient.of(ModItems.STONE_KNIFE::get)
    );
}