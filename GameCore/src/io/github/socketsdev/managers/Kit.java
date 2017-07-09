package io.github.socketsdev.managers;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.entity.Player;

public class Kit {
	
	String n = null;
	List<String> p = new ArrayList<String>();
	
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

}
