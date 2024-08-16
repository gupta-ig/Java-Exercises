package ArrayQuestions;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;

public class Student {
	private String name;
	private ArrayList<Integer> listOfMarks = new ArrayList<Integer>();
	
	
	Student(String name, int... listOfMarks) {
		this.name = name;
		
		for(int mark: listOfMarks) {
			this.listOfMarks.add(mark);
		}
	}
	
	int getNumberOfMarks() {
		return listOfMarks.size();
	}
	public int getTotalSumOfMarks() {
		int sum = 0;
		for(int mark: listOfMarks) {
			sum += mark;
		}
		return sum;
	}

	public int getMaximumMark() {
		// TODO Auto-generated method stub
//		int large = Integer.MIN_VALUE;
//		for(int mark: listOfMarks) {
//			if(large < mark) {
//				large = mark;
//			}
//		}
//		return large;
		return Collections.max(listOfMarks);
	}
	public int getMinMark() {
		// TODO Auto-generated method stub
//		int small = Integer.MAX_VALUE;
//		for(int mark: listOfMarks) {
//			if(small > mark) {
//				small = mark;
//			}
//		}
//		return small;
		return Collections.min(listOfMarks);
	}
	public BigDecimal getAverageMarks() {
		int sum = getTotalSumOfMarks();
		int number = getNumberOfMarks();
		
		return new BigDecimal(sum).divide(new BigDecimal(number), 3, RoundingMode.UP);
	}

	public void addNewMark(int mark) {
		// TODO Auto-generated method stub
		listOfMarks.add(mark);
		
	}

	public void removeMarkAtIndex(int mark) {
		// TODO Auto-generated method stub
		listOfMarks.remove(mark);
	}
	public String toString() {
		return name + listOfMarks;
	}
}
