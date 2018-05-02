package aula69;

public class Teste2 {
	
	public static void main(String[] args) {
		MinhaThreadRunnable r1 = new MinhaThreadRunnable("#1", 500);
		MinhaThreadRunnable r2 = new MinhaThreadRunnable("#2", 500);
		MinhaThreadRunnable r3 = new MinhaThreadRunnable("#3", 500);

		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		Thread t3 = new Thread(r3);

		t1.start();
		t2.start();
		t3.start();

		try {
			while (t1.isAlive() && t2.isAlive() && t3.isAlive()) {
				Thread.sleep(200);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("Programa finalizado.");
	}
}
