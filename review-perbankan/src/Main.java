import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Rekening> daftarRekening = new ArrayList<>();

        Tabungan t1 = new Tabungan("Andi", "821849821", 100000, 5);
        Giro g1 = new Giro("Budi", "782148721", 500000, 200000);
        Deposito d1 = new Deposito("Citra", "216487164", 500000, 12, 7);

        daftarRekening.add(t1);
        daftarRekening.add(g1);
        daftarRekening.add(d1);

        System.out.println("--- Simulasi Transaksi ---");
        t1.setor(500000, true);
        t1.hitungBunga(6);    
        
        g1.tarik(600000);      
        
        d1.tarik(100000);      

        System.out.println("\n--- Daftar Semua Rekening ---");
        Rekening tertinggi = daftarRekening.get(0);
        Rekening terendah = daftarRekening.get(0);

        for (Rekening r : daftarRekening) {
            r.tampilkanInfo();
            System.out.println("-------------------------");
            
            if (r.saldo > tertinggi.saldo) tertinggi = r;
            if (r.saldo < terendah.saldo) terendah = r;
        }

        // Statistik Saldo
        System.out.println("Saldo Tertinggi: " + tertinggi.namaPemilik + " (Rp" + tertinggi.saldo + ")");
        System.out.println("Saldo Terendah: " + terendah.namaPemilik + " (Rp" + terendah.saldo + ")");
    }
}