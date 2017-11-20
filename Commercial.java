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
public abstract class Commercial extends Employe {
    private double chiffreAffaire;
    
    public Commercial(String matricule, String nom, String prenom, int age, String date, double chiffreAffaire)
        {
            super(matricule, nom, prenom, age, date);
            this.chiffreAffaire=chiffreAffaire;
        }
    public double getChiffreAffaire()
        {
            return chiffreAffaire;
        }
}
