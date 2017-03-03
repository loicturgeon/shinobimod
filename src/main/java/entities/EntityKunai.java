package entities;

import com.tharx.shinobimod.items.ModItems;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;

public class EntityKunai extends EntityArrow{

	public EntityKunai(World worldIn, EntityLivingBase shooter) {
		super(worldIn, shooter);
		this.setDamage(1d);
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
	public void onCollideWithPlayer(EntityPlayer entityIn) 
	{
		if (!this.world.isRemote)
        {
			entityIn.dropItem(ModItems.item_kunai, 1);
			this.setDead();
        }

	}
	
	@Override
	protected void onHit(RayTraceResult raytraceResultIn) {
		Entity entity = raytraceResultIn.entityHit;
		if(entity != null && this.shootingEntity != null){
			if(entity instanceof EntityLivingBase){
				this.setDead();
			}
		}
		super.onHit(raytraceResultIn);
	}
	
	

}
