package aula74.labs;

public class Semaforo implements Runnable {
	private String cor;
	private boolean trocaCor;

	public Semaforo() {
		super();
		this.cor = "verde";
		this.trocaCor = false;
		new Thread(this).start();
	}

	@Override
	public void run() {
		try {
			while (!trocaCor) {
				printCorSemaforo();
				if (this.cor.equalsIgnoreCase("verde")) {
					Thread.sleep(300);
					trocaCor();
				} else if (this.cor.equalsIgnoreCase("amarelo")) {
					Thread.sleep(100);
					trocaCor();
				} else if (this.cor.equalsIgnoreCase("vermelho")) {
					Thread.sleep(500);
					trocaCor();
					System.out.println();
				} else {
					trocaCor();
				}
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void printCorSemaforo() {
		System.out.println(this.cor);
	}

	private void trocaCor() {
		if (this.cor.equalsIgnoreCase("verde")) {
			this.cor = "amarelo";
		} else if (this.cor.equalsIgnoreCase("amarelo")) {
			this.cor = "vermelho";
		} else if (this.cor.equalsIgnoreCase("vermelho")) {
			this.cor = "verde";
		}
	}
}
