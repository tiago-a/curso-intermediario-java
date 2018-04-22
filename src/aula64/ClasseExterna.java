package aula64;

public class ClasseExterna {
	
	private String texto = "texto externo";
	
	public class ClasseInterna {
//		descomentar para esse texto ser impresso em vez do externo
		private String texto = "texto interno";
		
		public void imprimeTexto() {
			System.out.println(texto);
			System.out.println(ClasseExterna.this.texto);
			
		}
	}
}
