public class Giro extends Rekening {
    double limitPenarikan;

    public Giro(String nama, String nomerRekening, double saldo, double limit) {
        super(nama, nomerRekening, saldo);
        this.limitPenarikan = limit;
    }

    @Override
    public void tarik(double jumlah) {
        if (jumlah <= (saldo + limitPenarikan)) {
            saldo -= jumlah;
            System.out.println("Penarikan berhasil: Rp" + jumlah);
        } else {
            System.out.println("Melebihi limit penarikan");
        }
    }
}