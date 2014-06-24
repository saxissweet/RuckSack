package com.dmillerteej.rucksack;

import java.io.File;

import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import com.dmillerteej.listeners.*;
import com.dmillerteej.recipes.*;

/**
 * @author teej107
 */
public class RuckSackPlugin extends JavaPlugin
{	
	private Backpack backpack;
	private RuckSack rucksack;
	
	@Override
	public void onEnable()
	{
		createFile(getDataFolder());
		
		backpack = new Backpack();
		rucksack = new RuckSack();
		
		registerListeners();
	}
	
	@Override
	public void onDisable()
	{
		//Save data here
	}
	
	private void registerListeners()
	{
		PluginManager pm = Bukkit.getPluginManager();
		pm.registerEvents(new InventoryListener(this), this);
	}
	
	public void createFile(File file)
	{
		if(!file.exists())
		{
			file.mkdirs();
		}
	}
	
	public Backpack getBackpack()
	{
		return backpack;
	}

	public RuckSack getRucksack()
	{
		return rucksack;
	}
}
