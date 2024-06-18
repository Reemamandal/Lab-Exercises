package day15_18th_june;

//Abstract class Shape
abstract class Shape {
 // Abstract method to calculate area (to be implemented by subclasses)
 public abstract double calculateArea();
 
 // Concrete method to display shape information
 public void display() {
     System.out.println("Displaying shape");
 }
}

//Concrete subclass Circle extending Shape
class Circle extends Shape {
 private double radius;
 
 // Constructor
 public Circle(double radius) {
     this.radius = radius;
 }
 
 // Implementing abstract method to calculate area for Circle
 @Override
 public double calculateArea() {
     return Math.PI * radius * radius;
 }
 
 // Getter method for radius (optional)
 public double getRadius() {
     return radius;
 }
}

//Concrete subclass Rectangle extending Shape
class Rectangle extends Shape {
 private double length;
 private double width;
 
 // Constructor
 public Rectangle(double length, double width) {
     this.length = length;
     this.width = width;
 }
 
 // Implementing abstract method to calculate area for Rectangle
 @Override
 public double calculateArea() {
     return length * width;
 }
 
 // Getter methods for length and width (optional)
 public double getLength() {
     return length;
 }
 
 public double getWidth() {
     return width;
 }
}

public class Main1 {
	 public static void main(String[] args) {
	        // Create instances of Circle and Rectangle
	        Circle circle = new Circle(5.0);
	        Rectangle rectangle = new Rectangle(4.0, 6.0);
	        
	        // Demonstrate polymorphic behavior
	        Shape shape1 = circle; // Upcasting
	        Shape shape2 = rectangle; // Upcasting
	        
	        // Calling methods and displaying areas
	        shape1.display();
	        System.out.println("Area of circle: " + shape1.calculateArea());
	        System.out.println("Radius of circle: " + ((Circle) shape1).getRadius()); // Downcasting
	        System.out.println();
	        
	        shape2.display();
	        System.out.println("Area of rectangle: " + shape2.calculateArea());
	        System.out.println("Length of rectangle: " + ((Rectangle) shape2).getLength()); // Downcasting
	        System.out.println("Width of rectangle: " + ((Rectangle) shape2).getWidth()); // Downcasting
	    }

}
