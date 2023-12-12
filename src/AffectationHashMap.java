import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class AffectationHashMap {
    private HashMap<Employe, Department> affectation;

    public AffectationHashMap() {
        affectation = new HashMap<>();
    }

    public void ajouterEmployeDepartement(Employe employe, Department departement) {
        affectation.put(employe, departement);
    }
    public void afficherEmployeEtDepartements() {
        for (Map.Entry<Employe, Department> entry : affectation.entrySet()) {
            Employe employe = entry.getKey();
            Department departement = entry.getValue();
            System.out.println(employe.getNom() + " - " + departement.getName());
        }
    }
    
    public void supprimerEmploye(Employe employe) {
        Iterator<Map.Entry<Employe, Department>> iterator = affectation.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Employe, Department> entry = iterator.next();
            if (entry.getKey().equals(employe)) {
                iterator.remove();
                System.out.println("Employé supprimé avec succès.");
                return;
            }
        }

        System.out.println("L'employé n'a pas été trouvé dans la collection.");
    }

    public void supprimerEmployeEtDepartement(Employe employe, Department departement) {
        Iterator<Map.Entry<Employe, Department>> iterator = affectation.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Employe, Department> entry = iterator.next();
            if (entry.getKey().equals(employe) && entry.getValue().equals(departement)) {
                iterator.remove();
                System.out.println("Employé supprimé du département avec succès.");
                return;
            }
        }

        System.out.println("L'association Employé - Département n'a pas été trouvée dans la collection.");
    }

    public void afficherEmployes() {
        Set<Employe> employes = new HashSet<>(affectation.keySet());

        System.out.println("Liste des employés :");
        for (Employe employe : employes) {
            System.out.println(employe.getNom());
        }
    }

    public void afficherDepartements() {
        Set<Department> departements = new HashSet<>(affectation.values());

        System.out.println("Liste des départements :");
        for (Department departement : departements) {
            System.out.println(departement.getName());
        }
    }

    public boolean rechercherEmploye(Employe employe) {
        return affectation.containsKey(employe);
    }

    public boolean rechercherDepartement(Department departement) {
        return affectation.containsValue(departement);
    }

    public TreeMap<Employe, Department> trierMap() {
        TreeMap<Employe, Department> sortedMap = new TreeMap<>(new Comparator<Employe>() {
            @Override
            public int compare(Employe emp1, Employe emp2) {
                Integer id1 = emp1.getID();
                Integer id2 = emp2.getID();
                return id1.compareTo(id2);
            }
        });

        sortedMap.putAll(affectation);

        return sortedMap;
    }
}