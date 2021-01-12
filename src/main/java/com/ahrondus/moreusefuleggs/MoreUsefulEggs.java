package com.ahrondus.moreusefuleggs;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.ahrondus.moreusefuleggs.init.ItemInitDR;

// The value here should match an entry in the META-INF/mods.toml file
@Mod("moreusefuleggs")
public class MoreUsefulEggs
{
    // Directly reference a log4j logger.
    private static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "moreusefuleggs";
    public static MoreUsefulEggs instance;


    public MoreUsefulEggs() 
    {
    	final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
    	
        // Register the setup method for mod loading
        modEventBus.addListener(this::setup);
        
        ItemInitDR.ITEMS.register(modEventBus);
        
        instance = this;

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event)
    {
    	
    }
    
}
