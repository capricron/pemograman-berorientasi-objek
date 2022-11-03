import java.util.Scanner;

public class Menghitungtotalnilai {

    public static void main(String[] args) {
        double totalnilai;

        try (Scanner input = new Scanner(System.in)) {
            System.out.println("masukan nilai tubes anda");
            double nilaiTubes = input.nextDouble();
            System.out.println("masukan nilai tugas anda");
            double nilaiTugas = input.nextDouble();
            System.out.println("masukan nilai quiz anda");
            double nilaiQuiz = input.nextDouble();
            System.out.println("masukan nilai uts anda");
            double nilaiUts = input.nextDouble();
            System.out.println("masukan nilai uas anda");
            double nilaiUas = input.nextDouble();

            input.close();
            // membuat objek dari class Hitungnilai
            Hitungnilai objekhitung = new Hitungnilai();
            totalnilai = objekhitung.hitungtubes(nilaiTubes) + objekhitung.hitungtugas(nilaiTugas)
                    + objekhitung.hitungquiz(nilaiQuiz)
                    + objekhitung.hitungUTS(nilaiUts) + objekhitung.hitungUAS(nilaiUas);
        }
        System.out.println("Nilai Total adalah  " + totalnilai);

        // membuat objek dari class tentukanhurufmutu
        tentukanhurufmutu objekhr = new tentukanhurufmutu(totalnilai);

        System.out.println("Huruf Mutu " + objekhr.hurufmutu());

    }

}
