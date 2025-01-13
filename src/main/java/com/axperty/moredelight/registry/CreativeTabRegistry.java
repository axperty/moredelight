package com.axperty.moredelight.registry;

import com.axperty.moredelight.MoreDelight;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class CreativeTabRegistry {
    public static final ItemGroup MOREDELIGHT_ITEMGROUP = FabricItemGroupBuilder.create(
                    new Identifier(MoreDelight.MOD_ID, "title"))
                        .icon(() -> new ItemStack(ItemRegistry.CHICKEN_SANDWICH_WITH_EGG_AND_TOMATO))
                        .appendItems(entries -> {
                            entries.add(new ItemStack(ItemRegistry.WOODEN_KNIFE));
                            entries.add(new ItemStack(ItemRegistry.STONE_KNIFE));
                            entries.add(new ItemStack(ItemRegistry.DICED_POTATOES));
                            entries.add(new ItemStack(ItemRegistry.CHOCOLATE_POPSICLE));
                            entries.add(new ItemStack(ItemRegistry.OMELETTE));
                            entries.add(new ItemStack(ItemRegistry.COOKED_RICE_WITH_CHICKEN_CUTS));
                            entries.add(new ItemStack(ItemRegistry.COOKED_RICE_WITH_BEEF));
                            entries.add(new ItemStack(ItemRegistry.COOKED_RICE_WITH_PORKCHOP));
                            entries.add(new ItemStack(ItemRegistry.CREAMY_PASTA_WITH_HAM));
                            entries.add(new ItemStack(ItemRegistry.CREAMY_PASTA_WITH_CHICKEN_CUTS));
                            entries.add(new ItemStack(ItemRegistry.MASHED_POTATOES));
                            entries.add(new ItemStack(ItemRegistry.DICED_POTATOES_WITH_CHICKEN_CUTS));
                            entries.add(new ItemStack(ItemRegistry.DICED_POTATOES_WITH_BEEF));
                            entries.add(new ItemStack(ItemRegistry.DICED_POTATOES_WITH_PORKCHOP));
                            entries.add(new ItemStack(ItemRegistry.DICED_POTATOES_WITH_EGG_AND_TOMATO));
                            entries.add(new ItemStack(ItemRegistry.POTATO_SALAD));
                            entries.add(new ItemStack(ItemRegistry.CHICKEN_SALAD));
                            entries.add(new ItemStack(ItemRegistry.CARROT_SOUP));
                            entries.add(new ItemStack(ItemRegistry.SIMPLE_HAMBURGER));

                            if (FabricLoader.getInstance().isModLoaded("expandeddelight") || FabricLoader.getInstance().isModLoaded("casualness_delight")) {
                                entries.add(new ItemStack(ItemRegistry.HAMBURGER_WITH_CHEESE));
                            }

                            entries.add(new ItemStack(ItemRegistry.HAMBURGER_WITH_EGG));
                            entries.add(new ItemStack(ItemRegistry.LOADED_HAMBURGER));
                            entries.add(new ItemStack(ItemRegistry.CHICKEN_SANDWICH_WITH_EGG_AND_TOMATO));
                            entries.add(new ItemStack(ItemRegistry.STEAK_SANDWICH));
                            entries.add(new ItemStack(ItemRegistry.PORKCHOP_SANDWICH));
                            entries.add(new ItemStack(ItemRegistry.EGG_WITH_BACON_SANDWICH));
                            entries.add(new ItemStack(ItemRegistry.TOMATO_SANDWICH));
                            entries.add(new ItemStack(ItemRegistry.BREAD_SLICE));
                            entries.add(new ItemStack(ItemRegistry.TOAST));
                            entries.add(new ItemStack(ItemRegistry.TOAST_WITH_EGG));
                            entries.add(new ItemStack(ItemRegistry.TOAST_WITH_HONEY));
                            entries.add(new ItemStack(ItemRegistry.TOAST_WITH_SWEET_BERRIES));
                            entries.add(new ItemStack(ItemRegistry.TOAST_WITH_GLOW_BERRIES));
                            entries.add(new ItemStack(ItemRegistry.TOAST_WITH_CHOCOLATE));

                            if (FabricLoader.getInstance().isModLoaded("expandeddelight") || FabricLoader.getInstance().isModLoaded("casualness_delight")) {
                                entries.add(new ItemStack(ItemRegistry.TOAST_WITH_CHEESE));
                            }

                            if (FabricLoader.getInstance().isModLoaded("expandeddelight")) {
                                entries.add(new ItemStack(ItemRegistry.TOAST_WITH_PEANUT_BUTTER));
                            }
                    })
                    .build();

    public static void registerCreativeTab() {
    }
}
