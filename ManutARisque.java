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
public class ManutARisque extends Manutentionnaire implements ARisque {
   public ManutARisque(String matricule, String nom, String prenom, int age, String date,int heures) {
       super(matricule, nom, prenom, age, date, heures);
       
   }
   public double calculerSalaire(){
       return super.calculerSalaire()+PRIME;
   }
}