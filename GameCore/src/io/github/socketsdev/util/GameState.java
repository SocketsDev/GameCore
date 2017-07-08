package io.github.socketsdev.util;

public class GameState {
	
	State state;
	
	public GameState(State state) {
		this.state = state;
	}
	
	public enum State {
		LOBBY, STARTING, WARMUP, STARTED, ENDING;
	}
	
	public State setState(State state) {
		return this.state = state;
	}
	
	public State getState(State state) {
		return this.state;
	}

}
