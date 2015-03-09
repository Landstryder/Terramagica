package com.landstryder.terramagica;

import com.landstryder.terramagica.configuration.ConfigurationHandler;
import com.landstryder.terramagica.init.ModBlocks;
import com.landstryder.terramagica.init.ModItems;
import com.landstryder.terramagica.init.Recipes;
import com.landstryder.terramagica.proxy.IProxy;
import com.landstryder.terramagica.reference.Reference;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
public class Terramagica
{
    @Mod.Instance(Reference.MOD_ID)
    public static Terramagica instance;

    @SidedProxy(clientSide = "com.landstryder.terramagica.proxy.ClientProxy", serverSide = "com.landstryder.terramagica.proxy.ServerProxy")
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        ConfigurationHandler.init(event.getSuggestedConfigurationFile());
        FMLCommonHandler.instance().bus().register(new ConfigurationHandler());

        ModItems.init();

        ModBlocks.init();
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
        Recipes.init();
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {

    }
}
