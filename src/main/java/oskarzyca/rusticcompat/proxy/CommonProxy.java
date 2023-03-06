package oskarzyca.rusticcompat.proxy;

import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import oskarzyca.rusticcompat.block.ModBlocks;

public class CommonProxy {
    public static Configuration config;

    public void preInit(FMLPreInitializationEvent event) {
        ModBlocks.init();
        if (Loader.isModLoaded("traverse")){
            ModBlocks.traverseInit();
        }
        if (Loader.isModLoaded("defiledlands")){
            ModBlocks.defiledInit();
        }
        if (Loader.isModLoaded("betternether")){
            ModBlocks.betnetInit();
        }
        if (Loader.isModLoaded("quark")){
            ModBlocks.quarkInit();
        }
        if (Loader.isModLoaded("twilightforest")){
            ModBlocks.twilightInit();
        }
    }

    public void init(FMLInitializationEvent event) {
    }

    public void postInit(FMLPostInitializationEvent event) {
    }
}
