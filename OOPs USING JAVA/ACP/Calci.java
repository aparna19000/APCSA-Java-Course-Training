package ACP;

class Calculator
{
    int a, b;

    void getNumbers(int x, int y)
    {
        a = x;
        b = y;
    }
}

class Addition extends Calculator
{
    void add()
    {
        System.out.println("Addition = " + (a + b));
    }
}

class Subtraction extends Calculator
{
    void subtract()
    {
        System.out.println("Subtraction = " + (a - b));
    }
}

class Multiplication extends Calculator
{
    void multiply()
    {
        System.out.println("Multiplication = " + (a * b));
    }
}

class Division extends Calculator
{
    void divide()
    {
        System.out.println("Division = " + (a / b));
    }
}

public class Calci
{
    public static void main(String[] args)
    {
        Addition obj1 = new Addition();
        obj1.getNumbers(20, 10);
        obj1.add();

        Subtraction obj2 = new Subtraction();
        obj2.getNumbers(20, 10);
        obj2.subtract();

        Multiplication obj3 = new Multiplication();
        obj3.getNumbers(20, 10);
        obj3.multiply();

        Division obj4 = new Division();
        obj4.getNumbers(20, 10);
        obj4.divide();
    }
}