public class App {
    public static void main(String[] args) throws Exception {
        Mobil m1 = new Mobil("Toyota", 2001, 250000, "Pertamanx", 4);
        m1.tampilkanInfo();
        m1.setHargaSewaPerHari(-50000);
        m1.tampilkanInfo();
        m1.setJenisBahanBakar("Pertal");
        m1.tampilkanInfo();
    }
}
