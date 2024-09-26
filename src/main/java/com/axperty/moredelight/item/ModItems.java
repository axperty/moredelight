package com.axperty.moredelight.item;

import com.axperty.moredelight.MoreDelight;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import vectorwing.farmersdelight.common.item.ConsumableItem;
import vectorwing.farmersdelight.common.registry.ModEffects;

public class ModItems {

    public static void registerItems() {

        ModItemList.WOODEN_KNIFE = knife("wooden_knife", new KnifeItem(ModMaterials.WOOD_MATERIAL, new FabricItemSettings()));

        ModItemList.STONE_KNIFE = knife("stone_knife", new KnifeItem(ModMaterials.STONE_MATERIAL, new FabricItemSettings()));

        ModItemList.DICED_POTATOES = consumable("diced_potatoes", 2, 0.4f, 64, null);

        ModItemList.CHOCOLATE_POPSICLE = consumable("chocolate_popsicle", 3, 0.2f, 64, null);

        ModItemList.OMELETTE = consumable("omelette", 6, 0.6f, 64, null);

        ModItemList.COOKED_RICE_WITH_MILK_CREAM_AND_CHICKEN_CUTS = consumableEffect("cooked_rice_with_milk_cream_and_chicken_cuts", 14, 0.8f, ModEffects.NOURISHMENT.get(), 3600, 0, 16, Items.BOWL);

        ModItemList.COOKED_RICE_WITH_MILK_CREAM_AND_BEEF = consumableEffect("cooked_rice_with_milk_cream_and_beef", 14, 0.8f, ModEffects.NOURISHMENT.get(), 3600, 0, 16, Items.BOWL);

        ModItemList.COOKED_RICE_WITH_MILK_CREAM_AND_PORKCHOP = consumableEffect("cooked_rice_with_milk_cream_and_porkchop", 14, 0.8f, ModEffects.NOURISHMENT.get(), 3600, 0, 16, Items.BOWL);

        ModItemList.MASHED_POTATOES = consumable("mashed_potatoes", 12, 0.8f, 16, Items.BOWL);

        ModItemList.PASTA_WITH_MILK_CREAM_AND_HAM = consumableEffect("pasta_with_milk_cream_and_ham", 12, 0.8f, ModEffects.NOURISHMENT.get(), 3600, 0, 16, Items.BOWL);

        ModItemList.COOKED_DICED_POTATOES_WITH_CHICKEN_CUTS = consumable("cooked_diced_potatoes_with_chicken_cuts", 10, 0.8f, 16, Items.BOWL);

        ModItemList.COOKED_DICED_POTATOES_WITH_BEEF = consumable("cooked_diced_potatoes_with_beef", 10, 0.8f, 16, Items.BOWL);

        ModItemList.COOKED_DICED_POTATOES_WITH_PORKCHOP = consumable("cooked_diced_potatoes_with_porkchop", 10, 0.8f, 16, Items.BOWL);

        ModItemList.CHICKEN_SALAD = consumableEffect("chicken_salad", 6, 0.6f, StatusEffects.REGENERATION, 100, 0, 16, Items.BOWL);

        ModItemList.POTATO_SALAD = consumableEffect("potato_salad", 6, 0.6f, StatusEffects.REGENERATION, 100, 0, 16, Items.BOWL);

        ModItemList.CARROT_SOUP = consumableEffect("carrot_soup", 12, 0.8f, ModEffects.COMFORT.get(), 3600, 0, 16, Items.BOWL);

        ModItemList.SIMPLE_HAMBURGER = consumable("simple_hamburger", 8, 0.8f, 64, null);

        if (FabricLoader.getInstance().isModLoaded("expandeddelight") || FabricLoader.getInstance().isModLoaded("casualness_delight")) {
            ModItemList.HAMBURGER_WITH_CHEESE = consumable("hamburger_with_cheese", 9, 0.8f, 64, null);
        }

        ModItemList.HAMBURGER_WITH_EGG = consumable("hamburger_with_egg", 9, 0.8f, 64, null);

        ModItemList.LOADED_HAMBURGER = consumable("loaded_hamburger", 13, 0.8f, 64, null);

        ModItemList.CHICKEN_SANDWICH_WITH_EGG_AND_TOMATO = consumable("chicken_sandwich_with_egg_and_tomato", 11, 0.8f, 64, null);

        ModItemList.STEAK_SANDWICH = consumable("steak_sandwich", 10, 0.8f, 64, null);

        ModItemList.PORKCHOP_SANDWICH = consumable("porkchop_sandwich", 10, 0.8f, 64, null);

        ModItemList.EGG_WITH_BACON_SANDWICH = consumable("egg_with_bacon_sandwich", 11, 0.8f, 64, null);

        ModItemList.TOMATO_SANDWICH = consumable("tomato_sandwich", 7, 0.8f, 64, null);

        ModItemList.BREAD_SLICE = consumable("bread_slice", 2, 0.4f, 64, null);

        ModItemList.TOAST = consumable("toast", 3, 0.4f, 64, null);

        ModItemList.TOAST_WITH_EGG = consumable("toast_with_egg", 5, 0.6f, 64, null);

        ModItemList.TOAST_WITH_HONEY = consumable("toast_with_honey", 5, 0.6f, 64, null);

        ModItemList.TOAST_WITH_SWEET_BERRIES = consumable("toast_with_sweet_berries", 5, 0.6f, 64, null);

        if (FabricLoader.getInstance().isModLoaded("nutritious-feast")) {
            ModItemList.TOAST_WITH_BLUEBERRIES = consumable("toast_with_blueberries", 5, 0.6f, 64, null);
        }

        ModItemList.TOAST_WITH_GLOW_BERRIES = consumable("toast_with_glow_berries", 5, 0.6f, 64, null);

        ModItemList.TOAST_WITH_CHOCOLATE = consumable("toast_with_chocolate", 5, 0.6f, 64, null);

        if (FabricLoader.getInstance().isModLoaded("expandeddelight") || FabricLoader.getInstance().isModLoaded("casualness_delight")) {
            ModItemList.TOAST_WITH_CHEESE = consumable("toast_with_cheese", 5, 0.6f, 64, null);
        }

        if (FabricLoader.getInstance().isModLoaded("expandeddelight")) {
            ModItemList.TOAST_WITH_PEANUT_BUTTER = consumable("toast_with_peanut_butter", 5, 0.6f, 64, null);
        }
    }

    private static Item knife(String name, KnifeItem knifeItem) {
        Item item = Registry.register(Registries.ITEM, new Identifier(MoreDelight.MOD_ID, name), knifeItem);
        ItemGroupEvents.modifyEntriesEvent(MoreDelight.GROUP).register(entries -> entries.add(item));
        return item;
    }

    private static Item consumable(String name, int hunger, float saturation, int maxCount, Item remainder) {
        Item item = Registry.register(Registries.ITEM, new Identifier(MoreDelight.MOD_ID, name),
                new ConsumableItem(new FabricItemSettings()
                        .recipeRemainder(remainder)
                        .maxCount(maxCount)
                        .food(new FoodComponent.Builder()
                                .hunger(hunger)
                                .saturationModifier(saturation)
                                .build()),
                        false, false));
        ItemGroupEvents.modifyEntriesEvent(MoreDelight.GROUP).register(entries -> entries.add(item));
        return item;
    }

    private static Item consumableEffect(String name, int hunger, float saturation, StatusEffect effect, int duration, int amplifier, int maxCount, Item remainder) {
        Item item = Registry.register(Registries.ITEM, new Identifier(MoreDelight.MOD_ID, name),
                new ConsumableItem(new FabricItemSettings()
                        .recipeRemainder(remainder)
                        .maxCount(maxCount)
                        .food(new FoodComponent.Builder()
                                .hunger(hunger)
                                .saturationModifier(saturation)
                                .statusEffect(new StatusEffectInstance(effect, duration, amplifier), 1.0f)
                                .build()),
                        true, false));
        ItemGroupEvents.modifyEntriesEvent(MoreDelight.GROUP).register(entries -> entries.add(item));
        return item;
    }
}