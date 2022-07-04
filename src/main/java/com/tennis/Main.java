package com.tennis;

public class Main {
	
	public static void main(String[] args) {
		
		Player nadal = new Player("Nadal");
		Player federer = new Player("Federer");
		DisplayInformationImpl display = new DisplayInformationImpl();
		
		Match match = new Match(nadal, federer);
		match.play(display);

	}

}
