package nickey.yukari;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.World;

public class BlockYukari extends Block {

	protected BlockYukari() {
		super(Material.rock);
		this.setBlockTextureName("yukari:YukariBlock").setCreativeTab(CreativeTabs.tabDecorations).setHardness(4).setBlockName("YukariBlock");
	}
	public AxisAlignedBB getCollisionBoundingBoxFromPool(World w, int x, int y, int z)
    {
		return YukariBlocks.canCollide ? super.getCollisionBoundingBoxFromPool(w,x,y,z) : null;
    }
	public int quantityDropped(Random rand)
    {
        return 4;
    }
}
