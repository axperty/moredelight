package com.axperty.moredelight.registry;

import net.minecraft.block.Block;
import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.TagKey;

import java.util.function.Supplier;

public enum MaterialRegistry implements ToolMaterial {

    // Wood Material
    WOOD_MATERIAL(3, 59, 8.0F, .7F, 10, () -> Ingredient.ofItems(Items.OAK_WOOD)),

    // Stone Material
    STONE_MATERIAL(3, 131, 8, 1.3F, 10, () -> Ingredient.ofItems(Items.COBBLESTONE));

    private final int miningLevel;
    private final int durability;
    private final float blockBreakSpeed;
    private final float attackDamage;
    private final int enchantability;
    private final Supplier<Ingredient> repairIngredient;

    MaterialRegistry(int miningLevel, int durability, float blockBreakSpeed, float attackDamage, int enchantability, Supplier repairIngredient) {
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

    //
    //
    // Careful with this one! Still needs some testing.
    //
    //
    @Override
    public TagKey<Block> getInverseTag() {
        return BlockTags.AIR;
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