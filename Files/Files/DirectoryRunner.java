package files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class DirectoryRunner {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Path currentDirectory = Paths.get(".");
		
		//Files.list(Paths.get(".")).forEach(System.out::println);
		
		Predicate<? super Path> predicate = path -> String.valueOf(path).contains(".java");
		
		Files.walk(currentDirectory, 4)
		.filter(predicate)
		.forEach(System.out::println);
		
		BiPredicate<Path, BasicFileAttributes> javaMatcher = (path, attributes) -> String.valueOf(path).contains(".java");
		
		BiPredicate<Path, BasicFileAttributes> directoryMatcher = (path, attributes) -> attributes.isDirectory();
		
		Files.find(currentDirectory, 4, directoryMatcher).forEach(System.out::println);
		
	}

}
