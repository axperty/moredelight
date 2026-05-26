package com.axperty.moredelight;

import com.axperty.delightlib.api.DelightAddon;
import com.axperty.delightlib.api.DelightApi;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ToolMaterial;
import vectorwing.farmersdelight.common.FoodValues;
import vectorwing.farmersdelight.common.registry.ModEffects;

public class MoreDelight implements ModInitializer {
    public static final String MOD_ID = "moredelight";
    public static DelightApi addon;

    @Override
    public void onInitialize() {

        // Creative Tab Registry
        addon = DelightAddon.create(MOD_ID)
                .withCreativeTab("More Delight",
                        () -> new ItemStack(Items.COOKED_CHICKEN));

        // Wooden Knife
        addon.knife("wooden_knife", ToolMaterial.WOOD)
                .attackSpeed(-2.0f)
                .build();

        addon.shapedRecipe("wooden_knife")
                .grid("A", "B")
                .defineTag('A', "minecraft:planks")
                .define('B', "minecraft:stick")
                .result("moredelight:wooden_knife", 1)
                .build();

        // Stone Knife
        addon.knife("stone_knife", ToolMaterial.STONE)
                .attackSpeed(-2.0f)
                .build();

        addon.shapedRecipe("stone_knife")
                .grid("A", "B")
                .defineTag('A', "minecraft:stone_crafting_materials")
                .define('B', "minecraft:stick")
                .result("moredelight:stone_knife", 1)
                .build();

        // Diced Potatoes
        addon.food("diced_potatoes")
                .nutrition(2)
                .saturation(0.4f)
                .build();

        // Chocolate Popsicle
        addon.food("chocolate_popsicle")
                .nutrition(3)
                .saturation(0.2f)
                .build();

        addon.shapedRecipe("chocolate_popsicle")
                .grid(" CC", "ICC", "SI ")
                .define('C', "minecraft:cocoa_beans")
                .define('I', "minecraft:ice")
                .define('S', "minecraft:stick")
                .result("moredelight:chocolate_popsicle", 1)
                .build();

        // Omelette
        addon.food("omelette")
                .nutrition(6)
                .saturation(0.6f)
                .build();

        // Cooked Rice with Chicken Cuts
        addon.food("cooked_rice_with_chicken_cuts")
                .nutrition(14)
                .saturation(0.8f)
                .withEffect(ModEffects.NOURISHMENT, FoodValues.MEDIUM_DURATION, 0, 1.0f)
                .bowlFood()
                .build();

        addon.cookingRecipe("cooked_rice_with_chicken_cuts")
                .addTagIngredient("c:drinks/milk")
                .addTagIngredient("c:crops/rice")
                .addTagIngredient("c:foods/raw_chicken")
                .result("moredelight:cooked_rice_with_chicken_cuts")
                .container("minecraft:bowl")
                .experience(1.0f)
                .cookingTime(400)
                .recipeBookTab("meals")
                .build();

        // Cooked Rice with Beef
        addon.food("cooked_rice_with_beef")
                .nutrition(14)
                .saturation(0.8f)
                .withEffect(ModEffects.NOURISHMENT, FoodValues.MEDIUM_DURATION, 0, 1.0f)
                .bowlFood()
                .build();

        addon.cookingRecipe("cooked_rice_with_beef")
                .addTagIngredient("c:drinks/milk")
                .addTagIngredient("c:crops/rice")
                .addTagIngredient("c:foods/raw_beef")
                .result("moredelight:cooked_rice_with_beef")
                .container("minecraft:bowl")
                .experience(1.0f)
                .cookingTime(400)
                .recipeBookTab("meals")
                .build();

        // Cooked Rice with Porkchop
        addon.food("cooked_rice_with_porkchop")
                .nutrition(14)
                .saturation(0.8f)
                .withEffect(ModEffects.NOURISHMENT, FoodValues.MEDIUM_DURATION, 0, 1.0f)
                .bowlFood()
                .build();

        addon.cookingRecipe("cooked_rice_with_porkchop")
                .addTagIngredient("c:drinks/milk")
                .addTagIngredient("c:crops/rice")
                .addIngredient("minecraft:porkchop")
                .result("moredelight:cooked_rice_with_porkchop")
                .container("minecraft:bowl")
                .experience(1.0f)
                .cookingTime(400)
                .recipeBookTab("meals")
                .build();

        // Creamy Pasta with Ham
        addon.food("creamy_pasta_with_ham")
                .nutrition(12)
                .saturation(0.8f)
                .withEffect(ModEffects.NOURISHMENT, FoodValues.MEDIUM_DURATION, 0, 1.0f)
                .bowlFood()
                .build();

        addon.cookingRecipe("creamy_pasta_with_ham")
                .addTagIngredient("c:drinks/milk")
                .addTagIngredient("c:foods/pasta")
                .addIngredient("farmersdelight:ham")
                .addTagIngredient("c:crops/onion")
                .result("moredelight:creamy_pasta_with_ham")
                .container("minecraft:bowl")
                .experience(1.0f)
                .cookingTime(400)
                .recipeBookTab("meals")
                .build();

        // Creamy Pasta with Chicken Cuts
        addon.food("creamy_pasta_with_chicken_cuts")
                .nutrition(12)
                .saturation(0.8f)
                .withEffect(ModEffects.NOURISHMENT, FoodValues.MEDIUM_DURATION, 0, 1.0f)
                .bowlFood()
                .build();

        addon.cookingRecipe("creamy_pasta_with_chicken_cuts")
                .addTagIngredient("c:drinks/milk")
                .addTagIngredient("c:foods/pasta")
                .addTagIngredient("c:foods/raw_chicken")
                .addTagIngredient("c:crops/onion")
                .result("moredelight:creamy_pasta_with_chicken_cuts")
                .container("minecraft:bowl")
                .experience(1.0f)
                .cookingTime(400)
                .recipeBookTab("meals")
                .build();

        // Mashed Potatoes
        addon.food("mashed_potatoes")
                .nutrition(12)
                .saturation(0.8f)
                .bowlFood()
                .build();

        addon.cookingRecipe("mashed_potatoes")
                .addTagIngredient("c:drinks/milk")
                .addIngredient("moredelight:diced_potatoes")
                .addIngredient("moredelight:diced_potatoes")
                .result("moredelight:mashed_potatoes")
                .container("minecraft:bowl")
                .experience(1.0f)
                .cookingTime(400)
                .recipeBookTab("meals")
                .build();

        // Diced Potatoes with Chicken Cuts
        addon.food("diced_potatoes_with_chicken_cuts")
                .nutrition(10)
                .saturation(0.8f)
                .bowlFood()
                .build();

        addon.cookingRecipe("diced_potatoes_with_chicken_cuts")
                .addTagIngredient("c:foods/raw_chicken")
                .addIngredient("moredelight:diced_potatoes")
                .addTagIngredient("c:crops/onion")
                .result("moredelight:diced_potatoes_with_chicken_cuts")
                .container("minecraft:bowl")
                .experience(1.0f)
                .cookingTime(400)
                .recipeBookTab("meals")
                .build();

        // Diced Potatoes with Beef
        addon.food("diced_potatoes_with_beef")
                .nutrition(10)
                .saturation(0.8f)
                .bowlFood()
                .build();

        addon.cookingRecipe("diced_potatoes_with_beef")
                .addTagIngredient("c:foods/raw_beef")
                .addIngredient("moredelight:diced_potatoes")
                .addTagIngredient("c:crops/onion")
                .result("moredelight:diced_potatoes_with_beef")
                .container("minecraft:bowl")
                .experience(1.0f)
                .cookingTime(400)
                .recipeBookTab("meals")
                .build();

        // Diced Potatoes with Porkchop
        addon.food("diced_potatoes_with_porkchop")
                .nutrition(10)
                .saturation(0.8f)
                .bowlFood()
                .build();

        addon.cookingRecipe("diced_potatoes_with_porkchop")
                .addIngredient("minecraft:porkchop")
                .addIngredient("moredelight:diced_potatoes")
                .addTagIngredient("c:crops/onion")
                .result("moredelight:diced_potatoes_with_porkchop")
                .container("minecraft:bowl")
                .experience(1.0f)
                .cookingTime(400)
                .recipeBookTab("meals")
                .build();

        // Diced Potatoes with Egg and Tomato
        addon.food("diced_potatoes_with_egg_and_tomato")
                .nutrition(10)
                .saturation(0.8f)
                .bowlFood()
                .build();

        addon.cookingRecipe("diced_potatoes_with_egg_and_tomato")
                .addIngredient("moredelight:diced_potatoes")
                .addTagIngredient("c:foods/cooked_egg")
                .addTagIngredient("c:crops/tomato")
                .addTagIngredient("c:crops/onion")
                .result("moredelight:diced_potatoes_with_egg_and_tomato")
                .container("minecraft:bowl")
                .experience(1.0f)
                .cookingTime(400)
                .recipeBookTab("meals")
                .build();

        // Potato Salad
        addon.food("potato_salad")
                .nutrition(6)
                .saturation(0.6f)
                .withEffect(MobEffects.REGENERATION, 100, 0, 1.0F)
                .bowlFood()
                .build();

        addon.cookingRecipe("potato_salad")
                .addTagIngredient("c:eggs")
                .addIngredient("moredelight:diced_potatoes")
                .addTagIngredient("c:crops/onion")
                .result("moredelight:potato_salad")
                .container("minecraft:bowl")
                .experience(1.0f)
                .cookingTime(400)
                .recipeBookTab("meals")
                .build();

        // Chicken Salad
        addon.food("chicken_salad")
                .nutrition(6)
                .saturation(0.6f)
                .withEffect(MobEffects.REGENERATION, 100, 0, 1.0F)
                .bowlFood()
                .build();

        addon.shapelessRecipe("chicken_salad")
                .addIngredient("minecraft:bowl")
                .addTagIngredient("c:crops/cabbage")
                .addTagIngredient("c:crops/tomato")
                .addTagIngredient("c:foods/cooked_chicken")
                .addTagIngredient("c:crops/onion")
                .result("moredelight:chicken_salad", 1)
                .build();

        // Carrot Soup
        addon.food("carrot_soup")
                .nutrition(12)
                .saturation(0.8f)
                .withEffect(ModEffects.NOURISHMENT, FoodValues.MEDIUM_DURATION, 0, 1.0F)
                .bowlFood()
                .build();

        addon.cookingRecipe("carrot_soup")
                .addTagIngredient("c:drinks/milk")
                .addTagIngredient("c:crops/carrot")
                .addTagIngredient("c:crops/carrot")
                .result("moredelight:carrot_soup")
                .container("minecraft:bowl")
                .experience(1.0f)
                .cookingTime(400)
                .recipeBookTab("meals")
                .build();

        // Simple Hamburger
        addon.food("simple_hamburger")
                .nutrition(8)
                .saturation(0.8f)
                .build();

        addon.shapelessRecipe("simple_hamburger")
                .addTagIngredient("c:foods/bread")
                .addIngredient("farmersdelight:beef_patty")
                .result("moredelight:simple_hamburger", 1)
                .build();

        // Hamburger with Cheese
        // (Not available on Fabric 26.1)
        //if (FabricLoader.getInstance().isModLoaded("casualness_delight") || FabricLoader.getInstance().isModLoaded("expandeddelight")) {
        //    addon.food("hamburger_with_cheese")
        //            .nutrition(9)
        //            .saturation(0.8f)
        //            .build();
        //}

        // Hamburger with Egg
        addon.food("hamburger_with_egg")
                .nutrition(9)
                .saturation(0.8f)
                .build();

        addon.shapelessRecipe("hamburger_with_egg")
                .addTagIngredient("c:foods/bread")
                .addIngredient("farmersdelight:beef_patty")
                .addTagIngredient("c:foods/cooked_egg")
                .result("moredelight:hamburger_with_egg", 1)
                .build();

        // Loaded Hamburger
        addon.food("loaded_hamburger")
                .nutrition(13)
                .saturation(0.8f)
                .build();

        addon.shapelessRecipe("loaded_hamburger")
                .addTagIngredient("c:foods/bread")
                .addIngredient("farmersdelight:beef_patty")
                .addTagIngredient("c:foods/leafy_green")
                .addTagIngredient("c:crops/tomato")
                .addTagIngredient("c:foods/cooked_bacon")
                .addTagIngredient("c:foods/cooked_egg")
                .addTagIngredient("c:crops/onion")
                .result("moredelight:loaded_hamburger", 1)
                .build();

        // Chicken Sandwich with Egg and Tomato
        addon.food("chicken_sandwich_with_egg_and_tomato")
                .nutrition(11)
                .saturation(0.8f)
                .build();

        addon.shapelessRecipe("chicken_sandwich_with_egg_and_tomato")
                .addTagIngredient("c:foods/bread")
                .addTagIngredient("c:foods/cooked_chicken")
                .addTagIngredient("c:foods/cooked_egg")
                .addTagIngredient("c:crops/tomato")
                .result("moredelight:chicken_sandwich_with_egg_and_tomato", 1)
                .build();

        // Steak Sandwich
        addon.food("steak_sandwich")
                .nutrition(10)
                .saturation(0.8f)
                .build();

        addon.shapelessRecipe("steak_sandwich")
                .addTagIngredient("c:foods/bread")
                .addTagIngredient("c:foods/cooked_beef")
                .addTagIngredient("c:foods/leafy_green")
                .result("moredelight:steak_sandwich", 1)
                .build();

        // Porkchop Sandwich
        addon.food("porkchop_sandwich")
                .nutrition(10)
                .saturation(0.8f)
                .build();

        addon.shapelessRecipe("porkchop_sandwich")
                .addTagIngredient("c:foods/bread")
                .addIngredient("minecraft:cooked_porkchop")
                .addTagIngredient("c:foods/leafy_green")
                .result("moredelight:porkchop_sandwich", 1)
                .build();

        // Egg with Bacon Sandwich
        addon.food("egg_with_bacon_sandwich")
                .nutrition(11)
                .saturation(0.8f)
                .build();

        addon.shapelessRecipe("egg_with_bacon_sandwich")
                .addTagIngredient("c:bread_slices")
                .addTagIngredient("c:bread_slices")
                .addTagIngredient("c:foods/cooked_egg")
                .addTagIngredient("c:foods/cooked_bacon")
                .result("moredelight:egg_with_bacon_sandwich", 1)
                .build();

        // Tomato Sandwich
        addon.food("tomato_sandwich")
                .nutrition(7)
                .saturation(0.8f)
                .build();

        addon.shapelessRecipe("tomato_sandwich")
                .addTagIngredient("c:bread_slices")
                .addTagIngredient("c:bread_slices")
                .addTagIngredient("c:crops/tomato")
                .result("moredelight:tomato_sandwich", 1)
                .build();

        // Bread Slice
        addon.food("bread_slice")
                .nutrition(2)
                .saturation(0.4f)
                .build();

        // Toast
        addon.food("toast")
                .nutrition(3)
                .saturation(0.4f)
                .fast()
                .build();

        // Toast with Egg
        addon.food("toast_with_egg")
                .nutrition(5)
                .saturation(0.6f)
                .fast()
                .build();

        addon.shapelessRecipe("toast_with_egg")
                .addTagIngredient("c:foods/cooked_egg")
                .addIngredient("moredelight:toast")
                .result("moredelight:toast_with_egg", 1)
                .build();

        // Toast with Honey
        addon.food("toast_with_honey")
                .nutrition(5)
                .saturation(0.6f)
                .fast()
                .build();

        addon.shapelessRecipe("toast_with_honey")
                .addIngredient("minecraft:honey_bottle")
                .addIngredient("moredelight:toast")
                .result("moredelight:toast_with_honey", 1)
                .build();

        // Toast with Sweet Berries
        addon.food("toast_with_sweet_berries")
                .nutrition(5)
                .saturation(0.6f)
                .fast()
                .build();

        addon.shapelessRecipe("toast_with_sweet_berries")
                .addIngredient("minecraft:sweet_berries")
                .addIngredient("moredelight:toast")
                .result("moredelight:toast_with_sweet_berries", 1)
                .build();

        // Toast with Glow Berries
        addon.food("toast_with_glow_berries")
                .nutrition(5)
                .saturation(0.6f)
                .fast()
                .build();

        addon.shapelessRecipe("toast_with_glow_berries")
                .addIngredient("minecraft:glow_berries")
                .addIngredient("moredelight:toast")
                .result("moredelight:toast_with_glow_berries", 1)
                .build();

        // Toast with Chocolate
        addon.food("toast_with_chocolate")
                .nutrition(5)
                .saturation(0.6f)
                .fast()
                .build();

        addon.shapelessRecipe("toast_with_chocolate")
                .addIngredient("minecraft:cocoa_beans")
                .addIngredient("moredelight:toast")
                .result("moredelight:toast_with_chocolate", 1)
                .build();

        // Toast with Cheese
        // (Not available on Fabric 26.1)
        //if (FabricLoader.getInstance().isModLoaded("casualness_delight") || FabricLoader.getInstance().isModLoaded("expandeddelight")) {
        //    addon.food("toast_with_cheese")
        //            .nutrition(5)
        //            .saturation(0.6f)
        //            .fast()
        //            .build();
        //}

        // Toast with Peanut Butter
        // (Not available on Fabric 26.1)
        //if (FabricLoader.getInstance().isModLoaded("expandeddelight")) {
        //    addon.food("toast_with_peanut_butter")
        //            .nutrition(5)
        //            .saturation(0.6f)
        //            .fast()
        //            .build();
        //}

        addon.build();
    }
}
