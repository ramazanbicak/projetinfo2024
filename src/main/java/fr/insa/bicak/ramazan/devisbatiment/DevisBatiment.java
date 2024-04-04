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
        
        System.out.println("type de revetement recherché :");
        String typeRevetement = Lire.S();
        DevisBatiment.rechercher_Revetement_Designation(typeRevetement);
        System.out.println("Identifiant du revetement choisi : ");
        String idRevetementChoisi = Lire.S();
        DevisBatiment.rechercher_Revetement_Identifiant(typeRevetement);
        
        
        
        
    public static void rechercher_Revetement_Designation(String revetementRech) {
            
        String[] tab;
            
            
        try {
            BufferedReader revetement=new BufferedReader(new FileReader("Catalogue.txt"));
            String lignelue;
            while((lignelue=revetement.readline())!=null){
               tab=lignelue.split(";");
               if(tab[1].equals(revetementRech)) {
                   System.out.println(lignelue);
               }
            }
            revetement.close();
        }
        catch(FileNotFoundException err){
            System.out.println("Erreur "+err);
             
        }
        catch(IOException err) {
            System.out.println("Erreur "+err);
        }
    }
       
       
    public static void rechercher_Revetement_Identifiant(String idRevetementRech) {
            
        String[] tab;
            
            
        try {
            BufferedReader revetement=new BufferedReader(new FileReader("Catalogue.txt"));
            String lignelue;
            while((lignelue=revetement.readline())!=null){
                tab=lignelue.split(";");
                if(tab[0].equals(idRevetementRech)) {
                    System.out.println(lignelue);
                    System.out.println("prix unitaire :"+tab[5]+"eruos/m2");
                }
            }
            revetement.close();
        }
        catch(FileNotFoundException err){
            System.out.println("Erreur "+err);
        }
            catch(IOException err) {
                System.out.println("Erreur "+err);

                
            }
            
            
        }
       
        
                
    }
}

