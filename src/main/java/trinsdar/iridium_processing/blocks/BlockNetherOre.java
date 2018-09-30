package trinsdar.iridium_processing.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import trinsdar.iridium_processing.IridiumProcessing;

public class BlockNetherOre extends Block {

    public BlockNetherOre(String blockName){
        super(Material.ROCK);
        this.setHardness(3.0F);
        this.setResistance(10.0F);
        this.setSoundType(SoundType.STONE);
        this.setHarvestLevel("pickaxe", 2);
        this.setCreativeTab(IridiumProcessing.creativeTab);
        this.setRegistryName(IridiumProcessing.MODID, blockName);
        this.setUnlocalizedName(IridiumProcessing.MODID + "." + blockName);
    }
}
