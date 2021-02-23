/*
	Write a java program that reads line of integer. Display each integer and also display sum of all integer.
*/

import java.lang.*;
import java.util.*;
public class Integer_Sum_Command_Line
{
	public static void main(String [] args)
	{
		int ele = args.length;
		int i,sum=0;
		if(ele>0)
		{
			for(i=0;i<ele;i++)
			{
				sum = sum + Integer.parseInt(args[i]);
			}		
		}
		else
		{
			System.exit(0);
		}
				System.out.println("Sum of Elements:"+sum);
	}
}