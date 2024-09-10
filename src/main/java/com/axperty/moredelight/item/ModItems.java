package com.axperty.moredelight.item;

import com.axperty.moredelight.MoreDelight;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraftforge.common.Tags;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.versions.forge.ForgeVersion;
import vectorwing.farmersdelight.common.FoodValues;
import vectorwing.farmersdelight.common.item.ConsumableItem;
import vectorwing.farmersdelight.common.item.KnifeItem;
import vectorwing.farmersdelight.common.registry.ModEffects;
import vectorwing.farmersdelight.data.ItemTags;

import static net.minecraftforge.common.crafting.CraftingHelper.getItemStack;
import static vectorwing.farmersdelight.common.registry.ModItems.bowlFoodItem;
import static vectorwing.farmersdelight.common.registry.ModItems.foodItem;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, MoreDelight.MOD_ID);
    public static final RegistryObject<Item> WOODEN_KNIFE = ITEMS.register("wooden_knife",
            () -> new KnifeItem(
                    ModTiers.WOOD,
                    0,
                    -2.0F,
                    new Item.Properties()
                            .tab(ModCreativeModeTab.CREATIVE_MODE_TAB)));

    public static final RegistryObject<Item> STONE_KNIFE = ITEMS.register("stone_knife",
            () -> new KnifeItem(
                    ModTiers.WOOD,
                    0,
                    -2.0F,
                    new Item.Properties()
                            .tab(ModCreativeModeTab.CREATIVE_MODE_TAB)));

    public static final RegistryObject<Item> DICED_POTATOES = ITEMS.register("diced_potatoes",
            () -> new ConsumableItem(foodItem((new FoodProperties.Builder())
                    .nutrition(1)
                    .saturationMod(0.3f)
                    .fast()
                    .build()).tab(ModCreativeModeTab.CREATIVE_MODE_TAB)));

    public static final RegistryObject<Item> CHOCOLATE_POPSICLE = ITEMS.register("chocolate_popsicle",
            () -> new ConsumableItem(foodItem((new FoodProperties.Builder())
                    .nutrition(3)
                    .saturationMod(0.2f)
                    .build()).tab(ModCreativeModeTab.CREATIVE_MODE_TAB)));

    public static final RegistryObject<Item> OMELETTE = ITEMS.register("omelette",
            () -> new ConsumableItem(foodItem((new FoodProperties.Builder())
                    .nutrition(6)
                    .saturationMod(0.5f)
                    .build()).tab(ModCreativeModeTab.CREATIVE_MODE_TAB)));

    public static final RegistryObject<Item> COOKED_RICE_WITH_MILK_CREAM_AND_CHICKEN_CUTS = ITEMS.register("cooked_rice_with_milk_cream_and_chicken_cuts",
            () -> new ConsumableItem(bowlFoodItem((new FoodProperties.Builder())
                    .nutrition(10)
                    .saturationMod(0.75f)
                    .effect(() -> new MobEffectInstance(ModEffects.COMFORT.get(), FoodValues.SHORT_DURATION, 0), 1.0F)
                    .build()).tab(ModCreativeModeTab.CREATIVE_MODE_TAB), true));

    public static final RegistryObject<Item> COOKED_RICE_WITH_MILK_CREAM_AND_BEEF = ITEMS.register("cooked_rice_with_milk_cream_and_beef",
            () -> new ConsumableItem(bowlFoodItem((new FoodProperties.Builder())
                    .nutrition(10)
                    .saturationMod(0.75f)
                    .effect(() -> new MobEffectInstance(ModEffects.COMFORT.get(), FoodValues.SHORT_DURATION, 0), 1.0F)
                    .build()).tab(ModCreativeModeTab.CREATIVE_MODE_TAB), true));

    public static final RegistryObject<Item> COOKED_RICE_WITH_MILK_CREAM_AND_PORKCHOP = ITEMS.register("cooked_rice_with_milk_cream_and_porkchop",
            () -> new ConsumableItem(bowlFoodItem((new FoodProperties.Builder())
                    .nutrition(10)
                    .saturationMod(0.75f)
                    .effect(() -> new MobEffectInstance(ModEffects.COMFORT.get(), FoodValues.SHORT_DURATION, 0), 1.0F)
                    .build()).tab(ModCreativeModeTab.CREATIVE_MODE_TAB), true));

    public static final RegistryObject<Item> MASHED_POTATOES = ITEMS.register("mashed_potatoes",
            () -> new ConsumableItem(bowlFoodItem((new FoodProperties.Builder())
                    .nutrition(10)
                    .saturationMod(0.75f)
                    .effect(() -> new MobEffectInstance(ModEffects.COMFORT.get(), FoodValues.SHORT_DURATION, 0), 1.0F)
                    .build()).tab(ModCreativeModeTab.CREATIVE_MODE_TAB), true));

    public static final RegistryObject<Item> PASTA_WITH_MILK_CREAM_AND_HAM = ITEMS.register("pasta_with_milk_cream_and_ham",
            () -> new ConsumableItem(bowlFoodItem((new FoodProperties.Builder())
                    .nutrition(10)
                    .saturationMod(0.75f)
                    .effect(() -> new MobEffectInstance(ModEffects.COMFORT.get(), FoodValues.SHORT_DURATION, 0), 1.0F)
                    .build()).tab(ModCreativeModeTab.CREATIVE_MODE_TAB), true));

    public static final RegistryObject<Item> COOKED_DICED_POTATOES_WITH_CHICKEN_CUTS = ITEMS.register("cooked_diced_potatoes_with_chicken_cuts",
            () -> new ConsumableItem(bowlFoodItem((new FoodProperties.Builder())
                    .nutrition(10)
                    .saturationMod(0.75f)
                    .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 200, 0), 1.0F)
                    .build()).tab(ModCreativeModeTab.CREATIVE_MODE_TAB), true));

    public static final RegistryObject<Item> COOKED_DICED_POTATOES_WITH_BEEF = ITEMS.register("cooked_diced_potatoes_with_beef",
            () -> new ConsumableItem(bowlFoodItem((new FoodProperties.Builder())
                    .nutrition(10)
                    .saturationMod(0.75f)
                    .effect(() -> new MobEffectInstance(MobEffects.DAMAGE_BOOST, 200, 0), 1.0F)
                    .build()).tab(ModCreativeModeTab.CREATIVE_MODE_TAB), true));

    public static final RegistryObject<Item> COOKED_DICED_POTATOES_WITH_PORKCHOP = ITEMS.register("cooked_diced_potatoes_with_porkchop",
            () -> new ConsumableItem(bowlFoodItem((new FoodProperties.Builder())
                    .nutrition(10)
                    .saturationMod(0.75f)
                    .effect(() -> new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 200, 0), 1.0F)
                    .build()).tab(ModCreativeModeTab.CREATIVE_MODE_TAB), true));

    public static final RegistryObject<Item> CHICKEN_SALAD = ITEMS.register("chicken_salad",
            () -> new ConsumableItem(bowlFoodItem((new FoodProperties.Builder())
                    .nutrition(6)
                    .saturationMod(0.6f)
                    .effect(() -> new MobEffectInstance(ModEffects.COMFORT.get(), FoodValues.SHORT_DURATION, 0), 1.0F)
                    .build()).tab(ModCreativeModeTab.CREATIVE_MODE_TAB), true));

    public static final RegistryObject<Item> POTATO_SALAD = ITEMS.register("potato_salad",
            () -> new ConsumableItem(bowlFoodItem((new FoodProperties.Builder())
                    .nutrition(6)
                    .saturationMod(0.6f)
                    .effect(() -> new MobEffectInstance(ModEffects.COMFORT.get(), FoodValues.SHORT_DURATION, 0), 1.0F)
                    .build()).tab(ModCreativeModeTab.CREATIVE_MODE_TAB), true));

    public static final RegistryObject<Item> CARROT_SOUP = ITEMS.register("carrot_soup",
            () -> new ConsumableItem(bowlFoodItem((new FoodProperties.Builder())
                    .nutrition(9)
                    .saturationMod(0.75f)
                    .effect(() -> new MobEffectInstance(ModEffects.COMFORT.get(), FoodValues.SHORT_DURATION, 0), 1.0F)
                    .build()).tab(ModCreativeModeTab.CREATIVE_MODE_TAB), true));

    public static final RegistryObject<Item> CHICKEN_SANDWICH_WITH_EGG_AND_TOMATO = ITEMS.register("chicken_sandwich_with_egg_and_tomato",
            () -> new ConsumableItem(foodItem((new FoodProperties.Builder())
                    .nutrition(11)
                    .saturationMod(0.9f)
                    .build()).tab(ModCreativeModeTab.CREATIVE_MODE_TAB)));

    public static final RegistryObject<Item> EGG_WITH_BACON_SANDWICH = ITEMS.register("egg_with_bacon_sandwich",
            () -> new ConsumableItem(foodItem((new FoodProperties.Builder())
                    .nutrition(10)
                    .saturationMod(0.8f)
                    .build()).tab(ModCreativeModeTab.CREATIVE_MODE_TAB)));

    public static final RegistryObject<Item> TOMATO_SANDWICH = ITEMS.register("tomato_sandwich",
            () -> new ConsumableItem(foodItem((new FoodProperties.Builder())
                    .nutrition(6)
                    .saturationMod(0.6f)
                    .build()).tab(ModCreativeModeTab.CREATIVE_MODE_TAB)));

    public static final RegistryObject<Item> BREAD_SLICE = ITEMS.register("bread_slice",
            () -> new ConsumableItem(foodItem((new FoodProperties.Builder())
                    .nutrition(2)
                    .saturationMod(0.4f)
                    .build()).tab(ModCreativeModeTab.CREATIVE_MODE_TAB)));

    public static final RegistryObject<Item> TOAST = ITEMS.register("toast",
            () -> new ConsumableItem(foodItem((new FoodProperties.Builder())
                    .nutrition(2)
                    .saturationMod(0.4f)
                    .build()).tab(ModCreativeModeTab.CREATIVE_MODE_TAB)));

    public static final RegistryObject<Item> TOAST_WITH_EGG = ITEMS.register("toast_with_egg",
            () -> new ConsumableItem(foodItem((new FoodProperties.Builder())
                    .nutrition(5)
                    .saturationMod(0.5f)
                    .build()).tab(ModCreativeModeTab.CREATIVE_MODE_TAB)));

    public static final RegistryObject<Item> TOAST_WITH_HONEY = ITEMS.register("toast_with_honey",
            () -> new ConsumableItem(foodItem((new FoodProperties.Builder())
                    .nutrition(5)
                    .saturationMod(0.5f)
                    .build()).tab(ModCreativeModeTab.CREATIVE_MODE_TAB)));

    public static final RegistryObject<Item> TOAST_WITH_SWEET_BERRIES = ITEMS.register("toast_with_sweet_berries",
            () -> new ConsumableItem(foodItem((new FoodProperties.Builder())
                    .nutrition(5)
                    .saturationMod(0.5f)
                    .build()).tab(ModCreativeModeTab.CREATIVE_MODE_TAB)));

    public static final RegistryObject<Item> TOAST_WITH_BLUEBERRIES = !modLoaded("casualness_delight") ? null : ITEMS.register("toast_with_blueberries",
            () -> new ConsumableItem(foodItem((new FoodProperties.Builder())
                    .nutrition(5)
                    .saturationMod(0.5f)
                    .build()).tab(ModCreativeModeTab.CREATIVE_MODE_TAB)));

    public static final RegistryObject<Item> TOAST_WITH_GLOW_BERRIES = ITEMS.register("toast_with_glow_berries",
            () -> new ConsumableItem(foodItem((new FoodProperties.Builder())
                    .nutrition(5)
                    .saturationMod(0.5f)
                    .effect(() -> new MobEffectInstance(MobEffects.GLOWING, 200, 0), 1.0f)
                    .build()).tab(ModCreativeModeTab.CREATIVE_MODE_TAB), true));

    public static final RegistryObject<Item> TOAST_WITH_CHOCOLATE = ITEMS.register("toast_with_chocolate",
            () -> new ConsumableItem(foodItem((new FoodProperties.Builder())
                    .nutrition(5)
                    .saturationMod(0.5f)
                    .build()).tab(ModCreativeModeTab.CREATIVE_MODE_TAB)));

    public static final RegistryObject<Item> TOAST_WITH_CHEESE = !modLoaded("casualness_delight") ? null : ITEMS.register("toast_with_cheese",
            () -> new ConsumableItem(foodItem((new FoodProperties.Builder())
                    .nutrition(5)
                    .saturationMod(0.5f)
                    .build()).tab(ModCreativeModeTab.CREATIVE_MODE_TAB)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

    private static boolean modLoaded(String modName) {
        return ModList.get().isLoaded(modName);
    }
}
