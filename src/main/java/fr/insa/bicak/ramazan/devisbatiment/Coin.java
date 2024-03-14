/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.bicak.ramazan.devisbatiment;

/**
 *
 * @author rbicak01
 */

    
    
    public class Coin {
    int idCoin;
    double cx;
    double cy;
    /**
    Coin(int id, double x, double y)
    
    {
      
        this.idCoin = id;
        this.cx= x;
        this.cy = y;
        
    }
*/
    public Coin(int idCoin, double cx, double cy) {
        
        this.idCoin = idCoin;
        this.cx = cx;
        this.cy = cy;
        
        
    }
    
    void afficher() {
        
        System.out.println("Identifiant :"+this.idCoin+" Abcisse :"+this.cx+" Ordonee :"+this.cy);
    
    }
    
    @Override
    public String toString() {
        return "Coin{"+ "idCoin=" + idCoin + ", cx=" + cx + ", cy=" + cy + '}';
    
    
    
    
    
    }
    
}

    

