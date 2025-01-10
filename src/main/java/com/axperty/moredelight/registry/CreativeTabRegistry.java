package com.axperty.moredelight.registry;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import com.axperty.moredelight.MoreDelight;

public class CreativeTabRegistry {
    public static final ItemGroup MOREDELIGHT_ITEMGROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.tryParse(MoreDelight.MOD_ID + ":" + "moredelight_itemgroup"),
            FabricItemGroup.builder()
                    .displayName(Text.translatable("itemGroup.moredelight"))
                    .icon(() -> new ItemStack(ItemRegistry.CHICKEN_SANDWICH_WITH_EGG_AND_TOMATO))
                    .entries((displayContext, entries) -> {
                        entries.add(ItemRegistry.WOODEN_KNIFE);
                        entries.add(ItemRegistry.STONE_KNIFE);
                        entries.add(ItemRegistry.DICED_POTATOES);
                        entries.add(ItemRegistry.CHOCOLATE_POPSICLE);
                        entries.add(ItemRegistry.OMELETTE);
                        entries.add(ItemRegistry.COOKED_RICE_WITH_CHICKEN_CUTS);
                        entries.add(ItemRegistry.COOKED_RICE_WITH_BEEF);
                        entries.add(ItemRegistry.COOKED_RICE_WITH_PORKCHOP);
                        entries.add(ItemRegistry.CREAMY_PASTA_WITH_HAM);
                        entries.add(ItemRegistry.CREAMY_PASTA_WITH_CHICKEN_CUTS);
                        entries.add(ItemRegistry.MASHED_POTATOES);
                        entries.add(ItemRegistry.DICED_POTATOES_WITH_CHICKEN_CUTS);
                        entries.add(ItemRegistry.DICED_POTATOES_WITH_BEEF);
                        entries.add(ItemRegistry.DICED_POTATOES_WITH_PORKCHOP);
                        entries.add(ItemRegistry.DICED_POTATOES_WITH_EGG_AND_TOMATO);
                        entries.add(ItemRegistry.POTATO_SALAD);
                        entries.add(ItemRegistry.CHICKEN_SALAD);
                        entries.add(ItemRegistry.CARROT_SOUP);
                        entries.add(ItemRegistry.SIMPLE_HAMBURGER);

                        if (FabricLoader.getInstance().isModLoaded("expandeddelight") || FabricLoader.getInstance().isModLoaded("casualness_delight")) {
                            entries.add(ItemRegistry.HAMBURGER_WITH_CHEESE);
                        }

                        entries.add(ItemRegistry.HAMBURGER_WITH_EGG);
                        entries.add(ItemRegistry.LOADED_HAMBURGER);
                        entries.add(ItemRegistry.CHICKEN_SANDWICH_WITH_EGG_AND_TOMATO);
                        entries.add(ItemRegistry.STEAK_SANDWICH);
                        entries.add(ItemRegistry.PORKCHOP_SANDWICH);
                        entries.add(ItemRegistry.EGG_WITH_BACON_SANDWICH);
                        entries.add(ItemRegistry.TOMATO_SANDWICH);
                        entries.add(ItemRegistry.BREAD_SLICE);
                        entries.add(ItemRegistry.TOAST);
                        entries.add(ItemRegistry.TOAST_WITH_EGG);
                        entries.add(ItemRegistry.TOAST_WITH_HONEY);
                        entries.add(ItemRegistry.TOAST_WITH_SWEET_BERRIES);

                        if (FabricLoader.getInstance().isModLoaded("nutritious-feast")) {
                            entries.add(ItemRegistry.TOAST_WITH_BLUEBERRIES);
                        }

                        entries.add(ItemRegistry.TOAST_WITH_GLOW_BERRIES);
                        entries.add(ItemRegistry.TOAST_WITH_CHOCOLATE);

                        if (FabricLoader.getInstance().isModLoaded("expandeddelight") || FabricLoader.getInstance().isModLoaded("casualness_delight")) {
                            entries.add(ItemRegistry.TOAST_WITH_CHEESE);
                        }

                        if (FabricLoader.getInstance().isModLoaded("expandeddelight")) {
                            entries.add(ItemRegistry.TOAST_WITH_PEANUT_BUTTER);
                        }
                    })
                    .build());

    public static void registerCreativeTab() {
    }
}