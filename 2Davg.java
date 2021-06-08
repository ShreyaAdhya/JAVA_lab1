public class 2Davg

{
	public static void main(String[] args) 
	{
	   float avg=0, sum=0;
	   int arr[][]= { {5,6},{-9,-8},{0,1},{333,111},{55,50} };
	   
	   for(int i=0; i<5;i++)
	     for(int j=0; j<2;j++)
	       sum+=arr[i][j];
	   avg = sum/5;
	   System.out.print("\nYour average is "+avg);
	   
	}
}