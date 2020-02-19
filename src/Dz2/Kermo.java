package Dz2;

public class Kermo {
    private String material;
    private int diameter;


    public void turnLeft(){
        System.out.println("Turn left");
    }
    public void turnRight(){
        System.out.println("Turn right");
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getDiameter() {
        return diameter+=10;
    }

    public void setDiameter() {
        this.diameter=diameter;
    }

    public Kermo(String material, int diameter) {
        this.material = material;
        this.diameter = diameter;
    }

    @Override
    public String toString() {
        return "Kermo{" +
                "material='" + material + '\'' +
                ", diameter='" + diameter + '\'' +
                '}';
    }
}
