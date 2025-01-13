package com.axperty.moredelight;

import com.axperty.moredelight.registry.CreativeTabRegistry;
import com.axperty.moredelight.registry.ItemRegistry;
import net.fabricmc.api.ModInitializer;

public class MoreDelight implements ModInitializer {
    public static final String MOD_ID = "moredelight";

    @Override
    public void onInitialize() {
        ItemRegistry.registerItems();
        CreativeTabRegistry.registerCreativeTab();
    }
}
