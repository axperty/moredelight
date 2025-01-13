package com.axperty.moredelight;

import com.axperty.moredelight.registry.CreativeTabRegistry;
import com.axperty.moredelight.registry.ItemRegistry;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MoreDelight implements ModInitializer {
	public static final String MOD_ID = "moredelight";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ItemRegistry.registerModItems();
		CreativeTabRegistry.registerCreativeTab();
	}
}
