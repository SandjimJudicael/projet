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
public class TechnARisque extends Technicien implements ARisque {
    public TechnARisque(String matricule, String nom, String prenom, int age, String date, int unites){
        super(matricule, nom, prenom, age,date, unites);
    }
   
public double calculerSalaire(){
return super.calculerSalaire()+PRIME;
}

}