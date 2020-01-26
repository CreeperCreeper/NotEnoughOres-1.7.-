package shareyourskins.notenoughores;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class CopperOre extends Block {

	protected CopperOre(Material material) {
		super(material);
		this.setBlockTextureName("notenoughores:copper_ore");
		this.setHardness(3);
		this.setHarvestLevel("pickaxe", 2);
		this.setStepSound(this.soundTypeStone);

	}
	
}	