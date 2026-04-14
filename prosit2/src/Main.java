//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Animal lion = new Animal();
        Zoo myZoo = new Zoo("belvedere", "tunis", 29);
        Animal katous= new Animal("fam","mimi", 25, true);
        myZoo.displayZoo();
        System.out.println(myZoo);
    }
}