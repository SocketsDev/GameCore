package io.github.socketsdev.managers;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.entity.Player;

import io.github.socketsdev.GameCore;
import io.github.socketsdev.util.ActionBar;
import io.github.socketsdev.util.GameState.State;
import net.md_5.bungee.api.ChatColor;

public class Countdown {
	
	GameCore plugin = null;
	private int[] i = null;
	int t = 0;
	int task;
	String msg = null;
	boolean ab = false;
	ActionBar ac = new ActionBar();
	boolean end = false;
	State es = null;
	boolean esb = false;
	Location l = null;
	boolean lb = false;
	
	public Countdown(int[] i, int t, GameCore p) {
		this.t = t;
		this.i = i;
		this.plugin = p;
	}
	
	public void startCountdown(final String msg, final String end) {
		
		task = Bukkit.getServer().getScheduler().scheduleSyncRepeatingTask(this.plugin, new Runnable() {
			  public void run() {
				  int ti = t;
				  
				  String message = msg.replaceAll("%countdown%", String.valueOf(t));
				  
				  for (int t : i) {
					  if(t == ti) {
						  Bukkit.broadcastMessage(ChatColor.translateAlternateColorCodes('&', message));
					  }
					  if(ab == true) { for (Player p : Bukkit.getOnlinePlayers()) { ac.sendBar(p, message); } }
				  }
				  
				  if(t == 0) {
					  Bukkit.broadcastMessage(ChatColor.translateAlternateColorCodes('&', end));
					  for (Player p : Bukkit.getOnlinePlayers()) { ac.sendBar(p, end); }
					  
					  //TODO: End
					  if(esb == true) { plugin.getGame().setState(es); }
					  if(lb == true) { for (Player p : Bukkit.getOnlinePlayers()) { 
						  Team t = plugin.getTeamManager().getTeam(p); 
						  Location l = t.getHome();
						  p.teleport(l);
						  } }
					  
					  stopCountdown();
				  }
				  
				  t--;
			  }
		}, 0L, 20L);
	}
	
	public void stopCountdown() {
		this.end = true;
		Bukkit.getServer().getScheduler().cancelTask(task);
	}
	
	public int getTime() {
		return this.t;
	}
	
	public String getTimeFormatted() {
		int mins = this.t / 60;
		int secs = this.t % 60;
		String minutes = (mins < 10 ? "0" : "") + mins;
		String seconds = (secs < 10 ? "0" : "") + secs;
		String timeFormatted = minutes + ":" + seconds;
		
		return timeFormatted;
	}
	
	public void setTime(int t) {
		this.t = t;
	}
	
	public void setActionBar(boolean ab) {
		this.ab = ab;
	}
	
	public boolean isOver() {
		if(this.end == true) { return true; } else { return false; }
	}
	
	public void setEndState(boolean esb, State es) {
		this.es = es;
		this.esb = esb;
	}
	
	public void setTeamHomeTeleport(boolean lb, Location l) {
		this.l = l;
		this.lb = lb;
	}
	
	public void applyKits(boolean ak) {
		
	}
	
}
