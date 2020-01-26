package shareyourskins.notenoughores;
	
	import net.minecraft.world.gen.feature.WorldGenMinable;
	import net.minecraft.block.Block;
	import net.minecraft.init.Blocks;
	import net.minecraft.world.chunk.IChunkProvider;
	import net.minecraft.world.World;
	import java.util.Random;
	import cpw.mods.fml.common.IWorldGenerator;

	public class OreGeneration implements IWorldGenerator
	{
	    public void generate(final Random random, final int chunkX, final int chunkZ, final World world, final IChunkProvider chunkGenerator, final IChunkProvider chunkProvider) {
	        switch (world.provider.dimensionId) {
	            case 0: {
	                this.generateOverworld(world, random, chunkX, chunkZ);
	                break;
	            }
	        }
	    }
	    
	    public void generateOverworld(final World world, final Random rand, final int x, final int z) {
	        this.generateOre(NotEnoughOres.CopperOre, world, rand, x, z, 2, 10, 50, 0, 75, Blocks.stone);
	        this.generateOre(NotEnoughOres.RubyOre, world, rand, x, z, 2, 9, 76, 0, 46, Blocks.stone);
	        this.generateOre(NotEnoughOres.SapphireOre, world, rand, x, z, 2, 6, 45, 0, 35, Blocks.stone);
	        this.generateOre(NotEnoughOres.TinOre, world, rand, x, z, 2, 15, 45, 0, 35, Blocks.stone);
	        this.generateOre(NotEnoughOres.SilverOre, world, rand, x, z, 3, 6, 53, 0, 55, Blocks.stone);
	        this.generateOre(NotEnoughOres.TungstenOre, world, rand, x, z, 3, 6, 12, 0, 28, Blocks.stone);
	    }
	    
	    public void generateOre(final Block block, final World world, final Random random, final int chunkX, final int chunkZ, final int minVienSize, final int maxVienSize, final int chance, final int minY, final int maxY, final Block generateIn) {
	        final int vienSize = minVienSize + random.nextInt(maxVienSize - minVienSize);
	        final int heightRange = maxY - minY;
	        final WorldGenMinable gen = new WorldGenMinable(block, vienSize, generateIn);
	        for (int i = 0; i < chance; ++i) {
	            final int xRand = chunkX * 16 + random.nextInt(16);
	            final int yRand = random.nextInt(heightRange) + minY;
	            final int zRand = chunkZ * 16 + random.nextInt(16);
	            gen.generate(world, random, xRand, yRand, zRand);
	        }
	    }
	}
