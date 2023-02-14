package oskarzyca.rusticcompat;

import org.apache.logging.log4j.Logger;
import oskarzyca.rusticcompat.proxy.CommonProxy;


import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.Mod;

@Mod(
        modid = RusticCompat.MOD_ID,
        name = RusticCompat.MOD_NAME,
        version = RusticCompat.VERSION,
        dependencies = "required-after:rustic"
)
public class RusticCompat {

    public static final String MOD_ID = "rusticcompat";
    public static final String MOD_NAME = "Rustic Furniture Compat";
    public static final String VERSION = "1.0";

    /**
     * This is the instance of your mod as created by Forge. It will never be null.
     */
    @SuppressWarnings("unused")
    private static Logger logger;
    @SidedProxy(clientSide = "oskarzyca.rusticcompat.proxy.ClientProxy", serverSide = "oskarzyca.rusticcompat.proxy.CommonProxy")
    public static CommonProxy proxy;

    @Mod.Instance(MOD_ID)
    public static RusticCompat INSTANCE;

    /**
     * This is the first initialization event. Register tile entities here.
     * The registry events below will have fired prior to entry to this method.
     */
    @Mod.EventHandler
    public void preinit(FMLPreInitializationEvent event) {
        proxy.preInit(event);
        logger = event.getModLog();
    }

    /**
     * This is the second initialization event. Register custom recipes
     */
    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        proxy.init(event);
    }

    /**
     * This is the final initialization event. Register actions from other mods here
     */
    @Mod.EventHandler
    public void postinit(FMLPostInitializationEvent event) {
        proxy.postInit(event);
    }
}
