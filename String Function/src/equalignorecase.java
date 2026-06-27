import java.util.Scanner;

public class equalignorecase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukan tujuan bank : ");
        String result = sc.nextLine();
        int jumlah = 50000;

        if (!result.equalsIgnoreCase("BNI")){
            System.out.println("Dipotong Biaya admin Rp.2500");
            jumlah -= 2500;
            System.out.println("Berhasil di transfer ke bank sebanyak : Rp." + jumlah);
        }
        System.out.println("Berhasil di transfer ke bank sebanyak : Rp." + jumlah);
        sc.close();
    }
}
