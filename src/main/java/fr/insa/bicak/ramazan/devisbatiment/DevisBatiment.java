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
        
       /*
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
        */
       
        System.out.println("type de revetement recherché :");
        String typeRevetement = Lire.S();
        DevisBatiment.rechercher_Revetement_Designation(typeRevetement);
        System.out.println("Identifiant du revetement choisi : ");
        String idRevetementChoisi = Lire.S();
        DevisBatiment.rechercher_Revetement_Identifiant(typeRevetement);
        
        
        
      int reponse;
     System.out.println("Création d'un Coin : 1=Oui et 0=Non");
     reponse=Lire.i();
     Coin c;
     //Déclaration de la ArrayList
     ArrayList<Coin> listeCoins;
     //Initialisation de la liste
     listeCoins=new ArrayList<>();
     //Boucle de saisie et d'ajout de Coins dans la liste
     while(reponse!=0){
         System.out.println("Identifiant: ");
         int id=Lire.i();
         System.out.println("Abscisse: ");
         double a=Lire.d();
         System.out.println("Ordonnée: ");
         double b=Lire.d();
         //Appel du constructeur
         c=new Coin(id,a,b);
         
         listeCoins.add(c);
         System.out.println("Création d'un coin : 1=Oui et 0= Non");
         reponse=Lire.i();
     }//Fin while
     
     //Recherche d'un Coin dans listeCoins par son identifiant
     System.out.println("Identifiant du coin Recherché:");
     int idRech=Lire.i();
     
     for (int i=0;i<listeCoins.size();i++){
         if(listeCoins.get(i).idCoin==idRech)
             listeCoins.get(i).afficher();
        
        
        
        
        
        
        
        
    } 
        
    }  
    public static void rechercher_Revetement_Designation(String revetementRech) {
            
        String[] tab;
            
            
        try {
            BufferedReader revetement=new BufferedReader(new FileReader("Catalogue.txt"));
            String lignelue;
            while((lignelue=revetement.readLine())!=null){
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
            while((lignelue = revetement.readLine())!=null){
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
    
