package Collections;
import java.util.*;
public class LinkedListExample {
	public static void main(String[] args){

		String[] fruits = {"apples", "bananas", "grapes", "pears", "peaches"};
		List<String> list1 = new LinkedList<String>();
		for(String x : fruits){
			list1.add(x);
		}

		String[] vegetables = {"Sparagus", "Brocoli", "Carrots", "Celery", "Onion"};
		List<String> list2 = new LinkedList<String>();
		for(String y : vegetables){
			list2.add(y);
		}

		list1.addAll(list2);
		list2 = null;

		printMe(list1);
		
		removeMe(list1, 2 , 5);
	
		printMe(list1);
		
		reverseMe(list1);
	}

	private static void printMe(List<String> list) {
		for(String b : list){
			System.out.printf("%s ", b);
		}
		System.out.println();

	}

	private static void removeMe(List<String> list, int from, int to) {
		list.subList(from, to).clear();

	}

	private static void reverseMe(List<String> list) {
		ListIterator<String> it = list.listIterator(list.size());
		while(it.hasPrevious()){
			System.out.printf("%s ", it.previous());
		}
	}



}

