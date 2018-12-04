package tutofinal;

public class Produit {
	
	private String nomProduit;
	private int prixProduit;
	
	public Produit(String nomProduit, int prixProduit) {
		this.nomProduit = nomProduit;
		this.prixProduit = prixProduit;
	}
	public Produit() {
		nomProduit="Unknown";
		prixProduit=0;
	}
	public String getNomProduit() {
		return nomProduit;
	}
	public void setNomProduit(String nomProduit) {
		this.nomProduit = nomProduit;
	}
	public int getPrixProduit() {
		return prixProduit;
	}
	public void setPrixProduit(int prix) {
		prixProduit=prix;
	}
	
	public String preparer() {
		return nomProduit+", preparé";
		
	}
	@Override
	public boolean equals(Object o) {
		if (o instanceof Produit) {
			return ((Produit)o).getNomProduit()==nomProduit;
			
		}else return false;
	}

}
