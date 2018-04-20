package aula53;

public class Teste {

	public static void main(String[] args) {
		usandoConstantes();
		usandoEnum();
	}
	
	private static void usandoConstantes() {
		
		int segunda = DiasSemanaConstantes.SEGUNDA;
		int terca = DiasSemanaConstantes.TERCA;
		int quarta = DiasSemanaConstantes.QUARTA;
		int quinta = DiasSemanaConstantes.QUINTA;
		int sexta = DiasSemanaConstantes.SEXTA;
		int sabado = DiasSemanaConstantes.SABADO;
		int domingo = DiasSemanaConstantes.DOMINGO;
		
		System.out.println("Teste utilizando constantes no Java");
		imprimiDiaSemana(segunda);
		imprimiDiaSemana(terca);
		imprimiDiaSemana(quarta);
		imprimiDiaSemana(quinta);
		imprimiDiaSemana(sexta);
		imprimiDiaSemana(sabado);
		imprimiDiaSemana(domingo);		
		
	}
	
	private static void imprimiDiaSemana(int dia) {
		switch (dia) {
		case 1:
			System.out.println("Segunda-feira");
			break;
		case 2:
			System.out.println("Terça-feira");
			break;
		case 3:
			System.out.println("Quarta-feira");
			break;
		case 4:
			System.out.println("Quinta-feira");
			break;
		case 5:
			System.out.println("Sexta-feira");
			break;
		case 6:
			System.out.println("Sábado");
			break;
		case 7:
			System.out.println("Domingo");
			break;		
		}
	}
	
	private static void usandoEnum() {
		DiaSemana segunda = DiaSemana.SEGUNDA;
		DiaSemana terca = DiaSemana.TERCA;
		DiaSemana quarta = DiaSemana.QUARTA;
		DiaSemana quinta = DiaSemana.QUINTA;
		DiaSemana sexta = DiaSemana.SEXTA;
		DiaSemana sabado = DiaSemana.SABADO;
		DiaSemana domingo = DiaSemana.DOMINGO;
		
		System.out.println("Teste utilizando constantes no Java");
		imprimiDiaSemana(segunda);
		imprimiDiaSemana(terca);
		imprimiDiaSemana(quarta);
		imprimiDiaSemana(quinta);
		imprimiDiaSemana(sexta);
		imprimiDiaSemana(sabado);
		imprimiDiaSemana(domingo);
		
	}
	
	private static void imprimiDiaSemana(DiaSemana dia) {
		switch (dia) {
		case SEGUNDA:
			System.out.println("Segunda-feira");
			break;
		case TERCA:
			System.out.println("Terça-feira");
			break;
		case QUARTA:
			System.out.println("Quarta-feira");
			break;
		case QUINTA:
			System.out.println("Quinta-feira");
			break;
		case SEXTA:
			System.out.println("Sexta-feira");
			break;
		case SABADO:
			System.out.println("Sábado");
			break;
		case DOMINGO:
			System.out.println("Domingo");
			break;		
		}
	}

}
