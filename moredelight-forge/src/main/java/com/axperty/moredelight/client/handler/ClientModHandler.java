package com.axperty.moredelight.client.handler;

import com.axperty.moredelight.client.screen.ExampleMenuScreen;
import com.axperty.moredelight.client.screen.DrawerMenuScreen;
import com.axperty.moredelight.MoreDelight;
import com.axperty.moredelight.init.MenuInit;
import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid = MoreDelight.MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientModHandler {
    @SubscribeEvent
    public static void clientSetup(FMLClientSetupEvent event) {
        event.enqueueWork(() -> {
            MenuScreens.register(MenuInit.EXAMPLE_MENU.get(), ExampleMenuScreen::new);
            MenuScreens.register(MenuInit.DRAWER_MENU.get(), DrawerMenuScreen::new);
        });
    }

}
