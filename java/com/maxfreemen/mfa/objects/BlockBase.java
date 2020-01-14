package com.maxfreemen.mfa.objects;

import com.maxfreemen.mfa.MFApocalypseCore;
import com.maxfreemen.mfa.init.BlockInit;
import com.maxfreemen.mfa.init.ItemInit;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class BlockBase extends Block implements IHasModel 

{
	public BlockBase(String name, Material material)
	{
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(MFApocalypseCore.tabMFBase);
		
		BlockInit.BLOCKS.add(this);
		ItemInit.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
		
	}
	
	@Override
	public void registerModels()
	{
		MFApocalypseCore.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
	}
	
}
