package aula64;

public class Teste2 {

	public static void main(String[] args) {
		Texto texto = new Texto() {
			
			@Override
			public void imprimeTexto() {
				// TODO Auto-generated method stub
				System.out.println("Classe anonima implementou a interface e j� est� declarada");
			}
		};
		
		texto.imprimeTexto();
	}

}
