package shareyourskins.notenoughores;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class TungstenOre extends Block {

	protected TungstenOre(Material material) {
		super(material);
		this.setBlockTextureName("notenoughores:tungsten_ore");
		this.setHardness(3);
		this.setHarvestLevel("pickaxe", 2);
		this.setStepSound(this.soundTypeStone);

	}
	
}	