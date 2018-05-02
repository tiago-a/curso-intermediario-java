package aula69;

public class Teste3 {

	public static void main(String[] args) {
		MinhaThreadRunnable r1 = new MinhaThreadRunnable("#1", 500);
		MinhaThreadRunnable r2 = new MinhaThreadRunnable("#2", 100);
		MinhaThreadRunnable r3 = new MinhaThreadRunnable("#3", 800);

		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		Thread t3 = new Thread(r3);

		t1.start();

		// try {
		// t1.join(200);
		// } catch (InterruptedException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }

		t2.start();

		// try {
		// t2.join();
		// } catch (InterruptedException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }
		t3.start();

		// try {
		// t3.join();
		// } catch (InterruptedException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }

		try {
			t1.join();
			t2.join();
			t3.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("Programa finalizado.");
	}

}
