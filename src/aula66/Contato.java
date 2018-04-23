package aula66;

public class Contato {
	private String nome;
	private String telefone;
	private String email;
	
	public Contato(String nome, String telefone, String email) {
		super();
		this.nome = nome;
		this.telefone = telefone;
		this.email = email;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void printInfo() {
		System.out.println("Informações do Contato: " + this.nome);
		System.out.println("Telefone: " + this.telefone);
		System.out.println("E-mail: " + this.email);
		System.out.println();
	}
	
}
