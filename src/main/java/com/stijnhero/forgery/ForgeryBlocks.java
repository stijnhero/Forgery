package com.stijnhero.forgery;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.registry.GameRegistry;
import com.stijnhero.forgery.common.block.BlockForgeryFurnace;
import com.stijnhero.forgery.common.block.BlockHeater;
import com.stijnhero.forgery.common.block.BlockLiquidOre;
import com.stijnhero.forgery.common.block.BlockOre;
import com.stijnhero.forgery.common.tileentity.TileEntityForgeryFurnace;
import com.stijnhero.forgery.common.tileentity.TileEntityHeater;
import com.stijnhero.forgery.common.worldgen.WorldGen;

public class ForgeryBlocks {
	
	public static Block OreCopper;
	public static Block OreTin;
	public static Block ClayHeater;
	public static Block BronzeHeater;
	public static Block LiquidCopper;
	public static Block ForgeryFurnace;
	public static Block LiquidCopperBlock;
	
	public static boolean HarvestWood = true;
	public static boolean LeavesDrop = true;
	
	public static void WorldGen(){
		GameRegistry.registerWorldGenerator(new WorldGen(), 1);
	}
	
	public static void Init(){
		LiquidCopperBlock = new BlockLiquidOre(ForgeryFluids.LiquidCopper, Material.lava).setUnlocalizedName("liquidcopper");
		OreCopper = new BlockOre(Material.rock, 1).setHardness(3.0F).setUnlocalizedName("orecopper");
		OreTin = new BlockOre(Material.rock, 1).setHardness(3.0F).setUnlocalizedName("oretin");
		ClayHeater = new BlockHeater(Material.rock, 100, 100).setHardness(3.0F).setUnlocalizedName("clayheater");
		BronzeHeater = new BlockHeater(Material.rock, 500, 500).setHardness(3.0F).setUnlocalizedName("bronzeheater");
		ForgeryFurnace = new BlockForgeryFurnace(Material.rock).setHardness(3.0F).setUnlocalizedName("forgery_furnace");
	}
	
	public static void RegisterBlocksInPre(){
		GameRegistry.registerBlock(ForgeryBlocks.OreCopper, "orecopper");
		GameRegistry.registerBlock(ForgeryBlocks.OreTin, "oretin");
		GameRegistry.registerBlock(ForgeryBlocks.ClayHeater, "clayheater");
		GameRegistry.registerBlock(ForgeryBlocks.ForgeryFurnace, "furnace");
		GameRegistry.registerBlock(ForgeryBlocks.BronzeHeater, "bronzeheater");
		GameRegistry.registerBlock(ForgeryBlocks.LiquidCopperBlock, "liquidcopper");
		
		GameRegistry.registerTileEntity(TileEntityHeater.class, "forgery.clayheater");
		GameRegistry.registerTileEntity(TileEntityForgeryFurnace.class, "forgery.furnace");
	}
	
	public static void EditBlocks(){
		if(HarvestWood)
			MinecraftForge.EVENT_BUS.register(new ForgeryEvents());
	}
}
