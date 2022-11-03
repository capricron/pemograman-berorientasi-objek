package kelipatan;

import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan angka: ");
        Integer input = sc.nextInt();

        for (int i = 1; i <= 12; i++) {
            System.out.println(input + " x " + i + " = " + (input * i));
        }
        sc.close();
    }
}
