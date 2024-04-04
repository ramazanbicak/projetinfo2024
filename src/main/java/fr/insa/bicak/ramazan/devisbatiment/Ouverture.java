/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.bicak.ramazan.devisbatiment;

/**
 *
 * @author Julien
 */


public class Ouverture {
    
    int idOuverture;
    double dimX;
    double dimY;
    
    void afficher() {
        
        System.out.println("Identifiant :"+this.idOuverture+" DimX"+ this.dimX+" Dim Y :"+this.dimY);
    
    }
    
    @Override
    public String toString() {
        return "Coin{"+ "idouverture=" + idOuverture + ", dimX=" + dimX + ", dimY=" + dimY + '}';
    
    }
    
}
