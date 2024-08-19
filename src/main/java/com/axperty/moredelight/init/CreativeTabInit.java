package com.axperty.moredelight.init;

import com.axperty.moredelight.MoreDelight;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

@Mod.EventBusSubscriber(modid = MoreDelight.MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class CreativeTabInit {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MoreDelight.MODID);

    public static final RegistryObject<CreativeModeTab> CREATIVE_TAB = CREATIVE_MODE_TABS.register("creative_tab",
            () -> CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup.moredelight"))
                    .icon(ItemInit.WOODEN_KNIFE.get()::getDefaultInstance)
                    .displayItems((displayParams, pOutput) -> {
                        pOutput.accept(ItemInit.WOODEN_KNIFE.get());
                        pOutput.accept(ItemInit.STONE_KNIFE.get());
                        pOutput.accept(ItemInit.DICED_POTATOES.get());
                        pOutput.accept(ItemInit.OMELETTE.get());
                        pOutput.accept(ItemInit.COOKED_RICE_WITH_MILK_CREAM_AND_CHICKEN_CUTS.get());
                        pOutput.accept(ItemInit.COOKED_RICE_WITH_MILK_CREAM_AND_BEEF.get());
                        pOutput.accept(ItemInit.COOKED_RICE_WITH_MILK_CREAM_AND_PORKCHOP.get());
                        pOutput.accept(ItemInit.MASHED_POTATOES.get());
                        pOutput.accept(ItemInit.PASTA_WITH_MILK_CREAM_AND_HAM.get());
                        pOutput.accept(ItemInit.COOKED_DICED_POTATOES_WITH_CHICKEN_CUTS.get());
                        pOutput.accept(ItemInit.COOKED_DICED_POTATOES_WITH_BEEF.get());
                        pOutput.accept(ItemInit.COOKED_DICED_POTATOES_WITH_PORKCHOP.get());
                        pOutput.accept(ItemInit.CHICKEN_SALAD.get());
                        pOutput.accept(ItemInit.POTATO_SALAD.get());
                        pOutput.accept(ItemInit.CARROT_SOUP.get());
                        pOutput.accept(ItemInit.CHOCOLATE_POPSICLE.get());
                        pOutput.accept(ItemInit.CHICKEN_SANDWICH_WITH_EGG_AND_TOMATO.get());
                        pOutput.accept(ItemInit.SIMPLE_HAMBURGER.get());
                        if (ModList.get().isLoaded("casualness_delight")) {
                            pOutput.accept(ItemInit.HAMBURGER_WITH_CHEESE.get());
                        }
                        pOutput.accept(ItemInit.HAMBURGER_WITH_EGG.get());
                        pOutput.accept(ItemInit.BIG_HAMBURGER.get());
                        pOutput.accept(ItemInit.EGG_WITH_BACON_SANDWICH.get());
                        pOutput.accept(ItemInit.STEAK_WITH_EGG_SANDWICH.get());
                        pOutput.accept(ItemInit.TOMATO_SANDWICH.get());
                        pOutput.accept(ItemInit.BREAD_SLICE.get());
                        pOutput.accept(ItemInit.TOAST.get());
                        pOutput.accept(ItemInit.TOAST_WITH_EGG.get());
                        pOutput.accept(ItemInit.TOAST_WITH_HONEY.get());
                        pOutput.accept(ItemInit.TOAST_WITH_SWEET_BERRIES.get());
                        if (ModList.get().isLoaded("nutritious_feast")) {
                            pOutput.accept(ItemInit.TOAST_WITH_BLUEBERRIES.get());
                        }
                        pOutput.accept(ItemInit.TOAST_WITH_GLOW_BERRIES.get());
                        pOutput.accept(ItemInit.TOAST_WITH_CHOCOLATE.get());
                        if (ModList.get().isLoaded("casualness_delight")) {
                            pOutput.accept(ItemInit.TOAST_WITH_CHEESE.get());
                        }
                    })
                    .noScrollBar()
                    .build()
    );

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
