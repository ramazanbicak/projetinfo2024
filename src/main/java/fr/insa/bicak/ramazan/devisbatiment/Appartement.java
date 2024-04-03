/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.bicak.ramazan.devisbatiment;

/**
 *
 * @author abentsiou01
 */
public class Appartement  {
    
    
    int idAppartement;
     int NiveauAppartement;
     
    /*
    public Appartement(int idAppartement, int NiveauAppartement) {
     this.idAppartement=idAppartement;
     this.NiveauAppartement=NiveauAppartement;
    }
    */
     
     void afficher() {
        
        System.out.println("Identifiant :"+this.idAppartement+" NiveauAppartement :"+this.NiveauAppartement);
    }
     
     @Override
         public String toString() {
        return "Piece{"+ "idMur=" + idAppartement + ", NiveauAppartement=" + NiveauAppartement + '}';
         }
         
     
    
}
