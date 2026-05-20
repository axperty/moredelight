package com.axperty.moredelight.registry;

import com.axperty.moredelight.MoreDelight;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import vectorwing.farmersdelight.common.item.ConsumableItem;

import static vectorwing.farmersdelight.common.registry.ModItems.foodItem;

public class ItemRegistry {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MoreDelight.MOD_ID);

    // This is only needed for the creative tab icon, it will be deleted once Delight Lib changes this.
    public static final DeferredItem<Item> CHICKEN_SANDWICH_WITH_EGG_AND_TOMATO = ITEMS.register("chicken_sandwich_with_egg_and_tomato",
            () -> new ConsumableItem(foodItem((new FoodProperties.Builder())
                    .build())));
}
