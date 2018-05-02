package aula72;

public class TicTac {

	boolean tique;

	synchronized void tic(boolean estaExecutando) {
		if (!estaExecutando) {
			tique = true;
			notify();
			return;
		}

		System.out.print("tic ");
		tique = true;
		notify();
		try {
			while (tique) {
				wait();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	synchronized void tac(boolean estaExecutando) {
		if (!estaExecutando) {
			tique = false;
			notify();
			return;
		}

		System.out.println("tac ");
		tique = false;
		notify();
		try {
			while (!tique) {
				wait();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}
