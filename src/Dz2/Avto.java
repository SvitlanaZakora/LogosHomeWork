package Dz2;

public class Avto {
    private int countHorsePower;
    private int promYear;

    public Avto(int countHorsePower, int promYear) {
        this.countHorsePower = countHorsePower;
        this.promYear = promYear;
    }

    public void setPromYear(int promYear) {
        this.promYear = promYear;
    }

    @Override
    public String toString() {
        return "Avto{" +
                "countHorsePower=" + countHorsePower +
                ", promYear=" + promYear +
                '}';
    }
}
