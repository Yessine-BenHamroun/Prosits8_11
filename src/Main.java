// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.ArrayList;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        ArrayList<Employe> listeEmployes;
        SocieteArrayList societe = new SocieteArrayList();

        Employe employe1 = new Employe( "Ben Hamroun","Yessine","Informatique",1);
        Employe employe2 = new Employe( "Chamakhi","Malek","RH",3);
        Employe employe3 = new Employe( "Hamila","Ahmed","Informatique",3);
        Employe employe4 = new Employe( "Miled","Yessine","Finance",2);

        societe.ajouterEmploye(employe1);
        societe.ajouterEmploye(employe2);
        societe.ajouterEmploye(employe3);
        societe.ajouterEmploye(employe4);

        societe.displayEmploye();

        System.out.println("Recherche de l'employé Chamakhi : " + societe.rechercherEmploye("Chamakhi"));

        societe.supprimerEmploye(employe1);
        System.out.println("Liste des employes apres supression:\n");
        societe.displayEmploye();

        // Tri par ID
        societe.trierEmployeParID();
        System.out.println("Liste des employés triée par ID :");
        societe.displayEmploye();

        // Tri par nom, département, et grade
        societe.trierEmployeParNomDepartementetGrade();
        System.out.println("Liste des employés triée par nom, département, et grade :");
        societe.displayEmploye();

        //Prosit 10:
        HashSet<Department> listeDepartments;
        DepartmentHashSet deptHS=new DepartmentHashSet();

        Department Informatique=new Department(1,"Informatique",2);
        Department RH=new Department(2,"RH",3);
        Department Finance=new Department(3,"Finance",3);

        deptHS.ajouterDepartment(Informatique);
        deptHS.ajouterDepartment(RH);
        deptHS.ajouterDepartment(Finance);

        deptHS.displayDepartment();

        System.out.println("Recherche du departement RH : " + deptHS.rechercherDepartment(RH));





    }
}
