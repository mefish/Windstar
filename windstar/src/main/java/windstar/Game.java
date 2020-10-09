package windstar;

public class Game {
	private String _welcomeMessage = "Welcome!";
	private IFileSystem _fileSystem;
	
	public Game() {
		_fileSystem = new PlainTextFileSystem();
	}
	
	public Game(IFileSystem fileSystem) {
		_fileSystem = fileSystem;
	}

	public String GetWelcomeMessage() { return _welcomeMessage; }
	
	public String GetRoom() {
		return _fileSystem.getNextRoom();
	}
}
