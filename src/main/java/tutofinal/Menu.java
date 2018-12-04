package tutofinal;


public class Menu extends Produit {
    private Produit plat;
    private Produit boisson;

    public Menu() {
    
    	super();
    	plat=new Produit();
    	boisson=new Boisson();
    }
    public Menu(String nom, Produit plat, Produit boisson) {
    	super(nom,plat.getPrixProduit()+boisson.getPrixProduit()-2);
    	this.plat=plat;
    	this.boisson=boisson;
    }

  public Produit getBoisson() {
	  return boisson;
  }
  public Produit getPlat() {
	  return plat;
  }
  
  public void setBoisson(Produit b) throws Exception {
	  if (b instanceof Boisson) {
		  boisson=b;
	  }else {
		  throw new Exception();
	  }
  }
  public void  setPlat(Produit plat) throws Exception {
	  if (plat instanceof Boisson) {
		  throw new Exception();
	  }else {
		  this.plat=plat;
	  }
  }
    public String preparer() {
       plat.preparer();
       boisson.preparer();
       return super.getNomProduit()+", preparé";
    }
}