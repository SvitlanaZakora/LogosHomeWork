public class Circle {
    private double radius;
    private double diameter;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    public Circle(double radius) {
        this.radius = radius;
        this.diameter = radius*2;
    }
    public double square(){
        return Math.PI* Math.pow(this.radius,2);
    }
    public double length(){
        return Math.PI*this.diameter;
    }
}
