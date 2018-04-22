package aula64;

import aula64.ClasseExterna.ClasseInterna;

public class Teste {

	public static void main(String[] args) {
		ClasseExterna a = new ClasseExterna();
		ClasseInterna b = a.new ClasseInterna();
		b.imprimeTexto();
	}

}
