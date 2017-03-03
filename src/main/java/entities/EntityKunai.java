package entities;

import com.tharx.shinobimod.items.ModItems;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class EntityKunai extends EntityArrow{

	public EntityKunai(World worldIn, EntityLivingBase shooter) {
		super(worldIn, shooter);
	}

	public EntityKunai(World worldIn, double x, double y, double z) {
		super(worldIn, x, y, z);
	}

	public EntityKunai(World worldIn) {
		super(worldIn);
	}

	@Override
	protected ItemStack getArrowStack() {
		return null;
	}
	
	@Override
	protected void arrowHit(EntityLivingBase living) {
		super.arrowHit(living);
	}
	
	@Override
	public void onCollideWithPlayer(EntityPlayer entityIn) {
		entityIn.dropItem(ModItems.item_kunai, 1);
		this.setDead();

	}
	
	

}
