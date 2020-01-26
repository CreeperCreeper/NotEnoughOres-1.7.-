package shareyourskins.notenoughores;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = NotEnoughOres.MODID, name = NotEnoughOres.NAME, version = NotEnoughOres.VERSION)

public class NotEnoughOres {
	
	 public static final String MODID = "notenoughores";
	    public static final String VERSION = "1.7.10-R1";
	    public static final String NAME = "Not Enough Ores";
	    
	    public static Block CopperOre;
	    public static Block TinOre;
	    public static Block TinBlock;
	    public static Block SilverOre;
	    public static Item SilverIngot;
	    public static Block SilverBlock;
	    public static Block RubyOre;
	    public static Item Ruby;
	    public static Block RubyBlock;
	    public static Block SapphireOre;
	    public static Item SapphireIngot;
	    public static Block SapphireBlock;
	    public static Block CopperBlock;
	    public static Item CopperIngot;
	    public static Item TinIngot;
	    public static Block TungstenOre;
	    public static Item TungstenIngot;
	    public static Block TungstenBlock;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event){
		CopperOre = new CopperOre(Material.rock).setBlockName("CopperOre").setCreativeTab(tabNotEnoughOres);
		CopperBlock = new CopperBlock(Material.iron).setBlockName("CopperBlock").setCreativeTab(tabNotEnoughOres);
		CopperIngot = new CopperIngot().setUnlocalizedName("CopperIngot").setCreativeTab(tabNotEnoughOres);
		TungstenOre = new TungstenOre(Material.rock).setBlockName("TungstenOre").setCreativeTab(tabNotEnoughOres);
		TungstenBlock = new TungstenBlock(Material.iron).setBlockName("TungstenBlock").setCreativeTab(tabNotEnoughOres);
		TungstenIngot = new TungstenIngot().setUnlocalizedName("TungstenIngot").setCreativeTab(tabNotEnoughOres);
		SapphireOre = new SapphireOre(Material.rock).setBlockName("SapphireOre").setCreativeTab(tabNotEnoughOres);
		SapphireBlock = new SapphireBlock(Material.iron).setBlockName("SapphireBlock").setCreativeTab(tabNotEnoughOres);
		SapphireIngot = new SapphireIngot().setUnlocalizedName("SapphireIngot").setCreativeTab(tabNotEnoughOres);
		TinOre = new TinOre(Material.rock).setBlockName("TinOre").setCreativeTab(tabNotEnoughOres);
		TinBlock = new TinBlock(Material.iron).setBlockName("TinBlock").setCreativeTab(tabNotEnoughOres);
		TinIngot = new TinIngot().setUnlocalizedName("TinIngot").setCreativeTab(tabNotEnoughOres);
		SilverOre = new SilverOre(Material.rock).setBlockName("SilverOre").setCreativeTab(tabNotEnoughOres);
		SilverBlock = new SilverBlock(Material.iron).setBlockName("SilverBlock").setCreativeTab(tabNotEnoughOres);
		SilverIngot = new SilverIngot().setUnlocalizedName("SilverIngot").setCreativeTab(tabNotEnoughOres);
		RubyOre = new RubyOre(Material.rock).setBlockName("RubyOre").setCreativeTab(tabNotEnoughOres);
		RubyBlock = new RubyBlock(Material.iron).setBlockName("RubyBlock").setCreativeTab(tabNotEnoughOres);
		Ruby = new Ruby().setUnlocalizedName("Ruby").setCreativeTab(tabNotEnoughOres);
		GameRegistry.registerBlock(CopperOre, CopperOre.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(CopperIngot, CopperIngot.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(CopperBlock, CopperBlock.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(TungstenOre, TungstenOre.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(TungstenIngot, TungstenIngot.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(TungstenBlock, TungstenBlock.getUnlocalizedName().substring(5));
    	GameRegistry.registerBlock(RubyOre, RubyOre.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(Ruby, Ruby.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(RubyBlock, RubyBlock.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(SilverOre, SilverOre.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(SilverIngot, SilverIngot.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(SilverBlock, SilverBlock.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(TinOre, TinOre.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(TinIngot, TinIngot.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(TinBlock, TinBlock.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(SapphireOre, SapphireOre.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(SapphireIngot, SapphireIngot.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(SapphireBlock, SapphireBlock.getUnlocalizedName().substring(5));
		GameRegistry.addSmelting(CopperOre, new ItemStack(CopperIngot), 1.0F);
		GameRegistry.addSmelting(TinOre, new ItemStack(TinIngot), 1.0F);
		GameRegistry.addSmelting(SilverOre, new ItemStack(SilverIngot), 1.0F);
		GameRegistry.addSmelting(TungstenOre, new ItemStack(TungstenIngot), 1.0F);
		GameRegistry.addRecipe(new ItemStack(CopperBlock), "CCC", "CCC", "CCC", 'C', CopperIngot);
		GameRegistry.addRecipe(new ItemStack(TinBlock), "TTT", "TTT", "TTT", 'T', TinIngot);
		GameRegistry.addRecipe(new ItemStack(SilverBlock), "SSS", "SSS", "SSS", 'S', SilverIngot);
		GameRegistry.addRecipe(new ItemStack(SapphireBlock), "HHH", "HHH", "HHH", 'H', SapphireIngot);
		GameRegistry.addRecipe(new ItemStack(RubyBlock), "RRR", "RRR", "RRR", 'R', Ruby);
		GameRegistry.addRecipe(new ItemStack(TungstenBlock), "EEE", "EEE", "EEE", 'E', TungstenIngot);
		GameRegistry.addRecipe(new ItemStack(TungstenIngot, 9), "U", 'U', TungstenBlock);

	}
	
	@EventHandler
	public void init(FMLInitializationEvent event){
		GameRegistry.registerWorldGenerator(new OreGeneration(), 0);
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event){
		
	}
	
	public static CreativeTabs tabNotEnoughOres = new CreativeTabs("tabNotEnoughOres") {
		@Override
		public Item getTabIconItem(){
			return new ItemStack(CopperIngot).getItem();
		}
	};
}
