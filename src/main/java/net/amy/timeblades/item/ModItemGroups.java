package net.amy.timeblades.item;

import net.amy.timeblades.Timeblades;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import static net.amy.timeblades.Timeblades.MOD_ID;

public class ModItemGroups {
    public static final ItemGroup TIME_BLADES_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP, Identifier.of(MOD_ID, "time_blade_items"),
            FabricItemGroup.builder()
                    .icon(() -> new ItemStack(ModItems.COMPLETE_TIME_BLADE))
                    .displayName(Text.translatable("itemgroup.timeblades.time_blades_items"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.CHRONOSTEEL_INGOT);
                      entries.add(ModItems.BLANK_TIME_BLADE);
                      entries.add(ModItems.PAUSE_TIME_BLADE);
                      entries.add(ModItems.FORWARD_TIME_BLADE);
                      entries.add(ModItems.REVERSAL_TIME_BLADE);
                      entries.add(ModItems.SLOWMO_TIME_BLADE);
                      entries.add(ModItems.ACRONIX_TIME_BLADE);
                      entries.add(ModItems.KRUX_TIME_BLADE);
                      entries.add(ModItems.COMPLETE_TIME_BLADE);
                    })
                    .build());

    public static void registerItemGroups() {
        Timeblades.LOGGER.info("Registering Item Groups for " + MOD_ID);
    }
}
