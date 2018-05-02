package aula74.labs;

public class SinalAmarelo {
	private String nome;
	private int tempo;
	private boolean executando;
	public SinalAmarelo() {
		super();
		this.nome = "amarelo";
		this.tempo = 2000;
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

