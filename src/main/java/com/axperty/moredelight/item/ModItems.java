package com.axperty.moredelight.item;

import com.axperty.moredelight.MoreDelight;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import vectorwing.farmersdelight.common.registry.ModEffects;

public class ModItems {

    public static void registerItems() {

        ModItemList.WOODEN_KNIFE = item("wooden_knife", new KnifeItem(ModMaterials.WOOD_MATERIAL, new FabricItemSettings()));

        ModItemList.STONE_KNIFE = item("stone_knife", new KnifeItem(ModMaterials.STONE_MATERIAL, new FabricItemSettings()));

        ModItemList.DICED_POTATOES = item("diced_potatoes", new Item(food(null, 2, .2f)));

        ModItemList.CHOCOLATE_POPSICLE = item("chocolate_popsicle", new Item(food(null, 3, .2f)));

        ModItemList.OMELETTE = item("omelette", new Item(food(null, 5, .5f)));

        ModItemList.COOKED_RICE_WITH_MILK_CREAM_AND_CHICKEN_CUTS = item("cooked_rice_with_milk_cream_and_chicken_cuts", new Item(meal(Items.BOWL,10, .75f)));

        ModItemList.COOKED_RICE_WITH_MILK_CREAM_AND_BEEF = item("cooked_rice_with_milk_cream_and_beef", new Item(meal(Items.BOWL,10, .75f)));

        ModItemList.COOKED_RICE_WITH_MILK_CREAM_AND_PORKCHOP = item("cooked_rice_with_milk_cream_and_porkchop", new Item(meal(Items.BOWL,10, .75f)));

        ModItemList.MASHED_POTATOES = item("mashed_potatoes", new Item(food(Items.BOWL,10, .75f).maxCount(16)));

        ModItemList.PASTA_WITH_MILK_CREAM_AND_HAM = item("pasta_with_milk_cream_and_ham", new Item(meal(Items.BOWL, 10, .75f)));

        ModItemList.COOKED_DICED_POTATOES_WITH_CHICKEN_CUTS = item("cooked_diced_potatoes_with_chicken_cuts", new Item(foodEffect(Items.BOWL, StatusEffects.SPEED, 200, 0, 10, .75f).maxCount(16)));

        ModItemList.COOKED_DICED_POTATOES_WITH_BEEF = item("cooked_diced_potatoes_with_beef", new Item(foodEffect(Items.BOWL, StatusEffects.STRENGTH, 200, 0,10, .75f).maxCount(16)));

        ModItemList.COOKED_DICED_POTATOES_WITH_PORKCHOP = item("cooked_diced_potatoes_with_porkchop", new Item(foodEffect(Items.BOWL, StatusEffects.RESISTANCE, 200, 0,10, .75f).maxCount(16)));

        ModItemList.CHICKEN_SALAD = item("chicken_salad", new Item(food(Items.BOWL,6, .6f).maxCount(16)));

        ModItemList.POTATO_SALAD = item("potato_salad", new Item(food(Items.BOWL,6, .6f).maxCount(16)));

        ModItemList.CARROT_SOUP = item("carrot_soup", new Item(stew(9, .75f)));

        ModItemList.SIMPLE_HAMBURGER = item("simple_hamburger", new Item(food(null, 5, 0.4f)));

        if (FabricLoader.getInstance().isModLoaded("expandeddelight") || FabricLoader.getInstance().isModLoaded("casualness_delight")) {
            ModItemList.HAMBURGER_WITH_CHEESE = item("hamburger_with_cheese", new Item(food(null, 6, 0.6f)));
        }

        ModItemList.HAMBURGER_WITH_EGG = item("hamburger_with_egg", new Item(food(null, 7, 0.7f)));

        ModItemList.LOADED_HAMBURGER = item("loaded_hamburger", new Item(food(null, 15, 1f)));

        ModItemList.CHICKEN_SANDWICH_WITH_EGG_AND_TOMATO = item("chicken_sandwich_with_egg_and_tomato", new Item(food(null, 11, .9f)));

        ModItemList.STEAK_SANDWICH = item("steak_sandwich", new Item(food(null, 7, .7f)));

        ModItemList.PORKCHOP_SANDWICH = item("porkchop_sandwich", new Item(food(null, 7, .7f)));

        ModItemList.EGG_WITH_BACON_SANDWICH = item("egg_with_bacon_sandwich", new Item(food(null, 10, .8f)));

        ModItemList.TOMATO_SANDWICH = item("tomato_sandwich", new Item(food(null, 6, .6f)));

        ModItemList.BREAD_SLICE = item("bread_slice", new Item(food(null, 2, .4f)));

        ModItemList.TOAST = item("toast", new Item(food(null, 2, .4f)));

        ModItemList.TOAST_WITH_EGG = item("toast_with_egg", new Item(food(null, 5, .5f)));

        ModItemList.TOAST_WITH_HONEY = item("toast_with_honey", new Item(food(null, 5, .5f)));

        ModItemList.TOAST_WITH_SWEET_BERRIES = item("toast_with_sweet_berries", new Item(food(null, 5, .5f)));

        if (FabricLoader.getInstance().isModLoaded("nutritious-feast")) {
            ModItemList.TOAST_WITH_BLUEBERRIES = item("toast_with_blueberries", new Item(food(null, 5, .5f)));
        }

        ModItemList.TOAST_WITH_GLOW_BERRIES = item("toast_with_glow_berries", new Item(foodEffect(null, StatusEffects.GLOWING, 100, 0, 5, .5f)));

        ModItemList.TOAST_WITH_CHOCOLATE = item("toast_with_chocolate", new Item(food(null, 5, .5f)));

        if (FabricLoader.getInstance().isModLoaded("expandeddelight") || FabricLoader.getInstance().isModLoaded("casualness_delight")) {
            ModItemList.TOAST_WITH_CHEESE = item("toast_with_cheese", new Item(food(null, 5, .5f)));
        }

        if (FabricLoader.getInstance().isModLoaded("expandeddelight")) {
            ModItemList.TOAST_WITH_PEANUT_BUTTER = item("toast_with_peanut_butter", new Item(food(null, 5, .5f)));
        }
    }

    private static Item item(String name, Item item) {
        ItemGroupEvents.modifyEntriesEvent(MoreDelight.GROUP).register(entries -> entries.add(item));
        return Registry.register(Registries.ITEM, new Identifier(MoreDelight.MOD_ID, name), item);
    }

    private static FabricItemSettings food(Item remainder, int hunger, float saturation) {
        return new FabricItemSettings()
                .recipeRemainder(remainder)
                .food(new FoodComponent.Builder()
                        .hunger(hunger)
                        .saturationModifier(saturation)
                        .build());
    }

    private static FabricItemSettings foodEffect(Item remainder, StatusEffect effect, int duration, int amplifier, int hunger, float saturation) {
        return new FabricItemSettings()
                .recipeRemainder(remainder)
                .food(new FoodComponent.Builder()
                        .hunger(hunger)
                        .saturationModifier(saturation)
                        .statusEffect(new StatusEffectInstance(effect, duration, amplifier), 1.0f)
                        .build());
    }

    private static FabricItemSettings meal(Item remainder, int hunger, float saturation) {
        return new FabricItemSettings()
                .recipeRemainder(remainder)
                .maxCount(16)
                .food(new FoodComponent.Builder()
                        .hunger(hunger)
                        .saturationModifier(saturation)
                        .statusEffect(new StatusEffectInstance(ModEffects.NOURISHMENT.get(), 3600, 0), 1.0f)
                        .build());
    }

    private static FabricItemSettings stew(int hunger, float saturation) {
                return new FabricItemSettings()
                        .recipeRemainder(Items.BOWL)
                        .maxCount(16)
                        .food(new FoodComponent.Builder()
                                .hunger(hunger)
                                .saturationModifier(saturation)
                                .statusEffect(new StatusEffectInstance(ModEffects.COMFORT.get(), 3600, 0), 1.0f)
                                .build());
    }
}
