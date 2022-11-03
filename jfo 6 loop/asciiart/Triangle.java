public class Triangle {
    public void art() {
        int knn = 1;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < knn; j++) {
                if (knn == 3 || knn == 4) {
                    if (j == 0 || j == (knn - 1)) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                } else {
                    System.out.print("*");
                }
            }
            knn++;
            System.out.println("");
        }
    }
}
