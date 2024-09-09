package com.axperty.moredelight;

import com.axperty.moredelight.item.ModItemList;
import com.axperty.moredelight.item.ModItems;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class MoreDelight implements ModInitializer {
    public static final String MOD_ID = "moredelight";
    public static final RegistryKey<ItemGroup> GROUP = RegistryKey.of(RegistryKeys.ITEM_GROUP, Identifier.of(MOD_ID, "group"));

    @Override
    public void onInitialize() {
        Registry.register(Registries.ITEM_GROUP, GROUP, FabricItemGroup.builder()
                .displayName(Text.translatable("itemGroup.moredelight"))
                .icon(() -> new ItemStack(ModItemList.CHICKEN_SANDWICH_WITH_EGG_AND_TOMATO))
                .build());

        ModItems.registerItems();
    }
}
