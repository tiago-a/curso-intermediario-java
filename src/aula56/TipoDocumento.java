package aula56;

public enum TipoDocumento {
	
	CPF {
		@Override
		public String geraNumeroTeste() {
			// ideal é ter uma classe separa que gera um CPF aleatorio
			return "038.045.112-05";
		}
	}, 
	CNPJ {
		@Override
		public String geraNumeroTeste() {
			// ideal é ter uma classe separa que gera um CNPJ aleatorio
			return "000.128.934/0009-10";
		}
	};
	
	public abstract String geraNumeroTeste();
}
