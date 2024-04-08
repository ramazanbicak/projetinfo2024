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
public class Mur {
    
    
     int idMur;
    Coin coinDebut;
    Coin coinFin;
    int nbrePortes;
    int nbreFenetre;
    ArrayList<Revetement> listeRevetements = new ArrayList<>();
    
    
    public Mur(int idMur, Coin coinDebut,  Coin coinFin, int nbrePortes, int nbreFenetre, ArrayList<Revetement> listeRevetements) {
     this.idMur=idMur;
     this.coinDebut=coinDebut;
     this.coinFin=coinFin;
     this.nbreFenetre = nbreFenetre;
     this.nbrePortes = nbrePortes;
     this.listeRevetements = listeRevetements;       
        
    }
        
        
        
        
        
        void afficher() {
        
        System.out.println("Identifiant :"+this.idMur+" Coin Debut :"+this.coinDebut+" Coin Fin :"+this.coinFin+"Nbr de porte :"+this.nbrePortes+"Nbr de fenetre :"+this.nbreFenetre+"liste des Revetements :"+this.listeRevetements);
    }
        @Override
         public String toString() {
        return "Mur{"+ "idMur=" + idMur + ", coinDebut=" + coinDebut + ", coinFin=" + coinFin + '}';
         }
         
         public double surface() {
             System.out.println("Quelle est la hauteur sous plafond ?");
             double h=Lire.d();
             System.out.println("Quelle est la longeur du mur ?");
             double longueur=Lire.d();
             
            double surface=h*longueur;
            
            return (surface);
                 
             
         }
         }
         
         
    
    

