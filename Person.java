public class Person {

    String name;
    int age;
    int height;
    int weight;

//    Constructor

    public Person(int age) {
        this.age = age;
    }
    public Person() {
        this(28);
    }

//    Methods

    public void walking() {
        System.out.print("Walking somewhere...");
    }

    public void breathe() {
        System.out.println("Breathing");
    }

    public void takingShower() {
        System.out.println("Taking a shower now");
    }
}
