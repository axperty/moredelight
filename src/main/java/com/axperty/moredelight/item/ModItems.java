package com.axperty.moredelight.item;

import com.axperty.moredelight.MoreDelight;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import vectorwing.farmersdelight.common.FoodValues;
import vectorwing.farmersdelight.common.item.ConsumableItem;
import vectorwing.farmersdelight.common.item.KnifeItem;
import vectorwing.farmersdelight.common.registry.ModEffects;

import static vectorwing.farmersdelight.common.registry.ModItems.bowlFoodItem;
import static vectorwing.farmersdelight.common.registry.ModItems.foodItem;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MoreDelight.MOD_ID);

    public static final DeferredItem<Item> WOODEN_KNIFE = ITEMS.register("wooden_knife",
            () -> new KnifeItem(
                    ModMaterials.WOOD,
                    new Item.Properties()
                            .attributes(KnifeItem.createAttributes(
                                    ModMaterials.WOOD,
                                    0,
                                    -1.8F
                            ))));

    public static final DeferredItem<Item> STONE_KNIFE = ITEMS.register("stone_knife",
            () -> new KnifeItem(
                    ModMaterials.STONE,
                    new Item.Properties()
                            .attributes(KnifeItem.createAttributes(
                                    ModMaterials.STONE,
                                    0,
                                    -1.8F
                            ))));

    public static final DeferredItem<Item> DICED_POTATOES = ITEMS.register("diced_potatoes",
            () -> new ConsumableItem(foodItem((new FoodProperties.Builder())
                    .nutrition(1)
                    .saturationModifier(0.3f)
                    .fast()
                    .build())));

    public static final DeferredItem<Item> OMELETTE = ITEMS.register("omelette",
            () -> new ConsumableItem(foodItem((new FoodProperties.Builder())
                    .nutrition(6)
                    .saturationModifier(0.5f)
                    .build())));

    public static final DeferredItem<Item> COOKED_RICE_WITH_MILK_CREAM_AND_CHICKEN_CUTS = ITEMS.register("cooked_rice_with_milk_cream_and_chicken_cuts",
            () -> new ConsumableItem(bowlFoodItem((new FoodProperties.Builder())
                    .nutrition(10)
                    .saturationModifier(0.75f)
                    .effect(() -> new MobEffectInstance(ModEffects.COMFORT, FoodValues.SHORT_DURATION, 0), 1.0F)
                    .build()), true));

    public static final DeferredItem<Item> COOKED_RICE_WITH_MILK_CREAM_AND_BEEF = ITEMS.register("cooked_rice_with_milk_cream_and_beef",
            () -> new ConsumableItem(bowlFoodItem((new FoodProperties.Builder())
                    .nutrition(10)
                    .saturationModifier(0.75f)
                    .effect(() -> new MobEffectInstance(ModEffects.COMFORT, FoodValues.SHORT_DURATION, 0), 1.0F)
                    .build()), true));

    public static final DeferredItem<Item> COOKED_RICE_WITH_MILK_CREAM_AND_PORKCHOP = ITEMS.register("cooked_rice_with_milk_cream_and_porkchop",
            () -> new ConsumableItem(bowlFoodItem((new FoodProperties.Builder())
                    .nutrition(10)
                    .saturationModifier(0.75f)
                    .effect(() -> new MobEffectInstance(ModEffects.COMFORT, FoodValues.SHORT_DURATION, 0), 1.0F)
                    .build()), true));

    public static final DeferredItem<Item> MASHED_POTATOES = ITEMS.register("mashed_potatoes",
            () -> new ConsumableItem(bowlFoodItem((new FoodProperties.Builder())
                    .nutrition(10)
                    .saturationModifier(0.75f)
                    .effect(() -> new MobEffectInstance(ModEffects.COMFORT, FoodValues.SHORT_DURATION, 0), 1.0F)
                    .build()), true));

    public static final DeferredItem<Item> PASTA_WITH_MILK_CREAM_AND_HAM = ITEMS.register("pasta_with_milk_cream_and_ham",
            () -> new ConsumableItem(bowlFoodItem((new FoodProperties.Builder())
                    .nutrition(10)
                    .saturationModifier(0.75f)
                    .effect(() -> new MobEffectInstance(ModEffects.COMFORT, FoodValues.SHORT_DURATION, 0), 1.0F)
                    .build()), true));

    public static final DeferredItem<Item> COOKED_DICED_POTATOES_WITH_CHICKEN_CUTS = ITEMS.register("cooked_diced_potatoes_with_chicken_cuts",
            () -> new ConsumableItem(bowlFoodItem((new FoodProperties.Builder())
                    .nutrition(10)
                    .saturationModifier(0.75f)
                    .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 200, 0), 1.0F)
                    .build()), true));

    public static final DeferredItem<Item> COOKED_DICED_POTATOES_WITH_BEEF = ITEMS.register("cooked_diced_potatoes_with_beef",
            () -> new ConsumableItem(bowlFoodItem((new FoodProperties.Builder())
                    .nutrition(10)
                    .saturationModifier(0.75f)
                    .effect(() -> new MobEffectInstance(MobEffects.DAMAGE_BOOST, 200, 0), 1.0F)
                    .build()), true));

    public static final DeferredItem<Item> COOKED_DICED_POTATOES_WITH_PORKCHOP = ITEMS.register("cooked_diced_potatoes_with_porkchop",
            () -> new ConsumableItem(bowlFoodItem((new FoodProperties.Builder())
                    .nutrition(10)
                    .saturationModifier(0.75f)
                    .effect(() -> new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 200, 0), 1.0F)
                    .build()), true));

    public static final DeferredItem<Item> CHICKEN_SALAD = ITEMS.register("chicken_salad",
            () -> new ConsumableItem(bowlFoodItem((new FoodProperties.Builder())
                    .nutrition(6)
                    .saturationModifier(0.6f)
                    .effect(() -> new MobEffectInstance(ModEffects.COMFORT, FoodValues.SHORT_DURATION, 0), 1.0F)
                    .build()), true));

    public static final DeferredItem<Item> POTATO_SALAD = ITEMS.register("potato_salad",
            () -> new ConsumableItem(bowlFoodItem((new FoodProperties.Builder())
                    .nutrition(6)
                    .saturationModifier(0.6f)
                    .effect(() -> new MobEffectInstance(ModEffects.COMFORT, FoodValues.SHORT_DURATION, 0), 1.0F)
                    .build()), true));

    public static final DeferredItem<Item> CARROT_SOUP = ITEMS.register("carrot_soup",
            () -> new ConsumableItem(bowlFoodItem((new FoodProperties.Builder())
                    .nutrition(9)
                    .saturationModifier(0.75f)
                    .effect(() -> new MobEffectInstance(ModEffects.COMFORT, FoodValues.SHORT_DURATION, 0), 1.0F)
                    .build()), true));

    public static final DeferredItem<Item> CHOCOLATE_POPSICLE = ITEMS.register("chocolate_popsicle",
            () -> new ConsumableItem(foodItem((new FoodProperties.Builder())
                    .nutrition(3)
                    .saturationModifier(0.2f)
                    .build())));

    public static final DeferredItem<Item> SIMPLE_HAMBURGER = ITEMS.register("simple_hamburger",
            () -> new ConsumableItem(foodItem((new FoodProperties.Builder())
                    .nutrition(5)
                    .saturationModifier(0.4f)
                    .build())));

    public static final DeferredItem<Item> HAMBURGER_WITH_CHEESE = ITEMS.register("hamburger_with_cheese",
            () -> new ConsumableItem(foodItem((new FoodProperties.Builder())
                    .nutrition(6)
                    .saturationModifier(0.6f)
                    .build())));

    public static final DeferredItem<Item> HAMBURGER_WITH_EGG = ITEMS.register("hamburger_with_egg",
            () -> new ConsumableItem(foodItem((new FoodProperties.Builder())
                    .nutrition(7)
                    .saturationModifier(0.7f)
                    .build())));

    public static final DeferredItem<Item> LOADED_HAMBURGER = ITEMS.register("loaded_hamburger",
            () -> new ConsumableItem(foodItem((new FoodProperties.Builder())
                    .nutrition(15)
                    .saturationModifier(1f)
                    .build())));

    public static final DeferredItem<Item> CHICKEN_SANDWICH_WITH_EGG_AND_TOMATO = ITEMS.register("chicken_sandwich_with_egg_and_tomato",
            () -> new ConsumableItem(foodItem((new FoodProperties.Builder())
                    .nutrition(11)
                    .saturationModifier(0.9f)
                    .build())));

    public static final DeferredItem<Item> STEAK_SANDWICH = ITEMS.register("steak_sandwich",
            () -> new ConsumableItem(foodItem((new FoodProperties.Builder())
                    .nutrition(7)
                    .saturationModifier(0.7f)
                    .build())));

    public static final DeferredItem<Item> PORKCHOP_SANDWICH = ITEMS.register("porkchop_sandwich",
            () -> new ConsumableItem(foodItem((new FoodProperties.Builder())
                    .nutrition(7)
                    .saturationModifier(0.7f)
                    .build())));

    public static final DeferredItem<Item> EGG_WITH_BACON_SANDWICH = ITEMS.register("egg_with_bacon_sandwich",
            () -> new ConsumableItem(foodItem((new FoodProperties.Builder())
                    .nutrition(10)
                    .saturationModifier(0.8f)
                    .build())));

    public static final DeferredItem<Item> TOMATO_SANDWICH = ITEMS.register("tomato_sandwich",
            () -> new ConsumableItem(foodItem((new FoodProperties.Builder())
                    .nutrition(6)
                    .saturationModifier(0.6f)
                    .build())));

    public static final DeferredItem<Item> BREAD_SLICE = ITEMS.register("bread_slice",
            () -> new ConsumableItem(foodItem((new FoodProperties.Builder())
                    .nutrition(2)
                    .saturationModifier(0.4f)
                    .build())));

    public static final DeferredItem<Item> TOAST = ITEMS.register("toast",
            () -> new ConsumableItem(foodItem((new FoodProperties.Builder())
                    .nutrition(2)
                    .saturationModifier(0.4f) // before: 0.5f reduced 33%
                    .build())));

    public static final DeferredItem<Item> TOAST_WITH_EGG = ITEMS.register("toast_with_egg",
            () -> new ConsumableItem(foodItem((new FoodProperties.Builder())
                    .nutrition(5)
                    .saturationModifier(0.5f)
                    .build())));

    public static final DeferredItem<Item> TOAST_WITH_HONEY = ITEMS.register("toast_with_honey",
            () -> new ConsumableItem(foodItem((new FoodProperties.Builder())
                    .nutrition(5)
                    .saturationModifier(0.5f)
                    .build())));

    public static final DeferredItem<Item> TOAST_WITH_SWEET_BERRIES = ITEMS.register("toast_with_sweet_berries",
            () -> new ConsumableItem(foodItem((new FoodProperties.Builder())
                    .nutrition(5)
                    .saturationModifier(0.5f)
                    .build())));

    public static final DeferredItem<Item> TOAST_WITH_BLUEBERRIES =  ITEMS.register("toast_with_blueberries",
            () -> new ConsumableItem(foodItem((new FoodProperties.Builder())
                    .nutrition(5)
                    .saturationModifier(0.5f)
                    .build())));

    public static final DeferredItem<Item> TOAST_WITH_GLOW_BERRIES = ITEMS.register("toast_with_glow_berries",
            () -> new ConsumableItem(foodItem((new FoodProperties.Builder())
                    .nutrition(5)
                    .saturationModifier(0.5f)
                    .effect(() -> new MobEffectInstance(MobEffects.GLOWING, 200, 0), 1.0f)
                    .build()), true));

    public static final DeferredItem<Item> TOAST_WITH_CHOCOLATE = ITEMS.register("toast_with_chocolate",
            () -> new ConsumableItem(foodItem((new FoodProperties.Builder())
                    .nutrition(5)
                    .saturationModifier(0.5f)
                    .build())));

    public static final DeferredItem<Item> TOAST_WITH_CHEESE = ITEMS.register("toast_with_cheese",
            () -> new ConsumableItem(foodItem((new FoodProperties.Builder())
                    .nutrition(5)
                    .saturationModifier(0.5f)
                    .build())));

    public static final DeferredItem<Item> TOAST_WITH_PEANUT_BUTTER = ITEMS.register("toast_with_peanut_butter",
            () -> new ConsumableItem(foodItem((new FoodProperties.Builder())
                    .nutrition(5)
                    .saturationModifier(0.5f)
                    .build())));
}
