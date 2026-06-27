public class trim {
    public static void main(String[] args) {
        String email = "                  example@gmail.com";

        email = email.trim();

        boolean isValidEmail = email.contains("@");
        if (isValidEmail) {
            System.out.println("email valid");
        }
        else{
            System.out.println("Email tidak valid");
        }
    }
}
