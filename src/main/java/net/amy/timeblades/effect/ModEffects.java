package net.amy.timeblades.effect;


import net.amy.timeblades.Timeblades;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;

public class ModEffects {

    public static final RegistryEntry<StatusEffect> REVERSAL = registerStatusEffect("reversal",
            new ReversalEffect(StatusEffectCategory.HARMFUL, 0xfff300)
                    .addAttributeModifier(EntityAttributes.GENERIC_OXYGEN_BONUS,
                    Identifier.of(Timeblades.MOD_ID, "reversal"), -1.0f,
            EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL));



    private static RegistryEntry<StatusEffect> registerStatusEffect(String name, StatusEffect statusEffect) {
        return Registry.registerReference(Registries.STATUS_EFFECT, Identifier.of(Timeblades.MOD_ID, name), statusEffect);
    }
    public static void registerEffects() {
        Timeblades.LOGGER.info("Registering Mod Effects for " + Timeblades.MOD_ID);
    }
}
