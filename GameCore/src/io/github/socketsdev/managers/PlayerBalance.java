package io.github.socketsdev.managers;

import org.bukkit.entity.Player;

public class PlayerBalance {
	
	int bal = 0;
	Player p = null;
	
	public PlayerBalance(Player p) {
		this.p = p;
	}
	
	public PlayerBalance(Player p, int bal) {
		this.bal = bal;
		this.p = p;
	}
	
	public void setBalance(int newBalance) {
		this.bal = newBalance;
	}
	
	public void addBalance(int ammount) {
		this.bal = this.bal + ammount;
	}
	
	public void resetBalance() {
		this.bal = 0;
	}
	
	public void removeBalance(int ammount) {
		this.bal = this.bal - ammount;
	}
	
	public int getBalance() {
		return this.bal;
	}

}
