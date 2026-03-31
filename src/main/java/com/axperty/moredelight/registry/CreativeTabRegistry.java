package com.axperty.moredelight.registry;

import net.fabricmc.fabric.api.creativetab.v1.FabricCreativeModeTab;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import com.axperty.moredelight.MoreDelight;

public class CreativeTabRegistry {
    public static final CreativeModeTab MOREDELIGHT_ITEMGROUP = Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB,
            Identifier.tryParse(MoreDelight.MOD_ID + ":" + "moredelight_itemgroup"),
            FabricCreativeModeTab.builder()
                    .title(Component.translatable("itemGroup.moredelight"))
                    .icon(() -> new ItemStack(ItemRegistry.CHICKEN_SANDWICH_WITH_EGG_AND_TOMATO))
                    .displayItems((displayContext, entries) -> {
                        entries.accept(ItemRegistry.WOODEN_KNIFE);
                        entries.accept(ItemRegistry.STONE_KNIFE);
                        entries.accept(ItemRegistry.DICED_POTATOES);
                        entries.accept(ItemRegistry.CHOCOLATE_POPSICLE);
                        entries.accept(ItemRegistry.OMELETTE);
                        entries.accept(ItemRegistry.COOKED_RICE_WITH_CHICKEN_CUTS);
                        entries.accept(ItemRegistry.COOKED_RICE_WITH_BEEF);
                        entries.accept(ItemRegistry.COOKED_RICE_WITH_PORKCHOP);
                        entries.accept(ItemRegistry.CREAMY_PASTA_WITH_HAM);
                        entries.accept(ItemRegistry.CREAMY_PASTA_WITH_CHICKEN_CUTS);
                        entries.accept(ItemRegistry.MASHED_POTATOES);
                        entries.accept(ItemRegistry.DICED_POTATOES_WITH_CHICKEN_CUTS);
                        entries.accept(ItemRegistry.DICED_POTATOES_WITH_BEEF);
                        entries.accept(ItemRegistry.DICED_POTATOES_WITH_PORKCHOP);
                        entries.accept(ItemRegistry.DICED_POTATOES_WITH_EGG_AND_TOMATO);
                        entries.accept(ItemRegistry.POTATO_SALAD);
                        entries.accept(ItemRegistry.CHICKEN_SALAD);
                        entries.accept(ItemRegistry.CARROT_SOUP);
                        entries.accept(ItemRegistry.SIMPLE_HAMBURGER);

                        if (FabricLoader.getInstance().isModLoaded("expandeddelight") || FabricLoader.getInstance().isModLoaded("casualness_delight")) {
                            entries.accept(ItemRegistry.HAMBURGER_WITH_CHEESE);
                        }

                        entries.accept(ItemRegistry.HAMBURGER_WITH_EGG);
                        entries.accept(ItemRegistry.LOADED_HAMBURGER);
                        entries.accept(ItemRegistry.CHICKEN_SANDWICH_WITH_EGG_AND_TOMATO);
                        entries.accept(ItemRegistry.STEAK_SANDWICH);
                        entries.accept(ItemRegistry.PORKCHOP_SANDWICH);
                        entries.accept(ItemRegistry.EGG_WITH_BACON_SANDWICH);
                        entries.accept(ItemRegistry.TOMATO_SANDWICH);
                        entries.accept(ItemRegistry.BREAD_SLICE);
                        entries.accept(ItemRegistry.TOAST);
                        entries.accept(ItemRegistry.TOAST_WITH_EGG);
                        entries.accept(ItemRegistry.TOAST_WITH_HONEY);
                        entries.accept(ItemRegistry.TOAST_WITH_SWEET_BERRIES);

                        if (FabricLoader.getInstance().isModLoaded("nutritious-feast")) {
                            entries.accept(ItemRegistry.TOAST_WITH_BLUEBERRIES);
                        }

                        entries.accept(ItemRegistry.TOAST_WITH_GLOW_BERRIES);
                        entries.accept(ItemRegistry.TOAST_WITH_CHOCOLATE);

                        if (FabricLoader.getInstance().isModLoaded("expandeddelight") || FabricLoader.getInstance().isModLoaded("casualness_delight")) {
                            entries.accept(ItemRegistry.TOAST_WITH_CHEESE);
                        }

                        if (FabricLoader.getInstance().isModLoaded("expandeddelight")) {
                            entries.accept(ItemRegistry.TOAST_WITH_PEANUT_BUTTER);
                        }
                    })
                    .build());

    public static void registerCreativeTab() {
    }
}