package com.axperty.moredelight.registry;

import com.axperty.moredelight.MoreDelight;
import com.axperty.moredelight.item.ItemList;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;
import vectorwing.farmersdelight.common.item.KnifeItem;
import vectorwing.farmersdelight.common.registry.ModEffects;

public class ItemRegistry {

    public static void registerItems() {

        ItemList.WOODEN_KNIFE = item("wooden_knife", new KnifeItem(MaterialRegistry.WOOD_MATERIAL, new Item.Settings().attributeModifiers(KnifeItem.createAttributeModifiers(MaterialRegistry.WOOD_MATERIAL, .5f, -1.8F))));

        ItemList.STONE_KNIFE = item("stone_knife", new KnifeItem(MaterialRegistry.STONE_MATERIAL, new Item.Settings().attributeModifiers(KnifeItem.createAttributeModifiers(MaterialRegistry.WOOD_MATERIAL, 1.1f, -1.8F))));

        ItemList.DICED_POTATOES = item("diced_potatoes", new Item(food(null, 2, .2f)));

        ItemList.CHOCOLATE_POPSICLE = item("chocolate_popsicle", new Item(food(null, 3, .2f)));

        ItemList.OMELETTE = item("omelette", new Item(food(null, 5, .5f)));

        ItemList.COOKED_RICE_WITH_MILK_CREAM_AND_CHICKEN_CUTS = item("cooked_rice_with_milk_cream_and_chicken_cuts", new Item(meal(Items.BOWL,10, .75f)));

        ItemList.COOKED_RICE_WITH_MILK_CREAM_AND_BEEF = item("cooked_rice_with_milk_cream_and_beef", new Item(meal(Items.BOWL,10, .75f)));

        ItemList.COOKED_RICE_WITH_MILK_CREAM_AND_PORKCHOP = item("cooked_rice_with_milk_cream_and_porkchop", new Item(meal(Items.BOWL,10, .75f)));

        ItemList.MASHED_POTATOES = item("mashed_potatoes", new Item(food(Items.BOWL,10, .75f).maxCount(16)));

        ItemList.PASTA_WITH_MILK_CREAM_AND_HAM = item("pasta_with_milk_cream_and_ham", new Item(meal(Items.BOWL, 10, .75f)));

        ItemList.COOKED_DICED_POTATOES_WITH_CHICKEN_CUTS = item("cooked_diced_potatoes_with_chicken_cuts", new Item(foodEffect(Items.BOWL, StatusEffects.SPEED, 200, 0, 10, .75f).maxCount(16)));

        ItemList.COOKED_DICED_POTATOES_WITH_BEEF = item("cooked_diced_potatoes_with_beef", new Item(foodEffect(Items.BOWL, StatusEffects.STRENGTH, 200, 0,10, .75f).maxCount(16)));

        ItemList.COOKED_DICED_POTATOES_WITH_PORKCHOP = item("cooked_diced_potatoes_with_porkchop", new Item(foodEffect(Items.BOWL, StatusEffects.RESISTANCE, 200, 0,10, .75f).maxCount(16)));

        ItemList.CHICKEN_SALAD = item("chicken_salad", new Item(food(Items.BOWL,6, .6f).maxCount(16)));

        ItemList.POTATO_SALAD = item("potato_salad", new Item(food(Items.BOWL,6, .6f).maxCount(16)));

        ItemList.CARROT_SOUP = item("carrot_soup", new Item(stew(9, .75f)));

        ItemList.SIMPLE_HAMBURGER = item("simple_hamburger", new Item(food(null, 5, 0.4f)));

        if (FabricLoader.getInstance().isModLoaded("expandeddelight") || FabricLoader.getInstance().isModLoaded("casualness_delight")) {
            ItemList.HAMBURGER_WITH_CHEESE = item("hamburger_with_cheese", new Item(food(null, 6, 0.6f)));
        }

        ItemList.HAMBURGER_WITH_EGG = item("hamburger_with_egg", new Item(food(null, 7, 0.7f)));

        ItemList.LOADED_HAMBURGER = item("loaded_hamburger", new Item(food(null, 15, 1f)));

        ItemList.CHICKEN_SANDWICH_WITH_EGG_AND_TOMATO = item("chicken_sandwich_with_egg_and_tomato", new Item(food(null, 11, .9f)));

        ItemList.STEAK_SANDWICH = item("steak_sandwich", new Item(food(null, 7, .7f)));

        ItemList.PORKCHOP_SANDWICH = item("porkchop_sandwich", new Item(food(null, 7, .7f)));

        ItemList.EGG_WITH_BACON_SANDWICH = item("egg_with_bacon_sandwich", new Item(food(null, 10, .8f)));

        ItemList.TOMATO_SANDWICH = item("tomato_sandwich", new Item(food(null, 6, .6f)));

        ItemList.BREAD_SLICE = item("bread_slice", new Item(food(null, 2, .4f)));

        ItemList.TOAST = item("toast", new Item(food(null, 2, .4f)));

        ItemList.TOAST_WITH_EGG = item("toast_with_egg", new Item(food(null, 5, .5f)));

        ItemList.TOAST_WITH_HONEY = item("toast_with_honey", new Item(food(null, 5, .5f)));

        ItemList.TOAST_WITH_SWEET_BERRIES = item("toast_with_sweet_berries", new Item(food(null, 5, .5f)));

        if (FabricLoader.getInstance().isModLoaded("nutritious-feast")) {
            ItemList.TOAST_WITH_BLUEBERRIES = item("toast_with_blueberries", new Item(food(null, 5, .5f)));
        }

        ItemList.TOAST_WITH_GLOW_BERRIES = item("toast_with_glow_berries", new Item(foodEffect(null, StatusEffects.GLOWING, 100, 0, 5, .5f)));

        ItemList.TOAST_WITH_CHOCOLATE = item("toast_with_chocolate", new Item(food(null, 5, .5f)));

        if (FabricLoader.getInstance().isModLoaded("expandeddelight") || FabricLoader.getInstance().isModLoaded("casualness_delight")) {
            ItemList.TOAST_WITH_CHEESE = item("toast_with_cheese", new Item(food(null, 5, .5f)));
        }

        if (FabricLoader.getInstance().isModLoaded("expandeddelight")) {
            ItemList.TOAST_WITH_PEANUT_BUTTER = item("toast_with_peanut_butter", new Item(food(null, 5, .5f)));
        }
    }

    private static Item item(String name, Item item) {
        ItemGroupEvents.modifyEntriesEvent(MoreDelight.GROUP).register(entries -> entries.add(item));
        return Registry.register(Registries.ITEM, Identifier.of(MoreDelight.MOD_ID, name), item);
    }

    private static Item.Settings food(Item remainder, int nutrition, float saturation) {
        return new Item.Settings()
                .recipeRemainder(remainder)
                .food(new FoodComponent.Builder()
                        .nutrition(nutrition)
                        .saturationModifier(saturation)
                        .build());
    }

    private static Item.Settings foodEffect(Item remainder, RegistryEntry<StatusEffect> effect, int duration, int amplifier, int nutrition, float saturation) {
        return new Item.Settings()
                .recipeRemainder(remainder)
                .food(new FoodComponent.Builder()
                        .nutrition(nutrition)
                        .saturationModifier(saturation)
                        .statusEffect(new StatusEffectInstance(effect, duration, amplifier), 1.0f)
                        .build());
    }

    private static Item.Settings meal(Item remainder, int nutrition, float saturation) {
        return new Item.Settings()
                .recipeRemainder(remainder)
                .maxCount(16)
                .food(new FoodComponent.Builder()
                        .nutrition(nutrition)
                        .saturationModifier(saturation)
                        .statusEffect(new StatusEffectInstance(ModEffects.NOURISHMENT, 3600, 0), 1.0f)
                        .build());
    }

    private static Item.Settings stew(int nutrition, float saturation) {
        return new Item.Settings()
                .recipeRemainder(Items.BOWL)
                .maxCount(16)
                .food(new FoodComponent.Builder()
                        .nutrition(nutrition)
                        .saturationModifier(saturation)
                        .statusEffect(new StatusEffectInstance(ModEffects.COMFORT, 3600, 0), 1.0f)
                        .build());
    }
}