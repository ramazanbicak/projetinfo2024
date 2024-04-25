/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.bicak.ramazan.devisbatiment;

/**
 *
 * @author Ramazan
 */
public class Fenetre extends Ouverture{
    
     public Fenetre(int idOuverture, double dimX, double dimY) {
        this.idOuverture = idOuverture; // Initialise l'identifiant hérité
        this.dimX = dimX; // Initialise dimX hérité
        this.dimY = dimY; // Initialise dimY hérité
        
    }
    
    int idOuverture;
    double dimX; 
    double dimY;
    
    public static double surface(){
        
        double dimX = 1.20;
        double dimY = 1.20;
        double sur = dimX*dimY;
        
        return(sur);
        
                
        
    }
    
}
