public class Animal {

    String family;
    String name;
    int age;
    boolean isMammal;

    public Animal () {

    }

    public Animal (String f,String n,int age,boolean ism) {

        this.family=f;
        this.name=n;
        this.age=age;
        this.isMammal=ism;

    }

    @Override
    public String toString(){
        return "Animal {" + "name = " + name + ", " + "family = " + family + ", "+ "age = " + age + ", " + "is mammal = " +isMammal + "}";

    }

}
