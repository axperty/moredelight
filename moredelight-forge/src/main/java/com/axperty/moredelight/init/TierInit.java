package com.axperty.moredelight.init;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class TierInit {
    public static final ForgeTier WOOD = new ForgeTier(
            4,
            59,
            1,
            0.7f,
            10,
            TagInit.NEEDS_EXAMPLE_TOOL,
            () -> Ingredient.of(ItemInit.WOODEN_KNIFE::get)
    );

    public static final ForgeTier STONE = new ForgeTier(
            3,
            131,
            1,
            1.3f,
            10,
            TagInit.NEEDS_EXAMPLE_TOOL,
            () -> Ingredient.of(ItemInit.STONE_KNIFE::get)
    );
}
