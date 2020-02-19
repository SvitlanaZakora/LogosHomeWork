package Dz2;

public class Koleso {
    private int diameter;
    private String color;

    public int sizeKoleso(){
        return this.diameter+5;
    }

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Koleso(int diameter, String color) {
        this.diameter = diameter;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Koleso{" +
                "diameter=" + diameter +
                ", color='" + color + '\'' +
                '}';
    }
}
