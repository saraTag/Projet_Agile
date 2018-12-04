package tutofinal;


import java.util.List;
import java.util.ArrayList;

/**
 * Décrivez votre classe Restaurant ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class Restaurant{  
    // variables d'instance - remplacez l'exemple qui suit par le vôtre
    private String nom,ville; 
    private List<Adjoint> ListManager = new ArrayList<Adjoint>();    
    
    /**
     * Constructeur d'objets de classe Restaurant
     */
    public Restaurant(String nomRest,String villeRest)
    {
        // initialisation des variables d'instance
        nom = nomRest;
        ville = villeRest;
              
    }

    public Restaurant() {
		// TODO Auto-generated constructor stub
    	nom="FoodChéri";
    	ville="Paris";
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
    
    public String getVille(){
      return ville;
    }    
    public List<Adjoint> getManagers(){
    	return ListManager;
    }
    
    public int NombreManagerRestaurant() {
    	
    	return ListManager.size();
    }
    
    
    public String getManager(){
    	
    String list="";	
    
    for(int i=0;i<ListManager.size();i++) {
    	list=list+ListManager.get(i).getNom()+",";
    }
    
    return list;    
    
    }
    
    //setters
    public void addManager(Adjoint man)
    {
    	
    	ListManager.add(man);
    }
    
    
    public void setNom(String NomRest) {
    	nom=NomRest;
    }
    
    public void setVille(String nomVille) {
    	
    	ville = nomVille ;
    }
    
    
    
    //autre methodes 
    public void removeManager(Adjoint man) {
    	ListManager.remove(man);
    }
    
    
    	
    public String Afficher()
    {
      
      return"Restaurant "+this.getNom()+" de la ville "+this.getVille();
      
    }
    @Override
    public boolean equals(Object o) {
    	if (o instanceof Restaurant) {
    		if (((Restaurant)o).getNom()==nom && ((Restaurant)o).getVille()==ville)
    			return true;
    		return false;
    	}
    	return false;
    }
    
    
}
    