package aula54;

public enum QuickTeste {
	PRIMEIRO_VALOR(1), SEGUNDO_VALOR(2), TERCEIRO_VALOR_COMO_STRING("terceiro");
	
	private int valor;
	private String valorS;
	
	QuickTeste(int valor) {
		this.valor = valor;
	}

	QuickTeste(String valorS) {
		this.valorS = valorS;
	}

	public int getValor() {
		return valor;
	}

	public String getValorS() {
		return valorS;
	}
	
	
	
	
}
