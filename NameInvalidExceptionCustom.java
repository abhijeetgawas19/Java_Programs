/*
	Question: Write a program to accept User name and check wheather it is valid or invalid. If invalid throw Exception Name is Invalid otherwise is display.

*/
package com.company;

import java.util.Scanner;

class NameIsInvalidException extends Exception
{
    @Override
    public String toString() {
        return "Name is Invalid";
    }
}
class NameIsBlankException extends Exception
{
    @Override
    public String toString() {
        return "Name is Blank";
    }
}

public class NameInvalidExceptionCustom {

    public static void main(String[] args) {
        String name;
        Scanner sc = new Scanner(System.in);
        try
        {
            System.out.println("Enter the Name");
            name = sc.nextLine();
            if(name.length()==0)
            {
                throw new NameIsBlankException();
            }
            else
            {
                int lengthString = name.length();
                int i,a;
                for(i=0;i<lengthString;i++)
                {
                    a = name.charAt(i);
                    if(a>=65 && a<=123)
                    {
                        // Do Nothing
                    }
                    else
                    {
                        throw new NameIsInvalidException();
                    }
                }
                System.out.println("Name Entered:"+name);
            }
        }
        catch(NameIsBlankException e)
        {
            System.out.println(e);
        }
        catch(NameIsInvalidException e)
        {
            System.out.println(e);
        }
    }
}
