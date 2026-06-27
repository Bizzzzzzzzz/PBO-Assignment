public class equal {

    public static void main(String[] args) {
        String result = "BNI";
        int jumlah = 50000;
        System.out.println("Bank yang dituju : " + result);

        if (!result.equals("BNI")){
            System.out.println("Dipotong Biaya admin Rp.2500");
            jumlah -= 2500;
            System.out.println("Berhasil di transfer ke bank sebanyak : Rp." + jumlah);
        }
        System.out.println("Berhasil di transfer ke bank sebanyak : Rp." + jumlah);
    }
}