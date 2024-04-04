package fr.insa.bicak.ramazan.devisbatiment;

import static fr.insa.bicak.ramazan.devisbatiment.Lire.c;

import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;









public class DevisBatiment {

    private static Coin c;

    public static void main(String[] args) {
        
       
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
        
    }
}

