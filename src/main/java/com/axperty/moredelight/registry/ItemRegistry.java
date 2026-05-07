package com.axperty.moredelight.registry;

import java.util.Collections;

import com.axperty.moredelight.MoreDelight;

import net.minecraft.core.component.DataComponents;
import net.minecraft.world.item.component.Consumable;
import net.minecraft.world.item.component.Consumables;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.component.Tool;
import net.minecraft.world.item.component.Weapon;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.consume_effects.ApplyStatusEffectsConsumeEffect;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.Holder;
import net.minecraft.resources.Identifier;
import vectorwing.farmersdelight.common.item.ConsumableItem;
import vectorwing.farmersdelight.common.item.KnifeItem;
import vectorwing.farmersdelight.common.registry.ModEffects;

public class ItemRegistry {

    public static Item WOODEN_KNIFE;
    public static Item STONE_KNIFE;
    public static Item DICED_POTATOES;
    public static Item CHOCOLATE_POPSICLE;
    public static Item OMELETTE;
    public static Item COOKED_RICE_WITH_CHICKEN_CUTS;
    public static Item COOKED_RICE_WITH_BEEF;
    public static Item COOKED_RICE_WITH_PORKCHOP;
    public static Item CREAMY_PASTA_WITH_HAM;
    public static Item CREAMY_PASTA_WITH_CHICKEN_CUTS;
    public static Item MASHED_POTATOES;
    public static Item DICED_POTATOES_WITH_CHICKEN_CUTS;
    public static Item DICED_POTATOES_WITH_BEEF;
    public static Item DICED_POTATOES_WITH_PORKCHOP;
    public static Item DICED_POTATOES_WITH_EGG_AND_TOMATO;
    public static Item POTATO_SALAD;
    public static Item CHICKEN_SALAD;
    public static Item CARROT_SOUP;
    public static Item SIMPLE_HAMBURGER;
    public static Item HAMBURGER_WITH_CHEESE;
    public static Item HAMBURGER_WITH_EGG;
    public static Item LOADED_HAMBURGER;
    public static Item CHICKEN_SANDWICH_WITH_EGG_AND_TOMATO;
    public static Item STEAK_SANDWICH;
    public static Item PORKCHOP_SANDWICH;
    public static Item EGG_WITH_BACON_SANDWICH;
    public static Item TOMATO_SANDWICH;
    public static Item BREAD_SLICE;
    public static Item TOAST;
    public static Item TOAST_WITH_EGG;
    public static Item TOAST_WITH_HONEY;
    public static Item TOAST_WITH_SWEET_BERRIES;
    public static Item TOAST_WITH_BLUEBERRIES;
    public static Item TOAST_WITH_GLOW_BERRIES;
    public static Item TOAST_WITH_CHOCOLATE;
    public static Item TOAST_WITH_CHEESE;
    public static Item TOAST_WITH_PEANUT_BUTTER;


    private static Item knife(String name, ToolMaterial material, float attackDamage, float attackSpeed) {
        Identifier id = Identifier.fromNamespaceAndPath(MoreDelight.MOD_ID, name);
        ResourceKey<Item> key = ResourceKey.create(Registries.ITEM, id);

        Item.Properties settings = new Item.Properties()
                .attributes(KnifeItem.createAttributes(material, attackDamage, attackSpeed))
                .durability(material.durability())
                .stacksTo(1)
                .setId(key)
                .component(DataComponents.TOOL, new Tool(Collections.emptyList(), 1.0F, 1, true))
                .component(DataComponents.WEAPON, new Weapon(1));

        Item item = new KnifeItem(settings);
        return Registry.register(BuiltInRegistries.ITEM, key, item);
    }

    private static Item consumable(String name, int nutrition, float saturation, int maxCount, Item remainder) {
        Identifier id = Identifier.fromNamespaceAndPath(MoreDelight.MOD_ID, name);
        ResourceKey<Item> key = ResourceKey.create(Registries.ITEM, id);

        FoodProperties foodComponent = new FoodProperties.Builder()
                .nutrition(nutrition)
                .saturationModifier(saturation)
                .build();

        Item.Properties settings = new Item.Properties()
                .stacksTo(maxCount)
                .food(foodComponent)
                .setId(key);

        if (remainder != null) {
            settings.craftRemainder(remainder);
        }

        Item item = new ConsumableItem(settings, false, false);
        return Registry.register(BuiltInRegistries.ITEM, key, item);
    }

    private static Item consumableEffect(String name, int nutrition, float saturation, Holder<MobEffect> effect, int duration, int amplifier, int maxCount, Item remainder) {
        Identifier id = Identifier.fromNamespaceAndPath(MoreDelight.MOD_ID, name);
        ResourceKey<Item> key = ResourceKey.create(Registries.ITEM, id);

        FoodProperties foodComponent = new FoodProperties.Builder()
                .nutrition(nutrition)
                .saturationModifier(saturation)
                .build();

        Consumable consumableComponent = Consumables.defaultFood()
                .onConsume(
                        new ApplyStatusEffectsConsumeEffect(
                                new MobEffectInstance(effect, duration, amplifier),
                                1.0f
                        )
                )
                .build();

        Item.Properties settings = new Item.Properties()
                .stacksTo(maxCount)
                .food(foodComponent, consumableComponent)
                .setId(key);

        if (remainder != null) {
            settings.craftRemainder(remainder);
        }

        Item item = new ConsumableItem(settings, true, false);
        return Registry.register(BuiltInRegistries.ITEM, key, item);
    }

    public static void registerItems() {
        WOODEN_KNIFE = knife("wooden_knife", MaterialRegistry.WOOD_MATERIAL, 0.5f, -2.0F);
        STONE_KNIFE = knife("stone_knife", MaterialRegistry.STONE_MATERIAL, 0.5f, -2.0F);

        DICED_POTATOES = consumable("diced_potatoes", 2, 0.4f, 64, null);
        CHOCOLATE_POPSICLE = consumable("chocolate_popsicle", 3, 0.2f, 64, null);
        OMELETTE = consumable("omelette", 6, 0.6f, 64, null);

        COOKED_RICE_WITH_CHICKEN_CUTS = consumableEffect("cooked_rice_with_chicken_cuts", 14, 0.8f, ModEffects.NOURISHMENT, 3600, 0, 16, Items.BOWL);
        COOKED_RICE_WITH_BEEF = consumableEffect("cooked_rice_with_beef", 14, 0.8f, ModEffects.NOURISHMENT, 3600, 0, 16, Items.BOWL);
        COOKED_RICE_WITH_PORKCHOP = consumableEffect("cooked_rice_with_porkchop", 14, 0.8f, ModEffects.NOURISHMENT, 3600, 0, 16, Items.BOWL);
        CREAMY_PASTA_WITH_HAM = consumableEffect("creamy_pasta_with_ham", 12, 0.8f, ModEffects.NOURISHMENT, 3600, 0, 16, Items.BOWL);
        CREAMY_PASTA_WITH_CHICKEN_CUTS = consumableEffect("creamy_pasta_with_chicken_cuts", 12, 0.8f, ModEffects.NOURISHMENT, 3600, 0, 16, Items.BOWL);
        POTATO_SALAD = consumableEffect("potato_salad", 6, 0.6f, MobEffects.REGENERATION, 100, 0, 16, Items.BOWL);
        CHICKEN_SALAD = consumableEffect("chicken_salad", 6, 0.6f, MobEffects.REGENERATION, 100, 0, 16, Items.BOWL);
        CARROT_SOUP = consumableEffect("carrot_soup", 12, 0.8f, ModEffects.NOURISHMENT, 3600, 0, 16, Items.BOWL);

        MASHED_POTATOES = consumable("mashed_potatoes", 12, 0.8f, 16, Items.BOWL);
        DICED_POTATOES_WITH_CHICKEN_CUTS = consumable("diced_potatoes_with_chicken_cuts", 10, 0.8f, 16, Items.BOWL);
        DICED_POTATOES_WITH_BEEF = consumable("diced_potatoes_with_beef", 10, 0.8f, 16, Items.BOWL);
        DICED_POTATOES_WITH_PORKCHOP = consumable("diced_potatoes_with_porkchop", 10, 0.8f, 16, Items.BOWL);
        DICED_POTATOES_WITH_EGG_AND_TOMATO = consumable("diced_potatoes_with_egg_and_tomato", 10, 0.8f, 16, Items.BOWL);

        SIMPLE_HAMBURGER = consumable("simple_hamburger", 8, 0.8f, 64, null);
        HAMBURGER_WITH_CHEESE = consumable("hamburger_with_cheese", 9, 0.8f, 64, null);
        HAMBURGER_WITH_EGG = consumable("hamburger_with_egg", 9, 0.8f, 64, null);
        LOADED_HAMBURGER = consumable("loaded_hamburger", 13, 0.8f, 64, null);
        CHICKEN_SANDWICH_WITH_EGG_AND_TOMATO = consumable("chicken_sandwich_with_egg_and_tomato", 11, 0.8f, 64, null);
        STEAK_SANDWICH = consumable("steak_sandwich", 10, 0.8f, 64, null);
        PORKCHOP_SANDWICH = consumable("porkchop_sandwich", 10, 0.8f, 64, null);
        EGG_WITH_BACON_SANDWICH = consumable("egg_with_bacon_sandwich", 11, 0.8f, 64, null);
        TOMATO_SANDWICH = consumable("tomato_sandwich", 7, 0.8f, 64, null);

        BREAD_SLICE = consumable("bread_slice", 2, 0.4f, 64, null);
        TOAST = consumable("toast", 3, 0.4f, 64, null);
        TOAST_WITH_EGG = consumable("toast_with_egg", 5, 0.6f, 64, null);
        TOAST_WITH_HONEY = consumable("toast_with_honey", 5, 0.6f, 64, null);
        TOAST_WITH_SWEET_BERRIES = consumable("toast_with_sweet_berries", 5, 0.6f, 64, null);
        TOAST_WITH_BLUEBERRIES = consumable("toast_with_blueberries", 5, 0.6f, 64, null);
        TOAST_WITH_GLOW_BERRIES = consumable("toast_with_glow_berries", 5, 0.6f, 64, null);
        TOAST_WITH_CHOCOLATE = consumable("toast_with_chocolate", 5, 0.6f, 64, null);
        TOAST_WITH_CHEESE = consumable("toast_with_cheese", 5, 0.6f, 64, null);
        TOAST_WITH_PEANUT_BUTTER = consumable("toast_with_peanut_butter", 5, 0.6f, 64, null);
    }
}