import java.util.Scanner;
public class ZooManagement {
    int nbrCages;
    String zooName;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ZooManagement firstZoo = new ZooManagement();

        System.out.println("Veuillez saisir le nom du zoo : ");
        firstZoo.zooName = sc.nextLine();
        while (firstZoo.zooName.isEmpty()) {
            System.out.println("Le nom ne peut pas etre vide ");
            firstZoo.zooName = sc.nextLine();
        }

        System.out.println("Veuillez saisir le nombre de cages : ");
        firstZoo.nbrCages = sc.nextInt();
        while (firstZoo.nbrCages < 0){
            System.out.println("Le nombre de cages doit etre positif");
            firstZoo.nbrCages = sc.nextInt();
        }


        System.out.println("Welcome to "+ firstZoo.zooName + ". We have " + firstZoo.nbrCages + " cages .");

        sc.close();

        Animal lion = new Animal();
        lion.name = "Simba";
        lion.family = "Felidae";
        lion.age=4;
        lion.isMammal= true;

        Zoo myZoo = new Zoo();
        myZoo.name ="myZoo";
        myZoo.city="Ariana";


        Animal chat = new Animal("Felidae","mimi",4,true);
        Zoo myZoo2 = new Zoo("myZoo2","Sfax",23);

        Animal eagle = new Animal("Birds","Sky",3,false);
        Animal elephant = new Animal("Mammals","Dumbo ",10,true);

        myZoo.displayZoo();
        myZoo2.displayZoo();

        System.out.println(myZoo) ;
        System.out.println(lion.toString()) ;
        System.out.println(eagle) ;

        for (int i=0 ; i<30 ; i++){
            Animal a = new Animal("family", "animal " + i, 2,true);
            boolean result = myZoo2.addAnimal(a);
            System.out.println("Adding animal "+i +":"+result);

        }

        myZoo2.displayAnimals();

        Zoo myZoo3 = new Zoo("myZoo3","Sfax",23);
        myZoo3.addAnimal(eagle);
        myZoo3.addAnimal(elephant);
        myZoo3.displayAnimals();
        System.out.println(myZoo3.searchAnimal(elephant));
        System.out.println(myZoo3.searchAnimal(eagle));

        Animal eagle2 = new Animal("Birds","Sky",3,false);
        System.out.println(myZoo3.searchAnimal(eagle2));

        myZoo3.removeAnimal(eagle);
        myZoo3.displayAnimals();


        System.out.println("Zoo2 full ? " + myZoo2.isZooFull());
        System.out.println("Zoo3 full ? " + myZoo3.isZooFull());

        Zoo bigger = Zoo.comparerZoo(myZoo2, myZoo3);

        System.out.println("Zoo with more animals: " + bigger.name);
    }
}
