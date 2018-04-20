package aula56;

public class TesteDocumento {

	public static void main(String[] args) {
		/*
		for (TipoDocumento tipo : TipoDocumento.values()) {
			System.out.println(tipo + " - " + tipo.geraNumeroTeste());
		}*/
		
		Pessoa pf = new Pessoa();
		pf.setTipoDocumento(TipoDocumento.CPF);
//		p.setTipoDocumento(Enum.valueOf(TipoDocumento, "CPF"));
		pf.setNumeroDocumento(pf.getTipoDocumento().geraNumeroTeste());
		System.out.println(pf.toString());
		
		Pessoa pj = new Pessoa();
		pj.setTipoDocumento(TipoDocumento.CNPJ);
//		p.setTipoDocumento(Enum.valueOf(TipoDocumento, "CPF"));
		pj.setNumeroDocumento(pj.getTipoDocumento().geraNumeroTeste());
		System.out.println(pj.toString());
	}

}
