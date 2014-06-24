package com.dmillerteej.rucksack;

import org.bukkit.plugin.java.JavaPlugin;

import com.dmillerteej.recipes.Backpack;

/**
 * @author teej107
 */
public class RuckSack extends JavaPlugin
{	
	private Backpack backpack;
	private RuckSack rucksack;
	
	@Override
	public void onEnable()
	{
		backpack = new Backpack();
		rucksack = new RuckSack();
	}
	
	@Override
	public void onDisable()
	{
		
	}
}
