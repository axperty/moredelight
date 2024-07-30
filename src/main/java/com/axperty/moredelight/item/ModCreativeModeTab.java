package com.axperty.moredelight.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab CREATIVE_MODE_TAB = new CreativeModeTab("moredelight.title") {
      @Override
      public ItemStack makeIcon() {
          return new ItemStack(ModItems.WOODEN_KNIFE.get());
      }
    };
}
