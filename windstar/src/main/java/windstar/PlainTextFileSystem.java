package windstar;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class PlainTextFileSystem implements IFileSystem {

	FileReader _fileReader;
	BufferedReader _bufferedReader;
	StringBuilder _stringbuilder;
	String _line;
	
	@Override
	public String getNextRoom() {
		try {
			printDirectory();
			
			buildFileVariables();
			
			readAllOfFile();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return _stringbuilder.toString();
	}

	private void readAllOfFile() throws IOException {
		while (_line != null) {
			_stringbuilder.append(_line);
			_line = _bufferedReader.readLine();
		}
	}

	private void buildFileVariables() throws FileNotFoundException, IOException {
		_fileReader = new FileReader("/Users/matthewfisher/Documents/Source/windstar/windstar/content/rooms/Room0.txt");
		_bufferedReader = new BufferedReader(_fileReader);
		_stringbuilder = new StringBuilder();
		_line = _bufferedReader.readLine();
	}
	
	private void printDirectory () {
		File dir = new File("content//rooms");
		File[] filesList = dir.listFiles();
		for (File file : filesList) {
		        System.out.println(file.getAbsolutePath());
		}
	}
}

