/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.bicak.ramazan.devisbatiment;

/**
 *
 * @author Ramazan
 */
public class Porte extends Ouverture{
    
    
    public Porte(int idOuverture, double dimX, double dimY) {
        this.idOuverture = idOuverture; // Initialise l'identifiant hérité
        this.dimX = dimX; // Initialise dimX hérité
        this.dimY = dimY; // Initialise dimY hérité
        
    }
    
    int idOuverture;
    double dimX; 
    double dimY;
    
    public static double surface(){
        
        double dimX = 0.9;
        double dimY = 2.10;
        double sur = dimX*dimY;
        
        return(sur);
        
                
        
    }
    
}
