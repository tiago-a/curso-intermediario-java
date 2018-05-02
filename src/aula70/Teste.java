package aula70;

import aula69.MinhaThreadRunnable;

public class Teste {

	public static void main(String[] args) {
		MinhaThreadRunnable r1 = new MinhaThreadRunnable("#1", 500);
		MinhaThreadRunnable r2 = new MinhaThreadRunnable("#2", 500);
		MinhaThreadRunnable r3 = new MinhaThreadRunnable("#3", 500);
		
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		Thread t3 = new Thread(r3);
		
		t1.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(Thread.NORM_PRIORITY);
		t3.setPriority(Thread.MIN_PRIORITY);
		
		t1.start();
		t2.start();
		t3.start();
	}

}
