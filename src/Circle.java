public class Circle {
    double radius;

    Circle(double radius){
        this.radius = radius;
    }
    public double calculateArea(){
        return Math.PI * Math.pow(this.radius, 2);
    }
}
