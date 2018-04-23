package aula64;

public class Anonima {
	
	public void fazNormalmente() {
		System.out.println("Texto de execução normal.");
	}

	public static void main(String[] args) {
		Anonima anonima = new Anonima();
		anonima.fazNormalmente();
		
		Anonima anonima2 = new Anonima() {
			@Override
			public void fazNormalmente() {
				System.out.println("Mudei seu comportamento");
				ousei();
			}
			public void ousei() {
				System.out.println("Consigo chegar aqui?");
			}
		};
		anonima2.fazNormalmente();
	}

}
