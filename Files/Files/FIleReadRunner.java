package files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FIleReadRunner {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Path pathFileToRead = Paths.get("./resources/data.txt");
		
		//List<String> lines = Files.readAllLines(pathFileToRead);
		
		//System.out.println(lines);
		Files.lines(pathFileToRead).forEach(System.out::println);
	}
	

}
