package com.axperty.moredelight.item;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class ModMaterials {
    public static final ForgeTier WOOD = new ForgeTier(
            4,
            59,
            1.4f,
            1.2f,
            10,
            ModTags.NEEDS_EXAMPLE_TOOL,
            () -> Ingredient.of(Items.CHERRY_PLANKS, Items.BIRCH_PLANKS, Items.BAMBOO_PLANKS, Items.ACACIA_PLANKS, Items.CRIMSON_PLANKS, Items.DARK_OAK_PLANKS, Items.JUNGLE_PLANKS, Items.MANGROVE_PLANKS, Items.OAK_PLANKS, Items.SPRUCE_PLANKS, Items.WARPED_PLANKS)
    );

    public static final ForgeTier STONE = new ForgeTier(
            3,
            131,
            1.4f,
            1.8f,
            10,
            ModTags.NEEDS_EXAMPLE_TOOL,
            () -> Ingredient.of(Items.COBBLESTONE, Items.BLACKSTONE, Items.COBBLED_DEEPSLATE)
    );
}
