package com.tharx.shinobimod.render;

import com.tharx.shinobimod.References;

import entities.EntityExplosiveKunai;
import net.minecraft.client.renderer.entity.RenderArrow;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderExplosiveKunai extends RenderArrow<EntityExplosiveKunai>{

	public RenderExplosiveKunai(RenderManager renderManagerIn) {
		super(renderManagerIn);
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityExplosiveKunai entity) {
		return new ResourceLocation(References.MODID, "entity/explosive_kunai.png");
	}
	
}
