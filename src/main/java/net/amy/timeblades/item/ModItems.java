package net.amy.timeblades.item;

import net.amy.timeblades.Timeblades;
import net.amy.timeblades.effect.ModEffects;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.SwordItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;

import static net.amy.timeblades.Timeblades.MOD_ID;

public class ModItems {

    public static final Item CHRONOSTEEL_INGOT = registerItem("chronosteel_ingot", new Item(new Item.Settings()));

    //Time Blades
    public static final Item BLANK_TIME_BLADE = registerItem("blank_time_blade", new SwordItem(ModToolMaterials.CHRONOSTEEL, new Item.Settings()
            .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.CHRONOSTEEL, 3, -2.4f))
            .fireproof()
            .rarity(Rarity.EPIC)));
    public static final Item PAUSE_TIME_BLADE = registerItem("pause_time_blade", new TimebladeItem(ModToolMaterials.CHRONOSTEEL, new Item.Settings()
            .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.CHRONOSTEEL, 3, -2.4f))
            .fireproof()
            .rarity(Rarity.EPIC), StatusEffects.SLOWNESS));
    public static final Item FORWARD_TIME_BLADE = registerItem("forward_time_blade", new TimebladeItem(ModToolMaterials.CHRONOSTEEL, new Item.Settings()
            .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.CHRONOSTEEL, 3, -2.4f))
            .fireproof()
            .rarity(Rarity.EPIC), StatusEffects.SPEED));
    public static final Item REVERSAL_TIME_BLADE = registerItem("reversal_time_blade", new TimebladeItem(ModToolMaterials.CHRONOSTEEL, new Item.Settings()
            .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.CHRONOSTEEL, 3, -2.4f))
            .fireproof()
            .rarity(Rarity.EPIC), ModEffects.REVERSAL));
    public static final Item SLOWMO_TIME_BLADE = registerItem("slowmo_time_blade", new TimebladeItem(ModToolMaterials.CHRONOSTEEL, new Item.Settings()
            .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.CHRONOSTEEL, 3, -2.4f))
            .fireproof()
            .rarity(Rarity.EPIC), StatusEffects.MINING_FATIGUE));
    public static final Item ACRONIX_TIME_BLADE = registerItem("acronix_time_blade", new AdvancedTimebladeItem(ModToolMaterials.CHRONOSTEEL, new Item.Settings()
            .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.CHRONOSTEEL, 3, -2.4f))
            .fireproof()
            .rarity(Rarity.EPIC), StatusEffects.SPEED, StatusEffects.MINING_FATIGUE));
    public static final Item KRUX_TIME_BLADE = registerItem("krux_time_blade", new AdvancedTimebladeItem(ModToolMaterials.CHRONOSTEEL, new Item.Settings()
            .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.CHRONOSTEEL, 3, -2.4f))
            .fireproof()
            .rarity(Rarity.EPIC), StatusEffects.WEAKNESS, StatusEffects.MINING_FATIGUE));
    public static final Item COMPLETE_TIME_BLADE = registerItem("complete_time_blade", new TimebladeItem(ModToolMaterials.CHRONOSTEEL,new Item.Settings()
            .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.CHRONOSTEEL, 3, -2.4f))
            .fireproof()
            .rarity(Rarity.EPIC), StatusEffects.SLOWNESS));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(MOD_ID, name), item);
    }

    public static void registerModItems() {
        Timeblades.LOGGER.info("Registering Mod Items for " + MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(CHRONOSTEEL_INGOT);
        });
    }
}
