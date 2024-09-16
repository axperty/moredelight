package com.axperty.moredelight.item;

import com.axperty.moredelight.MoreDelight;
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

public class ModItems {

    public static void registerItems() {

        ModItemList.WOODEN_KNIFE = knife("wooden_knife", new KnifeItem(ModMaterials.WOOD_MATERIAL, new Item.Settings().attributeModifiers(KnifeItem.createAttributeModifiers(ModMaterials.WOOD_MATERIAL, .5f, -1.8F))));

        ModItemList.STONE_KNIFE = knife("stone_knife", new KnifeItem(ModMaterials.STONE_MATERIAL, new Item.Settings().attributeModifiers(KnifeItem.createAttributeModifiers(ModMaterials.WOOD_MATERIAL, 1.1f, -1.8F))));

        ModItemList.DICED_POTATOES = food("diced_potatoes", null, 2, 0.4f, 64);

        ModItemList.CHOCOLATE_POPSICLE = food("chocolate_popsicle", null, 3, 0.2f, 64);

        ModItemList.OMELETTE = food("omelette", null, 6, 0.6f, 64);

        ModItemList.COOKED_RICE_WITH_MILK_CREAM_AND_CHICKEN_CUTS = foodEffect("cooked_rice_with_milk_cream_and_chicken_cuts", Items.BOWL, 14, 0.8f, ModEffects.NOURISHMENT, 3600, 0, 16);

        ModItemList.COOKED_RICE_WITH_MILK_CREAM_AND_BEEF = foodEffect("cooked_rice_with_milk_cream_and_beef", Items.BOWL, 14, 0.8f, ModEffects.NOURISHMENT, 3600, 0, 16);

        ModItemList.COOKED_RICE_WITH_MILK_CREAM_AND_PORKCHOP = foodEffect("cooked_rice_with_milk_cream_and_porkchop", Items.BOWL, 14, 0.8f, ModEffects.NOURISHMENT, 3600, 0, 16);

        ModItemList.MASHED_POTATOES = food("mashed_potatoes", Items.BOWL, 12, 0.8f, 16);

        ModItemList.PASTA_WITH_MILK_CREAM_AND_HAM = foodEffect("pasta_with_milk_cream_and_ham", Items.BOWL, 12, 0.8f, ModEffects.NOURISHMENT, 3600, 0, 16);

        ModItemList.COOKED_DICED_POTATOES_WITH_CHICKEN_CUTS = food("cooked_diced_potatoes_with_chicken_cuts", Items.BOWL, 10, 0.8f, 16);

        ModItemList.COOKED_DICED_POTATOES_WITH_BEEF = food("cooked_diced_potatoes_with_beef", Items.BOWL, 10, 0.8f, 16);

        ModItemList.COOKED_DICED_POTATOES_WITH_PORKCHOP = food("cooked_diced_potatoes_with_porkchop", Items.BOWL, 10, 0.8f, 16);

        ModItemList.CHICKEN_SALAD = foodEffect("chicken_salad", Items.BOWL, 6, 0.6f, StatusEffects.REGENERATION, 100, 0, 16);

        ModItemList.POTATO_SALAD = foodEffect("potato_salad", Items.BOWL, 6, 0.6f, StatusEffects.REGENERATION, 100, 0, 16);

        ModItemList.CARROT_SOUP = stew("carrot_soup", Items.BOWL, 12, 0.8f, ModEffects.COMFORT, 3600, 0);

        ModItemList.SIMPLE_HAMBURGER = food("simple_hamburger",null, 8, 0.8f, 64);

        if (FabricLoader.getInstance().isModLoaded("expandeddelight") || FabricLoader.getInstance().isModLoaded("casualness_delight")) {
            ModItemList.HAMBURGER_WITH_CHEESE = food("hamburger_with_cheese",null, 9, 0.8f, 64);
        }

        ModItemList.HAMBURGER_WITH_EGG = food("hamburger_with_egg",null, 9, 0.8f, 64);

        ModItemList.LOADED_HAMBURGER = food("loaded_hamburger",null, 13, 0.8f, 64);

        ModItemList.CHICKEN_SANDWICH_WITH_EGG_AND_TOMATO = food("chicken_sandwich_with_egg_and_tomato",null, 11, 0.8f, 64);

        ModItemList.STEAK_SANDWICH = food("steak_sandwich",null, 10, 0.8f, 64);

        ModItemList.PORKCHOP_SANDWICH = food("porkchop_sandwich",null, 10, 0.8f, 64);

        ModItemList.EGG_WITH_BACON_SANDWICH = food("egg_with_bacon_sandwich",null, 11, 0.8f, 64);

        ModItemList.TOMATO_SANDWICH = food("tomato_sandwich",null, 7, 0.8f, 64);

        ModItemList.BREAD_SLICE = food("bread_slice",null, 2, 0.4f, 64);

        ModItemList.TOAST = food("toast",null, 3, 0.4f, 64);

        ModItemList.TOAST_WITH_EGG = food("toast_with_egg",null, 5, 0.6f, 64);

        ModItemList.TOAST_WITH_HONEY = food("toast_with_honey",null, 5, 0.6f, 64);

        ModItemList.TOAST_WITH_SWEET_BERRIES = food("toast_with_sweet_berries", null,5, 0.6f, 64);

        if (FabricLoader.getInstance().isModLoaded("nutritious-feast")) {
            ModItemList.TOAST_WITH_BLUEBERRIES = food("toast_with_blueberries",null, 5, 0.6f, 64);
        }

        ModItemList.TOAST_WITH_GLOW_BERRIES = food("toast_with_glow_berries", null, 5, 0.6f, 64);

        ModItemList.TOAST_WITH_CHOCOLATE = food("toast_with_chocolate",null, 5, 0.6f, 64);

        if (FabricLoader.getInstance().isModLoaded("expandeddelight") || FabricLoader.getInstance().isModLoaded("casualness_delight")) {
            ModItemList.TOAST_WITH_CHEESE = food("toast_with_cheese",null, 5, 0.6f, 64);
        }

        if (FabricLoader.getInstance().isModLoaded("expandeddelight")) {
            ModItemList.TOAST_WITH_PEANUT_BUTTER = food("toast_with_peanut_butter",null, 5, 0.6f, 64);
        }
    }

    private static Item knife(String name, KnifeItem knifeItem) {
        Item item = Registry.register(Registries.ITEM, Identifier.of(MoreDelight.MOD_ID, name), knifeItem);
        ItemGroupEvents.modifyEntriesEvent(MoreDelight.GROUP).register(entries -> entries.add(item));
        return item;
    }

    private static Item item(String name) {
        Item item = Registry.register(Registries.ITEM, Identifier.of(MoreDelight.MOD_ID, name),
                new Item(new Item.Settings()));
        ItemGroupEvents.modifyEntriesEvent(MoreDelight.GROUP).register(entries -> entries.add(item));
        return item;
    }

    private static Item food(String name, Item remainder, int nutrition, float saturation, int maxCount) {
        Item item = Registry.register(Registries.ITEM, Identifier.of(MoreDelight.MOD_ID, name),
                new Item(new Item.Settings().recipeRemainder(remainder).maxCount(maxCount)
                        .food(new FoodComponent.Builder().nutrition(nutrition).saturationModifier(saturation).build())));
        ItemGroupEvents.modifyEntriesEvent(MoreDelight.GROUP).register(entries -> entries.add(item));
        return item;
    }

    private static Item foodEffect(String name, Item remainder, int nutrition, float saturation, RegistryEntry<StatusEffect> effect, int duration, int amplifier, int maxCount) {
        Item item = Registry.register(Registries.ITEM, Identifier.of(MoreDelight.MOD_ID, name),
                new ModEffectToolTip(effect, duration, amplifier, new Item.Settings()
                        .recipeRemainder(remainder).maxCount(maxCount)
                        .food(new FoodComponent.Builder()
                                .nutrition(nutrition)
                                .saturationModifier(saturation)
                                .statusEffect(new StatusEffectInstance(effect, duration, amplifier), 1.0f)
                                .build())
                )
        );
        ItemGroupEvents.modifyEntriesEvent(MoreDelight.GROUP).register(entries -> entries.add(item));
        return item;
    }

    private static Item stew(String name, Item remainder, int nutrition, float saturation, RegistryEntry<StatusEffect> effect, int duration, int amplifier) {
        Item item = Registry.register(Registries.ITEM, Identifier.of(MoreDelight.MOD_ID, name),
                new ModEffectToolTip(effect, duration, amplifier, new Item.Settings()
                        .recipeRemainder(remainder)
                        .food(new FoodComponent.Builder()
                                .nutrition(nutrition)
                                .saturationModifier(saturation)
                                .statusEffect(new StatusEffectInstance(effect, duration, amplifier), 1.0f)
                                .build())
                )
        );
        ItemGroupEvents.modifyEntriesEvent(MoreDelight.GROUP).register(entries -> entries.add(item));
        return item;
    }

    private static Item meal(String name, int nutrition, float saturation) {
        Item item = Registry.register(Registries.ITEM, Identifier.of(MoreDelight.MOD_ID, name),
                new Item(new Item.Settings().recipeRemainder(Items.BOWL).maxCount(16)
                        .food(new FoodComponent.Builder().nutrition(nutrition).saturationModifier(saturation)
                                .build())));
        ItemGroupEvents.modifyEntriesEvent(MoreDelight.GROUP).register(entries -> entries.add(item));
        return item;
    }
}