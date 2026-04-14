public class Main {
    public static void main(String[] args) {

        SocieteArrayList societe = new SocieteArrayList();

        Employe e1 = new Employe(3, "Ali", "Ahmed", "IT", 2);
        Employe e2 = new Employe(1, "Ben", "Sami", "RH", 1);
        Employe e3 = new Employe(2, "Zara", "Lina", "IT", 3);

        societe.ajouterEmploye(e1);
        societe.ajouterEmploye(e2);
        societe.ajouterEmploye(e3);

        societe.displayEmploye();

        // Tri par ID
        societe.trierEmployeParId();
        societe.displayEmploye();

        // Tri personnalisé
        societe.trierEmployeParNomDepartementEtGrade();
        System.out.println("\n=== Tri par Département, Grade, Nom ===");
        societe.displayEmploye();

        // Recherche
        System.out.println("\nRecherche 'Ali' : " + societe.rechercherEmploye("Ali"));

        // Recherche avancée
        System.out.println("\nEmployés du département IT :");
        for (Employe e : societe.rechercherParDepartement("IT")) {
            System.out.println(e);
        }
    }
}