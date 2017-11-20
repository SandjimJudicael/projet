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
public abstract class Employe {
    private String matricule;
    private String nom;
    private String prenom;
    private int age;
    private String date;
    public final static int SB=110000;
    
    public Employe(String matricule,String nom,String prenom,int age,String date){
        
        this.matricule=matricule;
        this.nom=nom;
        this.prenom=prenom;
        this.age=age;
        this.date=date;
        
    }
    public abstract double calculerSalaire();
    public String getTitre(){
        return "l'emlpoye"+" ";
    }
    public String getNom(){
        return getTitre()+nom+" "+prenom;
        
    }
}
