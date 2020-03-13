import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ZooClub zooClub = new ZooClub();
        Scanner sc = new Scanner(System.in);
        System.out.println(" 1 - Додати учасника клубу\n" +
                " 2 - Додати тваринку до учасника клубу\n" +
                " 3 - Видалити тваринку з учасника клубу\n" +
                " 4 - Видалити учасника з клубу\n" +
                " 5 - Видалити конкретну тваринку зі всіх власників\n" +
                " 6 - Вивести на екран зооклуб\n" +
                " 7 - Вийти з програми\n");

        int num = 0;
        while (num != 7) {
            System.out.println("Chose number : ");
            num = sc.nextInt();
            switch (num) {
                case 1: {
                    System.out.println("Name: ");
                    String enterPersonName = sc.next();
                    System.out.println("Age: ");
                    int enterPersonAge = sc.nextInt();
                    zooClub.addPerson(enterPersonName, enterPersonAge);
                    System.out.println("Entered successfully");
                    break;
                }
                case 2: {
                    System.out.println("Person name: ");
                    String enterPersonName = sc.next();
                    System.out.println("Enter animal name: ");
                    String enterAnimalName = sc.next();
                    System.out.println("Enter animal type: ");
                    String enterType = sc.next();
                    zooClub.addAnimal(enterPersonName, enterAnimalName, enterType);
                    System.out.println("Entered successfully");
                    break;
                }
                case 3: {
                    System.out.println("Person name: ");
                    String enterPersonName = sc.next();
                    System.out.println("Enter animal name: ");
                    String enterAnimalName = sc.next();
                    System.out.println("Enter animal type: ");
                    String enterType = sc.next();
                    zooClub.removeAnimal(enterPersonName, enterAnimalName, enterType);
                    System.out.println("Removed successfully");
                    break;
                }
                case 4: {
                    System.out.println("Name: ");
                    String enterPersonName = sc.next();
                    zooClub.removePerson(enterPersonName);
                    System.out.println("Removed successfully");
                    break;
                }
                case 5: {
                    System.out.println("Enter animal name: ");
                    String enterAnimalName = sc.next();
                    zooClub.removeAllAnimals(enterAnimalName);
                    System.out.println("Removed successfully");
                    break;
                }
                case 6: {
                    System.out.println(zooClub);
                    break;
                }
            }
        }
    }
}
