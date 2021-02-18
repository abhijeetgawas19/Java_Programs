/*
	Create a class telephone containing name, telephone number and city and write neccessary
	member function for following:
	- Search the telephone number with given name.
	- Search the name with given telephone number.
	- Search all customer in a given city (Use function overloading)
*/



package com.company;
import java.util.Scanner;
    public class Telephone {
    private String customerName;
    private String customerTelephone;
    private String customerCity;
    // Constructors
    public Telephone()
    {
        this.customerName = "Abc";
        this.customerTelephone = "988";
        this.customerCity = "Zxy";
    }
    public Telephone(String customerName, String customerTelephone, String customerCity)
    {
        this.customerName = customerName;
        this.customerTelephone = customerTelephone;
        this.customerCity = customerCity;
    }
    // Methods
    public void searchRecord(String name)
    {
        if(this.customerName.equals(name))
        {
            System.out.println("Customer Telephone: "+this.customerTelephone);
        }
    }
    public void searchName (String customerTelephone)
    {
        if(this.customerTelephone.equals(customerTelephone))
        {
            System.out.println("Customer Name: "+this.customerName);
        }
    }
    public static void searchRecord(Telephone[] obj, int n,String customerCity)
    {
        int i;
        for(i=0;i<n;i++)
        {
            if(obj[i].customerCity.equals(customerCity))
            {
                System.out.println("Customer Name: "+obj[i].customerName);
            }
        }
    }
    public void display()
    {
        System.out.println("Customer Name: "+this.customerName+"\nCustomer Telephone: "+this.customerTelephone+"\nCustomer City: "+this.customerCity);
    }

    public static void main(String[] args) {
        int n,i,ch;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of Records to Store");
        n = Integer.parseInt(sc.nextLine());
        // Class Information
        String name,telephone,city;
        Telephone obj [] = new Telephone[n];
        for(i=0;i<n;i++)
        {
            System.out.println("Enter the Customer Name");
            name = sc.nextLine();
            System.out.println("Enter the Customer Telephone");
            telephone = sc.nextLine();
            System.out.println("Enter the Customer City");
            city = sc.nextLine();
            obj[i] = new Telephone(name,telephone,city);
        }
        for(i=0;i<n;i++)
        {
            obj[i].display();
        }

        // Menu Driven Code
        while(true)
        {
            System.out.println("1. Search Telephone given name");
            System.out.println("2. Search Name given Telephone");
            System.out.println("3. Search All customer belong to particular City");
            System.out.println("4. Exit");
            System.out.println("Enter your choice as 1,2,3,4!!");
            ch = Integer.parseInt(sc.nextLine());
            switch(ch)
            {
                case 1:
                {
                    String cname;
                    System.out.println("Enter the Name");
                    cname = sc.nextLine();
                    for(i=0;i<n;i++)
                    {
                        obj[i].searchRecord(cname);
                    }
                    break;
                }
                case 2:
                {
                    String telephoneN;
                    System.out.println("Enter the Telephone");
                    telephoneN = sc.nextLine();
                    for(i=0;i<n;i++)
                    {
                        obj[i].searchName(telephoneN);
                    }
                    break;
                }
                case 3:
                {
                    String cityName;
                    System.out.println("Enter the Name of City");
                    cityName = sc.nextLine();
                    Telephone.searchRecord(obj,n,cityName);
                    break;
                }
                case 4:
                {
                    System.exit(0);
                }
                default:
                {
                    System.out.println("Invalid Option Encountered");
                }
            }
        }
    }
}
