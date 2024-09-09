package com.axperty.moredelight.item;

import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

import java.util.function.Supplier;

public enum ModMaterials implements ToolMaterial {

    WOOD_MATERIAL(3, 59, 8.0F, .7F, 10,
            () -> Ingredient.ofItems(Items.CHERRY_PLANKS, Items.BIRCH_PLANKS, Items.BAMBOO_PLANKS, Items.ACACIA_PLANKS, Items.CRIMSON_PLANKS, Items.DARK_OAK_PLANKS, Items.JUNGLE_PLANKS, Items.MANGROVE_PLANKS, Items.OAK_PLANKS, Items.SPRUCE_PLANKS, Items.WARPED_PLANKS)),

    STONE_MATERIAL(3, 131, 8, 1.3F, 10,
            () -> Ingredient.ofItems(Items.COBBLESTONE, Items.BLACKSTONE, Items.COBBLED_DEEPSLATE));

    private final int miningLevel;
    private final int durability;
    private final float blockBreakSpeed;
    private final float attackDamage;
    private final int enchantability;
    private final Supplier<Ingredient> repairIngredient;

    ModMaterials(int miningLevel, int durability, float blockBreakSpeed, float attackDamage, int enchantability, Supplier repairIngredient) {
        this.miningLevel = miningLevel;
        this.durability = durability;
        this.blockBreakSpeed = blockBreakSpeed;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairIngredient = repairIngredient;
    }

    public int getDurability() {
        return this.durability;
    }

    public float getMiningSpeedMultiplier() {
        return this.blockBreakSpeed;
    }

    public float getAttackDamage() {
        return this.attackDamage;
    }

    public int getMiningLevel() {
        return this.miningLevel;
    }

    public int getEnchantability() {
        return this.enchantability;
    }

    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }
}