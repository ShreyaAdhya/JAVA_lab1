public class Calc
{
	public static void main(String[] args) 
	{
		int a=5, b=6;
		System.out.println("For the values "+a+" and "+b);
		System.out.println("\nAddition is "+ (a+b));
		System.out.println("Subtraction is "+ Math.abs(a-b));
		System.out.println("Multiplication is "+(a*b));
		System.out.print("Division is ");
		if(a>b)
		{
		   System.out.println(a/b);
		}
		else
		{
		   System.out.println(b/a);
		}
		  
	}
}