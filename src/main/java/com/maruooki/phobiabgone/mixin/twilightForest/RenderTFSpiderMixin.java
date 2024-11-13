package com.maruooki.phobiabgone.mixin.twilightForest;


import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import twilightforest.client.renderer.entity.RenderTFSwarmSpider;

@Mixin(RenderTFSwarmSpider.class)
@SideOnly(Side.CLIENT)
public class RenderTFSpiderMixin {

// NOT DONE    private static final ResourceLocation textureLoc = new ResourceLocation("phobiabgone", "textures/model/swarmspider.png");
}

