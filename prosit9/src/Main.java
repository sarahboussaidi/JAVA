//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        SocieteArrayList s = new SocieteArrayList();

        Employe e1 = new Employe(1, "boussaidi", "sarra", "IT", 12);
        Employe e2 = new Employe(2, "charfi", "dina", "RH", 10);
        Employe e3 = new Employe(1, "gharbi", "ghofrane", "IT", 20);

        s.ajouterEmploye(e1);
        s.ajouterEmploye(e2);

        System.out.println("Recherche e3 (même id et nom que e1) : " + s.rechercherEmploye(e3));

        s.displayEmploye();

        s.trierEmployeParId();
        s.displayEmploye();
    }
}