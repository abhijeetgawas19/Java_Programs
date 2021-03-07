/*
	Write a class Student with attributes name, age. Intialize values through parameterized constructor. If age of student is not in between 15 and 21 then generate user defined excpetion "Age Not 
*/

// Invalid Name Exception
package com.company;

public class InvalidName extends Exception {
    @Override
    public String toString() {
        return "Name is Incorrect";
    }
}
// Invalid Age Exception
package com.company;

public class InvalidAge extends Exception{
    @Override
    public String toString() {
        return "Age is Invalid";
    }
}

//Driver Class
package com.company;

import java.util.Scanner;

public class StudentAgeNameValidationException {
    private int age;
    private  String name;
    // Constructors
    public DriverClass(int age, String name)
    {
        try
        {
            if(age<15 || age>21)
            {
                throw new InvalidAge();
            }
            String nameReplace = name.replaceAll(" ","");
            int length = nameReplace.length();
            int i;
            char grab;
            for(i=0;i<length;i++)
            {
                grab = nameReplace.charAt(i);
                if((grab>=65 && grab<=90)||(grab>=97 && grab<=122))
                {
                    // Nothing
                }
                else
                {
                    throw new InvalidName();
                }
            }
            // All Test are Passed
            this.age = age;
            this.name = name;
            this.display();
        }
        catch(InvalidName e)
        {
            System.out.println(e);
        }
        catch(InvalidAge e)
        {
            System.out.println(e);
        }
    }
    void display()
    {
        System.out.println("Name: "+this.name);
        System.out.println("Age: "+this.age);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name;
        int age;
        System.out.println("Enter the Name");
        name = sc.nextLine();
        System.out.println("Enter the Age");
        age = Integer.parseInt(sc.nextLine());
        DriverClass obj = new DriverClass(age,name);
        //obj.display();
    }
}
