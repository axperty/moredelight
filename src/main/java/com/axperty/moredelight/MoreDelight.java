package com.axperty.moredelight;

import com.axperty.moredelight.item.TagRegistry;
import com.mojang.logging.LogUtils;
import com.axperty.moredelight.item.ItemRegistry;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

@Mod(MoreDelight.MOD_ID)
public class MoreDelight {
    public static final String MOD_ID = "moredelight";
    private static final Logger LOGGER = LogUtils.getLogger();

    public MoreDelight() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        TagRegistry.register();
        ItemRegistry.register(modEventBus);
        MinecraftForge.EVENT_BUS.register(this);
    }
}
