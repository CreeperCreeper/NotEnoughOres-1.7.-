package shareyourskins.notenoughores;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

public class RubyOre extends Block {

	protected RubyOre(Material material) {
		super(material);
		this.setBlockTextureName("notenoughores:ruby_ore");	
		this.setHardness(3);
		this.setHarvestLevel("pickaxe", 2); // 0 - Wood 1 - Stone / Gold 2 - Iron 3 - Diamond
		this.setStepSound(this.soundTypeStone);

	}	

@Override
public Item getItemDropped(int metadata, Random rand, int fortune){
	return NotEnoughOres.Ruby;
  }
}