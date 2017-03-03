package com.tharx.shinobimod.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class item_dart extends Item {
	public item_dart()
	{
		this.setUnlocalizedName("item_dart").setCreativeTab(CreativeTabs.COMBAT);
		this.setRegistryName("item_dart");
		GameRegistry.register(this);
	}
}
