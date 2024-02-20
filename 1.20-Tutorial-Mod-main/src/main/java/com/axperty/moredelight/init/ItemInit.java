package com.axperty.moredelight.init;

import com.axperty.moredelight.MoreDelight;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.food.Foods;
import net.minecraft.world.item.*;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import vectorwing.farmersdelight.common.item.KnifeItem;

public class ItemInit {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MoreDelight.MODID);

    public static final RegistryObject<Item> WOODEN_KNIFE = CreativeTabInit.addToTab(ITEMS.register("wooden_knife",
            () -> new KnifeItem(
                    TierInit.WOOD,
                    0,
                    -2.0F,
                    new Item.Properties()
            )));

    public static final RegistryObject<Item> STONE_KNIFE = CreativeTabInit.addToTab(ITEMS.register("stone_knife",
            () -> new KnifeItem(
                    TierInit.STONE,
                    0,
                    -2.0F,
                    new Item.Properties()
            )));

    public static final RegistryObject<Item> OMELETTE = CreativeTabInit.addToTab(ITEMS.register("omelette",
            () -> new Item(new Item.Properties()
                    .food(new FoodProperties.Builder()
                            .nutrition(6)
                            .saturationMod(5)
                            .build()))));

    public static final RegistryObject<Item> BREAD_SLICE = CreativeTabInit.addToTab(ITEMS.register("bread_slice",
            () -> new Item(new Item.Properties()
                    .food(new FoodProperties.Builder()
                            .nutrition(2)
                            .saturationMod(3)
                            .build()))));

//    public static final RegistryObject<BlockItem> BLOCK_ITEM = CreativeTabInit.addToTab(ITEMS.register("block_item_id",
//            () -> new BlockItem(BlockInit.BLOCK_NAME.get(), new Item.Properties())));
}
