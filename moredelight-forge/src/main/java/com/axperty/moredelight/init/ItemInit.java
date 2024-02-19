package com.axperty.moredelight.init;

import com.axperty.moredelight.MoreDelight;
import net.minecraft.world.item.*;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemInit {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MoreDelight.MODID);

    public static final RegistryObject<Item> WOODEN_KNIFE = CreativeTabInit.addToTab(ITEMS.register("wooden_knife",
            () -> new SwordItem(
                    TierInit.WOOD,
                    0,
                    -2.0F,
                    new Item.Properties()
            )));

    public static final RegistryObject<Item> STONE_KNIFE = CreativeTabInit.addToTab(ITEMS.register("stone_knife",
            () -> new SwordItem(
                    TierInit.STONE,
                    0,
                    -2.0F,
                    new Item.Properties()
            )));

    public static final RegistryObject<BlockItem> GLASS_CABINET_BLOCK_ITEM = CreativeTabInit.addToTab(ITEMS.register("glass_cabinet_block",
            () -> new BlockItem(BlockInit.GLASS_CABINET_BLOCK.get(), new Item.Properties())));

    public static final RegistryObject<BlockItem> DRAWER_BLOCK_ITEM = CreativeTabInit.addToTab(ITEMS.register("drawer_block",
            () -> new BlockItem(BlockInit.DRAWER_BLOCK.get(), new Item.Properties())));
}
