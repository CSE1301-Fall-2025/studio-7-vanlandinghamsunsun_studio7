public class Rectangle {
    private double length;
    private double width;

    public Rectangle(double lengthInit, double widthInit) {
        length = lengthInit;
        width = widthInit;
    }

    public double area() {
        double area = length*width;
        return area;
    }

    public double perimeter() {
        return (2*length) + (2*width);
    }

    public boolean isSmaller(Rectangle r1, Rectangle r2) {
        if (r2.area() > r1.area()) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isSquare() {
        if (length == width) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(5,5);
        Rectangle r2 = new Rectangle(2,4);
        System.out.println(r1.area());
        System.out.println(r1.perimeter());
        System.out.println(r1.isSmaller(r1, r2));
        System.out.println(r1.isSquare());

    }
}

