package Dz3;

public class Main {
    public static void main(String[] args) {
        Animals animal1 = new Animals("Леопард",60.6,12);
        System.out.println("Назва тварини = " + animal1.getName() + "   " + "Швидкість тварини = " + animal1.getSpeed() + "   " + "Вік тварини = " + animal1.getAge());
        System.out.println("-----------------------------------------------------------------------------");
        animal1.setName("Бик");
        animal1.setSpeed(30.2);
        animal1.setAge(6);
        System.out.println("Назва тварини = " + animal1.getName() + "   " + "Швидкість тварини = " + animal1.getSpeed() + "   " + "Вік тварини = " + animal1.getAge());



    }
}
