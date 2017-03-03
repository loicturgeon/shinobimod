package com.tharx.shinobimod.items;

import com.tharx.shinobimod.References;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import scala.actors.threadpool.helpers.Utils;

public class ModItems {
	public static Item item_kunai;
	public static Item item_explosive_kunai;
	
	public static void InitItems(){
		item_kunai = new item_kunai();
		item_explosive_kunai = new item_explosive_kunai();
	}
	
	public static void renderItems(){
		render(item_kunai);
		render(item_explosive_kunai);
	}
	
	private static void render(Item item){
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(new ResourceLocation(References.MODID, item.getUnlocalizedName().substring(5)), "inventory"));
		
	}
	
	
}
