package com.maxfreemen.mfa;

import com.maxfreemen.mfa.proxy.CommonProxy;
import com.maxfreemen.mfa.util.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION)

public class MFApocalypseCore 

{
	
    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        System.out.println("\u001B[32m" + "[Starting MF Apocalypse Mod PRE-INITIALIZATION]" + "\u001B[0m");
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        System.out.println("\u001B[32m" + "[Starting MF Apocalypse Mod INITIALIZATION]" + "\u001B[0m");
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        System.out.println("\u001B[32m" + "[Starting MF Apocalypse Mod POST-INITIALIZATION]" + "\u001B[0m");
    }
    
    @SidedProxy(clientSide =Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
    public static CommonProxy proxy;
    
	
	public static final CreativeTabs tabMFBase = new CreativeTabs("mf_tab")
	{
	    @Override
	    public ItemStack getTabIconItem()
	    {
	        return new ItemStack(Item.getItemFromBlock(Blocks.BRICK_BLOCK));
	    }
	};
}