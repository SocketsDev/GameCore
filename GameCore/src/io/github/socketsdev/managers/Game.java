package io.github.socketsdev.managers;

import java.util.ArrayList;
import java.util.List;

import io.github.socketsdev.util.GameState.State;

public class Game {
	
	State s = null;
	String n = null;
    List<String> p = new ArrayList<String>();
    
    public Game(String name, State state) {
    	this.n = name;
    	this.s = state;
    }

    public List<String> getPlayers() {
        return this.p;
    }
    
    //Getters / setters
    public String getName() {
    	return this.n;
    }
    
    public State getState() {
    	return this.s;
    }
    
    public void setState(State s) {
    	this.s = s;
    }
    
}