package com.axperty.moredelight.registry;

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
public class CreativeTabRegistry {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MoreDelight.MODID);

    public static final RegistryObject<CreativeModeTab> CREATIVE_TAB = CREATIVE_MODE_TABS.register("creative_tab",
            () -> CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup.moredelight"))
                    .icon(ItemRegistry.WOODEN_KNIFE.get()::getDefaultInstance)
                    .displayItems((displayParams, pOutput) -> {
                        pOutput.accept(ItemRegistry.WOODEN_KNIFE.get());
                        pOutput.accept(ItemRegistry.STONE_KNIFE.get());
                        pOutput.accept(ItemRegistry.DICED_POTATOES.get());
                        pOutput.accept(ItemRegistry.CHOCOLATE_POPSICLE.get());
                        pOutput.accept(ItemRegistry.OMELETTE.get());
                        pOutput.accept(ItemRegistry.COOKED_RICE_WITH_MILK_CREAM_AND_CHICKEN_CUTS.get());
                        pOutput.accept(ItemRegistry.COOKED_RICE_WITH_MILK_CREAM_AND_BEEF.get());
                        pOutput.accept(ItemRegistry.COOKED_RICE_WITH_MILK_CREAM_AND_PORKCHOP.get());
                        pOutput.accept(ItemRegistry.MASHED_POTATOES.get());
                        pOutput.accept(ItemRegistry.PASTA_WITH_MILK_CREAM_AND_HAM.get());
                        pOutput.accept(ItemRegistry.COOKED_DICED_POTATOES_WITH_CHICKEN_CUTS.get());
                        pOutput.accept(ItemRegistry.COOKED_DICED_POTATOES_WITH_BEEF.get());
                        pOutput.accept(ItemRegistry.COOKED_DICED_POTATOES_WITH_PORKCHOP.get());
                        pOutput.accept(ItemRegistry.CHICKEN_SALAD.get());
                        pOutput.accept(ItemRegistry.POTATO_SALAD.get());
                        pOutput.accept(ItemRegistry.CARROT_SOUP.get());
                        pOutput.accept(ItemRegistry.SIMPLE_HAMBURGER.get());
                        if (ModList.get().isLoaded("casualness_delight")) {
                            pOutput.accept(ItemRegistry.HAMBURGER_WITH_CHEESE.get());
                        }
                        pOutput.accept(ItemRegistry.HAMBURGER_WITH_EGG.get());
                        pOutput.accept(ItemRegistry.LOADED_HAMBURGER.get());
                        pOutput.accept(ItemRegistry.CHICKEN_SANDWICH_WITH_EGG_AND_TOMATO.get());
                        pOutput.accept(ItemRegistry.STEAK_SANDWICH.get());
                        pOutput.accept(ItemRegistry.PORKCHOP_SANDWICH.get());
                        pOutput.accept(ItemRegistry.EGG_WITH_BACON_SANDWICH.get());
                        pOutput.accept(ItemRegistry.TOMATO_SANDWICH.get());
                        pOutput.accept(ItemRegistry.BREAD_SLICE.get());
                        pOutput.accept(ItemRegistry.TOAST.get());
                        pOutput.accept(ItemRegistry.TOAST_WITH_EGG.get());
                        pOutput.accept(ItemRegistry.TOAST_WITH_HONEY.get());
                        pOutput.accept(ItemRegistry.TOAST_WITH_SWEET_BERRIES.get());
                        if (ModList.get().isLoaded("nutritious_feast")) {
                            pOutput.accept(ItemRegistry.TOAST_WITH_BLUEBERRIES.get());
                        }
                        pOutput.accept(ItemRegistry.TOAST_WITH_GLOW_BERRIES.get());
                        pOutput.accept(ItemRegistry.TOAST_WITH_CHOCOLATE.get());
                        if (ModList.get().isLoaded("casualness_delight")) {
                            pOutput.accept(ItemRegistry.TOAST_WITH_CHEESE.get());
                        }
                    })
                    .noScrollBar()
                    .build()
    );

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
