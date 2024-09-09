package com.axperty.moredelight.item;

import com.axperty.moredelight.MoreDelight;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

@Mod.EventBusSubscriber(modid = MoreDelight.MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ModCreativeTab {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MoreDelight.MODID);

    public static final RegistryObject<CreativeModeTab> CREATIVE_TAB = CREATIVE_MODE_TABS.register("creative_tab",
            () -> CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup.moredelight"))
                    .icon(ModItems.CHICKEN_SANDWICH_WITH_EGG_AND_TOMATO.get()::getDefaultInstance)
                    .displayItems((displayParams, pOutput) -> {
                        pOutput.accept(ModItems.WOODEN_KNIFE.get());
                        pOutput.accept(ModItems.STONE_KNIFE.get());
                        pOutput.accept(ModItems.DICED_POTATOES.get());
                        pOutput.accept(ModItems.CHOCOLATE_POPSICLE.get());
                        pOutput.accept(ModItems.OMELETTE.get());
                        pOutput.accept(ModItems.COOKED_RICE_WITH_MILK_CREAM_AND_CHICKEN_CUTS.get());
                        pOutput.accept(ModItems.COOKED_RICE_WITH_MILK_CREAM_AND_BEEF.get());
                        pOutput.accept(ModItems.COOKED_RICE_WITH_MILK_CREAM_AND_PORKCHOP.get());
                        pOutput.accept(ModItems.MASHED_POTATOES.get());
                        pOutput.accept(ModItems.PASTA_WITH_MILK_CREAM_AND_HAM.get());
                        pOutput.accept(ModItems.COOKED_DICED_POTATOES_WITH_CHICKEN_CUTS.get());
                        pOutput.accept(ModItems.COOKED_DICED_POTATOES_WITH_BEEF.get());
                        pOutput.accept(ModItems.COOKED_DICED_POTATOES_WITH_PORKCHOP.get());
                        pOutput.accept(ModItems.CHICKEN_SALAD.get());
                        pOutput.accept(ModItems.POTATO_SALAD.get());
                        pOutput.accept(ModItems.CARROT_SOUP.get());
                        pOutput.accept(ModItems.SIMPLE_HAMBURGER.get());
                        if (ModList.get().isLoaded("casualness_delight")) {
                            pOutput.accept(ModItems.HAMBURGER_WITH_CHEESE.get());
                        }
                        pOutput.accept(ModItems.HAMBURGER_WITH_EGG.get());
                        pOutput.accept(ModItems.LOADED_HAMBURGER.get());
                        pOutput.accept(ModItems.CHICKEN_SANDWICH_WITH_EGG_AND_TOMATO.get());
                        pOutput.accept(ModItems.STEAK_SANDWICH.get());
                        pOutput.accept(ModItems.PORKCHOP_SANDWICH.get());
                        pOutput.accept(ModItems.EGG_WITH_BACON_SANDWICH.get());
                        pOutput.accept(ModItems.TOMATO_SANDWICH.get());
                        pOutput.accept(ModItems.BREAD_SLICE.get());
                        pOutput.accept(ModItems.TOAST.get());
                        pOutput.accept(ModItems.TOAST_WITH_EGG.get());
                        pOutput.accept(ModItems.TOAST_WITH_HONEY.get());
                        pOutput.accept(ModItems.TOAST_WITH_SWEET_BERRIES.get());
                        if (ModList.get().isLoaded("nutritious_feast")) {
                            pOutput.accept(ModItems.TOAST_WITH_BLUEBERRIES.get());
                        }
                        pOutput.accept(ModItems.TOAST_WITH_GLOW_BERRIES.get());
                        pOutput.accept(ModItems.TOAST_WITH_CHOCOLATE.get());
                        if (ModList.get().isLoaded("casualness_delight")) {
                            pOutput.accept(ModItems.TOAST_WITH_CHEESE.get());
                        }
                    })
                    .noScrollBar()
                    .build()
    );

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
