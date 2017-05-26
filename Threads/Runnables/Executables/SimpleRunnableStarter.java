package Threads.Runnables.Executables;

public class SimpleRunnableStarter {
	public static void main(String[] args){
		for (int threadCnt = 0; threadCnt <= 3; threadCnt++) {
			SimpleRunnable aSimpleRunnable = new SimpleRunnable();
			Thread aSimpleThread = new Thread(aSimpleRunnable);
			aSimpleThread.start();
		}
	}
}
