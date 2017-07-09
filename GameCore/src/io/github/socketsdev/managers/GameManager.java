package io.github.socketsdev.managers;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;

import io.github.socketsdev.GameCore;
import io.github.socketsdev.util.GameState.State;

public class GameManager implements Listener {
	
	GameCore gamecore;
	 
	public GameManager(GameCore instance) {
	    gamecore = instance;
	}
	
	public boolean inLobby(Player p){
        if(gamecore.getGame().getPlayers().contains(p.getName()) && gamecore.getGame().getState().equals(State.LOBBY))
                return true;
        return false;
	}
	
	public State getState() {
		return gamecore.getGame().getState();
	}
	
	public void setState(State s) {
		gamecore.getGame().setState(s);;
	}
	
	public String getGameName() {
		return gamecore.getGame().getName();
	}
	
	public Player getPlayer(String name) {
		if(gamecore.getGame().p.contains(name)) {
			Player p = Bukkit.getPlayer(name);
			return p;
		}
		return null;
	}

}
