import java.util.TreeSet;

public interface IDepartment <T>{
    public void ajouterDepartment(T t);
    public boolean rechercherDepartment(String nom);
    public boolean rechercherDepartment(T t);
    public void supprimerDepartment(T t);
    public void displayDepartment();
    public TreeSet<T> trierDepartmentByID();
}
