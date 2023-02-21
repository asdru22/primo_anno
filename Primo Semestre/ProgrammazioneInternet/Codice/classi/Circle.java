public class Circle {
    // dichiarazioni variabili
    private double radius;
    private double area;
    private double circumference;
    // Costruttore
    public Circle(double r){
        radius = r;
        area = Math.PI * radius * radius;
        circumference = 2.0 * Math.PI * radius;
    }
    // metodi della classe
    public double getArea(){
        return area;
    }
    public double getRadius(){
        return radius;
    }
    public double getCircumference(){
        return circumference;
    }
}