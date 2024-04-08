/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.bicak.ramazan.devisbatiment;

/**
 *
 * @author Ramazan
 */
public class Revetement {
    
    int idRevetement;
    String designation;
    int pourMur;
    int pourSol;
    int pourPlafond;
    double prixUnitaire;
    
    public Revetement(int idRevetement, String designation, int pourMur, int pourSol, int pourPlafond, double prixUnitaire) {
        
        this.idRevetement = idRevetement;
        this.designation = designation;
        this.pourMur = pourMur;
        this.pourSol = pourSol;
        this.pourPlafond = pourPlafond;
        this.prixUnitaire = prixUnitaire;
        
        
    }
    
    void afficher() {
        
        System.out.println("REV : "+this.idRevetement+" Nom : "+this.designation+" PourMur : "+this.pourMur+"PourSol : "+this.pourSol+"PourPlafond :"+this.pourPlafond+"Prix Unitaire : "+this.prixUnitaire);
    
    }
    
    
    
    
    
    
    
// On met montantTotalRevetement() là ou dans le main ?
    
}
