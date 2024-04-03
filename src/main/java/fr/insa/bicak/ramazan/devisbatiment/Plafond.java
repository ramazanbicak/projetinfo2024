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
    ArrayList<String> listeCoins= new ArrayList<>();
    ArrayList<String> listeRevetements = new ArrayList<>();
    
    
    
    /*
    public Plafond(int idPlafond, ArrayList<String> listeCoins,ArrayList<String> listeRevetements) {
        this.idPlafond = idPlafond;
        this.listeCoins = listeCoins;
        this.listeRevetements = listeRevetements;
    }
    
    */
    
    
    void afficher() {
        
        System.out.println("Plafond :"+this.idPlafond+" Coins :"+this.listeCoins+" Revetements : "+this.listeRevetements);
    
    }
    
    @Override
    public String toString() {
        return "Plafond{"+ "idNiveau=" + idPlafond + ", Coins=" + listeCoins + ", Liste des Revetements=" + listeRevetements + '}';
    }
    
    public void surface(){
        
        
        
        
    }
    
    
    
    
    
    
    
    
    
    
}
