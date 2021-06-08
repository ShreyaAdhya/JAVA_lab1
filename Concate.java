public class Concate
{
	public static void main(String[] args) 
	{
	   String dna1= "AGCTCGCATG";
	   String dna2= "GTACCGATCA";
	   
	   //using + operator
	   System.out.println(dna1+dna2+"\n");
	   
	   //using concat function
	   dna1 = dna1.concat(dna2);
		System.out.println(dna1);
		System.out.println(dna2);
		
	}
}
