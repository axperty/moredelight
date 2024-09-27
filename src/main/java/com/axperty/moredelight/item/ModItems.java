package com.axperty.moredelight.item;

import com.axperty.moredelight.MoreDelight;
import com.nhoryzon.mc.farmersdelight.item.ConsumableItem;
import com.nhoryzon.mc.farmersdelight.item.KnifeItem;
import com.nhoryzon.mc.farmersdelight.registry.EffectsRegistry;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Item WOODEN_KNIFE = registerItem("wooden_knife",
            new KnifeItem(ModMaterials.WOOD_MATERIAL,
                    new FabricItemSettings()
                    .group(ModCreativeTab.CREATIVE_MODE_TAB))
    );

    public static final Item STONE_KNIFE = registerItem("stone_knife",
            new KnifeItem(ModMaterials.STONE_MATERIAL,
                    new FabricItemSettings()
                    .group(ModCreativeTab.CREATIVE_MODE_TAB))
    );

    public static final Item DICED_POTATOES = registerItem("diced_potatoes",
            new ConsumableItem(new FabricItemSettings()
                    .food((new FoodComponent.Builder()).hunger(2).saturationModifier(.4f).build())
                    .group(ModCreativeTab.CREATIVE_MODE_TAB),
                    false, false)
    );

    public static final Item CHOCOLATE_POPSICLE = registerItem("chocolate_popsicle",
            new ConsumableItem(new FabricItemSettings()
                    .food((new FoodComponent.Builder()).hunger(3).saturationModifier(.2f).build())
                    .group(ModCreativeTab.CREATIVE_MODE_TAB),
                    false, false)
    );

    public static final Item OMELETTE = registerItem("omelette",
            new ConsumableItem(new FabricItemSettings()
                    .food((new FoodComponent.Builder()).hunger(6).saturationModifier(.6f).build())
                    .group(ModCreativeTab.CREATIVE_MODE_TAB),
            false, false)
    );

    public static final Item COOKED_RICE_WITH_MILK_CREAM_AND_CHICKEN_CUTS = registerItem("cooked_rice_with_milk_cream_and_chicken_cuts",
            new ConsumableItem(new FabricItemSettings()
                    .food(new FoodComponent.Builder().hunger(14).saturationModifier(.8f).statusEffect(new StatusEffectInstance(EffectsRegistry.NOURISHMENT.get(), 3600, 0), 1.0f).build())
                    .recipeRemainder(Items.BOWL)
                    .maxCount(16)
                    .group(ModCreativeTab.CREATIVE_MODE_TAB),
                    true, false)
    );

    public static final Item COOKED_RICE_WITH_MILK_CREAM_AND_BEEF = registerItem("cooked_rice_with_milk_cream_and_beef",
            new ConsumableItem(new FabricItemSettings()
                    .food(new FoodComponent.Builder().hunger(14).saturationModifier(.8f).statusEffect(new StatusEffectInstance(EffectsRegistry.NOURISHMENT.get(), 3600, 0), 1.0f).build())
                    .recipeRemainder(Items.BOWL)
                    .maxCount(16)
                    .group(ModCreativeTab.CREATIVE_MODE_TAB),
                    true, false)
    );

    public static final Item COOKED_RICE_WITH_MILK_CREAM_AND_PORKCHOP = registerItem("cooked_rice_with_milk_cream_and_porkchop",
            new ConsumableItem(new FabricItemSettings()
                    .food(new FoodComponent.Builder().hunger(14).saturationModifier(.8f).statusEffect(new StatusEffectInstance(EffectsRegistry.NOURISHMENT.get(), 3600, 0), 1.0f).build())
                    .recipeRemainder(Items.BOWL)
                    .maxCount(16)
                    .group(ModCreativeTab.CREATIVE_MODE_TAB),
                    true, false)
    );

    public static final Item MASHED_POTATOES = registerItem("mashed_potatoes",
            new ConsumableItem(new FabricItemSettings()
                    .food((new FoodComponent.Builder()).hunger(12).saturationModifier(.8f).build())
                    .recipeRemainder(Items.BOWL)
                    .maxCount(16)
                    .group(ModCreativeTab.CREATIVE_MODE_TAB),
                    false, false)
    );

    public static final Item PASTA_WITH_MILK_CREAM_AND_HAM = registerItem("pasta_with_milk_cream_and_ham",
            new ConsumableItem(new FabricItemSettings()
                    .food(new FoodComponent.Builder().hunger(12).saturationModifier(.8f).statusEffect(new StatusEffectInstance(EffectsRegistry.NOURISHMENT.get(), 3600, 0), 1.0f).build())
                    .recipeRemainder(Items.BOWL)
                    .maxCount(16)
                    .group(ModCreativeTab.CREATIVE_MODE_TAB),
            true, false)
    );

    public static final Item COOKED_DICED_POTATOES_WITH_CHICKEN_CUTS = registerItem("cooked_diced_potatoes_with_chicken_cuts",
            new ConsumableItem(new FabricItemSettings()
                    .food((new FoodComponent.Builder()).hunger(10).saturationModifier(.8f).build())
                    .recipeRemainder(Items.BOWL)
                    .maxCount(16)
                    .group(ModCreativeTab.CREATIVE_MODE_TAB),
            false, false)
    );

    public static final Item COOKED_DICED_POTATOES_WITH_BEEF = registerItem("cooked_diced_potatoes_with_beef",
            new ConsumableItem(new FabricItemSettings()
                    .food((new FoodComponent.Builder()).hunger(10).saturationModifier(.8f).build())
                    .recipeRemainder(Items.BOWL)
                    .maxCount(16)
                    .group(ModCreativeTab.CREATIVE_MODE_TAB),
                    false, false)
    );

    public static final Item COOKED_DICED_POTATOES_WITH_PORKCHOP = registerItem("cooked_diced_potatoes_with_porkchop",
            new ConsumableItem(new FabricItemSettings()
                    .food((new FoodComponent.Builder()).hunger(10).saturationModifier(.8f).build())
                    .recipeRemainder(Items.BOWL)
                    .maxCount(16)
                    .group(ModCreativeTab.CREATIVE_MODE_TAB),
            false, false)
    );

    public static final Item CHICKEN_SALAD = registerItem("chicken_salad",
            new ConsumableItem(new FabricItemSettings()
                    .food(new FoodComponent.Builder().hunger(6).saturationModifier(.6f).statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 100, 0), 1.0f).build())
                    .recipeRemainder(Items.BOWL)
                    .maxCount(16)
                    .group(ModCreativeTab.CREATIVE_MODE_TAB),
                    true, false)
    );

    public static final Item POTATO_SALAD = registerItem("potato_salad",
            new ConsumableItem(new FabricItemSettings()
                    .food(new FoodComponent.Builder().hunger(6).saturationModifier(.6f).statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 100, 0), 1.0f).build())
                    .recipeRemainder(Items.BOWL)
                    .maxCount(16)
                    .group(ModCreativeTab.CREATIVE_MODE_TAB),
            true, false)
    );

    public static final Item CARROT_SOUP = registerItem("carrot_soup",
            new ConsumableItem(new FabricItemSettings()
                    .food(new FoodComponent.Builder().hunger(12).saturationModifier(.8f).statusEffect(new StatusEffectInstance(EffectsRegistry.COMFORT.get(), 3600, 0), 1.0f).build())
                    .recipeRemainder(Items.BOWL)
                    .maxCount(16)
                    .group(ModCreativeTab.CREATIVE_MODE_TAB),
                    true, false)
    );

    public static final Item SIMPLE_HAMBURGER = registerItem("simple_hamburger",
            new ConsumableItem(new FabricItemSettings()
                    .food((new FoodComponent.Builder()).hunger(8).saturationModifier(.8f).build())
                    .group(ModCreativeTab.CREATIVE_MODE_TAB),
                    false, false)
    );

    public static final Item HAMBURGER_WITH_CHEESE = FabricLoader.getInstance().isModLoaded("expandeddelight") || FabricLoader.getInstance().isModLoaded("casualness_delight") ?
            registerItem("hamburger_with_cheese",
                    new ConsumableItem(new FabricItemSettings()
                    .food((new FoodComponent.Builder()).hunger(9).saturationModifier(.8f).build())
                    .group(ModCreativeTab.CREATIVE_MODE_TAB),
                    false, false)
            ): null;

    public static final Item HAMBURGER_WITH_EGG = registerItem("hamburger_with_egg",
            new ConsumableItem(new FabricItemSettings()
                    .food((new FoodComponent.Builder()).hunger(9).saturationModifier(.8f).build())
                    .group(ModCreativeTab.CREATIVE_MODE_TAB),
            false, false)
    );

    public static final Item LOADED_HAMBURGER = registerItem("loaded_hamburger",
            new ConsumableItem(new FabricItemSettings()
                    .food((new FoodComponent.Builder()).hunger(13).saturationModifier(.8f).build())
                    .group(ModCreativeTab.CREATIVE_MODE_TAB),
            false, false)
    );

    public static final Item CHICKEN_SANDWICH_WITH_EGG_AND_TOMATO = registerItem("chicken_sandwich_with_egg_and_tomato",
            new ConsumableItem(new FabricItemSettings()
                    .food((new FoodComponent.Builder()).hunger(11).saturationModifier(.8f).build())
                    .group(ModCreativeTab.CREATIVE_MODE_TAB),
                    false, false)
    );

    public static final Item STEAK_SANDWICH = registerItem("steak_sandwich",
            new ConsumableItem(new FabricItemSettings()
                    .food((new FoodComponent.Builder()).hunger(10).saturationModifier(.8f).build())
                    .group(ModCreativeTab.CREATIVE_MODE_TAB),
                    false, false)
    );

    public static final Item PORKCHOP_SANDWICH = registerItem("porkchop_sandwich",
            new ConsumableItem(new FabricItemSettings()
                    .food((new FoodComponent.Builder()).hunger(10).saturationModifier(.8f).build())
                    .group(ModCreativeTab.CREATIVE_MODE_TAB),
                    false, false)
    );

    public static final Item EGG_WITH_BACON_SANDWICH = registerItem("egg_with_bacon_sandwich",
            new ConsumableItem(new FabricItemSettings()
                    .food((new FoodComponent.Builder()).hunger(11).saturationModifier(.8f).build())
                    .group(ModCreativeTab.CREATIVE_MODE_TAB),
                    false, false)
    );

    public static final Item TOMATO_SANDWICH = registerItem("tomato_sandwich",
            new ConsumableItem(new FabricItemSettings()
                    .food((new FoodComponent.Builder()).hunger(7).saturationModifier(.8f).build())
                    .group(ModCreativeTab.CREATIVE_MODE_TAB),
                    false, false)
    );

    public static final Item BREAD_SLICE = registerItem("bread_slice",
            new ConsumableItem(new FabricItemSettings()
                    .food((new FoodComponent.Builder()).hunger(2).saturationModifier(.4f).build())
                    .group(ModCreativeTab.CREATIVE_MODE_TAB),
                    false, false)
    );

    public static final Item TOAST = registerItem("toast",
            new ConsumableItem(new FabricItemSettings()
                    .food((new FoodComponent.Builder()).hunger(3).saturationModifier(.4f).build())
                    .group(ModCreativeTab.CREATIVE_MODE_TAB),
            false, false)
    );

    public static final Item TOAST_WITH_EGG = registerItem("toast_with_egg",
            new ConsumableItem(new FabricItemSettings()
                    .food((new FoodComponent.Builder()).hunger(5).saturationModifier(.6f).build())
                    .group(ModCreativeTab.CREATIVE_MODE_TAB),
                    false, false)
    );

    public static final Item TOAST_WITH_HONEY = registerItem("toast_with_honey",
            new ConsumableItem(new FabricItemSettings()
                    .food((new FoodComponent.Builder()).hunger(5).saturationModifier(.6f).build())
                    .group(ModCreativeTab.CREATIVE_MODE_TAB),
                    false, false)
    );

    public static final Item TOAST_WITH_SWEET_BERRIES = registerItem("toast_with_sweet_berries",
            new ConsumableItem(new FabricItemSettings()
                    .food((new FoodComponent.Builder()).hunger(5).saturationModifier(.6f).build())
                    .group(ModCreativeTab.CREATIVE_MODE_TAB),
                    false, false)
    );

    public static final Item TOAST_WITH_GLOW_BERRIES = registerItem("toast_with_glow_berries",
            new ConsumableItem(new FabricItemSettings()
                    .food((new FoodComponent.Builder()).hunger(5).saturationModifier(.6f).build())
                    .group(ModCreativeTab.CREATIVE_MODE_TAB),
                    false, false)
    );

    public static final Item TOAST_WITH_CHOCOLATE = registerItem("toast_with_chocolate",
            new ConsumableItem(new FabricItemSettings()
                    .food((new FoodComponent.Builder()).hunger(5).saturationModifier(.6f).build())
                    .group(ModCreativeTab.CREATIVE_MODE_TAB),
                    false, false)
    );

    public static final Item TOAST_WITH_CHEESE = FabricLoader.getInstance().isModLoaded("expandeddelight") || FabricLoader.getInstance().isModLoaded("casualness_delight") ?
            registerItem("toast_with_cheese",
                    new ConsumableItem(new FabricItemSettings()
                            .food((new FoodComponent.Builder()).hunger(5).saturationModifier(.6f).build())
                            .group(ModCreativeTab.CREATIVE_MODE_TAB),
                            false, false)
            ): null;

    public static final Item TOAST_WITH_PEANUT_BUTTER = FabricLoader.getInstance().isModLoaded("expandeddelight") ?
            registerItem("toast_with_peanut_butter",
                    new ConsumableItem(new FabricItemSettings()
                            .food((new FoodComponent.Builder()).hunger(5).saturationModifier(.6f).build())
                            .group(ModCreativeTab.CREATIVE_MODE_TAB),
                            false, false)
            ): null;

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(MoreDelight.MOD_ID, name), item);
    }

    public static void registerModItems() {
        MoreDelight.LOGGER.debug("Registering Mod Items for " + MoreDelight.MOD_ID);
    }
}