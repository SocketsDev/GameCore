package io.github.socketsdev.managers;

import org.bukkit.entity.Player;
import org.bukkit.event.Listener;

import io.github.socketsdev.GameCore;
import io.github.socketsdev.util.GameState.State;

public class LobbyManager implements Listener {
	
	GameCore gamecore;
	 
	public LobbyManager(GameCore instance) {
	    gamecore = instance;
	}
	
	public boolean inLobby() {
		if(gamecore.getGame().getState().equals(State.LOBBY))
			return true;
		return false;
	}
	
	public boolean inLobby(Player p){
        if(gamecore.getGame().getPlayers().contains(p.getName()) && gamecore.getGame().getState() == State.LOBBY)
                return true;
        return false;
	}
	
	

}
