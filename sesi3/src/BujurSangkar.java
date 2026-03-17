public class BujurSangkar extends BangunDatar {
    private float sisi;

    public BujurSangkar(float sisi) {
        this.sisi = sisi;
    }

    public float luas() {
        return sisi * sisi;
    }

    public float keliling() {
        return 4 * sisi;
    }
}
