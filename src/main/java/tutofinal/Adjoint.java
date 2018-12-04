package tutofinal;



/**
 * DÃ©crivez votre classe Manager ici.
 *
 * @author (votre nom)
 * @version (un numÃ©ro de version ou une date)
 */
public class Adjoint implements ObservateurInterface {
    // variables d'instance - remplacez l'exemple qui suit par le vÃ´tre
    private String nom;
    private String ville;
    private Restaurant restaurant;
    private String State = "";
    
    
    public Adjoint() {
    	nom = "John";
    	ville = "Toulouse";
    	restaurant= null;
    }
    /**
     * Constructeur d'objets de classe Manager
     */
    
    public Adjoint(Restaurant r, String nom)
    {
        // initialisation des variables d'instance
        this.nom = nom;
        this.restaurant = r;
        ville=r.getVille();
        
    }

    /**
     * Un exemple de mÃ©thode - remplacez ce commentaire par le vÃ´tre
     *
     * @param  y   le paramÃ¨tre de la mÃ©thode
     * @return     la somme de x et de y
     */
    
    public String getNom() {
    	return this.nom;
    }
    
    public String getVille() {
    	return this.ville;
    }
    
    public Restaurant getRestaurant() {
    	return restaurant;
    }
    
    public void setVille() {
    	ville = restaurant.getVille();
    }
    
    public void setNom(String nomManager) {
    	this.nom=nomManager;
    }
    
    
    public void setRestaurant(Restaurant rest ) {
	   restaurant = rest ;
	   ville=restaurant.getVille();
   }
    
    public void removeRestaurant() {
	   restaurant = null;
	   ville = "";
   }
    
   @Override
   public boolean equals (Object o) {
	   if (o instanceof Adjoint) {
		   return ((Adjoint) o).getNom()== nom &&((Adjoint) o).getVille()== ville;
	   }
	   return false;
   }
   
   public boolean update (CommandeInterface commande) {
	   if(((Commande)commande).getEtat_commande()=="new") {
		  this.State = "new" ;
		  this.preparer(commande);
		   return true;
	   }
	return false;
	
   }
   
   public String getState() {
	   return this.State;
   }
	public void preparer(CommandeInterface c) {
		this.State = "en cours de preparation";
		((Commande)c).setEtat_commande("in progress");
	}
	
	public void terminer(CommandeInterface c) {
		this.State = "commande termine";
		((Commande)c).setEtat_commande("done");
	}
	
}
    
   
        
     
    
    
        
     
    
    
