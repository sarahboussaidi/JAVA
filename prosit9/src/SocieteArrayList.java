import java.util.*;

public class SocieteArrayList implements IGestion<Employe> {

    private ArrayList<Employe> employes = new ArrayList<>();

    @Override
    public void ajouterEmploye(Employe e) {
        employes.add(e);
    }

    @Override
    public boolean rechercherEmploye(String nom) {
        for (Employe e : employes) {
            if (e.getNom().equalsIgnoreCase(nom)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean rechercherEmploye(Employe emp) {
        return employes.contains(emp);
    }

    @Override
    public void supprimerEmploye(Employe e) {
        employes.remove(e);
    }

    @Override
    public void displayEmploye() {
        for (Employe e : employes) {
            System.out.println(e);
        }
    }

    @Override
    public void trierEmployeParId() {
        Collections.sort(employes);
    }

    @Override
    public void trierEmployeParNomDepartementEtGrade() {
        Collections.sort(employes, new Comparator<Employe>() {
            @Override
            public int compare(Employe e1, Employe e2) {

                int dep = e1.getNomDepartement().compareTo(e2.getNomDepartement());
                if (dep != 0) return dep;

                int grade = e1.getGrade() - e2.getGrade();
                if (grade != 0) return grade;

                return e1.getNom().compareTo(e2.getNom());
            }
        });
    }
}