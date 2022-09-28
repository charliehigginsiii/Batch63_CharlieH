package com.cogent.players;
/**
 * 
 * @author Charlie Higgins
 * @date   Sep 28, 2022
 */
public class PlayerManager {
	public static void main(String[]args) {
		new PlayerManager().getDailyExcercises(new GolfPlayer());
	}
	public void getDailyExcercises(Players players) {
		players.warmUpExercise();
	}

}
