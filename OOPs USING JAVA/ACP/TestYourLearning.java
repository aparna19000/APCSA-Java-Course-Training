package ACP;

class Shape
{
    // Method Overloading
    void area(int side)
    {
        System.out.println("Area of Square = " + (side * side));
    }

    void area(int length, int breadth)
    {
        System.out.println("Area of Rectangle = " + (length * breadth));
    }

    // Method to be overridden
    void display()
    {
        System.out.println("This is Shape class");
    }
}

class Circle extends Shape
{
    // Method Overriding
    void display()
    {
        System.out.println("This is Circle class (Overridden method)");
    }
}

public class TestYourLearning
{
    public static void main(String[] args)
    {
        Shape obj = new Shape();

        // Method Overloading
        obj.area(5);
        obj.area(4,6);

        // Method Overriding
        Circle c = new Circle();
        c.display();
    }
}