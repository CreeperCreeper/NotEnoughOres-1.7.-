package shareyourskins.notenoughores;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class SapphireOre extends Block {

	protected SapphireOre(Material material) {
		super(material);
		this.setBlockTextureName("notenoughores:sapphire_ore");
		this.setHardness(3);
		this.setHarvestLevel("pickaxe", 2);
		this.setStepSound(this.soundTypeStone);

	}
	
}	