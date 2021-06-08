import java.util.Scanner;
public class Exam
{
	public static void main(String[] args) 
	{
	   float avg=0, sum=0;
	   float arr[]=new float[5];
	   Scanner mk=new Scanner(System.in);
	   
	   for(int i=0;i<5;i++)
	   {
	      System.out.print("Marks of subject "+(i+1)+" = ");
	      arr[i]=mk.nextFloat();
	      sum+=arr[i];
	   }
	   
	   avg = sum/5;
	   System.out.print("\nYour percentage is "+avg+"% and you have ");
	   if(avg>=50)
		  System.out.println("Passed:)");
		else
		  System.out.println("Failed:(");
	}
}
