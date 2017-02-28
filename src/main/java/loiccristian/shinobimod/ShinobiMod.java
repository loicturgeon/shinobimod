package loiccristian.shinobimod;

import loiccristian.shinobimod.proxy.CommonProxy;
import loiccristian.shinobimod.util.Utils;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION)
public class ShinobiMod {
	
	@Mod.Instance(Reference.MODID)
	public static ShinobiMod instance;
	@SidedProxy(serverSide = Reference.SERVER_PROXY_CLASS, clientSide = Reference.CLIENT_PROXY_CLASS)
	public static CommonProxy proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event){
		Utils.getLogger().info("Pre Init");
		
		proxy.registerRenders();
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event){
		Utils.getLogger().info("Init");
	}
	@EventHandler
	public void postinit(FMLPostInitializationEvent event){
		Utils.getLogger().info("Post Init");
	}

}
