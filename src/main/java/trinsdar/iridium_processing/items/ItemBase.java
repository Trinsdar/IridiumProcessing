package trinsdar.iridium_processing.items;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import trinsdar.iridium_processing.IridiumProcessing;

import java.util.List;

public class ItemBase extends Item {
    public ItemBase(String itemName)
    {
        this.setCreativeTab(IridiumProcessing.creativeTab);
        this.setRegistryName(IridiumProcessing.MODID, itemName);
        this.setUnlocalizedName(IridiumProcessing.MODID + "." + itemName);
    }

    public List<ItemStack> getValidItemVariants()
    {
        return null;
    }
}
