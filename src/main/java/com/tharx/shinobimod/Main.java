package com.tharx.shinobimod;

import com.tharx.shinobimod.proxies.CommonProxy;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = References.MODID, name=References.NAME, version = References.VERSION)
public class Main
{
    @SidedProxy(clientSide=References.CLIENTPROXY, serverSide=References.COMMONPROXY)
	public static CommonProxy proxy;
    
    public static int EntityIds = 1;
	
	@Instance
	public static Main instance = new Main();
	
    @EventHandler
    public void preinit(FMLPreInitializationEvent event)
    {
    	proxy.preInit(event);
    }
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
    	proxy.init(event);
    }
    
    @EventHandler
    public void postinit(FMLPostInitializationEvent event)
    {
    	proxy.postInit(event);
    }
}
