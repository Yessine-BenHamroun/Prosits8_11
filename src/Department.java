import java.util.Objects;

public class Department {
    private int ID;
    private String name;
    private int nbr_emp;

    public Department(){}
    public Department(int ID,String name,int nbr_emp)
    {
        this.ID=ID;
        this.name=name;
        this.nbr_emp=nbr_emp;
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public int getNbr_emp() {
        return nbr_emp;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNbr_emp(int nbr_emp) {
        this.nbr_emp = nbr_emp;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Department dept = (Department) obj;

        // Comparaison en chaîne : ID et nom
        return Objects.equals(ID, dept.ID) && Objects.equals(name, dept.name);
    }

    @Override
    public String toString() {
        return ("\nID: " + ID +
                "\nName: " + name +
                "\nNombre des employees: " + nbr_emp);
    }

}
