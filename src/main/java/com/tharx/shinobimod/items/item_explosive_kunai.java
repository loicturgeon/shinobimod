package com.tharx.shinobimod.items;

import entities.EntityExplosiveKunai;
import entities.EntityKunai;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.StatList;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class item_explosive_kunai extends Item{
	public item_explosive_kunai(){
		this.setUnlocalizedName("item_explosive_kunai");
		this.setRegistryName("item_explosive_kunai");
		this.setCreativeTab(CreativeTabs.COMBAT);
		this.setNoRepair();
		this.maxStackSize = 32;
		GameRegistry.register(this);
		
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
        	EntityExplosiveKunai entityexpkunai = new EntityExplosiveKunai(worldIn, playerIn);
        	entityexpkunai.setAim(playerIn, playerIn.rotationPitch, playerIn.rotationYaw, 0.0F, 3.0F, 0.2F);
            worldIn.spawnEntity(entityexpkunai);
        }

        playerIn.addStat(StatList.getObjectUseStats(this));
        return new ActionResult(EnumActionResult.SUCCESS, itemstack);
    }
}
