/*
	Question: Write a program to accept a number from user if number is zero then then throw user defined exception "Number is 0" otherwise check wheather number is prime or not.
*/

package com.company;

import java.util.Scanner;

class NumberZeroException extends Exception
{
    @Override
    public String toString() {
        return "Number is 0 or Less than Zero";
    }
}
class PrimeFinder
{
    int numberValue;
    PrimeFinder()
    {
        this.numberValue = 1;
    }
    PrimeFinder(int numberValue)
    {
        this.numberValue = numberValue;
    }
    public String primeNumberStatus()
    {
        int flag=0,i;
        for(i=2;i<=this.numberValue/2;i++)
        {
            if(this.numberValue%i==0)
            {
                flag++;
            }
        }
        if(flag==0)
        {
            return "Prime Number";
        }
        else
        {
            return "Not a Prime Number";
        }
    }
}
public class NumberZeroException {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        try
        {
            System.out.println("Enter the Number");
            n = Integer.parseInt(sc.nextLine());
            if(n<=0)
            {
                throw new NumberZeroException();
            }
            PrimeFinder obj = new PrimeFinder(n);
            System.out.println(obj.primeNumberStatus());
        }
        catch(NumberZeroException e)
        {
            System.out.println("Exception Raised:"+e);
        }
    }
}
