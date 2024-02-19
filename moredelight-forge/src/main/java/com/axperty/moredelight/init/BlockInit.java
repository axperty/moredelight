package com.axperty.moredelight.init;

import com.axperty.moredelight.block.GlassCabinetBlock;
import com.axperty.moredelight.MoreDelight;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BlockInit {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MoreDelight.MODID);

    public static final RegistryObject<GlassCabinetBlock> GLASS_CABINET_BLOCK = BLOCKS.register("glass_cabinet_block",
            () -> new GlassCabinetBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)));

    public static final RegistryObject<GlassCabinetBlock> DRAWER_BLOCK = BLOCKS.register("drawer_block",
            () -> new GlassCabinetBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)));

}
