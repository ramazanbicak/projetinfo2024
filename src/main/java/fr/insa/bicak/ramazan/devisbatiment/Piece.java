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
    
    int idAppartement;
    int idPiece;
    int idSol;
    int idPlafond;
    ArrayList<Mur> listeMurs = new ArrayList<>();
     
     
      public Piece(int idAppartement, int idPiece, int idSol,  int idPlafond, ArrayList<Mur> listeMurs) {
     this.idAppartement = idAppartement;
     this.idPiece=idPiece;
     this.idSol=idSol;
     this.idPlafond = idPlafond;
     this.listeMurs=listeMurs;
     
      }
     
     
     void afficher() {
        
        System.out.println("Appartement :"+this.idAppartement+ "Identifiant :"+this.idPiece+" Sol :"+this.idSol+" Plafond :"+this.idPlafond+"listeMurs :"+this.listeMurs);
    }
     
     @Override
         public String toString() {
        return "Piece{"+  "idAppartement"+idAppartement+"idPiece=" + idPiece + ", sol=" + idSol + ", plafond=" + idPlafond +  "listeMurs"+listeMurs+'}';
         }
    
      public double surface(ArrayList<Sol> listeSols, ArrayList <Plafond> listePlafonds, ArrayList <Mur> listeMurs){
          
          double surface = DevisBatiment.rechSol(idSol, listeSols).surface() + DevisBatiment.rechPlafond(idPlafond, listePlafonds).surface() + 
          return(surface);
      }   
         
         
}
