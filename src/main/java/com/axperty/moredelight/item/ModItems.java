package com.axperty.moredelight.item;

import com.axperty.moredelight.MoreDelight;
import com.nhoryzon.mc.farmersdelight.item.KnifeItem;
import com.nhoryzon.mc.farmersdelight.registry.EffectsRegistry;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {
    public static final Item WOODEN_KNIFE = registerItem("wooden_knife",
            new KnifeItem(ModMaterials.WOOD_MATERIAL, new FabricItemSettings().group(ModCreativeTab.CREATIVE_MODE_TAB)));

    public static final Item STONE_KNIFE = registerItem("stone_knife",
            new KnifeItem(ModMaterials.STONE_MATERIAL, new FabricItemSettings().group(ModCreativeTab.CREATIVE_MODE_TAB)));

    public static final Item DICED_POTATOES = registerItem("diced_potatoes",
            new Item(food(null, 2, 0.4f).group(ModCreativeTab.CREATIVE_MODE_TAB)));

    public static final Item CHOCOLATE_POPSICLE = registerItem("chocolate_popsicle",
            new Item(food(null, 3, 0.2f).group(ModCreativeTab.CREATIVE_MODE_TAB)));

    public static final Item OMELETTE = registerItem("omelette",
            new Item(food(null, 6, 0.6f).group(ModCreativeTab.CREATIVE_MODE_TAB)));

    public static final Item COOKED_RICE_WITH_MILK_CREAM_AND_CHICKEN_CUTS = registerItem("cooked_rice_with_milk_cream_and_chicken_cuts",
            foodEffect(Items.BOWL, EffectsRegistry.NOURISHMENT.get(), 3600, 0, 14, 0.8f));

    public static final Item COOKED_RICE_WITH_MILK_CREAM_AND_BEEF = registerItem("cooked_rice_with_milk_cream_and_beef",
            foodEffect(Items.BOWL, EffectsRegistry.NOURISHMENT.get(), 3600, 0, 14, 0.8f));

    public static final Item COOKED_RICE_WITH_MILK_CREAM_AND_PORKCHOP = registerItem("cooked_rice_with_milk_cream_and_porkchop",
            foodEffect(Items.BOWL, EffectsRegistry.NOURISHMENT.get(), 3600, 0, 14, 0.8f));

    public static final Item MASHED_POTATOES = registerItem("mashed_potatoes",
            new Item(food(Items.BOWL,12, 0.8f).maxCount(16).group(ModCreativeTab.CREATIVE_MODE_TAB)));

    public static final Item PASTA_WITH_MILK_CREAM_AND_HAM = registerItem("pasta_with_milk_cream_and_ham",
            foodEffect(Items.BOWL, EffectsRegistry.NOURISHMENT.get(), 3600, 0, 12, 0.8f));

    public static final Item COOKED_DICED_POTATOES_WITH_CHICKEN_CUTS = registerItem("cooked_diced_potatoes_with_chicken_cuts",
            new Item(food(Items.BOWL, 10, 0.8f)));

    public static final Item COOKED_DICED_POTATOES_WITH_BEEF = registerItem("cooked_diced_potatoes_with_beef",
            new Item(food(Items.BOWL, 10, 0.8f)));

    public static final Item COOKED_DICED_POTATOES_WITH_PORKCHOP = registerItem("cooked_diced_potatoes_with_porkchop",
            new Item(food(Items.BOWL, 10, 0.8f)));

    public static final Item CHICKEN_SALAD = registerItem("chicken_salad",
            foodEffect(Items.BOWL, StatusEffects.REGENERATION, 100, 0, 6, 0.6f));

    public static final Item POTATO_SALAD = registerItem("potato_salad",
            foodEffect(Items.BOWL, StatusEffects.REGENERATION, 100, 0, 6, 0.6f));

    public static final Item CARROT_SOUP = registerItem("carrot_soup",
            foodEffect(Items.BOWL, EffectsRegistry.COMFORT.get(), 3600, 0, 12, 0.8f));

    public static final Item SIMPLE_HAMBURGER = registerItem("simple_hamburger",
            new Item(food(null, 8, 0.8f).group(ModCreativeTab.CREATIVE_MODE_TAB)));

    public static final Item HAMBURGER_WITH_CHEESE = FabricLoader.getInstance().isModLoaded("expandeddelight") || FabricLoader.getInstance().isModLoaded("casualness_delight") ?
            registerItem("hamburger_with_cheese", new Item(food(null, 9, 0.8f).group(ModCreativeTab.CREATIVE_MODE_TAB))): null;

    public static final Item HAMBURGER_WITH_EGG = registerItem("hamburger_with_egg",
            new Item(food(null, 9, 0.8f).group(ModCreativeTab.CREATIVE_MODE_TAB)));

    public static final Item LOADED_HAMBURGER = registerItem("loaded_hamburger",
            new Item(food(null, 13, 0.8f).group(ModCreativeTab.CREATIVE_MODE_TAB)));

    public static final Item CHICKEN_SANDWICH_WITH_EGG_AND_TOMATO = registerItem("chicken_sandwich_with_egg_and_tomato",
            new Item(food(null, 11, 0.8f).group(ModCreativeTab.CREATIVE_MODE_TAB)));

    public static final Item STEAK_SANDWICH = registerItem("steak_sandwich",
            new Item(food(null, 10, 0.8f).group(ModCreativeTab.CREATIVE_MODE_TAB)));

    public static final Item PORKCHOP_SANDWICH = registerItem("porkchop_sandwich",
            new Item(food(null, 10, 0.8f).group(ModCreativeTab.CREATIVE_MODE_TAB)));

    public static final Item EGG_WITH_BACON_SANDWICH = registerItem("egg_with_bacon_sandwich",
            new Item(food(null, 11, 0.8f).group(ModCreativeTab.CREATIVE_MODE_TAB)));

    public static final Item TOMATO_SANDWICH = registerItem("tomato_sandwich",
            new Item(food(null, 7, 0.8f).group(ModCreativeTab.CREATIVE_MODE_TAB)));

    public static final Item BREAD_SLICE = registerItem("bread_slice",
            new Item(food(null, 2, 0.4f).group(ModCreativeTab.CREATIVE_MODE_TAB)));

    public static final Item TOAST = registerItem("toast",
            new Item(food(null, 3, 0.4f).group(ModCreativeTab.CREATIVE_MODE_TAB)));

    public static final Item TOAST_WITH_EGG = registerItem("toast_with_egg",
            new Item(food(null, 5, 0.6f).group(ModCreativeTab.CREATIVE_MODE_TAB)));

    public static final Item TOAST_WITH_HONEY = registerItem("toast_with_honey",
            new Item(food(null, 5, 0.6f).group(ModCreativeTab.CREATIVE_MODE_TAB)));

    public static final Item TOAST_WITH_SWEET_BERRIES = registerItem("toast_with_sweet_berries",
            new Item(food(null, 5, 0.6f).group(ModCreativeTab.CREATIVE_MODE_TAB)));

    public static final Item TOAST_WITH_GLOW_BERRIES = registerItem("toast_with_glow_berries",
            new Item(food(null, 5, 0.6f).group(ModCreativeTab.CREATIVE_MODE_TAB)));

    public static final Item TOAST_WITH_CHOCOLATE = registerItem("toast_with_chocolate",
            new Item(food(null, 5, 0.6f).group(ModCreativeTab.CREATIVE_MODE_TAB)));

    public static final Item TOAST_WITH_CHEESE = FabricLoader.getInstance().isModLoaded("expandeddelight") || FabricLoader.getInstance().isModLoaded("casualness_delight") ?
            registerItem("toast_with_cheese", new Item(food(null, 5, 0.6f).group(ModCreativeTab.CREATIVE_MODE_TAB))): null;

    public static final Item TOAST_WITH_PEANUT_BUTTER = FabricLoader.getInstance().isModLoaded("expandeddelight") ?
            registerItem("toast_with_peanut_butter", new Item(food(null, 5, 0.6f).group(ModCreativeTab.CREATIVE_MODE_TAB))): null;

    private static FabricItemSettings food(Item remainder, int hunger, float saturation) {
        return new FabricItemSettings()
                .recipeRemainder(remainder)
                .food(new FoodComponent.Builder()
                        .hunger(hunger)
                        .saturationModifier(saturation)
                        .build());
    }

    private static ModEffectToolTip foodEffect(Item remainder, StatusEffect effect, int duration, int amplifier, int hunger, float saturation) {
        return new ModEffectToolTip(effect, duration, amplifier, new FabricItemSettings()
                .recipeRemainder(remainder)
                .food(new FoodComponent.Builder()
                        .hunger(hunger)
                        .saturationModifier(saturation)
                        .build())
        .group(ModCreativeTab.CREATIVE_MODE_TAB));
    }

    private static FabricItemSettings meal(Item remainder, int hunger, float saturation) {
        return new FabricItemSettings()
                .recipeRemainder(remainder)
                .maxCount(16)
                .food(new FoodComponent.Builder()
                        .hunger(hunger)
                        .saturationModifier(saturation)
                        .statusEffect(new StatusEffectInstance(EffectsRegistry.NOURISHMENT.get(), 3600, 0), 1.0f)
                        .build());
    }

    private static FabricItemSettings stew(int hunger, float saturation) {
        return new FabricItemSettings().recipeRemainder(Items.BOWL).maxCount(16)
                .food(new FoodComponent.Builder()
                        .hunger(hunger)
                        .saturationModifier(saturation)
                        .statusEffect(new StatusEffectInstance(EffectsRegistry.COMFORT.get(), 2400, 0), 1.0f)
                        .build());
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(MoreDelight.MOD_ID, name), item);
    }

    public static void registerModItems() {
        MoreDelight.LOGGER.debug("Registering Mod Items for " + MoreDelight.MOD_ID);
    }
}