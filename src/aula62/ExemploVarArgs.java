package aula62;

public class ExemploVarArgs {

	public static void main(String[] args) {
		int[] vetor = {2,3,4,5};
		System.out.println(soma(4, 3));
		System.out.println(soma(4, 3, 4));
		System.out.println(soma(vetor));
		System.out.println(soma(1,2,34,4,2,2,3,4));
	}
	
	static int soma(int a, int b) {
		return a + b;
	}
	
	static int soma(int a, int b, int c) {
		return a + b + c;
	}
	
	static int soma(int[] vetor) {
		int total = 0;
		for (int i=0; i<vetor.length; i++) {
			total += vetor[i];
		}
		return total;
	}
	
	static int soma(Integer... vetor) {
		int total = 0;
		for (int i=0; i<vetor.length; i++) {
			total += vetor[i];
		}
		return total;
	}
}
