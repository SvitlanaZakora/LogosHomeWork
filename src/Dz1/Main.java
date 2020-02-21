package Dz1;

public class Main {
    public static void main(String[] args) {
        WorkerHour worker1=new WorkerHour();
        WorkerMounth worker2=new WorkerMounth();

        System.out.println("Перший працівник з погодинною зарплатою: ");
        worker1.zarplata();
        System.out.println("Другий працівник з місячною зарплатою: ");
        worker2.zarplata();


    }
}
