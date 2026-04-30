package net.amy.timeblades.particle;

import net.amy.timeblades.Timeblades;
import net.fabricmc.fabric.api.particle.v1.FabricParticleTypes;
import net.minecraft.particle.SimpleParticleType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import static net.amy.timeblades.Timeblades.MOD_ID;

public class ModParticles {

    public static final SimpleParticleType PAUSE_PARTICLE =
            registerParticle("pause_particle", FabricParticleTypes.simple());

    private static SimpleParticleType registerParticle(String name, SimpleParticleType particleType) {
        return Registry.register(Registries.PARTICLE_TYPE, Identifier.of(MOD_ID, name), particleType);
    }

    public static void registerParticles() {
        Timeblades.LOGGER.info("Registering Particles for: " + MOD_ID);
    }
}
