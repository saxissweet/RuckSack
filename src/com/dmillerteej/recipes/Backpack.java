package com.dmillerteej.recipes;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapelessRecipe;

public class Backpack
{	
	private ItemStack[] backpacks;

	public Backpack()
	{
		backpacks = new ItemStack[]
			{ new ItemStack(Material.LEATHER_CHESTPLATE),
					new ItemStack(Material.IRON_CHESTPLATE),
					new ItemStack(Material.DIAMOND_CHESTPLATE),
					new ItemStack(Material.GOLD_CHESTPLATE) };
		
		for(ItemStack i : backpacks)
		{			
			//Metadata things etc. here
			ShapelessRecipe recipe = new ShapelessRecipe(i);
			recipe.addIngredient(i.getType());
			recipe.addIngredient(Material.CHEST);
			Bukkit.addRecipe(recipe);
		}
	}

	public ItemStack[] getBackpack()
	{
		return backpacks;
	}
}