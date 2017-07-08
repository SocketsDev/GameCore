package io.github.socketsdev;

import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

import io.github.socketsdev.managers.Game;

public class GameCore extends JavaPlugin {

	private static Plugin gamecore;
	
	Game game;
	
	public void onEnable() {
		gamecore = this;
		
		System.out.println("Minigame dependency enabled.");
	}
	
	public void onDisable() {
		System.out.println("Minigame dependency disabled.");
	}
	
    public static void registerEvents(org.bukkit.plugin.Plugin plugin, Listener... listener) {
        for (Listener l : listener) {
            Bukkit.getServer().getPluginManager().registerEvents(l, plugin);
        }
    }
    
    public static Plugin getCore() {
        return gamecore;
    }
    
    public void createGame(String name) {
    	game = new Game(name);
    }
    
    public Game getGame() {
		return game;
	}
	
}
