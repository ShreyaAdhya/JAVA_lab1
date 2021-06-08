import java.util.Scanner;
public class Avg2D
{
	public static void main(String[] args) 
	{
	   int n=0,m=0,sum=0;
	   double avg=0;
      Scanner scan=new Scanner(System.in);   //creating object scan
	   System.out.print("Enter the number of rows : ");
	   int r= scan.nextInt();
	    System.out.print("Enter the number of columns : ");
	   int c= scan.nextInt();
      int num[][] = new int[r][c];
   
  
   for(int i=0;i<r;i++)  // for counting rows
   {
     for(int j=0;j<c;j++)  // for counting columns
     {
      	System.out.print("Enter the value for row "+n+" column "+m+" = ");
         num[i][j] = scan.nextInt();
         sum += num[i][j];
         m++;
     }
      n++;
   
       avg = sum/(r*c);
   }
		System.out.println("Average is = "+avg);
	}
}