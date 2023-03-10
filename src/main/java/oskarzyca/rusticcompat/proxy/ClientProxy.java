package oskarzyca.rusticcompat.proxy;

import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import oskarzyca.rusticcompat.block.ModBlocks;

public class ClientProxy extends CommonProxy {
    @Override
    public void preInit(FMLPreInitializationEvent event) {
        super.preInit(event);
        ModBlocks.initModels();
        if (Loader.isModLoaded("traverse")){
            ModBlocks.traverseInitModels();
        }
        if (Loader.isModLoaded("defiledlands")){
            ModBlocks.defiledInitModels();
        }
        if (Loader.isModLoaded("betternether")){
            ModBlocks.betnetInitModels();
        }
        if (Loader.isModLoaded("quark")){
            ModBlocks.quarkInitModels();
        }
        if (Loader.isModLoaded("twilightforest")){
            ModBlocks.twilightInitModels();
        }
        if (Loader.isModLoaded("immersiveengineering")){
            ModBlocks.immersiveInitModels();
        }
        if (Loader.isModLoaded("comfycozy")){
            ModBlocks.cozyInitModels();
        }
    }
}
