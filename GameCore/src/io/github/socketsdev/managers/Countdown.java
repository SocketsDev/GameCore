package io.github.socketsdev.managers;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

import io.github.socketsdev.GameCore;
import io.github.socketsdev.util.ActionBar;

public class Countdown {
	
	private int[] i = null;
	int t = 0;
	int task;
	String msg = null;
	boolean ab = false;
	ActionBar ac = new ActionBar();
	
	public Countdown(int[] i, int t) {
		this.t = t;
		this.i = i;
	}
	
	public void startCountdown(final String msg) {
		
		task = Bukkit.getServer().getScheduler().scheduleSyncRepeatingTask(GameCore.getCore(), new Runnable() {
			  public void run() {
				  int ti = t;
				  
				  String message = msg.replaceAll("%countdown%", String.valueOf(t));
				  
				  for (int t : i) {
					  if(t == ti) {
						  Bukkit.broadcastMessage(message);
						  if(ab == true) { for (Player p : Bukkit.getOnlinePlayers()) { ac.sendBar(p, message); } }
					  }
				  }
				  
				  t--;
			  }
		}, 0L, 20L);
	}
	
	public void stopCountdown() {
		Bukkit.getServer().getScheduler().cancelTask(task);
	}
	
	public int getTime() {
		return this.t;
	}
	
	public void setTime(int t) {
		this.t = t;
	}
	
	public void setActionBar(boolean ab) {
		this.ab = ab;
	}

}
