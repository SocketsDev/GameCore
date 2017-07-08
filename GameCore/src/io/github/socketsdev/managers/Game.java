package io.github.socketsdev.managers;

import java.util.ArrayList;
import java.util.List;

import io.github.socketsdev.util.GameState.State;

public class Game {
	
	State s;
    List<String> p = new ArrayList<String>();

    public List<String> getPlayers(){
        return this.p;
    }
    
    public State getState() {
    	return this.s;
    }
    
    public void setState(State s) {
    	this.s = s;
    }
}