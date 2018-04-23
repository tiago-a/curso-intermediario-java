package aula65;

@interface InformacaoAula {
	String autor();
	
	int aulaNumero();
	
	String site() default "http://www.internet.com";
}
