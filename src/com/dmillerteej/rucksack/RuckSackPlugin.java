package com.dmillerteej.rucksack;

import java.io.File;

import org.bukkit.plugin.java.JavaPlugin;

import com.dmillerteej.recipes.Backpack;

/**
 * @author teej107
 */
public class RuckSackPlugin extends JavaPlugin
{	
	private Backpack backpack;
	private RuckSackPlugin rucksack;
	
	@Override
	public void onEnable()
	{
		createFile(getDataFolder());
		backpack = new Backpack();
		rucksack = new RuckSackPlugin();
	}
	
	@Override
	public void onDisable()
	{
		
	}
	
	public void createFile(File file)
	{
		if(!file.exists())
		{
			file.mkdirs();
		}
	}
}
