package com.axperty.moredelight;

import com.axperty.moredelight.init.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(MoreDelight.MODID)
public class MoreDelight {
    public static final String MODID = "moredelight";

    public MoreDelight() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        System.out.println("[More Delight Forge]: Registering items...");
        ItemInit.ITEMS.register(bus);
        CreativeTabInit.register(bus);
        System.out.println("[More Delight Forge]: Items registered successfully!");
    }
}
