package aula74.labs;

public class SinalVerde {
	private String nome;
	private int tempo;
	private boolean executando;
	public SinalVerde() {
		super();
		this.nome = "verde";
		this.tempo = 5000;
		this.executando = true;
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
