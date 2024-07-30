package com.axperty.moredelight.registry;

import com.axperty.moredelight.MoreDelight;
import com.axperty.moredelight.item.ItemList;
import com.axperty.moredelight.item.ToolMaterials;
import com.nhoryzon.mc.farmersdelight.registry.EffectsRegistry;
import com.nhoryzon.mc.farmersdelight.item.KnifeItem;
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

public class ItemRegistry {

    public static void registerItems() {
        // Wooden Knife
        ItemList.WOODEN_KNIFE = knife("wooden_knife", new KnifeItem(ToolMaterials.WOOD_MATERIAL, new FabricItemSettings()));

        // Stone Knife
        ItemList.STONE_KNIFE = knife("stone_knife", new KnifeItem(ToolMaterials.STONE_MATERIAL, new FabricItemSettings()));

        // Diced Potatoes
        ItemList.DICED_POTATOES = item("diced_potatoes",
                new Item(food(null, 2, .2f)));

        // Omelette
        ItemList.OMELETTE = item("omelette", new Item(food(null, 5, .5f)));

        // Cooked Rice with Milk Cream and Beef
        ItemList.COOKED_RICE_WITH_MILK_CREAM_AND_BEEF = item("cooked_rice_with_milk_cream_and_beef", new Item(meal(Items.BOWL,10, .75f)));

        // Mashed Potatoes
        ItemList.MASHED_POTATOES = item("mashed_potatoes", new Item(food(Items.BOWL,10, .75f).maxCount(16)));

        // Pasta with Milk Cream and Ham
        ItemList.PASTA_WITH_MILK_CREAM_AND_HAM = item("pasta_with_milk_cream_and_ham", new Item(meal(Items.BOWL, 10, .75f)));

        // Cooked Diced Potatoes with Chicken Cuts
        ItemList.COOKED_DICED_POTATOES_WITH_CHICKEN_CUTS = item("cooked_diced_potatoes_with_chicken_cuts", new Item(food_special(Items.BOWL, StatusEffects.SPEED, 200, 0, 10, .75f).maxCount(16)));

        // Cooked Diced Potatoes with Chicken Cuts
        ItemList.COOKED_DICED_POTATOES_WITH_BEEF = item("cooked_diced_potatoes_with_beef", new Item(food_special(Items.BOWL, StatusEffects.STRENGTH, 200, 0,10, .75f).maxCount(16)));

        // Cooked Diced Potatoes with Porkchop
        ItemList.COOKED_DICED_POTATOES_WITH_PORKCHOP = item("cooked_diced_potatoes_with_porkchop", new Item(food_special(Items.BOWL, StatusEffects.RESISTANCE, 200, 0,10, .75f).maxCount(16)));

        // Chicken Salad
        ItemList.CHICKEN_SALAD = item("chicken_salad", new Item(food(Items.BOWL,6, .6f).maxCount(16)));

        // Potato Salad
        ItemList.POTATO_SALAD = item("potato_salad", new Item(food(Items.BOWL,6, .6f).maxCount(16)));

        // Carrot Soup
        ItemList.CARROT_SOUP = item("carrot_soup", new Item(stew(9, .75f)));

        // Chocolate Popsicle
        ItemList.CHOCOLATE_POPSICLE = item("chocolate_popsicle", new Item(food(null, 3, .2f)));

        // Chicken Sandwich with Egg and Tomato
        ItemList.CHICKEN_SANDWICH_WITH_EGG_AND_TOMATO = item("chicken_sandwich_with_egg_and_tomato", new Item(food(null, 11, .9f)));

        // Ham and Cheese Sandwich (Expanded Delight & Casualness Delight)
        if (FabricLoader.getInstance().isModLoaded("expandeddelight") || (FabricLoader.getInstance().isModLoaded("casualness_delight"))) {
            ItemList.HAM_AND_CHEESE_SANDWICH = item("ham_and_cheese_sandwich", new Item(food(null, 10, .8f)));
        }

        // Egg with Bacon Sandwich
        ItemList.EGG_WITH_BACON_SANDWICH = item("egg_with_bacon_sandwich", new Item(food(null, 10, .8f)));

        // Steak and Egg Sandwich
        ItemList.STEAK_WITH_EGG_SANDWICH = item("steak_with_egg_sandwich", new Item(food(null, 10, .8f)));

        // Tomato Sandwich
        ItemList.TOMATO_SANDWICH = item("tomato_sandwich", new Item(food(null, 6, .6f)));

        // Bread Slice
        ItemList.BREAD_SLICE = item("bread_slice", new Item(food(null, 2, .4f)));

        // Toast
        ItemList.TOAST = item("toast", new Item(food(null, 2, .4f)));

        // Toast with Egg
        ItemList.TOAST_WITH_EGG = item("toast_with_egg", new Item(food(null, 5, .5f)));

        // Toast with Honey
        ItemList.TOAST_WITH_HONEY = item("toast_with_honey", new Item(food(null, 5, .5f)));

        // Toast with Sweet Berries
        ItemList.TOAST_WITH_SWEET_BERRIES = item("toast_with_sweet_berries", new Item(food(null, 5, .5f)));

        // Toast with Blueberries (Nutritious Feast)
        if (FabricLoader.getInstance().isModLoaded("nutritious-feast")) {
            ItemList.TOAST_WITH_BLUEBERRIES = item("toast_with_blueberries", new Item(food(null, 5, .5f)));
        }

        // Toast with Glow Berries
        ItemList.TOAST_WITH_GLOW_BERRIES = item("toast_with_glow_berries", new Item(food_special(null, StatusEffects.GLOWING, 100, 0, 5, .5f)));

        // Toast with Chocolate
        ItemList.TOAST_WITH_CHOCOLATE = item("toast_with_chocolate", new Item(food(null, 5, .5f)));

        // Toast with Cheese (Expanded Delight or Casualness Delight)
        if (FabricLoader.getInstance().isModLoaded("expandeddelight") || FabricLoader.getInstance().isModLoaded("casualness_delight")) {
            ItemList.TOAST_WITH_CHEESE = item("toast_with_cheese", new Item(food(null, 5, .5f)));
        }
    }

    private static Item knife(String name, Item item) {
        ItemGroupEvents.modifyEntriesEvent(MoreDelight.GROUP).register(entries -> entries.add(item));
        return Registry.register(Registries.ITEM, new Identifier(MoreDelight.MOD_ID, name), item);
    }

    private static Item item(String name, Item item) {
        ItemGroupEvents.modifyEntriesEvent(MoreDelight.GROUP).register(entries -> entries.add(item));
        return Registry.register(Registries.ITEM, new Identifier(MoreDelight.MOD_ID, name), item);
    }

    private static FabricItemSettings food(Item remainder, int hunger, float saturation) {
        return new FabricItemSettings().recipeRemainder(remainder)
                .food(new FoodComponent.Builder()
                        .hunger(hunger)
                        .saturationModifier(saturation)
                        .build());
    }

    private static FabricItemSettings meal(Item remainder, int hunger, float saturation) {
        return new FabricItemSettings().recipeRemainder(remainder).maxCount(16)
                .food(new FoodComponent.Builder().hunger(hunger)
                        .saturationModifier(saturation)
                        .statusEffect(new StatusEffectInstance(EffectsRegistry.NOURISHMENT.get(), 3600, 0), 1.0f)
                        .build());
    }

    private static FabricItemSettings stew(int hunger, float saturation) {
                return new FabricItemSettings().recipeRemainder(Items.BOWL).maxCount(16)
                        .food(new FoodComponent.Builder().hunger(hunger)
                                .saturationModifier(saturation)
                                .statusEffect(new StatusEffectInstance(EffectsRegistry.COMFORT.get(), 3600, 0), 1.0f)
                                .build());
    }

    private static FabricItemSettings food_special(Item remainder, StatusEffect effect, int duration, int amplifier, int hunger, float saturation) {
        return new FabricItemSettings().recipeRemainder(remainder)
                .food(new FoodComponent.Builder().hunger(hunger)
                        .saturationModifier(saturation)
                        .statusEffect(new StatusEffectInstance(effect, duration, amplifier), 1.0f)
                        .build());
    }


    private static FabricItemSettings basic() {
        return new FabricItemSettings();
    }
}
