package trinsdar.iridium_processing;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;
import trinsdar.iridium_processing.proxy.CommonProxy;
import trinsdar.iridium_processing.util.CreativeTabIridiumProcessing;

import java.io.File;

@Mod(modid = IridiumProcessing.MODID, name = IridiumProcessing.NAME, version = IridiumProcessing.VERSION)
public class IridiumProcessing
{
    public static final String MODID = "iridium_processing";
    public static final String NAME = "Iridium Processing";
    public static final String VERSION = "@VERSION@";

    public static Configuration config;
    public static Logger logger;

    @SidedProxy(clientSide = "trinsdar.iridium_processing.proxy.ClientProxy", serverSide = "trinsdar.iridium_processing.proxy.CommonProxy")
    public static CommonProxy proxy;
    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        proxy.preInit();
        logger = event.getModLog();
        File directory = event.getModConfigurationDirectory();
        config = new Configuration(new File(directory.getPath(), "iridium_processing.cfg"));
        Config.readConfig();
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
//        if (Loader.isModLoaded("ic2")) {
//            IC2Recipes.addRecipes();
//        }
    }

    @EventHandler
    public void postInit(FMLInitializationEvent event){
        if (config.hasChanged()) {
            config.save();
        }
    }

    public static final CreativeTabs creativeTab = new CreativeTabIridiumProcessing(MODID);
}
