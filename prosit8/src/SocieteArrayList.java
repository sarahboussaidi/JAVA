import java.util.*;

public class SocieteArrayList implements IGestion<Employe>, IRechercheAvancee<Employe> {

    private ArrayList<Employe> employes = new ArrayList<>();

    // Ajouter
    @Override
    public void ajouterEmploye(Employe e) {
        employes.add(e);
    }

    // Recherche par nom
    @Override
    public boolean rechercherEmploye(String nom) {
        for (Employe e : employes) {
            if (e.getNom().equalsIgnoreCase(nom)) {
                return true;
            }
        }
        return false;
    }

    // Recherche par objet
    @Override
    public boolean rechercherEmploye(Employe emp) {
        return employes.contains(emp);
    }

    // Supprimer
    @Override
    public void supprimerEmploye(Employe e) {
        employes.remove(e);
    }

    // Affichage
    @Override
    public void displayEmploye() {
        for (Employe e : employes) {
            System.out.println(e);
        }
    }

    // Tri naturel (id)
    @Override
    public void trierEmployeParId() {
        Collections.sort(employes);
    }

    // Tri personnalisé (département → grade → nom)
    @Override
    public void trierEmployeParNomDepartementEtGrade() {
        Collections.sort(employes, new Comparator<Employe>() {
            @Override
            public int compare(Employe e1, Employe e2) {
                int depCompare = e1.getNomDepartement().compareTo(e2.getNomDepartement());
                if (depCompare != 0) return depCompare;

                int gradeCompare = e1.getGrade() - e2.getGrade();
                if (gradeCompare != 0) return gradeCompare;

                return e1.getNom().compareTo(e2.getNom());
            }
        });
    }

    // Recherche avancée par département
    @Override
    public List<Employe> rechercherParDepartement(String nomDepartement) {
        List<Employe> result = new ArrayList<>();
        for (Employe e : employes) {
            if (e.getNomDepartement().equalsIgnoreCase(nomDepartement)) {
                result.add(e);
            }
        }
        return result;
    }
}