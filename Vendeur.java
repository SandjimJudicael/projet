/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salary;

/**
 *
 * @author WIN
 */
public class Vendeur extends Commercial {
     private final static double PCT_V=0.2;
    private final static int BONUS_V=100;
    public Vendeur(String matricule, String nom, String prenom, int age, String date, double chiffreAffaire)
        {
          super(matricule, nom, prenom, age, date, chiffreAffaire);
          
        }
    public double calculerSalaire()
        {
            return(PCT_V*getChiffreAffaire())+BONUS_V+SB;
            
        }
public String getTitre()
    {
return "le vendeur"+" ";
    }
}
