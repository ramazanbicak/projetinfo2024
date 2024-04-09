
package fr.insa.bicak.ramazan.devisbatiment;

import java.util.ArrayList;

/**
 *
 * @author Ramazan
 */
public class Sol {
    
    int idSol;
    ArrayList<Coin> listeCoins= new ArrayList<>();
    ArrayList<Revetement> listeRevetements = new ArrayList<>();
    
    
      public Sol(int idSol, ArrayList<Coin> listeCoins, ArrayList<Revetement> listeRevetements) {
        this.idSol = idSol;
        this.listeCoins = listeCoins;
        this.listeRevetements = listeRevetements;
    }
    
    
    
    void afficher() {
        
        System.out.println("Sol :"+this.idSol+" Coins :"+this.listeCoins+" Revetements : "+this.listeRevetements);
    
    }
    
    @Override
    public String toString() {
        return "Sol{"+ "idNiveau=" + idSol + ", Coins=" + listeCoins + ", Liste des Revetements=" + listeRevetements + '}';
    }
    
    public double surface(){
        
        double longueur;
        double largueur;
        longueur = 0;
        largueur = 0;
        
        for (int i = 0; i<4; i++){
            
        if(listeCoins.get(0).cx == listeCoins.get(i).cx){
            longueur = Math.abs(listeCoins.get(0).cy - listeCoins.get(i).cy);
         
        }
        
        if(listeCoins.get(0).cy == listeCoins.get(i).cy){
            largueur = Math.abs(listeCoins.get(0).cx - listeCoins.get(i).cx);
            
            
        }
        
        
        
    }
    double surface;
    surface = longueur * largueur;
    
    return(surface);
        
    }
    
    
    public double montantRevetement(double surface){
             
             double montant;
             montant = 0;
             for (int i=0; i<listeRevetements.size(); i++){
                 
             montant = surface*listeRevetements.get(i).prixUnitaire + montant;
             
             }
             
             return(montant);
         }
    
    
    
    
    
    
    
    
    
}
