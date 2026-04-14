public class Zoo {

    Animal [] animals;
    String name;
    String city;
    final int nbrCages;
    private static final int MAX_ANIMALS = 25;
    int animalCount = 0;

    public Zoo () {
        this.nbrCages = 20;
    }

    public Zoo (String n, String c,int nbr) {

        this.name=n;
        this.city=c;

        if (nbr>MAX_ANIMALS){
            this.nbrCages=MAX_ANIMALS;
        } else{
            this.nbrCages= nbr;
        }

        this.animals=new Animal[25];

    }

    public void displayZoo (){

        System.out.println("zoo name : " + name);
        System.out.println("city : " + city);
        System.out.println("number of cages : " + nbrCages);

    }

    @Override
    public String toString(){
        return "Zoo {" + "name = " + name + ", " + "city = " + city + ", "+ "Cages = " + nbrCages +"}";

    }

    public boolean addAnimal(Animal animal){
        if (animal == null){
            return false;
        }
        if (animalCount >= animals.length){
            return false;
        }
        for (int i=0;i<animalCount;i++){
            if (animals[i].name.equalsIgnoreCase(animal.name)){
                return false;
            }
        }

        animals[animalCount] = animal;
        animalCount++;
        return true;

    }

    public void displayAnimals(){

        if (animalCount == 0){
            System.out.println("No animals in the zoo");
            return;
        }
        for (int i=0 ; i<animalCount ; i++){
            System.out.println(animals[i]);
        }

    }

    public int searchAnimal (Animal animal){
        for (int i=0;i<animalCount;i++){
            if (animals[i].name.equals(animal.name)) {
                return i;
            }

        }
        return -1;

    }

    public boolean removeAnimal (Animal animal){
        int index = searchAnimal(animal);

        if (index == -1){
            return false;
        }

        for (int i=index; i<animalCount-1; i++){
            animals[i] = animals[i+1];
        }
        animals[animalCount-1] = null;
        animalCount--;

        return true;
    }

    public boolean isZooFull(){
        return animalCount>=nbrCages;
    }

    public static Zoo comparerZoo (Zoo z1, Zoo z2){
        if (z1.animalCount > z2.animalCount){
            return z1;

        }else {
            return z2;
        }
    }
}

