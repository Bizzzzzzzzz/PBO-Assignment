public class Kendaraan {
    private String merk;
    private int tahunProduksi;
    private double hargaSewaPerHari;

    public Kendaraan(String merk, int tahunProduksi, double hargaSewaPerHari){
        this.merk = merk;
        this.tahunProduksi = tahunProduksi;
        this.hargaSewaPerHari = hargaSewaPerHari;
    }

    public void setMerk(String brand){
        merk = brand;
    }

    public void setTahunProduksi(int tahun){
        tahunProduksi = tahun;
    }

    public void setHargaSewaPerHari(double harga){
        if (harga <= 0) {
            hargaSewaPerHari = 100000;
            return;
        }
        hargaSewaPerHari = harga;
    }

    public String getMerk(){
        return merk;
    }

    public int getTahunProduksi(){
        return tahunProduksi;
    }

    public double getHargaSewaPerHari(){
        return hargaSewaPerHari;
    }

    public void tampilkanInfo(){
        System.out.println("Merk Mobil: " + getMerk());
        System.out.println("Tahun Produksi Mobil: " + getTahunProduksi());
        System.out.println("Harga Sewa Per Hari: " + getHargaSewaPerHari());
    }

}
