public class Deposito extends Rekening {
    int jangkaWaktuBulan;
    double sukuBunga;
    boolean sudahJatuhTempo = false;

    public Deposito(String nama, String nomerRekening, double saldo, int jangka, double bunga) {
        super(nama, nomerRekening, saldo);
        this.jangkaWaktuBulan = jangka;
        this.sukuBunga = bunga / 100;
    }

    public void hitungBunga() {
        double bunga = sukuBunga * saldo * jangkaWaktuBulan;
        System.out.println("Bunga Deposito (" + jangkaWaktuBulan + " bulan) cair: Rp" + bunga);
    }

    @Override
    public void tarik(double jumlah) {
        if (!sudahJatuhTempo) {
            double denda = 0.10 * saldo;
            saldo -= denda;
            System.out.println("Penarikan sebelum jatuh tempo! Denda 10%: Rp" + denda);
        }
        super.tarik(jumlah);
    }
}