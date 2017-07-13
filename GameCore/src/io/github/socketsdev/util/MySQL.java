package io.github.socketsdev.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.bukkit.craftbukkit.libs.jline.internal.Log;

public class MySQL {
	
	Connection c = null;
	String h = null;
	String po = null;
	String db = null;
	String u = null;
	String p = null;
	
	public MySQL(String hostName, String port, String dataBase, String user, String password) {
		this.h = hostName;
		this.po = port;
		this.db = dataBase;
		this.u = user;
		this.p = password;
	}
	
	public void openConnection() throws SQLException, ClassNotFoundException {
	    if (c != null && !c.isClosed()) {
	        return;
	    }
	 
	    synchronized (this) {
	        if (c != null && !c.isClosed()) {
	            return;
	        }
	        Class.forName("com.mysql.jdbc.Driver");
	        c = DriverManager.getConnection("jdbc:mysql://" + this.h + ":" + this.po + "/" + this.db, this.u, this.p);
	    }
	}
	
	public Connection getConnection() {
		return this.c;
	}
	
	
	public void closeConnection() {
		try {
			this.c.close();
		}catch(SQLException e) {
			Log.error(e);
		}
		this.c = null;
	}

}
