package io.github.socketsdev.managers;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class Team {
	
	String n = null;
	ChatColor c = null;
	List<String> p = new ArrayList<String>();
	Location l = null;
	ItemStack icon = null;
	
	public Team(String name) {
		this.n = name;
	}
	
	public Team(String name, ChatColor teamColor) {
		this.n = name;
		this.c = teamColor;
	}
	
	public List<String> getPlayers() {
        return this.p;
    }
    
    //Getters / setters
	public String getName() {
		return this.n;
	}
	
	public ChatColor getColor() {
		return this.c;
	}
	
	public void setColor(ChatColor c) {
		this.c = c;
	}
	
	public void addPlayer(Player p) {
		this.p.add(p.getName());
	}
	
	public void removePlayer(Player p) {
		this.p.remove(p.getName());
	}
	
	public void clearTeam() {
		this.n = null;
		this.c = null;
		this.p.removeAll(getPlayers());
	}
	
	public void setHome(Location l) {
		this.l = l;
	}
	
	public Location getHome() {
		return this.l;
	}
	
	public void setIcon(ItemStack icon) {
		this.icon = icon;
	}
	
	public ItemStack getIcon() {
		return this.icon;
	}

}
