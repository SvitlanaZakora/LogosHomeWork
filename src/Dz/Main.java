package Dz;

public class Main {
    public static void main(String[] args) {
        Robot coffeRobot = new CoffeRobot();
        Robot robotDancer = new RobotDancer();
        Robot robotCooker = new RobotCooker();

        Robot arr[] = new Robot[3];
        arr[0]= coffeRobot;
        arr[1]= robotDancer;
        arr[2]= robotCooker;

        for(int i=0; i<=2; i++ ){
            arr[i].work();

            }
        }
    }

