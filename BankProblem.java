/*
	In a bank different customers having saving account.
	Some customer may have taken loan from bank
	Bank always maintain information about bank depositors and borrowes.
	Design Base class Customer(name, phone number).
	Derive a class Depositor (accountno,balance) from Customer.
	Derive a class Borrower (loan_no, loan_amount)from Depositor
	Write member function to read and display the details of n customers
*/



// Customer Class
package com.company;

public class Customer {
    private String nameOfCustomer;
    private String phoneNumber;
    // Default
    public Customer()
    {
        this.nameOfCustomer = "NA";
        this.phoneNumber = "98";
    }
    // Parameterized
    public Customer(String nameOfCustomer, String phoneNumber)
    {
        this.nameOfCustomer = nameOfCustomer;
        this.phoneNumber = phoneNumber;
    }
    public void display()
    {
        System.out.println("Name of Customer: "+ this.nameOfCustomer+" Contact Details: "+this.phoneNumber);
    }
}


// Depositor Class
package com.company;

public class Depositor extends Customer{
    private String accountNumber;
    private double balanceAmount;
    // Default Constructor
    public Depositor()
    {
        this.accountNumber = "101";
        this.balanceAmount = 0.0;
    }
    // Customized Constructor
    public Depositor(String accountNumber, double balanceAmount, String nameOfCustomer, String phoneNumber)
    {
        super(nameOfCustomer,phoneNumber);
        this.accountNumber = accountNumber;
        this.balanceAmount = balanceAmount;
    }
    public void display()
    {
        super.display();
        System.out.println("Account No: "+this.accountNumber+" Balance Amount: "+this.balanceAmount);
    }
}


// Borrower Class
package com.company;

public class Borrower extends Depositor{
    private String loanAccountNo;
    private double loanAmount;
    // Default Constructor
    public Borrower()
    {
        super();
        this.loanAccountNo = "0";
        this.loanAmount = 0.0d;
    }
    public Borrower(String loanAccountNo, double loanAmount, String accountNumber, double balanceAmount,String nameOfCustomer, String phoneNumber)
    {
        super(accountNumber,balanceAmount,nameOfCustomer,phoneNumber);
        this.loanAccountNo = loanAccountNo;
        this.loanAmount = loanAmount;
    }
    public void display()
    {
        super.display();
        System.out.print("Loan ID: "+this.loanAccountNo+" Loan Amount: "+this.loanAmount);
    }
}


// Main Class
package com.company;

import java.util.Scanner;

public class BankProblem {

    public static void main(String[] args) {

        // Creating Object of Borrower to set and get
        String nameOfCustomer, phoneNumber, accountNumber, loanAccountNo;
        double balanceAmount, loanAmount;
        int n,i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of records to store");
        n = Integer.parseInt(sc.nextLine());
        Borrower obj [] = new Borrower[n];
        for(i=0;i<n;i++)
        {
            System.out.println("Enter the Name");
            nameOfCustomer = sc.nextLine();
            System.out.println("Enter the Phone Number");
            phoneNumber = sc.nextLine();
            System.out.println("Enter the Account Number");
            accountNumber = sc.nextLine();
            System.out.println("Enter the Balance Amount");
            balanceAmount = Double.parseDouble(sc.nextLine());
            System.out.println("Enter the Loan Number");
            loanAccountNo = sc.nextLine();
            System.out.println("Enter the Loan Amount");
            loanAmount = Double.parseDouble(sc.nextLine());
            obj[i] = new Borrower(loanAccountNo,loanAmount,accountNumber,balanceAmount,nameOfCustomer,phoneNumber);
        }
        System.out.println("Records of Borrower");
        for(i=0;i<n;i++)
        {
            obj[i].display();
        }
    }
}
