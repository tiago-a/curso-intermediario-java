package aula57;

public class TesteWrappers {

	public static void main(String[] args) {
		
		short num1 = 1;
		byte num2 = 10;
		int num3 = 100;
		long num4 = 10000l;
		float num5 = 3.5f;
		double num6 = 3.55555;
		boolean flag = false;
		char a = 'a';
		
//		Short num7 = new Short(num1);
		Short num7 = new Short((short) 1);
		Byte num8 = new Byte(num2);
		Integer num9 = new Integer(num3);
		Long num10 = new Long(num4);
		Float num11 = new Float(3.5f);
		Double num12 = new Double(num6);
		Boolean flag2 = new Boolean(true);
		Character b = new Character('b');
		
		Integer num13 = new Integer("129");
		
		System.out.println(num13.shortValue());
		
		Integer num14 = Integer.valueOf(35);
		System.out.println(num14);
	}

}
