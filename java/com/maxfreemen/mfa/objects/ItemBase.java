package com.maxfreemen.mfa.objects;

import com.maxfreemen.mfa.MFApocalypseCore;
import com.maxfreemen.mfa.init.ItemInit;

import net.minecraft.item.Item;

public class ItemBase
	extends Item 
	implements IHasModel

{
	public ItemBase(String name)
	{
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(MFApocalypseCore.tabMFBase);
		
		ItemInit.ITEMS.add(this);

	}
	
	@Override
	public void registerModels()
	{
		MFApocalypseCore.proxy.registerItemRenderer(this, 0, "inventory");
	}
	
}
