
package fr.insa.bicak.ramazan.devisbatiment;

import java.util.ArrayList;

/**
 *
 * @author Ramazan
 */
public class Sol {
    
    int idSol;
    ArrayList<String> listeCoins= new ArrayList<>();
    ArrayList<String> listeRevetements = new ArrayList<>();
    
    /*
      public Sol(int idSol, ArrayList<String> listeCoins,ArrayList<String> listeRevetements) {
        this.idSol = idSol;
        this.listeCoins = listeCoins;
        this.listeRevetements = listeRevetements;
    }
    
    */
    
    void afficher() {
        
        System.out.println("Sol :"+this.idSol+" Coins :"+this.listeCoins+" Revetements : "+this.listeRevetements);
    
    }
    
    @Override
    public String toString() {
        return "Sol{"+ "idNiveau=" + idSol + ", Coins=" + listeCoins + ", Liste des Revetements=" + listeRevetements + '}';
    }
    
    
    
    
    
    
    
}
