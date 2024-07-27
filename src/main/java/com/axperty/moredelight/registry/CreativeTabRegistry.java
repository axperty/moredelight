package com.axperty.moredelight.registry;

import com.axperty.moredelight.MoreDelight;
import com.axperty.moredelight.registry.ItemRegistry.*;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.neoforged.fml.ModList;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;


public class CreativeTabRegistry {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MoreDelight.MOD_ID);

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> MOREDELIGHT_TAB = CREATIVE_MODE_TABS.register("moredelight_tab", () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup.moredelight"))
            .icon(() -> ItemRegistry.CHICKEN_SANDWICH_WITH_EGG_AND_TOMATO.get().getDefaultInstance())
            .displayItems((parameters, output) -> {
                output.accept(ItemRegistry.WOODEN_KNIFE.get());
                output.accept(ItemRegistry.STONE_KNIFE.get());
                output.accept(ItemRegistry.DICED_POTATOES.get());
                output.accept(ItemRegistry.OMELETTE.get());
                output.accept(ItemRegistry.COOKED_RICE_WITH_MILK_CREAM_AND_BEEF.get());
                output.accept(ItemRegistry.MASHED_POTATOES.get());
                output.accept(ItemRegistry.PASTA_WITH_MILK_CREAM_AND_HAM.get());
                output.accept(ItemRegistry.COOKED_DICED_POTATOES_WITH_CHICKEN_CUTS.get());
                output.accept(ItemRegistry.COOKED_DICED_POTATOES_WITH_BEEF.get());
                output.accept(ItemRegistry.COOKED_DICED_POTATOES_WITH_PORKCHOP.get());
                output.accept(ItemRegistry.CHICKEN_SALAD.get());
                output.accept(ItemRegistry.POTATO_SALAD.get());
                output.accept(ItemRegistry.CARROT_SOUP.get());
                output.accept(ItemRegistry.CHOCOLATE_POPSICLE.get());
                output.accept(ItemRegistry.CHICKEN_SANDWICH_WITH_EGG_AND_TOMATO.get());
                output.accept(ItemRegistry.EGG_WITH_BACON_SANDWICH.get());
                output.accept(ItemRegistry.STEAK_WITH_EGG_SANDWICH.get());
                output.accept(ItemRegistry.TOMATO_SANDWICH.get());
                output.accept(ItemRegistry.BREAD_SLICE.get());
                output.accept(ItemRegistry.TOAST.get());
                output.accept(ItemRegistry.TOAST_WITH_EGG.get());
                output.accept(ItemRegistry.TOAST_WITH_HONEY.get());
                output.accept(ItemRegistry.TOAST_WITH_SWEET_BERRIES.get());
                if (ModList.get().isLoaded("nutritious_feast")) {
                    output.accept(ItemRegistry.TOAST_WITH_BLUEBERRIES.get());
                }
                output.accept(ItemRegistry.TOAST_WITH_GLOW_BERRIES.get());
                output.accept(ItemRegistry.TOAST_WITH_CHOCOLATE.get());
                if (ModList.get().isLoaded("casualness_delight") || ModList.get().isLoaded("expandeddelight")) {
                    output.accept(ItemRegistry.TOAST_WITH_CHEESE.get());
                }
            }).build());
}
