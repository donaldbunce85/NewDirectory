public class GitTestingClass {


    public static void main(String[] args) {
        String newMessage = "Hello, I've added something new here";
        System.out.println(newMessage);
        happyHour(5); 
    }

    public static boolean happyHour(int hour) {
        if (hour > 6 || hour < 2) {
            System.out.println("Not happy hour.");
            return false;
        } else {
            System.out.println("Yesssss, it's happy hour!!");
            return true;
        }
    }
}
