package net.amy.timeblades.item;


import net.amy.timeblades.effect.ModEffects;
import net.amy.timeblades.effect.ReversalEffect;
import net.amy.timeblades.particle.ModParticles;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;

import java.util.List;

public class TimebladeItem extends SwordItem {

    private final RegistryEntry<StatusEffect> effect;

    public TimebladeItem(ToolMaterial toolMaterial, Settings settings, RegistryEntry<StatusEffect> effect) {
        super(toolMaterial, settings);
        this.effect = effect;
    }

    @Override
    public ActionResult useOnEntity(ItemStack stack, PlayerEntity user, LivingEntity entity, Hand hand) {

        StatusEffectInstance instance = new StatusEffectInstance(
                effect, 120 * 20, 1, false, true, true
        );



        entity.addStatusEffect(instance);

        return ActionResult.SUCCESS;
    }

    @Override
    public void postDamageEntity(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        super.postDamageEntity(stack, target, attacker);
    }


}
