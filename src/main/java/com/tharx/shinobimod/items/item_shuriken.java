package com.tharx.shinobimod.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class item_shuriken extends Item{
	
	public item_shuriken()
	{
		this.setUnlocalizedName("item_shuriken").setCreativeTab(CreativeTabs.COMBAT);
		this.setRegistryName("item_shuriken");
		GameRegistry.register(this);
		this.maxStackSize = 32;
	}
}
