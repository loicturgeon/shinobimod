package com.tharx.shinobimod.proxies;

import com.tharx.shinobimod.items.ModItems;

import entities.ModEntities;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy extends CommonProxy{
	public void preInit(FMLPreInitializationEvent e){
		super.preInit(e);
		ModItems.renderItems();
	}
	
	public void init(FMLInitializationEvent e){
		super.init(e);
		ModEntities.renderEntities();
	}
	
	public void postInit(FMLPostInitializationEvent e){
		super.postInit(e);
	}
}
