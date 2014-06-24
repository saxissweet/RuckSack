package com.dmillerteej.listeners;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

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
		//Check the itemmeta data and see if it has a inventory file hooked up to it. If not, create new inventory and save it
		Player player = (Player) event.getWhoClicked();
		ItemStack item = event.getCurrentItem();
		for(ItemStack i : plugin.getBackpack().getBackpack())
		{
			if(item.equals(i))
			{
				player.openInventory(Bukkit.createInventory(player, InventoryType.CHEST, i.getType().toString() + " Backpack"));
				break;
			}
		}
		if(item.equals(plugin.getRucksack().getRucksack()))
		{
			player.openInventory(Bukkit.createInventory(player, InventoryType.CHEST, "Rucksack"));
		}
	}
}
