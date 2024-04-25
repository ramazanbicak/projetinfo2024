package fr.insa.bicak.ramazan.devisbatiment;

import static fr.insa.bicak.ramazan.devisbatiment.Lire.c;

import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class DevisBatiment {

    
    public static double hauteurSousPlafond;
    private static Coin c;
    public static Revetement r;
    public static ArrayList<Revetement> listeRevtementMurs;

    public static void main(String[] args) {
        
     int niv;
    int idNiveau = 0;
     
     
     
     
     
     System.out.println("Quelle est le type de Batiment : 1=Maison 2=Immeuble");
     int typebat =Lire.i();
     if (typebat == 1){
         int idAppart = 1;
     }
     
     
     System.out.println("Niveau"+idNiveau);
     
   
     
     System.out.println("Quelle est la hauteur sous Plafond");
     double hauteurSousPlafond = Lire.d();
     
     
     
        
      int reponse;
     System.out.println("Creation d'un Coin : 1=Oui et 0=Non");
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
         System.out.println("Ordonnee: ");
         double b=Lire.d();
         //Appel du constructeur
         c=new Coin(id,a,b);
         
         listeCoins.add(c);
         System.out.println("Creation d'un coin : 1=Oui et 0= Non");
         reponse=Lire.i();
     }//Fin while
     
     
     int rep;
     System.out.println("Creation d'un mur :1=0 et 0=Non");
     rep =Lire.i();
     
     ArrayList<Mur> listeMurs;
     listeMurs = new ArrayList<>();
     
     ArrayList<Revetement> listeRevetementMur;
     listeRevetementMur = new ArrayList<>();
     
     while(rep !=0){
         
         
         System.out.println("Identifiant: ");
         int id=Lire.i();
         System.out.println("Quelle est le coin de debut");
         int idcd=Lire.i();
         System.out.println("Quelle est le coin de fin");
         int idcf= Lire.i();
         
         System.out.println("Combien il y a de fenetre ?");
         int nbfenetre = Lire.i();
         System.out.println("Combien il y a de porte ?");
         int nbporte = Lire.i();
         
         
         
         //methode revetement
       System.out.println("Voulez-vous mettre un revetement ?");
       int repv = Lire.i();
        
        while(repv != 0) {
            
        
        System.out.println("type de revetement recherche :");
        String typeRevetement = Lire.S();
        DevisBatiment.rechercher_Revetement_Designation(typeRevetement);
        System.out.println("Identifiant du revetement choisi : ");
        String idRevetementChoisi = Lire.S();
        DevisBatiment.rechercher_Revetement_Identifiant(idRevetementChoisi);
        creerRevetement(idRevetementChoisi, listeRevetementMur);
        
                
        
                
        
        System.out.println("Voulez-vous mettre un revetement ?");
        repv = Lire.i();
        }
         
                 
         Mur m = new Mur(id, rechCoin(idcd, listeCoins), rechCoin(idcf, listeCoins), nbporte, nbfenetre, listeRevetementMur);
         listeMurs.add(m);
         
         
         
         System.out.println(listeMurs.get(0).surface(hauteurSousPlafond));
         
         System.out.println(listeMurs.get(0).montantRevetement(listeMurs.get(0).surface(hauteurSousPlafond)));
         
         
         
        
         
         
         
         
         System.out.println("Creation d'un Mur : 1=Oui et 0= Non");
         rep=Lire.i();
         
         
         
     }
         
     
     
     
     
     
    
            
    int ic;
    ic=0;
    int idcoin;
    int reppl;
     System.out.println("Creation d'un sol :1=0 et 0=Non");
     rep =Lire.i();
     
     //Liste de Coin des sols
     ArrayList<Coin> listeCoinsol;
     listeCoinsol = new ArrayList<>();
     
     //Liste des sols
     ArrayList<Sol> listeSols;
     listeSols = new ArrayList<>();
     
     //liste des plafonds
     ArrayList<Plafond> listePlafonds;
     listePlafonds = new ArrayList<>();
     
     while(rep !=0){
         
         
         System.out.println("Identifiant: ");
         int id=Lire.i();
         
         while(ic<4){
             
             System.out.println("saisir coin :");
             idcoin = Lire.i();
             listeCoinsol.add(rechCoin(idcoin, listeCoins));
             ic=ic+1;
             
         }
         
         ic = 0;
         
           
         
         
         //methode revetement
         
         
      ArrayList<Revetement> listeRevetementSol;
     listeRevetementSol = new ArrayList<>();
     
       System.out.println("Voulez-vous mettre un revetement ?");
       int repv = Lire.i();
        
      
            
        
        System.out.println("type de revetement recherche :");
        String typeRevetement = Lire.S();
        DevisBatiment.rechercher_Revetement_Designation(typeRevetement);
        System.out.println("Identifiant du revetement choisi : ");
        String idRevetementChoisi = Lire.S();
        DevisBatiment.rechercher_Revetement_Identifiant(idRevetementChoisi);
        creerRevetement(idRevetementChoisi, listeRevetementSol);
        
        
        Sol s = new Sol(id, listeCoinsol, listeRevetementSol);
         listeSols.add(s);
         
         //System.out.println(listeSols.get(id-1).surface());
         System.out.println(rechSol(id, listeSols).surface());
         
        
         
         System.out.println(listeSols.get(0).montantRevetement(listeSols.get(0).surface()));
                 
         
         
         
         
         
         
         
         System.out.println("Voulez-vous un plafond : 1=Oui 0=Non");
         reppl = Lire.i();
         
         if (reppl == 1){
             
             
     System.out.println("Quelle est le nombre de tremis du plafond ?");
     int nbtremis = Lire.i();
     
     ArrayList<Revetement> listeRevetementPlafond;
     listeRevetementPlafond = new ArrayList<>();
     
      System.out.println("type de revetement recherche :");
        typeRevetement = Lire.S();
        DevisBatiment.rechercher_Revetement_Designation(typeRevetement);
        System.out.println("Identifiant du revetement choisi : ");
        idRevetementChoisi = Lire.S();
        DevisBatiment.rechercher_Revetement_Identifiant(idRevetementChoisi);
        creerRevetement(idRevetementChoisi, listeRevetementPlafond);
        
        
        
        Plafond p = new Plafond(id, listeCoinsol, nbtremis, listeRevetementPlafond);
        listePlafonds.add(p);
         
       
        //System.out.println(listePlafonds.get(id-1).surface());
         System.out.println(rechPlafond(id, listePlafonds).surface());
        
        //System.out.println(listePlafonds.get(id-1).montantRevetement(listePlafonds.get(0).surface()));
        System.out.println(rechPlafond(id, listePlafonds).montantRevetement(listePlafonds.get(0).surface()));
        
        
         }
         
         listeCoinsol.clear();
         
         
         System.out.println("Creation d'un Sol : 1=Oui et 0= Non");
         rep=Lire.i();
         
         
         
     }
     
     
     
     System.out.println("Voulez vous créer une pièce ?");
     int repi=Lire.i();
     if (repi == 1){
         int idAppartement = 0;
         if (typebat == 2){
         System.out.println("A quelle apartement appartient cette pièce ?");
            idAppartement = Lire.i();
         }
         
         System.out.println("Quelle est l'identifiant de la piece");
         int idPiece  = Lire.i();
         
         
         System.out.println("Saisir l'identifiant du sol de la pièce");
         int idsol = Lire.i();
         
         System.out.println("La pièce a-t-il un plafond");
         int reponseplafond = Lire.i();
         
         int idPlafond = 0;
         if (reponseplafond == 1) {
         System.out.println("Saisir le plafond de la pièce");
            idPlafond = Lire.i();
         
         }
         
         if (reponseplafond == 0) {
            idPlafond = 0;
         }
         
        ArrayList<Mur> listeMursPiece;
        listeMursPiece = new ArrayList<>();
        
         System.out.println("Saisir les murs de la pièce");
         for (int i = 0; i<4; i++){
         System.out.println("Saisir les murs de la pièce");
         int idMurPiece= Lire.i();
         //listeMursPiece.add(listeMurs.get(idMurPlafond - 1));
         listeMursPiece.add(rechMur(idMurPiece, listeMurs));
         
         Piece p = new Piece(idAppartement, idPiece, idsol, idPlafond, listeMursPiece);
         
         
         
         
         }
         
         
     }
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     //Recherche d'un Coin dans listeCoins par son identifiant
     System.out.println("Identifiant du coin Recherche:");
     int idRech=Lire.i();
     
     for (int i=0;i<listeCoins.size();i++){
         if(listeCoins.get(i).idCoin==idRech)
             listeCoins.get(i).afficher();
       
        
    } 
        
     
     System.out.println("Identifiant du Mur Recherche:");
     int idRechm=Lire.i();
     
     for (int i=0;i<listeMurs.size();i++){
         if(listeMurs.get(i).idMur==idRechm)
             listeMurs.get(i).afficher();
       
        
    }
     
     System.out.println("Identifiant du Sol Recherche:");
     int idRechs=Lire.i();
     
     for (int i=0;i<listeSols.size();i++){
         if(listeSols.get(i).idSol==idRechs)
             listeSols.get(i).afficher();
       
        
    }
     
    
     
     System.out.println("Identifiant du Plafond Recherche:");
     int idRechp=Lire.i();
     
     for (int i=0;i<listePlafonds.size();i++){
         if(listePlafonds.get(i).idPlafond==idRechp)
             listePlafonds.get(i).afficher();
       
        
    }
     
     
     
        
             
     
     
     
        
    }  
    
    public static Coin rechCoin(int idCoin, ArrayList <Coin> listeCoins){
        Coin Coinrech = listeCoins.get(0);
        for (int i=0;i<listeCoins.size();i++){
            if(listeCoins.get(i).idCoin == idCoin)
                Coinrech = listeCoins.get(i);
                
        }
        return(Coinrech);
    }
    
    public static Mur rechMur(int idMur, ArrayList <Mur> listeMurs){
        Mur Murrech = listeMurs.get(0);
        for (int i=0;i<listeMurs.size();i++){
            if(listeMurs.get(i).idMur == idMur)
                Murrech = listeMurs.get(i);
                
        }
        return(Murrech);
    }
    
    public static Sol rechSol(int idSol, ArrayList <Sol> listeSols){
        Sol Solrech = listeSols.get(0);
        for (int i=0;i<listeSols.size();i++){
            if(listeSols.get(i).idSol == idSol)
                Solrech = listeSols.get(i);
                
        }
        return(Solrech);
    }
    public static Plafond rechPlafond(int idPlafond, ArrayList <Plafond> listePlafonds){
        Plafond Plafondrech = listePlafonds.get(0);
        for (int i=0;i<listePlafonds.size();i++){
            if(listePlafonds.get(i).idPlafond == idPlafond)
                Plafondrech = listePlafonds.get(i);
                
        }
        return(Plafondrech);
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
                    System.out.println("prix unitaire :"+tab[5]+"euros/m2");
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
    
    public static void creerRevetement(String idRevetementRech, ArrayList<Revetement> listeRevetement) {
        
        
         String[] tab;
         
         
            
        try {
            BufferedReader revetement=new BufferedReader(new FileReader("Catalogue.txt"));
            String lignelue;
            while((lignelue = revetement.readLine())!=null){
                tab=lignelue.split(";");
                
                if(tab[0].equals(idRevetementRech)) {
                    
                    int idrev = Integer.parseInt(tab[0]);
                    int pourmur = Integer.parseInt(tab[2]);
                    int poursol = Integer.parseInt(tab[3]);
                    int pourplafond = Integer.parseInt(tab[4]);
                    double prixUnitaire = Double.parseDouble(tab[5]);
                    Revetement r = new Revetement(idrev, tab[1], pourmur, poursol, pourplafond, prixUnitaire);
                    listeRevetement.add(r);
                    
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