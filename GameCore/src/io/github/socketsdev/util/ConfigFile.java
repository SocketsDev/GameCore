package io.github.socketsdev.util;

import java.io.File;
import java.io.IOException;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

public class ConfigFile {

	String path = null;
	String plugin = null;
	File Data;
	FileConfiguration DataFile;

	public ConfigFile(String plugin, String path) {
		this.path = path;
		this.plugin = plugin;
		Data = new File("plugins/" + plugin + "/" + path + ".yml");
		DataFile = YamlConfiguration.loadConfiguration(Data);
	}

	public void createFile() {
		try {
			Data.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public FileConfiguration getFile() {
		return DataFile;
	}

	public void saveFile() {
		try {
			getFile().save(Data);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}