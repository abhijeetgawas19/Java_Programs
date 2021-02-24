/*
	Question: Create abstract class Shape. Derive three classes sphere, cone, cylinder from it. Calculate area and volume of all. (Use Method Overriding)
*/

// Abstract Class Shape
package com.company;

public abstract class Shape {
    public abstract void area();
    public abstract void volume();
}

// Sphere Class

package com.company;

public class Sphere extends Shape{
    private int radius;
    private double piValue;
    // Constructors
    public Sphere()
    {
        this.radius = 0;
        this.piValue = Math.PI;
    }
    public Sphere(int radius)
    {
        this.radius = radius;
        this.piValue = Math.PI;
    }
    // Overridden Methods
    public void area()
    {
        double area = 4 * piValue * Math.pow(this.radius,2);
        System.out.println("Area of Sphere:"+area);
    }
    public void volume()
    {
        double volume = (4/3) * this.piValue * Math.pow(this.radius,3);
        System.out.println("Volume of Sphere:"+volume);
    }
}

// Cone Class

package com.company;

public class Cone extends Shape {
    private int radius;
    private int height;
    private double piValue;
    // Constructors
    public Cone()
    {
        this.radius = radius;
        this.height = height;
        this.piValue = Math.PI;
    }
    public Cone(int radius,int height)
    {
        this.radius = radius;
        this.height = height;
        this.piValue = Math.PI;
    }
    // Overridden Methods
    public void area()
    {
        double powerValue = Math.pow(this.height,2) + Math.pow(this.radius,2);
        double sqValue = Math.sqrt(powerValue);
        double area = this.piValue * this.radius * (this.radius + sqValue);
        System.out.println("Area of Cone:"+area);
    }
    public void volume()
    {
        double volume = this.piValue + Math.pow(this.radius,2) * (this.height/3);
        System.out.println("Volume of Cone"+volume);
    }
}

// Cylinder Class

package com.company;

public class Cylinder extends Shape{
    private int radius;
    private int height;
    private double piValue;
    // Constructor
    public Cylinder()
    {
        this.radius = 0;
        this.height = 0;
        this.piValue = Math.PI;
    }
    public Cylinder(int radius,int height)
    {
        this.radius = radius;
        this.height = height;
        this.piValue = Math.PI;
    }
    public void area()
    {
        double area = 2 * this.piValue * this.radius * (this.height + this.radius);
        System.out.println("Area of Cylinder:"+area);
    }
    public void volume()
    {
        double volume = this.piValue * Math.pow(this.radius,2) + this.height;
        System.out.println("Volume of Cylinder:"+volume);
    }
}


// Main Class
package com.company;

import java.util.Scanner;

public class AbstractShapeInheritence {

    public static void main(String[] args) {
        // Menu Driven Program
        int ch;
        Scanner sc = new Scanner(System.in);
        while(true)
        {
            System.out.println("-----------------------");
            System.out.println("1. Area and Volume of Sphere");
            System.out.println("2. Area and Volume of Cone");
            System.out.println("3. Area and Volume of Cylinder");
            System.out.println("4. Exit");
            System.out.println("Enter your choice");
            ch = Integer.parseInt(sc.nextLine());
            switch(ch)
            {
                case 1:
                {
                    int radius;
                    System.out.println("Enter the Radius");
                    radius = Integer.parseInt(sc.nextLine());
                    Sphere obj = new Sphere(radius);
                    obj.area();
                    obj.volume();
                    break;
                }
                case 2:
                {
                    int radius,height;
                    System.out.println("Enter the Radius");
                    radius = Integer.parseInt(sc.nextLine());
                    System.out.println("Enter the Height");
                    height = Integer.parseInt(sc.nextLine());
                    Cone obj = new Cone(radius,height);
                    obj.area();
                    obj.volume();
                    break;
                }
                case 3:
                {
                    int radius,height;
                    System.out.println("Enter the Radius");
                    radius = Integer.parseInt(sc.nextLine());
                    System.out.println("Enter the Height");
                    height = Integer.parseInt(sc.nextLine());
                    Cylinder obj = new Cylinder(radius,height);
                    obj.area();
                    obj.volume();
                    break;
                }
                case 4:
                {
                    System.exit(0);
                    break;
                }
                default:
                {
                    System.out.println("Invalid Choice");
                }
            }
        }
    }
}
