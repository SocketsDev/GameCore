package io.github.socketsdev;

import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

import io.github.socketsdev.managers.BalanceManager;
import io.github.socketsdev.managers.Game;
import io.github.socketsdev.managers.GameManager;
import io.github.socketsdev.managers.KitManager;
import io.github.socketsdev.managers.TeamsManager;
import io.github.socketsdev.util.GameState.State;

public class GameCore extends JavaPlugin {

	private static Plugin gamecore;
	
	Game game;
	
	GameManager gm = new GameManager(this);
	TeamsManager tm = new TeamsManager(this);
	KitManager km = new KitManager(this);
	BalanceManager bm = new BalanceManager(this);
	
	public void onEnable() {
		gamecore = this;
		
		System.out.println("GameCore - dependency enabled.");
	}
	
	public void onDisable() {
		System.out.println("GameCore - dependency disabled.");
	}
	
    public static void registerEvents(org.bukkit.plugin.Plugin plugin, Listener... listener) {
        for (Listener l : listener) {
            Bukkit.getServer().getPluginManager().registerEvents(l, plugin);
        }
    }
    
    public static Plugin getCore() {
        return gamecore;
    }
    
    public GameManager getGameManager() {
        return gm;
    }
    
    public TeamsManager getTeamManager() {
        return tm;
    }
    
    public KitManager getKitManager() {
        return km;
    }
    
    public KitManager getBalanceManager() {
        return km;
    }
    
    public void createGame(String name, State state) {
    	game = new Game(name, state);
    }
    
    public Game getGame() {
		return game;
	}
	
}
