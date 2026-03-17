public class App {
    public static void main(String[] args) {

        BujurSangkar kotak = new BujurSangkar(5);
        PersegiPanjang persegiPanjang = new PersegiPanjang(6, 4);
        Segitiga segitiga = new Segitiga(8, 10);


        System.out.println("Kotak");
        System.out.println("Luas: " + kotak.luas());
        System.out.println("Keliling: " + kotak.keliling());

        System.out.println("\nPersegi Panjang");
        System.out.println("Luas: " + persegiPanjang.luas());
        System.out.println("Keliling: " + persegiPanjang.keliling());

        System.out.println("\nSegitiga");
        System.out.println("Luas: " + segitiga.luas());
        System.out.println("Keliling: " + segitiga.keliling());
    }
}