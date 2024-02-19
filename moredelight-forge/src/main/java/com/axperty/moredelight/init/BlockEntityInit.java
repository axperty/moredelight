package com.axperty.moredelight.init;

import com.axperty.moredelight.MoreDelight;
import com.axperty.moredelight.blockentity.GlassCabinetBlockEntity;
import com.axperty.moredelight.blockentity.DrawerBlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BlockEntityInit {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
            DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, MoreDelight.MODID);

    public static final RegistryObject<BlockEntityType<GlassCabinetBlockEntity>> GLASS_CABINET_BLOCK_ENTITY = BLOCK_ENTITIES
            .register("glass_cabinet_block",
                    () -> BlockEntityType.Builder.of(GlassCabinetBlockEntity::new, BlockInit.GLASS_CABINET_BLOCK.get())
                            .build(null));

    public static final RegistryObject<BlockEntityType<DrawerBlockEntity>> DRAWER_BLOCK_ENTITY = BLOCK_ENTITIES
            .register("drawer_block",
                    () -> BlockEntityType.Builder.of(DrawerBlockEntity::new, BlockInit.DRAWER_BLOCK.get())
                            .build(null));

}
