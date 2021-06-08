public class Fibo
{
	public static void main(String[] args) 
	{
	   
	   int i=0;
	   long s1=0, s2=1,s=0;
	   while(i<51)    //printing upto 50th term
	   {  
	      System.out.println("Term "+i+" is "+s);
	      s=s1+s2;
	      s2=s1;
	      s1=s;
	      i++;
	   }
	   
	}
}
