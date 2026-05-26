package com.axperty.moredelight;

import com.axperty.delightlib.api.DelightAddon;
import com.axperty.delightlib.api.DelightApi;
import com.axperty.delightlib.internal.DelightDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class MoreDelightDataGeneration implements DataGeneratorEntrypoint {

    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {

        FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();
        DelightApi addon = MoreDelight.addon;

        pack.addProvider((output, registries) -> new DelightDataGenerator(output, (DelightAddon) addon));
    }
}