public class Rectangle {
    public void art() {
        for (Integer i = 0; i < 4; i++) {

            if (i >= 1 && i <= 2) {
                for (Integer j = 0; j < 5; j++) {
                    if (j >= 1 && j <= 3) {
                        System.out.print(" ");
                    } else {
                        System.out.print("*");
                    }
                }
            } else {
                for (Integer j = 0; j < 5; j++) {
                    System.out.print("*");
                }
            }
            System.out.println("");
        }
    }
}
