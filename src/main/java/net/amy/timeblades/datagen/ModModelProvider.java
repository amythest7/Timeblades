package net.amy.timeblades.datagen;


import net.amy.timeblades.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;


public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {

        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.CHRONOSTEEL_INGOT, Models.HANDHELD);

        //Time Blades
        itemModelGenerator.register(ModItems.BLANK_TIME_BLADE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.PAUSE_TIME_BLADE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.FORWARD_TIME_BLADE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.REVERSAL_TIME_BLADE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.SLOWMO_TIME_BLADE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.ACRONIX_TIME_BLADE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.KRUX_TIME_BLADE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.COMPLETE_TIME_BLADE, Models.HANDHELD);

        itemModelGenerator.register(ModItems.WILLS_HEARTFELT_WORDS_TO_CAI, Models.GENERATED);


    }
}
