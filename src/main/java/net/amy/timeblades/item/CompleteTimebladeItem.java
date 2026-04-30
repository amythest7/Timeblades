package net.amy.timeblades.item;


import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.StackReference;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.screen.slot.Slot;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.ClickType;
import net.minecraft.util.Hand;

import java.util.List;

public class CompleteTimebladeItem extends SwordItem {

    private final RegistryEntry<StatusEffect> effect1;
    private final RegistryEntry<StatusEffect> effect2;
    private final RegistryEntry<StatusEffect> effect3;
    private final RegistryEntry<StatusEffect> effect4;

    public CompleteTimebladeItem(ToolMaterial toolMaterial, Settings settings, RegistryEntry<StatusEffect> effect1, RegistryEntry<StatusEffect> effect2, RegistryEntry<StatusEffect> effect3, RegistryEntry<StatusEffect> effect4) {
        super(toolMaterial, settings);
        this.effect1 = effect1;
        this.effect2 = effect2;
        this.effect3 = effect3;
        this.effect4 = effect4;
    }

    @Override
    public ActionResult useOnEntity(ItemStack stack, PlayerEntity user, LivingEntity entity, Hand hand) {
        StatusEffectInstance instance1 = new StatusEffectInstance(
                effect1, 120 * 20, 1, false, true, true
        );
        StatusEffectInstance instance2 = new StatusEffectInstance(
                effect2, 120 * 20, 1, false, true, true
        );
        StatusEffectInstance instance3 = new StatusEffectInstance(
                effect3, 120 * 20, 1, false, true, true
        );
        StatusEffectInstance instance4 = new StatusEffectInstance(
                effect4, 120 * 20, 1, false, true, true
        );


        entity.addStatusEffect(instance1);
        entity.addStatusEffect(instance2);
        entity.addStatusEffect(instance3);
        entity.addStatusEffect(instance4);

        return ActionResult.SUCCESS;
    }

    @Override
    public boolean onClicked(ItemStack stack, ItemStack otherStack, Slot slot, ClickType clickType, PlayerEntity player, StackReference cursorStackReference) {
        return super.onClicked(stack, otherStack, slot, clickType, player, cursorStackReference);
    }

    @Override
    public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
        tooltip.add(Text.translatable("tooltip.timeblades.complete_time_blade.tooltip"));
        super.appendTooltip(stack, context, tooltip, type);
    }
}
