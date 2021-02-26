/*
	Question: Create package mathematics which has 2 classes as 
	class Addition with method to add two numbers, add three numbers and 
	class Maximum with method to find maximum of 2 numbers and maximum of 3 numbers.
	Make Use of finalize
*/
// mathematics package


// Addition Class
package mathematics;
public class Addition
{
	private int numberOne,numberTwo,numberThree;
	// Constructor
	public Addition()
	{
		this.numberOne = 0;
		this.numberTwo = 0;
		this.numberThree = 0;
	}
	// Addition of 2 Numbers
	public Addition(int numberOne, int numberTwo)
	{
		this.numberOne = numberOne;
		this.numberTwo = numberTwo;
		this.numberThree = 0;
	}
	// Addition of 3 Numbers
	public Addition(int numberOne, int numberTwo, int numberThree)
	{
		this.numberOne = numberOne;
		this.numberTwo = numberTwo;
		this.numberThree = numberThree;
	}
	// Calculation 
	public int add()
	{
		if(this.numberThree==0)
			return this.numberOne + this.numberTwo;
		else
			return this.numberOne + this.numberTwo + this.numberThree;
			
	}
}

// Maximum Class	
package mathematics;

public class Maximum
{
	private int numberOne, numberTwo, numberThree;
	// Constructor
	public Maximum()
	{
		this.numberOne = 0;
		this.numberTwo = 0;
		this.numberThree = 0;
	}
	public Maximum(int numberOne, int numberTwo)	
	{
		this.numberOne = numberOne;
		this.numberTwo = numberTwo;
		this.numberThree = 0;
	}
	public Maximum(int numberOne, int numberTwo, int numberThree)
	{
		this.numberOne = numberOne;
		this.numberTwo = numberTwo;
		this.numberThree = numberThree;
	}
	public int maximum_value()
	{
		if(this.numberThree==0)
		{
			if(this.numberOne > this.numberTwo)
			{
				return this.numberOne;
			}
			else
			{
				return this.numberTwo;
			}
		}
		else
		{
			if(this.numberOne > this.numberTwo && this.numberOne>this.numberThree)
				return this.numberOne;
			else if(this.numberTwo> this.numberOne && this.numberTwo>this.numberThree)
				return this.numberTwo;
			else
				return this.numberThree;
		}
	}
}
import mathematics.*;
import java.util.*;	
public class Package_Mathematics_Demonstration
{
	public static void main(String [] args)
	{
		int ch;
		int numberOne,numberTwo,numberThree;
		Scanner sc = new Scanner(System.in);
		while(true)
		{
			System.out.println("-------------------------");
			System.out.println("1. Addition Operations");
			System.out.println("2. Maximum Operations");
			System.out.println("3. Exit");
			System.out.println("Enter the Choice");
			ch = Integer.parseInt(sc.nextLine());
			switch(ch)
			{
				case 1:
					{
						int h;
						System.out.println("1.Addition of 2 Numbers");
						System.out.println("2.Addition of 3 Numbers");
						System.out.println("Enter the Choice");
						h = Integer.parseInt(sc.nextLine());
						if(h==1)
						{
							System.out.println("Enter the First Digit");
							numberOne = Integer.parseInt(sc.nextLine());
							System.out.println("Enter the Second Digit");
							numberTwo = Integer.parseInt(sc.nextLine());
							Addition obj = new Addition(numberOne,numberTwo);
							System.out.println("Addition of 2 Elements:"+obj.add());
						}
						else if(h==2)
						{
							System.out.println("Enter the First Digit");
							numberOne = Integer.parseInt(sc.nextLine());
							System.out.println("Enter the Second Digit");
							numberTwo = Integer.parseInt(sc.nextLine());
							System.out.println("Enter the Third Digit");
							numberThree = Integer.parseInt(sc.nextLine());
							Addition obj = new Addition(numberOne,numberTwo,numberThree);
							System.out.println("Addition of 3 Elements:"+obj.add());
						}
						else
						{
							System.out.println("Invalid Choice");
						}
						break;	
					}
				case 2:
					{
						int c;
						System.out.println("1.Maximum of 2 Numbers");
						System.out.println("2.Maximum of 3 Numbers");
						System.out.println("Enter the Choice");
						c = Integer.parseInt(sc.nextLine());
						if(c==1)
						{
							System.out.println("Enter the First Digit");
							numberOne = Integer.parseInt(sc.nextLine());
							System.out.println("Enter the Second Digit");
							numberTwo = Integer.parseInt(sc.nextLine());
							Maximum obj = new Maximum(numberOne,numberTwo);
							System.out.println("Maximum of 2 Elements:"+obj.maximum_value());
						}
						else if(c==2)
						{
							System.out.println("Enter the First Digit");
							numberOne = Integer.parseInt(sc.nextLine());
							System.out.println("Enter the Second Digit");
							numberTwo = Integer.parseInt(sc.nextLine());
							System.out.println("Enter the Third Digit");
							numberThree = Integer.parseInt(sc.nextLine());
							Maximum obj = new Maximum(numberOne,numberTwo,numberThree);
							System.out.println("Maximum of 3 Elements:"+obj.maximum_value());
						}
						else
						{
							System.out.println("Invalid Choice");
						}
						break;
					}
				case 3:
					{
						System.exit(0);
						break;
					}
				default:
					{
						System.out.println("Try Again");
					}	
			}
		}
	}
	public void finalize()
	{
		System.out.println("Program Execution is Completed");
	}
}
