package aula55;

import aula54.DiaSemana;
import aula54.QuickTeste;

public class TesteEnum2 {

	public static void main(String[] args) {
		
		DiaSemana dia;
		
		System.out.println(Enum.valueOf(DiaSemana.class, "DOMINGO"));
		System.out.println(Enum.valueOf(QuickTeste.class, "TERCEIRO_VALOR_COMO_STRING"));
		
	}

}
