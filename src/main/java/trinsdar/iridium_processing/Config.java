package trinsdar.iridium_processing;

import net.minecraftforge.common.config.Configuration;
import org.apache.logging.log4j.Level;

public class Config {
    private static final String CATEGORY_GENERAL = "general";

    public static int netherGenChance = 0;
    public static int endGenChance= 0;
    public static int overworldGenChance = 6;
    public static int netherMaxHeight = 256;
    public static int netherMinHeight = 0;
    public static int endMaxHeight = 256;
    public static int endMinHeight = 0;
    public static int overworldMaxHeight = 15;
    public static int overworldMinHeight = 0;

    public static void readConfig() {
        Configuration cfg = IridiumProcessing.config;
        try {
            cfg.load();
            initGeneralConfig(cfg);
        } catch (Exception e1) {
            IridiumProcessing.logger.log(Level.ERROR, "Problem loading config file!", e1);
        } finally {
            if (cfg.hasChanged()) {
                cfg.save();
            }
        }
    }

    private static void initGeneralConfig(Configuration cfg) {
        cfg.addCustomCategoryComment(CATEGORY_GENERAL, "General configuration");
        cfg.addCustomCategoryComment(CATEGORY_GENERAL, "Recommended to set the gen chances to 0 and use another mod for generation if you want more control.");
        // cfg.getBoolean() will get the value in the config if it is already specified there. If not it will create the value.
        netherGenChance = cfg.getInt("netherGenChance", CATEGORY_GENERAL, netherGenChance, 0, 500, "This determines the frequency of the ore. Set to 0 to disable.");
        endGenChance = cfg.getInt("endGenChance", CATEGORY_GENERAL, endGenChance, 0, 500, "This determines the frequency of the ore. Set to 0 to disable.");
        overworldGenChance = cfg.getInt("overworldGenChance", CATEGORY_GENERAL, overworldGenChance, 0, 500,  "This determines the frequency of the ore. Set to 0 to disable.");
        netherMaxHeight = cfg.getInt("netherMaxHeight", CATEGORY_GENERAL, netherMaxHeight, 1, 256,  "This determines the max height to generate the ore at.");
        endMaxHeight = cfg.getInt("endMaxHeight", CATEGORY_GENERAL, endMaxHeight, 1, 256,  "This determines the max height to generate the ore at.");
        overworldMaxHeight = cfg.getInt("overworldMaxHeight", CATEGORY_GENERAL, overworldMaxHeight, 1, 256, "This determines the max height to generate the ore at.");
        netherMinHeight = cfg.getInt("netherMinHeight", CATEGORY_GENERAL, netherMinHeight, 0, 255, "This determines the min height to generate the ore at.");
        endMinHeight = cfg.getInt("endMinHeight", CATEGORY_GENERAL, endMinHeight, 0, 255, "This determines the min height to generate the ore at.");
        overworldMinHeight = cfg.getInt("overworldMinHeight", CATEGORY_GENERAL, overworldMinHeight, 0, 255, "This determines the min height to generate the ore at.");
    }
}
