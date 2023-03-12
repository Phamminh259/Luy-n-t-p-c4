class Shape{
    String color;
    boolean filled;
    Shape(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }
    public String toString(){
        return "("+this.color+","+this.filled+")";
    }
}
class Circle extends Shape{
    double radius;
    Circle(String color, boolean filled){
        super(color, filled);
    }
    Circle(String color, boolean filled, double radius){
        super(color,filled);
        this.radius = radius;
    }
    public double getarea(){
        double area = this.radius*this.radius*3.14;
        return area;
    }
    public double getperimeter(){
        double perimeter = 2*3.14*this.radius;
        return perimeter;
    }
    public String toString(){
        return "("+this.color+","+this.filled+","+this.radius+")";
    }
}
class Rectangle extends Shape{
    double width;
    double length;
    Rectangle(String color, boolean filled){
        super(color, filled);
    }
    Rectangle(String color, boolean filled, double width, double length){
        super(color, filled);
        this.width = width;
        this.length = length;
    }
    public double getarea(){
        double area = this.width*this.length;
        return area;
    }
    public double getperimeter(){
        double perimeter = (this.width+this.length)*2;
        return perimeter;
    }
    public String toString(){
        return "("+this.color+","+this.filled+","+this.width+","+this.length+")";
    }
}
class Square extends Rectangle{
    double side;
    Square(String color, boolean filled, double width, double length){
        super(color, filled, width, length);
    }
    Square(String color, boolean filled, double width, double length, double side){
        super(color, filled, width, length);
        this.side = side;
    }
    public String toString(){
        return "("+this.color+","+this.filled+","+this.side+")";
    }
}
class main{
    public static void main(String[]args){
        Circle kq1 = new Circle("Red", true, 1.0);
        Rectangle kq2 = new Rectangle("Red", true, 1.0, 1.0);
        Square kq3 = new Square("Red", true, 1.0, 1.0, 1.0);
        System.out.println("Hinh tron" +kq1.toString());
        System.out.println("Dien tich: "+kq1.getarea());
        System.out.println("Chu vi: "+kq1.getperimeter());
        System.out.println("Hinh chu nhat" +kq2.toString());
        System.out.println("Dien tich: "+kq2.getarea());
        System.out.println("Chu vi: "+kq2.getperimeter());
        System.out.println("Hinh vuong" +kq3.toString());
    }
}