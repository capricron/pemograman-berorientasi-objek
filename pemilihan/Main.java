
// import scanner
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("masukan nilai anda");
            double nilai = input.nextDouble();
            tentukanhurufmutu nilaiakhir = new tentukanhurufmutu(nilai);
            System.out.println(nilaiakhir.hurufmutu());
        } catch (Exception e) {
            System.out.println("masukan nilai yang benar");
        }
    }
}
