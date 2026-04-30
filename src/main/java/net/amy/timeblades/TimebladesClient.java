package net.amy.timeblades;

import net.amy.timeblades.particle.ModParticles;
import net.amy.timeblades.particle.PauseParticle;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.particle.v1.ParticleFactoryRegistry;
import net.minecraft.client.particle.ParticleFactory;

public class TimebladesClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        ParticleFactoryRegistry.getInstance().register(ModParticles.PAUSE_PARTICLE, PauseParticle.Factory::new);
    }
}
