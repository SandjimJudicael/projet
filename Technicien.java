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
public class Technicien extends Employe {
    private final static double F_U=5.0;
    private int unites; 
    public Technicien(String matricule, String nom, String prenom,int age, String date, int unites){
        
    super(matricule, nom, prenom, age, date);
    this.unites=unites;
    }
    public double calculerSalaire()
        {
        return F_U*unites+SB;
        }
    public String getTitre(){
        return "le technicien"+" ";
    }
}
