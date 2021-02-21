/*
	Write a java program to accept n numbers through command line and store all prime and perfect no into different array and display both arrays.
*/

import java.lang.*;
import java.util.*;
class PP_Finder 
{
    private int primeElements[]=new int[10];
    private int perfectElements[]=new int[10];
    private static int primeCount;
    private static int perfectCount;
    public void perfect_primeFinder(int x)
    {
        // Prime Logic
        int i,flag=0,sum=0;
        for(i=2;i<x/2;i++)
        {
            if(x%i==0)
            {
                flag++;
            }
        }
        if(flag==0)
        {
            primeElements[primeCount] = x;
            primeCount++;
        }
        // Perfect Logic
        for(i=1;i<=x/2;i++)
        {
            if(x%i==0)
            {
                sum+=i;
            }
        }
        if(sum==x)
        {
            perfectElements[perfectCount]= x;
            perfectCount++;
        }

    }
    public void display()
    {
        int i,j;
        System.out.println("Prime Numbers");
        for(i=0;i<primeCount;i++)
        {
            System.out.print(primeElements[i]+" ");
        }
        System.out.println();
        System.out.println("Perfect Numbers");
        for(i=0;i<perfectCount;i++)
        {
            System.out.print(perfectElements[i]+" ");
        }
        System.out.println();
    }

}

public class Prime_Perfect_Finder {

    public static void main(String[] args) {
        int elements = (args.length);
        int i,ele;
        if(elements>0)
        {
            PP_Finder obj = new PP_Finder();
            for(i=0;i<elements;i++)
            {
                ele = Integer.parseInt(args[i]);
                obj.perfect_primeFinder(ele);
            }
                obj.display();
        }
        else
        {
            System.out.println("No Argument Passed through Command Line");
            System.exit(0);
        }
    }
}




