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
public class Manutentionnaire extends Employe{
    private final static double S_H=65.0;
    private int heures;
    
    public Manutentionnaire(String matricule, String nom, String prenom, int age, String date, int heures){
        super(matricule, nom, prenom, age, date);
        this.heures=heures;
        
    }
    public double calculerSalaire(){
        return S_H*heures+SB;
        
    }
    public String getTitre(){
        return "le manut"+" ";
    }
}
