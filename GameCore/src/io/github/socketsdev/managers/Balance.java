package io.github.socketsdev.managers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Balance {
	
	String n = null;
	HashMap<String, Integer> bal = new HashMap<String, Integer>();
	List<String> p = new ArrayList<String>();
	
	public Balance(String name) {
		this.n = name;
	}
	
	public List<String> getPlayers() {
        return this.p;
    }
	
	public String getName() {
		return this.n;
	}
	
	public void setname(String newName) {
		this.n = newName;
	}
	
	public void put(String playerName, int balance) {
		this.bal.put(playerName, balance);
		if(!(this.p.contains(playerName)))this.p.add(playerName);
	}
	
	public void remove(String playerName) {
		this.bal.remove(playerName);
	}
	
	public int get(String playerName) {
		return this.bal.get(playerName);
	}
	
	public void addBalance(String playerName, int newBalance) {
		this.bal.put(playerName, this.bal.get(playerName) + newBalance);
	}
	
	public void removeBalance(String playerName, int amount) {
		this.bal.put(playerName, this.bal.get(playerName) - amount);
	}

}
