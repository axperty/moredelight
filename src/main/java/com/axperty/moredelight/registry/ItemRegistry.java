package com.axperty.moredelight.registry;

import com.axperty.moredelight.MoreDelight;
import net.minecraft.component.type.ConsumableComponent;
import net.minecraft.component.type.ConsumableComponents;
import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.item.*;
import net.minecraft.item.consume.ApplyEffectsConsumeEffect;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;
import vectorwing.farmersdelight.common.item.ConsumableItem;
import vectorwing.farmersdelight.common.item.KnifeItem;
import vectorwing.farmersdelight.common.registry.ModEffects;

public class ItemRegistry {

    public static Item WOODEN_KNIFE = knife("wooden_knife", new KnifeItem(new Item.Settings().attributeModifiers(KnifeItem.createAttributes(MaterialRegistry.WOOD_MATERIAL, .5f, -1.8F))));

    public static Item STONE_KNIFE = knife("stone_knife", new KnifeItem(new Item.Settings().attributeModifiers(KnifeItem.createAttributes(MaterialRegistry.WOOD_MATERIAL, 1.1f, -1.8F))));

    public static Item DICED_POTATOES = consumable("diced_potatoes", 2, 0.4f, 64, null);

    public static Item CHOCOLATE_POPSICLE = consumable("chocolate_popsicle", 3, 0.2f, 64, null);

    public static Item OMELETTE = consumable("omelette", 6, 0.6f, 64, null);

    public static Item COOKED_RICE_WITH_CHICKEN_CUTS = consumableEffect("cooked_rice_with_chicken_cuts", 14, 0.8f, ModEffects.NOURISHMENT, 3600, 0, 16, Items.BOWL);

    public static Item COOKED_RICE_WITH_BEEF = consumableEffect("cooked_rice_with_beef", 14, 0.8f, ModEffects.NOURISHMENT, 3600, 0, 16, Items.BOWL);

    public static Item COOKED_RICE_WITH_PORKCHOP = consumableEffect("cooked_rice_with_porkchop", 14, 0.8f, ModEffects.NOURISHMENT, 3600, 0, 16, Items.BOWL);

    public static Item CREAMY_PASTA_WITH_HAM = consumableEffect("creamy_pasta_with_ham", 12, 0.8f, ModEffects.NOURISHMENT, 3600, 0, 16, Items.BOWL);

    public static Item CREAMY_PASTA_WITH_CHICKEN_CUTS = consumableEffect("creamy_pasta_with_chicken_cuts", 12, 0.8f, ModEffects.NOURISHMENT, 3600, 0, 16, Items.BOWL);

    public static Item MASHED_POTATOES = consumable("mashed_potatoes", 12, 0.8f, 16, Items.BOWL);

    public static Item DICED_POTATOES_WITH_CHICKEN_CUTS = consumable("diced_potatoes_with_chicken_cuts", 10, 0.8f, 16, Items.BOWL);

    public static Item DICED_POTATOES_WITH_BEEF = consumable("diced_potatoes_with_beef", 10, 0.8f, 16, Items.BOWL);

    public static Item DICED_POTATOES_WITH_PORKCHOP = consumable("diced_potatoes_with_porkchop", 10, 0.8f, 16, Items.BOWL);

    public static Item DICED_POTATOES_WITH_EGG_AND_TOMATO = consumable("diced_potatoes_with_egg_and_tomato", 10, 0.8f, 16, Items.BOWL);

    public static Item POTATO_SALAD = consumableEffect("potato_salad", 6, 0.6f, StatusEffects.REGENERATION, 100, 0, 16, Items.BOWL);

    public static Item CHICKEN_SALAD = consumableEffect("chicken_salad", 6, 0.6f, StatusEffects.REGENERATION, 100, 0, 16, Items.BOWL);

    public static Item CARROT_SOUP = consumableEffect("carrot_soup", 12, 0.8f, ModEffects.COMFORT, 3600, 0, 16, Items.BOWL);

    public static Item SIMPLE_HAMBURGER = consumable("simple_hamburger", 8, 0.8f, 64, null);

    public static Item HAMBURGER_WITH_CHEESE = consumable("hamburger_with_cheese", 9, 0.8f, 64, null);

    public static Item HAMBURGER_WITH_EGG = consumable("hamburger_with_egg", 9, 0.8f, 64, null);

    public static Item LOADED_HAMBURGER = consumable("loaded_hamburger", 13, 0.8f, 64, null);

    public static Item CHICKEN_SANDWICH_WITH_EGG_AND_TOMATO = consumable("chicken_sandwich_with_egg_and_tomato", 11, 0.8f, 64, null);

    public static Item STEAK_SANDWICH = consumable("steak_sandwich", 10, 0.8f, 64, null);

    public static Item PORKCHOP_SANDWICH = consumable("porkchop_sandwich", 10, 0.8f, 64, null);

    public static Item EGG_WITH_BACON_SANDWICH = consumable("egg_with_bacon_sandwich", 11, 0.8f, 64, null);

    public static Item TOMATO_SANDWICH = consumable("tomato_sandwich", 7, 0.8f, 64, null);

    public static Item BREAD_SLICE = consumable("bread_slice", 2, 0.4f, 64, null);

    public static Item TOAST = consumable("toast", 3, 0.4f, 64, null);

    public static Item TOAST_WITH_EGG = consumable("toast_with_egg", 5, 0.6f, 64, null);

    public static Item TOAST_WITH_HONEY = consumable("toast_with_honey", 5, 0.6f, 64, null);

    public static Item TOAST_WITH_SWEET_BERRIES = consumable("toast_with_sweet_berries", 5, 0.6f, 64, null);

    // Nutritious Feast
    public static Item TOAST_WITH_BLUEBERRIES = consumable("toast_with_blueberries", 5, 0.6f, 64, null);

    public static Item TOAST_WITH_GLOW_BERRIES = consumable("toast_with_glow_berries", 5, 0.6f, 64, null);

    public static Item TOAST_WITH_CHOCOLATE = consumable("toast_with_chocolate", 5, 0.6f, 64, null);

    // Expanded Delight and Casualness Delight
    public static Item TOAST_WITH_CHEESE = consumable("toast_with_cheese", 5, 0.6f, 64, null);

    // Expanded Delight
    public static Item TOAST_WITH_PEANUT_BUTTER = consumable("toast_with_peanut_butter", 5, 0.6f, 64, null);

    private static Item knife(String name, KnifeItem knifeItem) {
        Item item = Registry.register(Registries.ITEM, Identifier.of(MoreDelight.MOD_ID, name), knifeItem);
        return item;
    }

    private static Item consumable(String name, int nutrition, float saturation, int maxCount, Item remainder) {
        Item item = Registry.register(Registries.ITEM, Identifier.of(MoreDelight.MOD_ID, name),
                new ConsumableItem(new Item.Settings()
                        .recipeRemainder(remainder)
                        .maxCount(maxCount)
                        .food(new FoodComponent.Builder()
                                .nutrition(nutrition)
                                .saturationModifier(saturation)
                                .build()),
                        false, false));
        return item;
    }

    private static Item consumableEffect(
            String name,
            int nutrition,
            float saturation,
            RegistryEntry<StatusEffect> effect,
            int duration,
            int amplifier,
            int maxCount,
            Item remainder
    ) {
        FoodComponent food = new FoodComponent.Builder()
                .nutrition(nutrition)
                .saturationModifier(saturation)
                .build();

        ConsumableComponent consumable = ConsumableComponents.food()
                .consumeEffect(
                        new ApplyEffectsConsumeEffect(
                                new StatusEffectInstance(effect, duration, amplifier),
                                1.0f
                        )
                )
                .build();

        Item item = Registry.register(
                Registries.ITEM,
                Identifier.of(MoreDelight.MOD_ID, name),
                new ConsumableItem(
                        new Item.Settings()
                                .recipeRemainder(remainder)
                                .maxCount(maxCount)
                                .food(food, consumable),
                        true,
                        false
                )
        );
        return item;
    }


    public static void registerItems() {
    }
}