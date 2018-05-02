package aula73;

public class Teste {

	public static void main(String[] args) {
		MinhaThread t1 = new MinhaThread("#A");
		MinhaThread t2 = new MinhaThread("#B");
		
		System.out.println("Pausando a thread #A");
		
		t1.suspend();
		
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Pausando a thread #B");
		t2.suspend();
		System.out.println("Resumindo a thread #A");
		t1.resume();
		
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Resumindo a thread #B");
		t2.resume();
		System.out.println("Terminando a thread #B");
		t2.stop();
	}

}
