package shareyourskins.notenoughores;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class CopperBlock extends Block {

	protected CopperBlock(Material material) {
		super(material);
		this.setBlockTextureName("notenoughores:copper_block");
		this.setHardness(3);
		this.setHarvestLevel("pickaxe", 2); // 0 - Wood 1 - Stone / Gold 2 - Iron 3 - Diamond
		this.setStepSound(this.soundTypeMetal);

	}
	
}	