package week2;

public class Lumbung {
    int persediaan = 100; // 100 kg
    int diambil;
    String jenis;

    Lumbung(int diambil, String jenis) {
        this.diambil = diambil;
        this.jenis = jenis;
    }

    public void totalPersediaan() {
        System.out.println("Total persediaan: " + hitungPersediaan());
    }

    public int hitungPersediaan() {
        return this.persediaan - this.diambil;
    }

    public String jenisLumbung() {
        return this.jenis;
    }

}
