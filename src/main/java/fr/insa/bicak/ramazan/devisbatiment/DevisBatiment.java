/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
// TEST modifs
package fr.insa.bicak.ramazan.devisbatiment;

import static fr.insa.bicak.ramazan.devisbatiment.Lire.c;

/**
 *
 * @author rbicak01
 */
public class DevisBatiment {

    private static Coin c;

    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println("Au revoir");
       
        
        
        
        int id;
        double abscisse, ordonnee;
        System.out.println("Identifiant");
        id = Lire.i();
        System.out.println("Abscisse :");
        abscisse = Lire.d();
        System.out.println("Ordonee");
        ordonnee = Lire.d();
           
        
                
        c = new Coin(id, abscisse, ordonnee);
        
        c.afficher();
        //bonjour
        //apnian
    }
}

