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
public class Appartement  {
    
    
   int idAppartement;
   int NiveauAppartement;
   ArrayList <Piece> listePieceAppart = new ArrayList<>();
    
    public Appartement(int idAppartement, int NiveauAppartement, ArrayList<Piece> listePieceAppart) {
     this.idAppartement=idAppartement;
     this.NiveauAppartement=NiveauAppartement;
     this.listePieceAppart=listePieceAppart;
    }
    
     
     void afficher() {
        
        System.out.println("Identifiant :"+this.idAppartement+" NiveauAppartement :"+this.NiveauAppartement+"listePieceAppartement:"+this.listePieceAppart);
    }
     
     @Override
         public String toString() {
        return "Piece{"+ "idMur=" + idAppartement + ", NiveauAppartement=" + NiveauAppartement +", listePieceAppart"+listePieceAppart+ '}';
         }
         
     public double surface(ArrayList<Sol> listeSols, ArrayList <Plafond> listePlafonds){
         
         double surface = 0;
         for(int i=0;i<listePieceAppart.size();i++){
            surface = surface + DevisBatiment.rechPiece(i, listePieceAppart).surface(listeSols, listePlafonds);
             
           
         }
         return(surface);  
         
     }
       
public double montantRevetement(ArrayList<Sol> listeSols, ArrayList <Plafond> listePlafonds){
         
         double mr = 0;
         for(int i=0;i<listePieceAppart.size();i++){
            //mr = mr + DevisBatiment.rechPiece(i, listePieceAppart).montantRevetement.surface(listeSols, listePlafonds);
             mr = mr + DevisBatiment.rechPiece(i, listePieceAppart).montantRevetement(DevisBatiment.rechPiece(i, listePieceAppart).surface(listeSols, listePlafonds),listeSols, listePlafonds);
   
         }
         
         return(mr); 
     }
    
}
