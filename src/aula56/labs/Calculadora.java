package aula56.labs;

public enum Calculadora {
	SOMA('+') {
		@Override
		public double calcula(double num1, double num2) {
			return num1 + num2;
		}
	}, SUBTRACAO('-') {
		@Override
		public double calcula(double num1, double num2) {
			return num1 - num2;
		}
	}, MULTIPLICACAO('*') {
		@Override
		public double calcula(double num1, double num2) {
			return num1 * num2;
		}
	}, DIVISAO('/') {
		@Override
		public double calcula(double num1, double num2) {
			if (num2 == 0) {
				System.out.println("Divisao por 0 num pode!");
				return 0;
			}
			return num1/num2;
		}
	};
	
	private char operacao;
	
	Calculadora(char oper){
		this.operacao = oper;
	}
	public char getOperacao() {
		return operacao;
	}
	public abstract double calcula(double num1, double num2);
	
	public String toString() {
		return String.valueOf(this.operacao);
	}
}
