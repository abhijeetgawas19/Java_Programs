/*
	Define Employee Class with Basic Attributes and having getSalary() method.
	Write class Manager extends Employee overrides getSalary() method, which will
	return salary of manager by adding travel allowance , house rent allowance.
*/
// Employee Class

package com.company;

public class Employee {
    private int employeeID;
    private String employeeName;
    private double employeeBasicPay;
    // Constructors
    public Employee()
    {
        this.employeeID = 0;
        this.employeeName = "NA";
        this.employeeBasicPay = 12000.0;
    }
    public Employee(int employeeID, String employeeName, double employeeBasicPay)
    {
        this.employeeID = employeeID;
        this.employeeName = employeeName;
        this.employeeBasicPay = employeeBasicPay;
    }
    public double getSalary()
    {
        return this.employeeBasicPay;
    }
    public void display()
    {
        System.out.println("Employee ID:"+this.employeeID);
        System.out.println("Employee Name:"+this.employeeName);
        System.out.println("Employee Basic Pay:"+this.employeeBasicPay);
    }
}


// Manager Class

package com.company;

public class Manager extends Employee{
    private double grossSalary;
    // Constructors
    public Manager()
    {
        super();
        this.grossSalary = 0;
    }
    public Manager(int employeeID, String employeeName, double basicSalary)
    {
        super(employeeID,employeeName,basicSalary);
        this.grossSalary = 0;
    }
    public double getSalary()
    {
        double basicPay = super.getSalary();
        // Allowance 10% TA, 20% HRA
        double travelAllowance = basicPay * 0.10;
        double houseRentAllowance = basicPay * 0.20;
        this.grossSalary = basicPay + travelAllowance + houseRentAllowance;
        return this.grossSalary;
    }
    public void display()
    {
        super.display();
    }
}

// Main Class
package com.company;

import java.io.DataInput;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Manager_Salary_Calculation {

    public static void main(String[] args) throws IOException {
        // Accept Details of Manager
        int employeeID;
        String employeeName;
        double employeeBasicPay;
        double employeeSalary;
        Scanner in = new Scanner(System.in);
        // Create Array of Class
        int n,i;
        System.out.println("No of Records to insert");
        n = Integer.parseInt(in.nextLine());
        Manager objects[] = new Manager[n];
        for(i=0;i<n;i++)
        {
            System.out.println("Enter the Employee ID");
            employeeID = Integer.parseInt(in.nextLine());
            System.out.println("Enter the Employee Name");
            employeeName = (in.nextLine());
            System.out.println("Enter the Employee Basic Pay");
            employeeBasicPay = Double.parseDouble(in.nextLine());
            objects[i] = new Manager(employeeID,employeeName,employeeBasicPay);
        }
        System.out.println("Salary of All Managers");
        for(i=0;i<n;i++)
        {
            System.out.println("----------------------------");
            objects[i].getSalary();
            objects[i].display();
            // Grab the Salary Here
            employeeSalary = objects[i].getSalary();
            System.out.println("Employee Salary:"+employeeSalary);
        }
    }
}
