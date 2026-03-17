public class Segitiga extends BangunDatar {
    private float alas, tinggi;

    public Segitiga(float alas, float tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    public float luas() {
        return (alas * tinggi) / 2;
    }
    
    public float keliling() {
        return 3 * alas;
    }
}
