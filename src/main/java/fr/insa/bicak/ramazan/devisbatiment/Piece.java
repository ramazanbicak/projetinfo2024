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
    ArrayList<Mur> listeMursPiece = new ArrayList<>();
     
     
      public Piece(int idAppartement, int idPiece, int idSol,  int idPlafond, ArrayList<Mur> listeMursPiece) {
     this.idAppartement = idAppartement;
     this.idPiece=idPiece;
     this.idSol=idSol;
     this.idPlafond = idPlafond;
     this.listeMursPiece = listeMursPiece;
     
      }
     
     
     void afficher() {
        
        System.out.println("Appartement :"+this.idAppartement+ "Identifiant :"+this.idPiece+" Sol :"+this.idSol+" Plafond :"+this.idPlafond+"listeMurs :"+this.listeMursPiece);
    }
     
     @Override
         public String toString() {
        return "Piece{"+  "idAppartement"+idAppartement+"idPiece=" + idPiece + ", sol=" + idSol + ", plafond=" + idPlafond +  "listeMurs"+listeMursPiece+'}';
         }
    
      public double surface(ArrayList<Sol> listeSols, ArrayList <Plafond> listePlafonds){
          double surfMur = 0;
          for(int i=0;i<listeMursPiece.size();i++){
              surfMur = surfMur + DevisBatiment.rechMur(i, listeMursPiece).surface(DevisBatiment.hauteurSousPlafond); 
                      
          }
          double surface = DevisBatiment.rechSol(idSol, listeSols).surface() + DevisBatiment.rechPlafond(idPlafond, listePlafonds).surface() + surfMur;
                  
          return(surface);
      }  
      
      public double montantRevetement(double surface, ArrayList<Sol> listeSols, ArrayList<Plafond> listePlafonds)
      {
          
          double montmur = 0;
          
          for(int i=0;i<listeMursPiece.size();i++){
              montmur = montmur + DevisBatiment.rechMur(i, listeMursPiece).surface(DevisBatiment.hauteurSousPlafond); 
                      
          }
          
          double mr = DevisBatiment.rechSol(idSol, listeSols).montantRevetement(DevisBatiment.rechSol(idSol, listeSols).surface()) + DevisBatiment.rechPlafond(idPlafond, listePlafonds).montantRevetement(DevisBatiment.rechPlafond(idPlafond, listePlafonds).surface()) + montmur;
          
          
          return(mr);
      }     
         
}
