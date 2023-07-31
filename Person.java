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
}
