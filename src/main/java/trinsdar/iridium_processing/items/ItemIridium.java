package trinsdar.iridium_processing.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;

import java.util.ArrayList;
import java.util.List;

public class ItemIridium extends ItemBase {

    public static final String[] itemIridium = {"platina_prill", "platina190", "iridium193", "iridium191", "iridium_compound"};

    public ItemIridium(String itemName){
        super(itemName);
        this.hasSubtypes = true;
    }

    @Override
    public String getUnlocalizedName(ItemStack itemStack) {
        return this.getUnlocalizedName() + "_" + itemIridium[itemStack.getMetadata()];
    }

    @Override
    public void getSubItems(CreativeTabs tab, NonNullList<ItemStack> items)
    {
        if (this.isInCreativeTab(tab))
        {
            int i = 0;

            for (String itemIrid : itemIridium)
            {
                items.add(new ItemStack(this, 1, i));
                i++;
            }
        }
    }

    @Override
    public List<ItemStack> getValidItemVariants()
    {
        List<ItemStack> itemList = new ArrayList<>();
        for (int i = 0; i < itemIridium.length; i++)
        {
            itemList.add(new ItemStack(this, 1, i));
        }
        return itemList;
    }

}
