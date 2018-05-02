package aula68;

public class Teste {

	public static void main(String[] args) {
		MinhaThreadRunnable thread = new MinhaThreadRunnable("thread #1", 500);
		MinhaThreadRunnable thread2 = new MinhaThreadRunnable("thread #2", 600);
		MinhaThreadRunnable thread3 = new MinhaThreadRunnable("thread #3", 800);
	}

}
