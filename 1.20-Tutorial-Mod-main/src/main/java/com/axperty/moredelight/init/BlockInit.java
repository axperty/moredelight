package com.axperty.moredelight.init;

import com.axperty.moredelight.MoreDelight;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockInit {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MoreDelight.MODID);

    //public static final RegistryObject<BlockName> BLOCK_NAME = BLOCKS.register("block_name_id",
    //        () -> new BlockName(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)));

}
