package com.tharx.shinobimod.render;

import com.tharx.shinobimod.References;

import entities.EntityKunai;
import net.minecraft.client.renderer.entity.RenderArrow;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderKunai extends RenderArrow<EntityKunai> {

	public RenderKunai(RenderManager rm) {
		super(rm);
	}

	public ResourceLocation getEntityTexture(EntityKunai entity) {
		return new ResourceLocation(References.MODID, "entity/kunai.png");
	}
}
