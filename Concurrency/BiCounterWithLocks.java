package concurrency;

import java.util.concurrent.locks.*;
import java.util.concurrent.locks.ReentrantLock;

public class BiCounterWithLocks {
	private int i = 0;
	private int j = 0;
	
	Lock lockForI = new ReentrantLock();
	Lock lockForJ = new ReentrantLock();
	
	synchronized public void incrementI() {
		//Get lock for I
		i++;
		
		//Release Lock for I
	}

	synchronized public void incrementJ() {
		//Get lock for J
		j++;
		//Release Lock 
	}
	
	public int getI() {
		return i;
	}

	public int getJ() {
		return j;
	}
	
}
