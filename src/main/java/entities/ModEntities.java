package entities;

import com.tharx.shinobimod.Main;
import com.tharx.shinobimod.References;
import com.tharx.shinobimod.render.RenderExplosiveKunai;
import com.tharx.shinobimod.render.RenderKunai;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class ModEntities {
	public static void registerEntities(){
		EntityRegistry.registerModEntity(new ResourceLocation(References.MODID,"entity/kunai.png"),EntityKunai.class, "Kunai", Main.EntityIds++, Main.instance, 64, 20, true);
		EntityRegistry.registerModEntity(new ResourceLocation(References.MODID, "entity/explosive_kunai.png"), EntityExplosiveKunai.class, "Explosive_Kunai", Main.EntityIds++, Main.instance, 64, 20, true);
	}
	
	public static void renderEntities(){
		RenderManager renderer = Minecraft.getMinecraft().getRenderManager();
		renderer.entityRenderMap.put(EntityKunai.class, new RenderKunai(renderer));
		renderer.entityRenderMap.put(EntityExplosiveKunai.class, new RenderExplosiveKunai(renderer));
	}
}
