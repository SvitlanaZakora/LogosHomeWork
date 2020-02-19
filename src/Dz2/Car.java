package Dz2;

public class Car {
    private String model;
    private double year;
    private Kermo kermo;
    private Koleso koleso;
    private Kusov kusov;

    public void run(){
        System.out.println("Go");
    }

    public void goLeft(){
        kermo.turnLeft();
    }
    public void goRight(){
        kermo.turnRight();
    }
    public void End(){
        System.out.println("Stop car");
    }
    public void refactorCar(){
        System.out.println("Новий об'єм кузова: "+ kusov.twiceVolume() + "\n" + "Новий розмір керма: " + kermo.getDiameter() + "\n" + "Новий розмір колес: " + koleso.sizeKoleso());

    }

    public Car(String model, double year, Kermo kermo, Koleso koleso, Kusov kusov) {
        this.model = model;
        this.year = year;
        this.kermo = kermo;
        this.koleso = koleso;
        this.kusov = kusov;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", year=" + year +
                ", " + kermo +
                ", " + koleso +
                ", " + kusov +
                '}';
    }
}
