package aula75.aula84;

import java.util.Calendar;

public class Aula87 {

	public static void main(String[] args) {
		Calendar hoje = Calendar.getInstance(); //singleton
		
		int ano = hoje.get(Calendar.YEAR);
		int mes = hoje.get(Calendar.MONTH);
		int dia = hoje.get(Calendar.DAY_OF_MONTH);
		
		int hora = hoje.get(Calendar.HOUR_OF_DAY);
		int minuto = hoje.get(Calendar.MINUTE);
		int segundo = hoje.get(Calendar.SECOND);
		
		System.out.printf("Hoje é: %02d/%02d/%d %02d:%02d:%02d", dia, (mes+1), ano, hora, minuto, segundo);
		
		System.out.println("\n");
		System.out.println(ano);
		System.out.println(mes+1);
		System.out.println(dia);
		System.out.println(hora);
		System.out.println(minuto);
		System.out.println(segundo);
		
		System.out.println();
		System.out.println(hoje);
	}

}
