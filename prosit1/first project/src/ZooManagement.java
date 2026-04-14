import java.util.Scanner;

public class ZooManagement {
    int nbrCages = 20;
    String zooName = "my zoo";

    public static void main(String[] args) {
        ZooManagement zoo = new ZooManagement();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Zoo name: "+ zoo.zooName +" | Number of cages: " +zoo.nbrCages);

        do {
            System.out.print("Enter zoo name: ");
            zoo.zooName = scanner.nextLine();
        } while (zoo.zooName.trim().isEmpty());
        do {
            System.out.print("Enter number of cages: ");
            zoo.nbrCages = scanner.nextInt();
        } while (zoo.nbrCages <= 0);

        System.out.println("Zoo name: "+ zoo.zooName +" | Number of cages: " +zoo.nbrCages);

        scanner.close();
    }
}
