public class Car {
    private String merk;
    private int whell;
    private String color;

    public Car(String merk, int whell, String color) {
        this.merk = merk;
        this.whell = whell;
        this.color = color;
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public int getWhell() {
        return whell;
    }

    public void setWhell(int whell) {
        this.whell = whell;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
