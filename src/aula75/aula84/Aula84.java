package aula75.aula84;

import java.util.StringTokenizer;

public class Aula84 {

	public static void main(String[] args) {
		String dado = ";55;nome;2018-01-01;7;6603303;";
		
		StringTokenizer st = new StringTokenizer(dado, ";");
		System.out.println(st.countTokens());
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}

}
