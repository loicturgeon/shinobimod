package entities;

import com.tharx.shinobimod.items.ModItems;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;

public class EntityExplosiveKunai extends EntityArrow{

	public EntityExplosiveKunai(World worldIn) {
		super(worldIn);
	}

	public EntityExplosiveKunai(World worldIn, double x, double y, double z) {
		super(worldIn, x, y, z);
	}

	public EntityExplosiveKunai(World worldIn, EntityLivingBase shooter) {
		super(worldIn, shooter);
	}

	@Override
	protected ItemStack getArrowStack() {
		return new ItemStack(ModItems.item_explosive_kunai);
	}
	
	@Override
	protected void onHit(RayTraceResult raytraceResultIn) {
		//super.onHit(raytraceResultIn);
		if(!this.world.isRemote){
			this.setDead();
			this.world.createExplosion(this, this.posX, this.posY, this.posZ, 3.0F, true);
		}
		
		
	}
}
