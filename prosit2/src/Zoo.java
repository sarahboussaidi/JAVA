public class Zoo {
    Animal [] animals;
    String name ;
    String city;
    static final int nbrCages =25;
    int nbrAnimals ;
    Zoo(){
    }
    Zoo(String name, String city, int nbrCages){
        this.name = name;
        this.city = city ;
        this.nbrCages = nbrCages;
        animals = new Animal[this.nbrCages];
    }
    void displayZoo(){
        System.out.println("Zoo");
        System.out.println("Name: " + this.name+ " City: " + this.city + "N Cages: "+nbrCages);
    }
    @Override
    public String toString(){
        return "name: " + this.name + " city: " + this.city + "N Cages: "+nbrCages;
    }
    boolean addAnimal(Animal animal){
        if (isZooFull()) return false;
        if (searchAnimal(animal)!=-1){
            return false;
        }
        animals[nbrAnimals] = animal;
        nbrAnimals++;
        return true;
    }
    void displayAnimals(){
        for (Animal animal : animals){
            System.out.println(animal);
        }
    }
    int searchAnimal(Animal animal){
        int index = -1;
        for (int i = 0; i<this.nbrAnimals; i++){
            if (animals[i].name == animal.name){
                index = i;
            }
        }
        return index;
    }
    boolean removeAnimal(Animal animal){
        if (searchAnimal(animal)==-1){
            return false;
        }else {
            int index = searchAnimal(animal);
            for (int i =index; i<this.nbrAnimals; i++){
                animals[i] = animals[i+1];
            }
            nbrAnimals--;
            animals[nbrAnimals] = null;
            return true;

        }
    }

    boolean isZooFull(){
        return nbrAnimals == this.nbrCages;
    }

    Zoo compareZoo(Zoo z1, Zoo z2){
        if (z1.nbrAnimals==z2.nbrAnimals){
            return z1;
        }
        return z2;
    }
}
