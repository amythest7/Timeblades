package net.amy.timeblades.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;


import java.util.concurrent.CompletableFuture;

import static net.amy.timeblades.item.ModItems.*;


public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(ItemTags.SWORD_ENCHANTABLE)
                .add(BLANK_TIME_BLADE)
                .add(PAUSE_TIME_BLADE)
                .add(SLOWMO_TIME_BLADE)
                .add(REVERSAL_TIME_BLADE)
                .add(FORWARD_TIME_BLADE)
                .add(ACRONIX_TIME_BLADE)
                .add(KRUX_TIME_BLADE)
                .add(COMPLETE_TIME_BLADE);
    }
}
