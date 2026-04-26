public class Tabungan extends Rekening {
    double bungaTahunan;

    public Tabungan(String nama, String nomerRekening, double saldo, double bunga) {
        super(nama, nomerRekening, saldo);
        this.bungaTahunan = bunga / 100;
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Bunga Tahunan: " + bungaTahunan * 100 + "%");
    }

    public void hitungBunga(int bulan) {
        double bunga = (bungaTahunan / 12) * saldo * bulan;
        System.out.println("Bunga: " + bunga);
    }
}