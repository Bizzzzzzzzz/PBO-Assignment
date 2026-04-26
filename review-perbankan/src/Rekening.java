public class Rekening {
    String namaPemilik;
    String nomorRekening;
    double saldo;

    public Rekening(String namaPemilik, String nomorRekening, double saldo) {
        this.namaPemilik = namaPemilik;
        this.nomorRekening = nomorRekening;
        this.saldo = saldo;
    }

    // Overloading //
    public void setor(double jumlah) {
        saldo += jumlah;
        System.out.println("Setor tunai berhasil: Rp" + jumlah);
    }

    public void setor(double jumlah, boolean transfer) {
        double biayaAdmin = 2500;
        if (transfer) {
            saldo += (jumlah - biayaAdmin);
            System.out.println("Transfer masuk berhasil: Rp" + jumlah + " (Dipotong admin Rp2.500)");
        } else {
            setor(jumlah);
        }
    }
    //

    // Method //
    public void tarik(double jumlah) {
        if (jumlah <= saldo) {
            saldo -= jumlah;
            System.out.println("Penarikan berhasil: Rp" + jumlah);
        } else {
            System.out.println("Saldo tidak mencukupi!");
        }
    }

    public void tampilkanInfo() {
        System.out.println("Pemilik: " + namaPemilik);
        System.out.println("No Rekening: " + nomorRekening);
        System.out.println("Saldo: Rp" + saldo);
    }
    //
}