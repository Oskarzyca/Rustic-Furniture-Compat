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
    }
}
