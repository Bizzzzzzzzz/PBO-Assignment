public class contains {
    public static void main(String[] args) {
        String email = "example@gmail.com";
        boolean isValidEmail = email.contains("@");
        if (isValidEmail) {
            System.out.println("Email vaild");
        }
        else {
            System.out.println("Email tidak valid");
        }
    }
}
