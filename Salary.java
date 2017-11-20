
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
import java.util.Scanner;
public class Salary {

    /**
     * @param args the command line arguments
     */
    private final static Scanner CLAVIER= new Scanner(System.in);
    public static void main(String[] args) {
        Personnel s=new Personnel();
        System.out.println("Saisir le matricule");
        String mat=CLAVIER.nextLine();
        System.out.println("Saisir le nom");
        String nom=CLAVIER.nextLine();
        System.out.println("Saisir le prénom");
        String prenom=CLAVIER.nextLine();
        System.out.println("Saisir l'âge");
        int age=CLAVIER.nextInt();
        System.out.println("Saisir la date");
        String date=CLAVIER.nextLine();
        System.out.println("Salaire");
        double inconnu=CLAVIER.nextDouble();
        
        s.ajouterEmploye(new Vendeur(mat, nom, prenom, age, date, inconnu));
        
        System.out.println("Saisir le matricule");
        String ma=CLAVIER.nextLine();
        System.out.println("Saisir le nom");
        String n=CLAVIER.nextLine();
        System.out.println("Saisir le prénom");
        String pre=CLAVIER.nextLine();
        System.out.println("Saisir l'âge");
        int ag=CLAVIER.nextInt();
        System.out.println("Saisir la date");
        String d=CLAVIER.nextLine();
        System.out.println("Salaire");
        double incon=CLAVIER.nextDouble();
      
        s.ajouterEmploye(new Representant(ma, n, pre, ag, d, incon));
        
         System.out.println("Saisir le matricule");
        String mt=CLAVIER.nextLine();
        System.out.println("Saisir le nom");
        String nm=CLAVIER.nextLine();
        System.out.println("Saisir le prénom");
        String prn=CLAVIER.nextLine();
        System.out.println("Saisir l'âge");
        int aj=CLAVIER.nextInt();
        System.out.println("Saisir la date");
        String dt=CLAVIER.nextLine();
        System.out.println("Salaire");
        int inc=CLAVIER.nextInt();
     
         s.ajouterEmploye(new Technicien(mt,nm, prn, aj, dt, inc));
         
          String mtt=CLAVIER.nextLine();
        System.out.println("Saisir le nom");
        String nmm=CLAVIER.nextLine();
        System.out.println("Saisir le prénom");
        String prenn=CLAVIER.nextLine();
        System.out.println("Saisir l'âge");
        int agge=CLAVIER.nextInt();
        System.out.println("Saisir la date");
        String dtt=CLAVIER.nextLine();
        System.out.println("Salaire");
        int incco=CLAVIER.nextInt();
        
        s.ajouterEmploye(new Manutentionnaire(mtt, nmm,prenn,agge, dtt,incco));
        
         String matri=CLAVIER.nextLine();
        System.out.println("Saisir le nom");
        String nonn=CLAVIER.nextLine();
        System.out.println("Saisir le prénom");
        String prennom=CLAVIER.nextLine();
        System.out.println("Saisir l'âge");
        int aggg=CLAVIER.nextInt();
        System.out.println("Saisir la date");
        String dte=CLAVIER.nextLine();
        System.out.println("Salaire");
        int inko=CLAVIER.nextInt();
        
        s.ajouterEmploye(new TechnARisque(matri, nonn, prennom, aggg, dte, inko));
        
          String matrii=CLAVIER.nextLine();
        System.out.println("Saisir le nom");
        String non=CLAVIER.nextLine();
        System.out.println("Saisir le prénom");
        String prre=CLAVIER.nextLine();
         System.out.println("Saisir l'âge");
        int ages=CLAVIER.nextInt();
        System.out.println("Saisir la date");
        String dattes=CLAVIER.nextLine();
        System.out.println("Salaire");
        int inkko=CLAVIER.nextInt();
       
        
        s.ajouterEmploye(new ManutARisque(matrii, non, prre, ages, dattes, inkko ));
       
        
        
   
         
         
         
		s.afficherSalaires();
		System.out.println("Le salaire moyen dans l'entreprise est de "
				+ s.salaireMoyen() + " francs.");

    }
    
}
