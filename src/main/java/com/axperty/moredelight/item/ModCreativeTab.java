package com.axperty.moredelight.item;

import com.axperty.moredelight.MoreDelight;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.neoforged.fml.ModList;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;


public class ModCreativeTab {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MoreDelight.MOD_ID);

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> MOREDELIGHT_TAB = CREATIVE_MODE_TABS.register("moredelight_tab", () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup.moredelight"))
            .icon(() -> ModItems.CHICKEN_SANDWICH_WITH_EGG_AND_TOMATO.get().getDefaultInstance())
            .displayItems((parameters, output) -> {
                output.accept(ModItems.WOODEN_KNIFE.get());
                output.accept(ModItems.STONE_KNIFE.get());
                output.accept(ModItems.DICED_POTATOES.get());
                output.accept(ModItems.CHOCOLATE_POPSICLE.get());
                output.accept(ModItems.OMELETTE.get());
                output.accept(ModItems.COOKED_RICE_WITH_MILK_CREAM_AND_CHICKEN_CUTS.get());
                output.accept(ModItems.COOKED_RICE_WITH_MILK_CREAM_AND_BEEF.get());
                output.accept(ModItems.COOKED_RICE_WITH_MILK_CREAM_AND_PORKCHOP.get());
                output.accept(ModItems.MASHED_POTATOES.get());
                output.accept(ModItems.PASTA_WITH_MILK_CREAM_AND_HAM.get());
                output.accept(ModItems.COOKED_DICED_POTATOES_WITH_CHICKEN_CUTS.get());
                output.accept(ModItems.COOKED_DICED_POTATOES_WITH_BEEF.get());
                output.accept(ModItems.COOKED_DICED_POTATOES_WITH_PORKCHOP.get());
                output.accept(ModItems.CHICKEN_SALAD.get());
                output.accept(ModItems.POTATO_SALAD.get());
                output.accept(ModItems.CARROT_SOUP.get());
                output.accept(ModItems.SIMPLE_HAMBURGER.get());
                if (ModList.get().isLoaded("casualness_delight") || ModList.get().isLoaded("expandeddelight")) {
                    output.accept(ModItems.HAMBURGER_WITH_CHEESE.get());
                }
                output.accept(ModItems.HAMBURGER_WITH_EGG.get());
                output.accept(ModItems.LOADED_HAMBURGER.get());
                output.accept(ModItems.CHICKEN_SANDWICH_WITH_EGG_AND_TOMATO.get());
                output.accept(ModItems.STEAK_SANDWICH.get());
                output.accept(ModItems.PORKCHOP_SANDWICH.get());
                output.accept(ModItems.EGG_WITH_BACON_SANDWICH.get());
                output.accept(ModItems.TOMATO_SANDWICH.get());
                output.accept(ModItems.BREAD_SLICE.get());
                output.accept(ModItems.TOAST.get());
                output.accept(ModItems.TOAST_WITH_EGG.get());
                output.accept(ModItems.TOAST_WITH_HONEY.get());
                output.accept(ModItems.TOAST_WITH_SWEET_BERRIES.get());
                if (ModList.get().isLoaded("nutritious_feast")) {
                    output.accept(ModItems.TOAST_WITH_BLUEBERRIES.get());
                }
                output.accept(ModItems.TOAST_WITH_GLOW_BERRIES.get());
                output.accept(ModItems.TOAST_WITH_CHOCOLATE.get());
                if (ModList.get().isLoaded("casualness_delight") || ModList.get().isLoaded("expandeddelight")) {
                    output.accept(ModItems.TOAST_WITH_CHEESE.get());
                }
                if (ModList.get().isLoaded("expandeddelight")) {
                    output.accept(ModItems.TOAST_WITH_PEANUT_BUTTER.get());
                }
            })
            .build());
}
