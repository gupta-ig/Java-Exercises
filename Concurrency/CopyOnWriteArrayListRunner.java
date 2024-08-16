package concurrency;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new CopyOnWriteArrayList<>();
		
		list.add("Ant");
		list.add("Bat");
		list.add("Cat");
		
		for(String element : list) {
			System.out.println(element);
		}
	}

}
