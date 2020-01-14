package com.maxfreemen.mfa.init;

import java.util.ArrayList;
import java.util.List;

import com.maxfreemen.mfa.objects.BlockBase;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;


public class BlockInit 

{
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block BLOCK_TEST = new BlockBase("block_test", Material.IRON);
}
