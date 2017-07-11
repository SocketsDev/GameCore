package io.github.socketsdev.managers;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;

import io.github.socketsdev.GameCore;

public class TeamsManager implements Listener {
	
	GameCore gamecore;
	 
	public TeamsManager(GameCore instance) {
	    gamecore = instance;
	}
	
	List<Team> teams = new ArrayList<Team>();
	
	public Team getTeam(Player p) {
		Team t = null;
        for(Team team : teams){
            if(team.getPlayers().contains(p.getName())){
                t = team;
                return t;
            }
        }
		return null;
	}
	
	public Team getTeam(ChatColor c) {
		Team t = null;
        for(Team team : teams){
            if(team.getColor().equals(c)){
                t = team;
                return t;
            }
        }
		return null;
	}
	
	public boolean hasTeam(Player p) {
        for(Team team : teams){
            if(team.getPlayers().contains(p.getName())){
                return true;
            }
        }
		return false;
	}
	
	public void addPlayer(Player p, Team t) {
		t.addPlayer(p);
	}
	
	public void removePlayer(Player p) {
		Team t = getTeam(p);
		t.removePlayer(p);
	}
	
	public void removeTeam(ChatColor c) {
		Team t = getTeam(c);
		t.clearTeam();
	}
	
	public void removeTeam(Team t) {
		t.clearTeam();
	}
	
	public void removeTeam(Player p) {
		Team t = getTeam(p);
		t.clearTeam();
	}

}