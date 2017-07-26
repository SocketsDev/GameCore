package io.github.socketsdev.managers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class PlayerLives {
	
	int l = 0;
	HashMap<String, Integer> pl = new HashMap<String, Integer>();
	List<String> p = new ArrayList<String>();
	
	public PlayerLives(int lives) {
		this.l = lives;
	}
	
	public List<String> getPlayers() {
        return this.p;
    }
	
	public int getMaxLives() {
		return this.l;
	}
	
	public void put(String playerName) {
		this.pl.put(playerName, this.l);
		if(!(this.p.contains(playerName)))this.p.add(playerName);
	}
	
	public void remove(String playerName) {
		this.pl.remove(playerName);
	}
	
	public int get(String playerName) {
		return this.pl.get(playerName);
	}
	
	public void addLives(String playerName, int newLives) {
		this.pl.put(playerName, this.pl.get(playerName) + newLives);
	}
	
	public void removeLives(String playerName, int amount) {
		this.pl.put(playerName, this.pl.get(playerName) - amount);
	}

}
