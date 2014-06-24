package com.dmillerteej.listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

import com.dmillerteej.rucksack.RuckSackPlugin;

public class InventoryListener implements Listener
{
	private RuckSackPlugin plugin;
	
	public InventoryListener(RuckSackPlugin plugin)
	{
		this.plugin = plugin;
	}
	
	@EventHandler
	public void onInventoryClick(InventoryClickEvent event)
	{
		
	}
}
