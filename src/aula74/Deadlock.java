package aula74;

import aula73.MinhaThread;

public class Deadlock {

	public static void main(String[] args) {
		final String RSRC_A = "RECURSOA";
		final String RSRC_B = "RECURSOB";

		Thread tA = new Thread() {
			public void run() {
				synchronized (RSRC_A) {
					System.out.println("Acessando o " + RSRC_A);
					try {
						Thread.sleep(200);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println("Inicio de tentativa de uso do outro recurso");

					synchronized (RSRC_B) {
						System.out.println("Acessando o " + RSRC_B);
					}
				}
			}
		};

		Thread tB = new Thread() {
			public void run() {
				synchronized (RSRC_B) {
					System.out.println("Acessando o " + RSRC_B);
					try {
						Thread.sleep(200);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println("Inicio de tentativa de uso do outro recurso");

					synchronized (RSRC_A) {
						System.out.println("Acessando o " + RSRC_A);
					}
				}
			}
		};

		tA.start();
		tB.start();
	}
}
