package aula75.aula84;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Aula89 {

	public static void main(String[] args) {
		String data = "04/05/2018 16:42:21.908753";
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		try {
			Date date = sdf.parse(data);
			System.out.println(sdf.format(date));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
