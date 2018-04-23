package aula64;

public class Externa {
	
	public void metodoQualquer() {
		class ClasseLocal{
			
			private String texto = "Aqui vai o texto";
			
			public void imprimeTexto() {
				System.out.println(texto);
			}
		}
		
		ClasseLocal cl = new ClasseLocal();
		cl.imprimeTexto();
	}

	public static void main(String[] args) {
		Externa e = new Externa();
		e.metodoQualquer();
	}

}
