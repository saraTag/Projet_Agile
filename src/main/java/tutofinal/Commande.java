package tutofinal;

import java.util.ArrayList;
import java.util.List;

public class Commande implements CommandeInterface {
	
	private int prix;
	private String etat_commande ;
	private List <Produit> produits;
	private List <ObservateurInterface> adjclient = new ArrayList<ObservateurInterface>();
	private Restaurant r;
	
	public Commande() {
		prix=0;
		etat_commande="new";
		produits=new ArrayList<Produit>();
		r=new Restaurant();
	}
	public Commande(int prix_unitaire,Restaurant r) {
		this.r=r;
		prix=prix_unitaire;
		produits=new ArrayList<Produit>();
	
	}
	public int getPrix_unitaire() {
		return prix;
	}
	public void setPrix(int prix) {
		this.prix = prix;
	}
	
    public String getEtat_commande() {
		return etat_commande;
	}
	public void setEtat_commande(String etat_commande) {
		this.etat_commande = etat_commande;
		notifyObserver();
	}
	public void add (Produit c) {
		this.produits.add(c);
	}
	
	public void addObserver(ObservateurInterface a) {
		
		adjclient.add(a);
		
	}
	public void removeObser(ObservateurInterface a) {
		
		adjclient.remove(a);
	}
	public void notifyObserver() {
		
		for (ObservateurInterface adj : adjclient)
			adj.update(this);
		
	}
	
}
