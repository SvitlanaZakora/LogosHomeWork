package Dz2;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("BMV",2.8,new Kermo("rubber",50),new Koleso(85,"Black"),new Kusov(900,"iron","square"));
        Car car2 = new Car("Toyota",1.6,new Kermo("skin",60),new Koleso(100,"brown"),new Kusov(500,"alum","rectangle"));
        System.out.println(car);
        car.run();
        car.goLeft();
        car.goRight();
        car.End();
        car.refactorCar();
        car.run();
        System.out.println(car2);
        car2.run();
        car2.goLeft();
        car2.goRight();
        car2.End();
        car2.refactorCar();
        car2.run();





    }
}
