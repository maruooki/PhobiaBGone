package com.maruooki.phobiabgone.mixin.twilightForest;

import com.maruooki.phobiabgone.mixin.minecraft.ModelSpiderMixin;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.model.ModelSpider;
import net.minecraft.entity.Entity;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import twilightforest.client.model.entity.ModelTFSwarmSpider;

@Mixin(ModelTFSwarmSpider.class)
@SideOnly(Side.CLIENT)
public class ModelTFSpiderMixin extends ModelSpider {

    @Unique
    private final ModelRenderer bb_main = new ModelRenderer((ModelSpider) (Object) this);
    @Unique
    private final ModelRenderer S = new ModelRenderer((ModelSpider) (Object) this);
    @Unique
    private final ModelRenderer cube_r1 = new ModelRenderer((ModelSpider) (Object) this);
    @Unique
    private final ModelRenderer cube_r2 = new ModelRenderer((ModelSpider) (Object) this);
    @Unique
    private final ModelRenderer cube_r3 = new ModelRenderer((ModelSpider) (Object) this);
    @Unique
    private final ModelRenderer cube_r4 = new ModelRenderer((ModelSpider) (Object) this);
    @Unique
    private final ModelRenderer cube_r5 = new ModelRenderer((ModelSpider) (Object) this);
    @Unique
    private final ModelRenderer cube_r6 = new ModelRenderer((ModelSpider) (Object) this);
    @Unique
    private final ModelRenderer cube_r7 = new ModelRenderer((ModelSpider) (Object) this);
    @Unique
    private final ModelRenderer cube_r8 = new ModelRenderer((ModelSpider) (Object) this);
    @Unique
    private final ModelRenderer cube_r9 = new ModelRenderer((ModelSpider) (Object) this);
    @Unique
    private final ModelRenderer cube_r10 = new ModelRenderer((ModelSpider) (Object) this);
    @Unique
    private final ModelRenderer cube_r11 = new ModelRenderer((ModelSpider) (Object) this);
    @Unique
    private final ModelRenderer cube_r12 = new ModelRenderer((ModelSpider) (Object) this);
    @Unique
    private final ModelRenderer cube_r13 = new ModelRenderer((ModelSpider) (Object) this);
    @Unique
    private final ModelRenderer P = new ModelRenderer((ModelSpider) (Object) this);
    @Unique
    private final ModelRenderer I = new ModelRenderer((ModelSpider) (Object) this);
    @Unique
    private final ModelRenderer D = new ModelRenderer((ModelSpider) (Object) this);
    @Unique
    private final ModelRenderer E = new ModelRenderer((ModelSpider) (Object) this);
    @Unique
    private final ModelRenderer R = new ModelRenderer((ModelSpider) (Object) this);


    @Inject(method = "<init>", at = @At(value = "TAIL"))
    public void init(CallbackInfo ci) {
        bb_main.textureHeight = 16;
        bb_main.textureWidth = 16;

        S.setRotationPoint(-11.0F, 21.0F, 0.0F);
        S.cubeList.add(new ModelBox(S, 0, 6, -13.0F, -18.75F, -1.0F, 2, 7, 2, 0.0F, false));
        S.cubeList.add(new ModelBox(S, 0, 6, -8.0F, -11.75F, -1.0F, 2, 5, 2, 0.0F, false));

        cube_r1.setRotationPoint(-5.0F, -7.75F, 0.0F);
        S.addChild(cube_r1);
        setRotationAngle(cube_r1, 0.0F, 0.0F, -1.5708F);
        cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 6, -1.0F, -8.0F, -1.0F, 2, 5, 2, 0.0F, false));

        cube_r2.setRotationPoint(-3.0F, -12.75F, 0.0F);
        S.addChild(cube_r2);
        setRotationAngle(cube_r2, 0.0F, 0.0F, -1.5708F);
        cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 6, -1.0F, -8.0F, -1.0F, 2, 5, 2, 0.0F, false));

        cube_r3.setRotationPoint(-3.0F, -17.75F, 0.0F);
        S.addChild(cube_r3);
        setRotationAngle(cube_r3, 0.0F, 0.0F, -1.5708F);
        cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 6, -1.0F, -8.0F, -1.0F, 2, 5, 2, 0.0F, false));

        P.setRotationPoint(-6.0F, 22.0F, 0.0F);
        P.cubeList.add(new ModelBox(P, 0, 6, -9.0F, -19.75F, -1.0F, 2, 12, 2, 0.0F, false));
        P.cubeList.add(new ModelBox(P, 0, 6, -4.0F, -17.75F, -1.0F, 2, 3, 2, 0.0F, false));

        cube_r4.setRotationPoint(-1.0F, -13.75F, 0.0F);
        P.addChild(cube_r4);
        setRotationAngle(cube_r4, 0.0F, 0.0F, -1.5708F);
        cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 6, -1.0F, -6.0F, -1.0F, 2, 5, 2, 0.0F, false));

        cube_r5.setRotationPoint(-8.0F, -18.75F, 0.0F);
        P.addChild(cube_r5);
        setRotationAngle(cube_r5, 0.0F, 0.0F, 1.5708F);
        cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 6, -1.0F, -6.0F, -1.0F, 2, 5, 2, 0.0F, false));

        I.setRotationPoint(-5.0F, 10.25F, 0.0F);
        I.cubeList.add(new ModelBox(I, 0, 6, -1.0F, -8.0F, -1.0F, 2, 12, 2, 0.0F, false));

        D.setRotationPoint(3.0F, 24.0F, 0.0F);
        D.cubeList.add(new ModelBox(D, 0, 6, -5.0F, -21.75F, -1.0F, 2, 12, 2, 0.0F, false));
        D.cubeList.add(new ModelBox(D, 0, 6, 1.0F, -19.75F, -1.0F, 2, 8, 2, 0.0F, false));

        cube_r6.setRotationPoint(-3.0F, -10.75F, 0.0F);
        D.addChild(cube_r6);
        setRotationAngle(cube_r6, 0.0F, 0.0F, -1.5708F);
        cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 6, -1.0F, 0.0F, -1.0F, 2, 4, 2, 0.0F, false));

        cube_r7.setRotationPoint(-3.0F, -20.75F, 0.0F);
        D.addChild(cube_r7);
        setRotationAngle(cube_r7, 0.0F, 0.0F, -1.5708F);
        cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 6, -1.0F, 0.0F, -1.0F, 2, 4, 2, 0.0F, false));

        E.setRotationPoint(-1.0F, 24.0F, 0.0F);
        E.cubeList.add(new ModelBox(E, 0, 6, 9.0F, -21.75F, -1.0F, 2, 12, 2, 0.0F, false));

        cube_r8.setRotationPoint(15.0F, -15.75F, 0.0F);
        E.addChild(cube_r8);
        setRotationAngle(cube_r8, 0.0F, 0.0F, 1.5708F);
        cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 6, -1.0F, 1.0F, -1.0F, 2, 3, 2, 0.0F, false));

        cube_r9.setRotationPoint(15.0F, -10.75F, 0.0F);
        E.addChild(cube_r9);
        setRotationAngle(cube_r9, 0.0F, 0.0F, 1.5708F);
        cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 6, -1.0F, -1.0F, -1.0F, 2, 5, 2, 0.0F, false));

        cube_r10.setRotationPoint(15.0F, -20.75F, 0.0F);
        E.addChild(cube_r10);
        setRotationAngle(cube_r10, 0.0F, 0.0F, 1.5708F);
        cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 6, -1.0F, -1.0F, -1.0F, 2, 5, 2, 0.0F, false));

        R.setRotationPoint(26.0F, 22.0F, 0.0F);
        R.cubeList.add(new ModelBox(R, 0, 6, -9.0F, -19.75F, -1.0F, 2, 12, 2, 0.0F, false));
        R.cubeList.add(new ModelBox(R, 0, 6, -4.0F, -17.75F, -1.0F, 2, 3, 2, 0.0F, false));

        cube_r11.setRotationPoint(-1.0F, -14.75F, 0.0F);
        R.addChild(cube_r11);
        setRotationAngle(cube_r11, 0.0F, 0.0F, -1.5708F);
        cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 6, -1.0F, -6.0F, -1.0F, 2, 5, 2, 0.0F, false));

        cube_r12.setRotationPoint(-8.0F, -18.75F, 0.0F);
        R.addChild(cube_r12);
        setRotationAngle(cube_r12, 0.0F, 0.0F, 1.5708F);
        cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 6, -1.0F, -6.0F, -1.0F, 2, 5, 2, 0.0F, false));

        cube_r13.setRotationPoint(-4.75F, -10.75F, 0.0F);
        R.addChild(cube_r13);
        setRotationAngle(cube_r13, 0.0F, 0.0F, 2.5744F);
        cube_r13.cubeList.add(new ModelBox(cube_r13, 0, 6, -1.0F, -3.0F, -1.0F, 2, 7, 2, 0.0F, false));
    }

    @Inject(method = "render", at = @At(value = "INVOKE"), cancellable = true)
    public void render(Entity entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scale, CallbackInfo ci) {
        ci.cancel();
        S.render(scale);
        P.render(scale);
        I.render(scale);
        D.render(scale);
        E.render(scale);
        R.render(scale);
        bb_main.render(scale);
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
