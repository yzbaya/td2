package td2;

public class Livre {
	
    protected String titre ;
    protected String domaine;
    protected int TVA=10;
    protected int nb_pages;
    
    
    
    Livre(String T,String d,int TVA,int nbP){
    	this.titre=T;
    	this.domaine=d;
    	this.TVA=TVA;
    	this.nb_pages=nbP;
    }
    
     public double prix(double prix,int nbP) {
		prix=(0.075 * nbP)*(1+TVA);
		return prix;
    }
  @Override 
  public String toString() {
	return ("le titre est "+this.titre + "le domaine est "+this.domaine + "le nb de page est"+this.nb_pages);
	  
  }

}
