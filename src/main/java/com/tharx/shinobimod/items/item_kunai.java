package com.tharx.shinobimod.items;

import entities.EntityKunai;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntitySnowball;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.StatList;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class item_kunai extends Item{
	public item_kunai(){
		this.setUnlocalizedName("item_kunai").setCreativeTab(CreativeTabs.COMBAT);
		this.setRegistryName("item_kunai");
		GameRegistry.register(this);
		this.maxStackSize = 32;
	}
	
	public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn)
    {
        ItemStack itemstack = playerIn.getHeldItem(handIn);

        if (!playerIn.capabilities.isCreativeMode)
        {
            itemstack.shrink(1);
        }

        //worldIn.playSound((EntityPlayer)null, playerIn.posX, playerIn.posY, playerIn.posZ, SoundEvents.ENTITY_SNOWBALL_THROW, SoundCategory.NEUTRAL, 0.5F, 0.4F / (itemRand.nextFloat() * 0.4F + 0.8F));

        if (!worldIn.isRemote)
        {
        	EntityKunai entitykunai = new EntityKunai(worldIn, playerIn);
        	entitykunai.setAim(playerIn, playerIn.rotationPitch, playerIn.rotationYaw, 0.0F, 3.0F, 0.2F);
            worldIn.spawnEntity(entitykunai);
        }

        playerIn.addStat(StatList.getObjectUseStats(this));
        return new ActionResult(EnumActionResult.SUCCESS, itemstack);
    }
	
	
}
