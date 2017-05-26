package Threads.Runnables.Executables;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class Executable {
	private static Executor test = Executors.newCachedThreadPool();
	private static Executor test2 = Executors.newFixedThreadPool(100);
	
	public static void main(String[] args){
		
		SimpleRunnable runnable = new SimpleRunnable();
		test.execute(runnable);
		test2.execute(runnable);
		
	}
}
