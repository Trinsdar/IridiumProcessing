package trinsdar.iridium_processing.items;

import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.registries.IForgeRegistry;
import trinsdar.iridium_processing.blocks.RegistryBlock;

public class RegistryItem {
    public static final Item itemIridium = new ItemIridium("itemIridium");

    public static final Item[] items = {
            itemIridium
    };

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event)
    {
        IForgeRegistry registry = event.getRegistry();

        for (Item item : items)
        {
            registry.register(item);
        }
    }

    public static void registerModels() {
//        itemIridium.registerItemModel();
    }

    @SubscribeEvent
    public static void registerItems(ModelRegistryEvent event) {
        RegistryItem.registerModels();
        RegistryBlock.registerModels();
    }
}
