public class Professor extends Person {




    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.setName("Rob Hutson");
        Professor secondProfessor = new Professor();
        secondProfessor.setName("Brenton Hutson");

        System.out.println(professor.getName());
    }
}
