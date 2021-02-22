/*
	Create a class Shape which consist of one final method and area().Create 3 classess Rectangle, Triangle, Circle and calculate area of it.
*/



// Shape Abstract Class

package com.company;

public abstract class Shape {
    abstract void area();
    final void display()
    {
    }
}

// Rectangle Class

package com.company;

public class Rectangle extends Shape{
    private int length;
    private int breadth;
    // Constructors
    public Rectangle()
    {
        this.length = 0;
        this.breadth = 0;
    }
    public Rectangle(int length, int breadth)
    {
        this.length = length;
        this.breadth = breadth;
    }
    // Overridden Method
    public void area()
    {
        int area = this.length * this.breadth;
        System.out.println("Area of Rectangle:"+area);
    }
}

// Triangle Class

package com.company;

public class Triangle extends Shape{
    private int base;
    private int height;
    // Constructors
    public Triangle()
    {
        this.base = 0;
        this.height = 0;
    }
    public Triangle(int base, int height)
    {
        this.base = base;
        this.height = height;
    }
    // Overridden Method
    public void area()
    {
        double area = this.base * this.height * 0.5;
        System.out.println("Area of Triangle:"+area);
    }
}

// Circle Class

package com.company;

public class Circle extends Shape{
    private int radius;
    private double piValue;
    // Constructors
    public Circle()
    {
        this.radius = 0;
        this.piValue = Math.PI;
    }
    public Circle(int radius)
    {
        this.radius = radius;
        this.piValue = Math.PI;
    }
    // Overridden Method
    public void area()
    {
        double area = this.piValue * Math.pow(this.radius,2);
        System.out.println("Area of Circle:"+area);
    }
}

// Main Class
package com.company;

import java.util.Scanner;

public class Area_Of_Shapes_Abstract {

    public static void main(String[] args) {
        // Menu Driven Code
        int ch;
        Scanner sc = new Scanner(System.in);
        while(true)
        {
            System.out.println("--------------------------");
            System.out.println("Menu - Area Calculator");
            System.out.println("1. Area of Rectangle");
            System.out.println("2. Area of Circle");
            System.out.println("3. Area of Triangle");
            System.out.println("4. Exit");
            System.out.println("Enter the Choice");
            ch = Integer.parseInt(sc.nextLine());
            switch(ch)
            {
                case 1:
                {
                    int length,breadth;
                    System.out.println("Enter the Length");
                    length = Integer.parseInt(sc.nextLine());
                    System.out.println("Enter the Breadth");
                    breadth = Integer.parseInt(sc.nextLine());
                    // Object Creation
                    Rectangle obj = new Rectangle(length,breadth);
                    obj.area();
                    break;
                }
                case 2:
                {
                    int radius;
                    System.out.println("Enter the Radius");
                    radius = Integer.parseInt(sc.nextLine());
                    // Object Creation
                    Circle obj = new Circle(radius);
                    obj.area();
                    break;
                }
                case 3:
                {
                    int base,height;
                    System.out.println("Enter the Base");
                    base = Integer.parseInt(sc.nextLine());
                    System.out.println("Enter the Height");
                    height = Integer.parseInt(sc.nextLine());
                    // Object Creation
                    Triangle obj = new Triangle(base,height);
                    obj.area();
                    break;
                }
                case 4:
                {
                    System.exit(0);
                    break;
                }
                default:
                {
                    System.out.println("Invalid Option Try Again!!!");
                }

            }
        }
    }
}
