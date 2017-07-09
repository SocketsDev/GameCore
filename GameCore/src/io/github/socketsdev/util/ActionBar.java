package io.github.socketsdev.util;

import org.bukkit.craftbukkit.v1_8_R3.entity.CraftPlayer;
import org.bukkit.entity.Player;

import net.minecraft.server.v1_8_R3.IChatBaseComponent;
import net.minecraft.server.v1_8_R3.IChatBaseComponent.ChatSerializer;
import net.minecraft.server.v1_8_R3.PacketPlayOutChat;


public class ActionBar {
	
	public void sendBar(Player p, String msg) {
		String m = msg.replace('&', '§');
		IChatBaseComponent chat = ChatSerializer.a("{\"text\": \"" + m + "\"}");
        PacketPlayOutChat ppoc = new PacketPlayOutChat(chat, (byte) 2);
        ((CraftPlayer) p).getHandle().playerConnection.sendPacket(ppoc);
	}

}
