package td2;

import java.lang.reflect.Method;

public class roman extends Livre {
	
	private String nom_aut;
    private String nom_edit;
  
	public String getNom_aut() {
		return nom_aut;
	}
	public void setNom_aut(String aut) {
		this.nom_aut = aut;
	}
	
	
	
	public String getNom_edit() {
		return nom_edit;
	}
	public void setNom_edit(String edit) {
		this.nom_edit = edit;
	}
    
	
    
    roman(String T, String d, int TVA, int nbP,String aut,String edit) {
    	
	super(T, d, TVA, nbP);
	this.nom_aut=aut;
	this.nom_edit=edit; 
   }
  
    @Override
   public String toString() {
	  
	return ("le nom d'auteur est "+this.nom_aut + " et le nom de l'editeur est "+this.nom_edit);
  }  
    
    public double calculPrix(double prix,int nbPages,double bonus) {
    	super.prix(prix, nbPages);
    	
		prix=(0.35 * nbPages)*(1+TVA)+bonus;
        return prix;
    }
    
    
}
