import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.TreeSet;

public class DepartmentHashSet implements IDepartment<Department>{

    private HashSet<Department> HSDepartment;
    public DepartmentHashSet() {
        this.HSDepartment=new HashSet<>();
    }

    @Override
    public void ajouterDepartment(Department dept) {
        HSDepartment.add(dept);
    }

    @Override
    public boolean rechercherDepartment(String nom) {
        for(Department dept:HSDepartment){
            if(dept.getName().equals(nom))
                return true;
        }
        return false;
    }

    @Override
    public boolean rechercherDepartment(Department dept) {

        return HSDepartment.contains(dept);
    }

    @Override
    public void supprimerDepartment(Department dept) {
        HSDepartment.remove(dept);
    }

    @Override
    public void displayDepartment() {
        System.out.println("Liste des départements: \n");
        for (Department dept:HSDepartment)
        {
            String ch=dept.toString();
            System.out.println(ch);
        }
    }

    @Override
    public TreeSet<Department> trierDepartmentByID() {
        TreeSet<Department> treeSet = new TreeSet<>(HSDepartment);
        return treeSet; //cela permet de retourner les valeurs triés
    }
}
