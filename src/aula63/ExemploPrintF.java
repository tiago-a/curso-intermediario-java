package aula63;

public class ExemploPrintF {
	public static void main(String[] args) {
		System.out.printf("Hello %s", "Mundo!!!");
		System.out.println();
		System.out.printf("Hello %S", "Mundo!!!");
		System.out.println();
		System.out.printf("%s", "Olá Mundo!!!");
		System.out.println();
		System.out.printf("%c", 'y');
		System.out.println();
		System.out.printf("%C", 'y');
		System.out.println();
		
		int valor = 123423;
		System.out.printf("%d", valor);
		System.out.println();
		
		double valord = 1234.23;
		System.out.printf("%f", valord);
		System.out.println();
		
		String str = "Holá Mundo!!";
		System.out.printf("%20s", str);
		System.out.println();
		System.out.printf("%-20s", str);
		System.out.println();
		
		int valorNeg = -5946;
		System.out.printf("%+d", valor);
		System.out.println();
		System.out.printf("%+d", valorNeg);
		System.out.println();
		System.out.printf("%015d", valor);
		System.out.println();
		System.out.printf("%,d", valor);
		System.out.println();
		
		System.out.printf("% d", valor);
		System.out.println();
		System.out.printf("% d", valorNeg);
		System.out.println();
		
		double valorzin = 54.94851197;
		System.out.printf("%.3f", valorzin);
		System.out.println();
		
		System.out.printf("R$%10.2f", valorzin);
		System.out.println();
		testeMaisCompleto();
	}
	private static void testeMaisCompleto() {
		double[] precos = {10000, 123.54, 89.11, 25, 3.5};
		
		for (int i=0; i<precos.length; i++) {
			System.out.printf("R$%20.2f", precos[i]);
			System.out.println();
		}
		
		for (int i=0; i<precos.length; i++) {
			System.out.printf("%s %02d R$%,20.2f", "Item", i+1, precos[i]);
			System.out.println();
		}
	}
}