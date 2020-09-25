/*
 * package tests.java;
 * 
 * import static org.junit.jupiter.api.Assertions.*;
 * 
 * import java.io.BufferedReader; import java.io.FileNotFoundException; import
 * java.io.FileReader; import java.io.IOException;
 * 
 * import org.junit.jupiter.api.Test;
 * 
 * class FileSystemTests {
 * 
 * @Test void CanReadAFile() { var stringBuilder = new StringBuilder(); var
 * strLine = "";
 * 
 * FileReader fileReader;
 * 
 * try { fileReader = new FileReader("../../../Rooms/Room0.txt"); var
 * bufferedReader = new BufferedReader(fileReader); while (strLine != null) {
 * stringBuilder.append(strLine);
 * //stringBuilder.append(System.lineSeparator()); strLine =
 * bufferedReader.readLine(); System.out.println(strLine); }
 * 
 * } catch (FileNotFoundException e) { //TODO Auto-generated catch block
 * e.printStackTrace(); } catch (IOException e) { //TODO Auto-generated catch
 * block e.printStackTrace(); } assert(stringBuilder.toString() != ""); }
 * 
 * }
 */