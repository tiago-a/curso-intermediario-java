package aula72;

public class Teste {

	public static void main(String[] args) {
		TicTac tt = new TicTac();
		ThreadTicTac tic = new ThreadTicTac("tic", tt);
		ThreadTicTac tac = new ThreadTicTac("tac", tt);
		
		try {
			tic.t.join();
			tac.t.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
