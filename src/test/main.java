package test;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Personne p1 = new Personne("mohammed","alg�rien");
	
		
		Personne p2 = new Personne("omar","alg�rien");
		
		
		Personne p3 = new Personne("tom","am�ricain");
		
		
		
		
		Amis a = new Amis();
		a.creerListeAmis();
		a.ajouterAmis(p1);
		a.ajouterAmis(p2);
		a.ajouterAmis(p3);
		a.amisAlgerien();
		a.amisEtranger();
	}

}
