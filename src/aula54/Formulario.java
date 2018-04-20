package aula54;

public class Formulario {
	
	enum Genero{
		FEMININO(1), MASCULINO(2);
		
		private int genero;
		
		Genero(int genero){
			this.genero = genero;
		}
		
		public int getGenero(){
			return this.genero;
		}
	}
	
	private String nome;
	private Genero genero;
	
}
