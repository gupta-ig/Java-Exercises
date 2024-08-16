package conditionals;

public class WhileNumberPlayer {
	
	private int limit;
	public WhileNumberPlayer(int limit) {
		// TODO Auto-generated constructor stub
		this.limit = limit;
	}

	public static void main(String[] args) {
		WhileNumberPlayer player = new WhileNumberPlayer(30);
		
		player.printSquaresUptoLimit();
		player.printCubesUptoLimit();
		
	}

	private void printCubesUptoLimit() {
		// TODO Auto-generated method stub
		int i = 1;
		while(i*i*i <= limit) {
			System.out.print(i*i*i + " ");
			i++;
		}
		System.out.println();
		
	}

	private void printSquaresUptoLimit() {
		// TODO Auto-generated method stub
		int i = 1;
		while(i*i <= limit) {
			System.out.print(i*i + " ");
			i++; 
		}
		System.out.println();
	}
}
