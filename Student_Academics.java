/*
	Write a Java program which creates class student 	(roll,name,subject1,subject2,subject3,subject4,subject5).
	Write a parameterized constructor and display the details of all students with
	class and percentage	

*/


package com.company;

public class Student_Academics {
    private int roll_no;
    private String name;
    private int subject1;
    private int subject2;
    private int subject3;
    private int subject4;
    private int subject5;
    // Default Constructor
    public Student_Academics()
    {
        this.roll_no = 0;
        this.name = "NA";
        this.subject1 = 0;
        this.subject2 = 0;
        this.subject3 = 0;
        this.subject4 = 0;
        this.subject5 = 0;

    }
    // Parameterized Constructor
    public Student_Academics(int roll_no,String name,int subject1, int subject2, int subject3, int subject4, int subject5)
    {
        this.roll_no = roll_no;
        this.name = name;
        this.subject1 = subject1;
        this.subject2 = subject2;
        this.subject3 = subject3;
        this.subject4 = subject4;
        this.subject5 = subject5;
    }
    // Display
    public void resultCalculation()
    {
        int total = this.subject1 + this.subject2 + this.subject3 + this.subject4 + this.subject5;
        int per = total/5;
        String grade = getGrade(per);
        System.out.println(this.roll_no+" "+this.name+" scored "+per+"% with class "+grade);
    }

    public String getGrade(int score)
    {
        if(score>=75 && score<=100)
        {
            return "First Class with Distinction";
        }
        else if(score>=60 && score<=74)
        {
            return "First Class";
        }
        else if(score>=50 && score<=59)
        {
            return "Second Class";
        }
        else if(score>=40 && score<=49)
        {
            return "Pass Class";
        }
        else
        {
            return "Fail";
        }

    }

}

// Main Class Code

package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int recordCount,i;
        // Records Variables
        int roll_no,subject1,subject2,subject3,subject4,subject5;
        String name;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the No of Students");
        recordCount = Integer.parseInt(sc.nextLine());
        Student_Academics [] obj = new Student_Academics[recordCount];
        System.out.println("Enter the Student Details");
        for(i=0;i<recordCount;i++)
        {
            System.out.println("Enter the Roll No");
            roll_no = Integer.parseInt(sc.nextLine());
            System.out.println("Enter the Name");
            name = sc.nextLine();
            System.out.println("Enter the DBMS Marks");
            subject1 = Integer.parseInt(sc.nextLine());
            System.out.println("Enter the OS Marks");
            subject2 = Integer.parseInt(sc.nextLine());
            System.out.println("Enter the CN Marks");
            subject3 = Integer.parseInt(sc.nextLine());
            System.out.println("Enter the DSA Marks");
            subject4 = Integer.parseInt(sc.nextLine());
            System.out.println("Enter the Java Marks");
            subject5 = Integer.parseInt(sc.nextLine());
            obj[i] = new Student_Academics(roll_no,name,subject1,subject2,subject3,subject4,subject5);
        }
        for(i=0;i<recordCount;i++)
        {
            obj[i].resultCalculation();
        }
    }
}

