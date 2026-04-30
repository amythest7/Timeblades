package net.amy.timeblades.item;

import net.amy.timeblades.Timeblades;
import net.amy.timeblades.effect.ModEffects;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;

import java.util.List;

import static net.amy.timeblades.Timeblades.MOD_ID;

public class ModItems {

    public static final Item CHRONOSTEEL_INGOT = registerItem("chronosteel_ingot", new Item(new Item.Settings()));

    //Time Blades
    public static final Item BLANK_TIME_BLADE = registerItem("blank_time_blade", new SwordItem(ModToolMaterials.CHRONOSTEEL, new Item.Settings()
            .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.CHRONOSTEEL, 3, -2.4f))
            .fireproof()
            .rarity(Rarity.EPIC)));
    public static final Item PAUSE_TIME_BLADE = registerItem("pause_time_blade", new TimebladeItem(ModToolMaterials.CHRONOSTEEL, new Item.Settings()
            .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.CHRONOSTEEL, 4, -2.4f))
            .fireproof()
            .rarity(Rarity.EPIC), StatusEffects.SLOWNESS){
        @Override
        public void appendTooltip(ItemStack stack, Item.TooltipContext context, List< Text > tooltip, TooltipType type) {
            tooltip.add(Text.translatable("tooltip.timeblades.pause_time_blade.tooltip"));
            super.appendTooltip(stack, context, tooltip, type);
        }
    });
    public static final Item FORWARD_TIME_BLADE = registerItem("forward_time_blade", new TimebladeItem(ModToolMaterials.CHRONOSTEEL, new Item.Settings()
            .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.CHRONOSTEEL, 4, -2.4f))
            .fireproof()
            .rarity(Rarity.EPIC), StatusEffects.HUNGER){
        @Override
        public void appendTooltip(ItemStack stack, Item.TooltipContext context, List< Text > tooltip, TooltipType type) {
            tooltip.add(Text.translatable("tooltip.timeblades.forward_time_blade.tooltip"));
            super.appendTooltip(stack, context, tooltip, type);
        }
    });
    public static final Item REVERSAL_TIME_BLADE = registerItem("reversal_time_blade", new TimebladeItem(ModToolMaterials.CHRONOSTEEL, new Item.Settings()
            .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.CHRONOSTEEL, 4, -2.4f))
            .fireproof()
            .rarity(Rarity.EPIC), ModEffects.REVERSAL){
        @Override
        public void appendTooltip(ItemStack stack, Item.TooltipContext context, List< Text > tooltip, TooltipType type) {
            tooltip.add(Text.translatable("tooltip.timeblades.reversal_time_blade.tooltip"));
            super.appendTooltip(stack, context, tooltip, type);
        }
    });
    public static final Item SLOWMO_TIME_BLADE = registerItem("slowmo_time_blade", new TimebladeItem(ModToolMaterials.CHRONOSTEEL, new Item.Settings()
            .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.CHRONOSTEEL, 4, -2.4f))
            .fireproof()
            .rarity(Rarity.EPIC), StatusEffects.MINING_FATIGUE){
        @Override
        public void appendTooltip(ItemStack stack, Item.TooltipContext context, List< Text > tooltip, TooltipType type) {
            tooltip.add(Text.translatable("tooltip.timeblades.slowmo_time_blade.tooltip"));
            super.appendTooltip(stack, context, tooltip, type);
        }
    });
    public static final Item ACRONIX_TIME_BLADE = registerItem("acronix_time_blade", new AdvancedTimebladeItem(ModToolMaterials.CHRONOSTEEL, new Item.Settings()
            .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.CHRONOSTEEL, 5, -2.4f))
            .fireproof()
            .rarity(Rarity.EPIC), StatusEffects.HUNGER, StatusEffects.MINING_FATIGUE){
        @Override
        public void appendTooltip(ItemStack stack, Item.TooltipContext context, List< Text > tooltip, TooltipType type) {
            tooltip.add(Text.translatable("tooltip.timeblades.acronix_time_blade.tooltip"));
            super.appendTooltip(stack, context, tooltip, type);
        }
    });
    public static final Item KRUX_TIME_BLADE = registerItem("krux_time_blade", new AdvancedTimebladeItem(ModToolMaterials.CHRONOSTEEL, new Item.Settings()
            .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.CHRONOSTEEL, 5, -2.4f))
            .fireproof()
            .rarity(Rarity.EPIC), StatusEffects.WEAKNESS, ModEffects.REVERSAL){
        @Override
        public void appendTooltip(ItemStack stack, Item.TooltipContext context, List< Text > tooltip, TooltipType type) {
            tooltip.add(Text.translatable("tooltip.timeblades.krux_time_blade.tooltip"));
            super.appendTooltip(stack, context, tooltip, type);
        }
    });
    public static final Item COMPLETE_TIME_BLADE = registerItem("complete_time_blade", new CompleteTimebladeItem(ModToolMaterials.CHRONOSTEEL,new Item.Settings()
            .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.CHRONOSTEEL, 7, -2.4f))
            .fireproof()
            .rarity(Rarity.EPIC),  StatusEffects.HUNGER, StatusEffects.MINING_FATIGUE, StatusEffects.SLOWNESS, ModEffects.REVERSAL));


    public static final Item WILLS_HEARTFELT_WORDS_TO_CAI = registerItem("wills_heartfelt_words_to_cai", new Item(new Item.Settings()){
        @Override
        public void appendTooltip(ItemStack stack, Item.TooltipContext context, List< Text > tooltip, TooltipType type) {
            tooltip.add(Text.translatable("tooltip.timeblades.wills_heartfelt_words_to_cai.tooltip"));
            super.appendTooltip(stack, context, tooltip, type);
        }
    });

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
