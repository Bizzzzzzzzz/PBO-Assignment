import java.util.Scanner;

public class length {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean x = true;
        while (x) {
            System.out.println("Masukan Username : ");
            String result = sc.nextLine();
            int length = result.length();
            if (length > 24){
                System.out.println("username terlalu panjang, maks 24");
            }
            else{
                System.out.println("username terdaftar : " + result);
                x = false;
            }
        }
        sc.close();
    }
}
