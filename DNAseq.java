public class DNAseq
{
	public static void main(String[] args) 
	{
	  //using String  
	   String dna = "ATACGATACAA"; 
	   System.out.println("Your sequence is '"+dna+"'");
	   
	  //using char array 
		char dna1 []= {'A','T','A','C','G','A','T','A','C','A','A'};
		String print = new String(dna1);
	   System.out.println("\nYour sequence is '"+print+"'");		
	}	  
	
}