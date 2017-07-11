package io.github.socketsdev.managers;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.entity.Player;
import org.bukkit.event.Listener;

import io.github.socketsdev.GameCore;

public class KitManager implements Listener {
	
	GameCore gamecore;
	 
	public KitManager(GameCore instance) {
	    gamecore = instance;
	}
	
	List<Kit> kits = new ArrayList<Kit>();
	
	public Kit getKit(Player p) {
		Kit k = null;
        for(Kit kit : kits){
            if(kit.getPlayers().contains(p.getName())){
                k = kit;
                return k;
            }
        }
		return null;
	}
	
	public boolean hasKit(Player p) {
        for(Kit kit : kits){
            if(kit.getPlayers().contains(p.getName())){
                return true;
            }
        }
		return false;
	}
	
	public void addPlayer(Player p, Kit k) {
		k.addPlayer(p);
	}
	
	public void removePlayer(Player p) {
		Kit t = getKit(p);
		t.removePlayer(p);
	}
	
	public void removeKit(Kit k) {
		k.removeKit();
	}
	
	public void removeKit(Player p) {
		Kit k = getKit(p);
		k.removeKit();
	}

}