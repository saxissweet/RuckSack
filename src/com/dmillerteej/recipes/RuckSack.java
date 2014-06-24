package com.dmillerteej.recipes;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;

public class RuckSack
{
	private ItemStack rucksack;
	
	public RuckSack()
	{
		rucksack = new ItemStack(Material.CHEST);
		ShapedRecipe recipe = new ShapedRecipe(rucksack);
		recipe.shape("aaa", "aba", "aaa");
		recipe.setIngredient('a', Material.LEATHER);
		Bukkit.addRecipe(recipe);
	}

	public ItemStack getRucksack()
	{
		return rucksack;
	}
}
