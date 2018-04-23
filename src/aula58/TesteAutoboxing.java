package aula58;

public class TesteAutoboxing {

	public static void main(String[] args) {
		
		//autoboxing
		Short num7 = 1;
		Byte num8 = 10;
		Integer num9 = 1000;
		Long num10 = 3000l;
		Float num11 = 3.5f;
		Double num12 = 3.55555;
		Boolean flag2 = true;
		Character b = 'b';
		
		int num13 = num9;
		System.out.println(num9);
		System.out.println(num13);
		
		int num14 = new Integer(num13);
		System.out.println(num14);
	}

}
