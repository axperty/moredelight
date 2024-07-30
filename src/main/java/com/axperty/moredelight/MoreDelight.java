package com.axperty.moredelight;

import com.axperty.moredelight.item.ModTags;
import com.mojang.logging.LogUtils;
import com.axperty.moredelight.item.ModItems;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

@Mod(MoreDelight.MOD_ID)
public class MoreDelight {
    public static final String MOD_ID = "moredelight";
    private static final Logger LOGGER = LogUtils.getLogger();

    public MoreDelight() {
        System.out.println("[More Delight Forge]: Registering items...");
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        ModTags.register();
        ModItems.register(modEventBus);
        System.out.println("[More Delight Forge]: Items registered successfully!");
    }
}
