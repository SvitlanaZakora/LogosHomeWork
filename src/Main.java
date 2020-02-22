public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        Rectangle r = new Rectangle(30, 28);
        Circle circle = new Circle(5);
        System.out.println("Площа прямокутника = " + rectangle.square());
        System.out.println("Периметр прямокутника = " + rectangle.perimeter());
        System.out.println("Площа прямокутника 2 = " + r.square());
        System.out.println("Периметр прямокутника 2 = " + r.perimeter());
        System.out.println("Площа кола = " + circle.square());
        System.out.println("Довжина кола = " + circle.length());
    }
}
