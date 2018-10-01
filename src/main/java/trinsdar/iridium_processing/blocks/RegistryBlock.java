package trinsdar.iridium_processing.blocks;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.registries.IForgeRegistry;

public class RegistryBlock {
    public static final Block blockOre = new BlockOre("platinaOre");
    public static final Block blockEndOre = new BlockEndOre("platinaEndOre");
    public static final Block blockNetherOre = new BlockNetherOre("platinaNetherOre");

    public static final Block[] blocks =
    {
            blockOre,
            blockEndOre,
            blockNetherOre
    };

    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event)
    {
        IForgeRegistry registry = event.getRegistry();

        for (Block block : blocks)
        {
            registry.register(block);
        }

    }

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event)
    {
        IForgeRegistry registry = event.getRegistry();

        for (Block block : blocks)
        {
            registry.register(new ItemBlock(block).setRegistryName(block.getRegistryName()).setUnlocalizedName(block.getUnlocalizedName()));
        }
    }

    public static void registerModels() {
//        blockOre.registerItemModel(Item.getItemFromBlock(blockOre));
//        blockEndOre.registerItemModel(Item.getItemFromBlock(blockEndOre));
//        blockNetherOre.registerItemModel(Item.getItemFromBlock(blockNetherOre));
    }

}
