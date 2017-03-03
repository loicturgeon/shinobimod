package entities;

import com.tharx.shinobimod.Main;
import com.tharx.shinobimod.References;
import com.tharx.shinobimod.render.RenderKunai;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class ModEntities {
	public static void registerEntities(){
		EntityRegistry.registerModEntity(new ResourceLocation(References.MODID,"textures/entity/kunai"),EntityKunai.class, "Kunai", Main.EntityIds++, Main.instance, 64, 20, true);
	}
	
	public static void renderEntities(){
		RenderingRegistry.registerEntityRenderingHandler(EntityKunai.class, new IRenderFactory() {
			@Override
			public Render createRenderFor(RenderManager manager) {
				return new RenderKunai(manager);
			}
		});
	}
}
