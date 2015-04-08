package nickey.yukari;

import java.io.File;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.config.Configuration;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = YukariBlocks.MODID, version = YukariBlocks.VERSION)
public class YukariBlocks
{
    public static final String MODID = "YukariBlocks";
    public static final String VERSION = "1.0";

    public static boolean canCollide;
    public static Block YukariBlock;

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
    	YukariBlock = new BlockYukari();
    	GameRegistry.registerBlock(YukariBlock, "YukariBlock");
    	GameRegistry.addRecipe(new ItemStack(YukariBlock),"XXX","XXX","XXX",'X',new ItemStack(Items.coal,1,1));
    	GameRegistry.addShapelessRecipe(new ItemStack(Blocks.diamond_block,2),Blocks.diamond_block,YukariBlock);
    	GameRegistry.addShapelessRecipe(new ItemStack(Blocks.iron_block,2),Blocks.iron_block,YukariBlock);
    	GameRegistry.addShapelessRecipe(new ItemStack(Blocks.gold_block,2),Blocks.gold_block,YukariBlock);
    	GameRegistry.addShapelessRecipe(new ItemStack(Blocks.emerald_block,2),Blocks.emerald_block,YukariBlock);
    }

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
    	File configDir = new File(event.getModConfigurationDirectory(),"YukariBlocks.cfg");
    	Configuration config = new Configuration(configDir);
    	config.load();
    	canCollide = config.getBoolean("canCollide","general",true,"can collide with Yukari Block?");
    }
}
