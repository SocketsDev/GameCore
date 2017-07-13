package io.github.socketsdev.managers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class Kit {
	
	String n = null;
	List<String> p = new ArrayList<String>();
	HashMap<ItemStack, Integer> i = new HashMap<ItemStack, Integer>();
	ItemStack icon = null;
	
	public Kit(String name) {
		this.n = name;
	}
	
	public List<String> getPlayers() {
        return this.p;
    }
    
    //Getters / setters
	public String getName() {
		return this.n;
	}
	
	public void addPlayer(Player p) {
		this.p.add(p.getName());
	}
	
	public void removePlayer(Player p) {
		this.p.remove(p.getName());
	}
	
	public void removeKit() {
		this.n = null;
		this.p.removeAll(getPlayers());
	}
	
	public void addKitItem(ItemStack i, int s) {
		this.i.put(i, s);
	}
	
	public void giveKitPlayer(Player p) {
		if(!(this.p.contains(p.getName()))) this.p.add(p.getName());
		for(ItemStack i : this.i.keySet()) {
			if(this.i.get(i) == 100) { p.getInventory().setBoots(i); } else
			if(this.i.get(i) == 101) { p.getInventory().setLeggings(i); } else
			if(this.i.get(i) == 102) { p.getInventory().setChestplate(i); } else 
			if(this.i.get(i) == 103) { p.getInventory().setHelmet(i); } else
			if(this.i.get(i) <= 35) { p.getInventory().setItem(this.i.get(i), i); } else {
				System.out.println("error whilist applying kit " + getName() + " with slot " + this.i.get(i) + " with itemstack " + i + " for player " + p.getName());
			}
		}
	}
	
	public void setIcon(ItemStack icon) {
		this.icon = icon;
	}
	
	public ItemStack getIcon() {
		return this.icon;
	}

}
