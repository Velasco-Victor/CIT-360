package Threads.Runnables.Executables;

public class Threads {
	public static void main(String[] args){

		//Create the Threads
		Thread t1 = new Thread(new Tuna("one"));
		Thread t2 = new Thread(new Tuna("two"));
		Thread t3 = new Thread(new Tuna("three"));
		Thread t4 = new Thread(new Tuna("four"));

		//start the Threads
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}
}
