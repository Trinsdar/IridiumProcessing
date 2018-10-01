package trinsdar.iridium_processing.proxy;

import net.minecraft.item.Item;
import net.minecraftforge.common.MinecraftForge;
import trinsdar.iridium_processing.blocks.RegistryBlock;
import trinsdar.iridium_processing.items.RegistryItem;

public class CommonProxy {
    public void preInit()
    {
        MinecraftForge.EVENT_BUS.register(RegistryBlock.class);
        MinecraftForge.EVENT_BUS.register(RegistryItem.class);
    }

    public void registerItemRenderer(Item item, int meta, String id) {
    }
}
