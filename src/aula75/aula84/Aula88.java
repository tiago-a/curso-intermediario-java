package aula75.aula84;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Aula88 {

	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss Z");
		Calendar date = Calendar.getInstance();
		System.out.println(sdf.format(date.getTime()));
	}

}
