package tests.java;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.java.Game;

class TestCases {

	@Test
	void testsWillRun() {
		assertTrue(true);
	}
	
	@Test
	void willPrintWelcomeMessage() {
		var game = new Game();
		assertTrue(game.GetWelcomeMessage() == "Welcome!");
	}

}
