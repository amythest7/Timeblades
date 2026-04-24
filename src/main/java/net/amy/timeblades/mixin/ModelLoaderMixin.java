package net.amy.timeblades.mixin;

import net.amy.timeblades.Timeblades;
import net.minecraft.client.render.model.ModelLoader;
import net.minecraft.client.util.ModelIdentifier;
import net.minecraft.util.Identifier;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(ModelLoader.class)
public abstract class ModelLoaderMixin {
    @Shadow
    protected abstract void loadItemModel(ModelIdentifier id);

    @Inject(method = "<init>", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/render/model/ModelLoader;loadItemModel(Lnet/minecraft/client/util/ModelIdentifier;)V", ordinal = 1))
    private void onInit(CallbackInfo ci) {
        this.loadItemModel(ModelIdentifier.ofInventoryVariant(Identifier.of(Timeblades.MOD_ID, "blank_time_blade_3d")));
        this.loadItemModel(ModelIdentifier.ofInventoryVariant(Identifier.of(Timeblades.MOD_ID, "pause_time_blade_3d")));
        this.loadItemModel(ModelIdentifier.ofInventoryVariant(Identifier.of(Timeblades.MOD_ID, "slowmo_time_blade_3d")));
        this.loadItemModel(ModelIdentifier.ofInventoryVariant(Identifier.of(Timeblades.MOD_ID, "reversal_time_blade_3d")));
        this.loadItemModel(ModelIdentifier.ofInventoryVariant(Identifier.of(Timeblades.MOD_ID, "forward_time_blade_3d")));
        this.loadItemModel(ModelIdentifier.ofInventoryVariant(Identifier.of(Timeblades.MOD_ID, "acronix_time_blade_3d")));
        this.loadItemModel(ModelIdentifier.ofInventoryVariant(Identifier.of(Timeblades.MOD_ID, "krux_time_blade_3d")));
        this.loadItemModel(ModelIdentifier.ofInventoryVariant(Identifier.of(Timeblades.MOD_ID, "complete_time_blade_3d")));
    }
}
