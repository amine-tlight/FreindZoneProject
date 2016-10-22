package test;

public class Amis {
	Personne[] amis;
	int nbAmis=-1;
	
	public Amis(Amis a){
		this.amis = a.amis;
		this.nbAmis = a.nbAmis;
	}
	
	public Amis() {
		// TODO Auto-generated constructor stub
	}

	public void creerListeAmis(){
		amis=new Personne[200];
		System.out.println("Liste d'amis creer!");
	}
	
	public void ajouterAmis(Personne p){
		nbAmis++;
		amis[nbAmis] = p;
		
		System.out.println("amis: "+p.nom+" a �t� ajout� dans votre liste");
	}
	
	public void maListeAmis(){
		System.out.println("----Liste d'amis----");
		for (int i = 0; i <=nbAmis; i++) {
			System.out.println("amis "+(i+1)+": "+amis[i].nom + " de '"+amis[i].nationalit�+"'");
		}
	}
	
	public void amisAlgerien(){
		System.out.println("----Liste d'amis alg�rien----");
		for (int i = 0; i <=nbAmis; i++) {
			if(amis[i].nationalit�.equals("alg�rien")){
			System.out.println("amis "+(i+1)+": "+amis[i].nom + " de '"+amis[i].nationalit�+"'");
			}
		}
	}
	
	public void amisEtranger(){
		System.out.println("----Liste d'amis �tranger----");
		for (int i = 0; i <=nbAmis; i++) {
			if(!amis[i].nationalit�.equals("alg�rien")){
			System.out.println("amis "+(i+1)+": "+amis[i].nom + " de '"+amis[i].nationalit�+"'");
			}
		}
	}
	
	public void supprimer(int i){
		if(i==nbAmis){
			amis[i] = null;
		}else{
				for (int j = i; j <= nbAmis; j++) {
					amis[j] = amis[j+1];
				}
		}
		nbAmis--;
	}
	
}
