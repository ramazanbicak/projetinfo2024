/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.bicak.ramazan.devisbatiment;

import java.util.ArrayList;

/**
 *
 * @author Ramazan
 */
public class Plafond {
    int idPlafond;
    ArrayList<Coin> listeCoins= new ArrayList<>();
    ArrayList<Revetement> listeRevetements = new ArrayList<>();
    int nbreTremis;
    
    
    
    public Plafond(int idPlafond, ArrayList<Coin> listeCoins, int nbreTremis, ArrayList<Revetement> listeRevetements ) {
        this.idPlafond = idPlafond;
        this.listeCoins = listeCoins;
        this.nbreTremis = nbreTremis;
        this.listeRevetements = listeRevetements;
    }
    
    
    
    
    void afficher() {
        
        System.out.println("Plafond :"+this.idPlafond+" Coins :"+this.listeCoins+"nbreTremis :"+this.nbreTremis+ "Revetements : "+this.listeRevetements);
    
    }
    
    @Override
    public String toString() {
        return "Plafond{"+ "idNiveau=" + idPlafond + ", Coins=" + listeCoins +", nbreTremis="+nbreTremis+ ", Liste des Revetements=" + listeRevetements + '}';
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
    surface = surface - nbreTremis*Tremie.surface();
    
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
