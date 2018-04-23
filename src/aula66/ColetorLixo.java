package aula66;

public class ColetorLixo {
	
	public static void obterMemoriaUsada() {
		
		final int KB = 1024;
		
		Runtime rt = Runtime.getRuntime();
		
		System.out.println((rt.totalMemory() - rt.freeMemory())/KB);		
		
	}

	public static void main(String[] args) {
		
		Contato[] contatos = new Contato[10000000];
		Contato contato;
		for (int i=0; i<contatos.length; i++) {
			contato = new Contato("Contato"+i, "2134"+i, "contato"+i+"@email.com");
			contatos[i] = contato;
		}
		System.out.println("Contatos criados.");
		
		obterMemoriaUsada();
		
		contatos = null;

		Runtime.getRuntime().runFinalization();
		
		Runtime.getRuntime().gc();
		
		System.out.println("Contatos removidos da memoria.");
		
		obterMemoriaUsada();
	}

}
