package tutofinal;

import java.util.ArrayList;
import java.util.List;

public class Client implements ObservateurInterface {
	 private String nom,prenom; 
	    private List<Commande> ListCommande = new ArrayList<Commande>();    
	    
	    /**
	     * Constructeur d'objets de classe Restaurant
	     */
	    public Client(String nomc,String prenomc)
	    {
	        // initialisation des variables d'instance
	        nom = nomc;
	        prenom = prenomc;
	              
	    }

	    public Client() {
			// TODO Auto-generated constructor stub
	    	nom = "TAGZIRIA";
	    	prenom = "sara";
		}
	    public void creercommande(int prixunitaire, int quantite, Restaurant r) {
	    	ListCommande.add(new Commande(prixunitaire,r));
	    }

		/**
	     * Un exemple de méthode - remplacez ce commentaire par le vôtre
	     *
	     * @param  y   le paramètre de la méthode
	     * @return     la somme de x et de y
	     */
	    //getters
	    public String getNom(){
	       return nom;     
	    }
	    
	    public String getPrenom(){
	      return prenom;
	    }    
	    public List<Commande> getCommandes(){
	    	return ListCommande;
	    }
	    
	    public int NombreCommande() {
	    	
	    	return ListCommande.size();
	    }
	    
	    
	  
	    
	    //setters
	    public void addCommande(Commande com)
	    {
	    	
	    	ListCommande.add(com);
	    }
	    
	    
	    public void setNom(String Nomc) {
	    	nom=Nomc;
	    }
	    
	    public void setPrenom(String prenomc) {
	    	
	    	prenom = prenomc ;
	    }
	    
	    //autre methodes
	    
	    public void removeCommande(Commande com) {
	    	ListCommande.remove(com);
	    }
	    
	    
	    public String Afficher()
	    {
	      
	      return"Client "+this.getNom()+this.getPrenom();
	      
	    }
	    @Override
	    public boolean equals(Object o) {
	    	if (o instanceof Client) {
	    		if (((Client)o).getNom()==nom && ((Client)o).getPrenom()==prenom)
	    			return true;
	    		return false;
	    	}
	    	return false;
	    }

	    public boolean update(CommandeInterface commande) {
			// TODO Auto-generated method stub
			String out =((Commande) commande).getEtat_commande();
			return true;
	        }	   
	    
}
