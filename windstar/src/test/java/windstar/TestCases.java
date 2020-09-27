package windstar;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class TestCases {
	
	@Test
	void willPrintWelcomeMessage() {
		var game = new Game();
		assertTrue(game.GetWelcomeMessage() == "Welcome!");
	}
	
	@Test
	void canViewARoomDescription() {
		var game = new Game();
		assertTrue(game.GetRoom() != "");
	}

}
