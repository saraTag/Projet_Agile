package tutofinal;

public class Boisson extends Produit {
	private String taille;
	public Boisson() {
		super();
		taille="small";
	}
	
	public Boisson ( String nomBoisson, int PrixBoisson, String taille) {
		super(nomBoisson,PrixBoisson);
		this.taille=taille;
	}
	
	public String getTaille() {
		return taille;
	}
	public void setTaille(String taille) {
		this.taille=taille;
	}
	@Override
	public String preparer() {
		return taille+" "+super.getNomProduit()+", preparé";
	}
}
