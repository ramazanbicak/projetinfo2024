/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.bicak.ramazan.devisbatiment;

import java.util.ArrayList;

/**
 *
 * @author abentsiou01
 */
public class Piece {
    
    int idPiece;
    int sol;
    int plafond;
    ArrayList<String> listePieces = new ArrayList<>();
     
     
      public Piece(int idPiece, int sol,  int plafond) {
     this.idPiece=idPiece;
     this.sol=sol;
     this.plafond=plafond;
     
      }
     
     
     void afficher() {
        
        System.out.println("Identifiant :"+this.idPiece+" Sol :"+this.sol+" Plafond :"+this.plafond);
    }
     
     @Override
         public String toString() {
        return "Piece{"+ "idPiece=" + idPiece + ", sol=" + sol + ", plafond=" + plafond + '}';
         }
    
}
