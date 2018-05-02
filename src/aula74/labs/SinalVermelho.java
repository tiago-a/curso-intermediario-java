package aula74.labs;

public class SinalVermelho {
	private String nome;
	private int tempo;
	private boolean executando;
	public SinalVermelho() {
		super();
		this.nome = "vermelho";
		this.tempo = 7000;
		this.executando = false;
	}
	public boolean isExecutando() {
		return executando;
	}
	public void setExecutando(boolean executando) {
		this.executando = executando;
	}
	public String getNome() {
		return nome;
	}
	public int getTempo() {
		return tempo;
	}
}

