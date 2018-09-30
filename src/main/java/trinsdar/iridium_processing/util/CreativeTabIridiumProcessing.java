package trinsdar.iridium_processing.util;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;

public class CreativeTabIridiumProcessing extends CreativeTabs {
    public CreativeTabIridiumProcessing(String label)
    {
        super(label);
    }

    @Override
    public ItemStack getTabIconItem()
    {
        return new ItemStack(Blocks.GRAVEL);
    }
}
