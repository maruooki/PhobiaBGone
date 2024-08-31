package com.maruooki.phobiabgone.mixin.minecraft;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.model.ModelSpider;
import net.minecraft.entity.Entity;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@SideOnly(Side.CLIENT)
@Mixin(ModelSpider.class)
public class ModelSpiderMixin {

    @Unique
    private final ModelRenderer bb_main = new ModelRenderer((ModelSpider)(Object)this);

    @Inject(method = "<init>", at = @At(value = "TAIL"))
    public void init(CallbackInfo ci) {
        bb_main.textureHeight = 64;
        bb_main.textureWidth = 64;
        bb_main.setRotationPoint(0.0F, 24.0F, 0.0F);
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -14.0F, -21.0F, 0.0F, 28, 21, 0, 0.0F, false));
    }

    @Inject(method = "render", at = @At(value = "INVOKE"), cancellable = true)
    public void render(Entity entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scale, CallbackInfo ci) {
        ci.cancel();
        bb_main.render(scale);
    }
}
