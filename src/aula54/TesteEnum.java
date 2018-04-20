package aula54;

public class TesteEnum {

	public static void main(String[] args) {
		DiaSemana dia = DiaSemana.SABADO;
		
		System.out.println(dia.toString() + " - " + dia.getValor());
		
		Data data = new Data(1, 2, 2018, DiaSemana.QUARTA);
		
	}

}
