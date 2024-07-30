package com.axperty.moredelight;

import com.axperty.moredelight.item.ItemRegistry;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MoreDelight implements ModInitializer {
	public static final String MOD_ID = "moredelight";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		System.out.println("[More Delight Fabric]: Registering items...");
		ItemRegistry.registerModItems();
		System.out.println("[More Delight Fabric]: Items registered successfully!");
	}
}
