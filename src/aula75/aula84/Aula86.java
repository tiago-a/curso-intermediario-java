package aula75.aula84;

import java.util.Date;

public class Aula86 {

	public static void main(String[] args) {
		Date date = new Date();
		System.out.println("Hoje é dia: " + date.getDate());
		System.out.println("Milisegundos desde 1970: " + date.getTime());
		System.out.println("Length dos milisegundos: " + String.valueOf(date.getTime()).length());
	}

}
