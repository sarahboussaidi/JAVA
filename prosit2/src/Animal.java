public class Animal {
    String family;
    String name;
    int age ;
    boolean isMammal;
    void setAge(int age) {
        if (age < 0) {
            System.out.println("Invalid age");
            return;
        }
        this.age = age;
    }
    void setName(String name) {
        if (name.isBlank()) {
            System.out.println("Invalid name");
            return;
        }
        this.name = name;
    }
    Animal(String family, String name, int age, boolean isMammal) {
        this.family = family;
        this.name = name;
        this.age = age;
        this.isMammal = isMammal;
    }

    public Animal() {

    }
}
