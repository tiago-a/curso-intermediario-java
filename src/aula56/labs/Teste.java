package aula56.labs;

public class Teste {

	public static void main(String[] args) {
		
		double num1 = 3.9;
		double num2 = 0.0;
		for (Calculadora c : Calculadora.values()) {
			System.out.println(num1 + c.toString() + num2  + " = " + c.calcula(num1, num2));
		}

	}

}
