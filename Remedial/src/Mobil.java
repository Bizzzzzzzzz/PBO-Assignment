public class Mobil extends Kendaraan {
    private String jenisBahanBakar;
    private int jumlahPintu;

    public Mobil(String merk, int tahunProduksi, double hargaSewaPerHari, String jenisBahanBakar, int jumlahPintu){
        super(jenisBahanBakar, tahunProduksi, hargaSewaPerHari);
        this.jenisBahanBakar = jenisBahanBakar;
        this.jumlahPintu = jumlahPintu;
    }

    public void setJenisBahanBakar(String bahanBakar){
        jenisBahanBakar = bahanBakar;
    }

    public void jumlahPintu(int pintu){
        jumlahPintu = pintu;
    }

    public String getJenisBahanBakar(){
        return jenisBahanBakar;
    }

    public int getJumlahPintu(){
        return jumlahPintu;
    }

    @Override
    public void tampilkanInfo(){
        super.tampilkanInfo();
        System.out.println("Jenis Bahan Bakar: " + getJenisBahanBakar());
        System.out.println("Jumlah Pintu: "+getJumlahPintu());
    }
}
