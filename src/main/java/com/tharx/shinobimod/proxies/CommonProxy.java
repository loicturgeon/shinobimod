package com.tharx.shinobimod.proxies;

import com.tharx.shinobimod.items.ModItems;

import entities.ModEntities;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy {
	public void preInit(FMLPreInitializationEvent e){
		ModItems.InitItems();
		ModEntities.registerEntities();
	}
	
	public void init(FMLInitializationEvent e){
		
	}
	
	public void postInit(FMLPostInitializationEvent e){
		
	}
}
