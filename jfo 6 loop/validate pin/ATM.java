import java.util.Scanner;

public class ATM {

    private Integer pin = 1234;

    public void validatePin() {

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Masukkan PIN: ");
            Integer input = sc.nextInt();

            if (input.equals(pin)) {
                System.out.println("PIN benar");
                break;
            } else {
                System.out.println("PIN salah");
            }
        }

        sc.close();
    }

}
