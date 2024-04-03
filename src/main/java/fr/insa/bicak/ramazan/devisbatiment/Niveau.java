/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.bicak.ramazan.devisbatiment;

import java.util.ArrayList;

/**
 *
 * @author Ramazan
 */
public class Niveau {
    
    int idNiveau;
    double hauteurSousPlafond;
    ArrayList<String> ListeApparts = new ArrayList<String>();
    
    public Niveau(int idNiveau, double hauteurSousPlafond, ArrayList<String> ListeApparts) {
        this.idNiveau = idNiveau;
        this.hauteurSousPlafond = hauteurSousPlafond;
        this.ListeApparts = ListeApparts;
    }
    
     void afficher() {
        
        System.out.println("Niveau :"+this.idNiveau+" HauteurSousPlafond :"+this.hauteurSousPlafond+" Appartement : "+this.ListeApparts);
    
    }
    
    @Override
    public String toString() {
        return "Niveau{"+ "idNiveau=" + idNiveau + ", hauteurSousPlafond=" + hauteurSousPlafond + ", ListeApparts=" + ListeApparts + '}';
    }
    
    
    public int suface() {
        
    }
}
