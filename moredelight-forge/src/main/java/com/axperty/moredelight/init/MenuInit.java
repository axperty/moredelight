package com.axperty.moredelight.init;

import com.axperty.moredelight.MoreDelight;
import com.axperty.moredelight.menu.DrawerMenu;
import com.axperty.moredelight.menu.ExampleMenu;
import net.minecraft.world.inventory.MenuType;
import net.minecraftforge.common.extensions.IForgeMenuType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class MenuInit {
    public static final DeferredRegister<MenuType<?>> MENU_TYPES =
            DeferredRegister.create(ForgeRegistries.MENU_TYPES, MoreDelight.MODID);

    public static final RegistryObject<MenuType<ExampleMenu>> EXAMPLE_MENU = MENU_TYPES.register("example_menu",
            () -> IForgeMenuType.create(ExampleMenu::new));

    public static final RegistryObject<MenuType<DrawerMenu>> DRAWER_MENU = MENU_TYPES.register("drawer_menu",
            () -> IForgeMenuType.create(DrawerMenu::new));
}
