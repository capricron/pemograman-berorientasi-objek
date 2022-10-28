package week2;

public class ModalDagang {
    int modalAwal = 1000;
    int penjualan = 3000;

    public int hitungKeuntungan() {
        return this.penjualan - this.modalAwal;
    }

    public void totalKeuntungan() {
        System.out.println("Keuntungan: " + this.hitungKeuntungan());
    }
}
