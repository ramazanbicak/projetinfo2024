/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.bicak.ramazan.devisbatiment;

/**
 *
 * @author abentsiou01
 */
public class Mur {
    
    
     int idMur;
    Coin coinDebut;
    Coin coinFin;
    int nbrePortes;
    int nbreFenetre;
    
    
    
    public Mur(int idMur, Coin coinDebut,  Coin coinFin) {
         this.idMur=idMur;
     this.coinDebut=coinDebut;
     this.coinFin=coinFin;
    
        
    }
        
        
        
        
        
        void afficher() {
        
        System.out.println("Identifiant :"+this.idMur+" Coin Début :"+this.coinDebut+" Coin Fin :"+this.coinFin);
    }
        
         public String toString() {
        return "Mur{"+ "idMur=" + idMur + ", coinDebut=" + coinDebut + ", coinFin=" + coinFin + '}';
    
    
}
