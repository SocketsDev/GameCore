package io.github.socketsdev.managers;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

public class Team {
	
	String n = null;
	ChatColor c = null;
	List<String> p = new ArrayList<String>();
	
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

}
