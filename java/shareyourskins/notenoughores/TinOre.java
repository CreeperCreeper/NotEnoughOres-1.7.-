package shareyourskins.notenoughores;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class TinOre extends Block {

	protected TinOre(Material material) {
		super(material);
		this.setBlockTextureName("notenoughores:tin_ore");
		this.setHardness(3);
		this.setHarvestLevel("pickaxe", 2); // 0 - Wood 1 - Stone / Gold 2 - Iron 3 - Diamond
		this.setStepSound(this.soundTypeStone);

	}
	
}	