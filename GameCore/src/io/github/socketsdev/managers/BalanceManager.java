package io.github.socketsdev.managers;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.entity.Player;
import org.bukkit.event.Listener;

import io.github.socketsdev.GameCore;

public class BalanceManager implements Listener {
	
	GameCore gamecore;
	 
	public BalanceManager(GameCore instance) {
	    gamecore = instance;
	}
	
	List<Balance> currencies = new ArrayList<Balance>();
	
	public Balance getBalance(String name) {
		Balance b = null;
        for(Balance bal : currencies){
            if(bal.getName().equalsIgnoreCase(name)){
                b = bal;
                return b;
            }
        }
		return null;
	}
	
	public void registerBalance(Balance bal) {
		currencies.add(bal);
	}
	
	public void addPlayer(Player p, Balance bal) {
		bal.put(p.getName(), 0);
	}
	
	public void addPlayer(Player p, Balance bal, int newBal) {
		bal.put(p.getName(), newBal);
	}
	
	public void removePlayer(Balance bal, Player p) {
		bal.getPlayers().remove(p.getName());
		bal.remove(p.getName());
	}
	
	public List<Balance> getCurrencies() {
		return currencies;
	}

}