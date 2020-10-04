package windstar;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;


class TestCases {
	
	@Mock
	IFileSystem fileSystem;
	
	@Test
	void willPrintWelcomeMessage() {
		fileSystem = mock(IFileSystem.class);
		var game = new Game(fileSystem);
		assertTrue(game.GetWelcomeMessage() == "Welcome!");
	}
	
	@Test
	void canViewARoomDescription() {
		fileSystem = mock(IFileSystem.class);
		var game = new Game(fileSystem);
		assertTrue(game.GetRoom() != "");
	}
	
	@Test
	void gameWillCallFileSystemForCurrentRoom() {
		fileSystem = mock(IFileSystem.class);
		var game = new Game(fileSystem);
		game.GetRoom();
		verify(fileSystem, times(1)).getNextRoom();
	}

}
