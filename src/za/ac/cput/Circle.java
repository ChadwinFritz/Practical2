package za.ac.cput;

public class Circle {

    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double calDiameter() {
        return radius * 2;
    }

    public double Circumference() {
        return 2 * Math.PI * radius;
    }

    public double Area() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public String toString() {
        return "Circle radius = " + radius;
    }
    
    

}
