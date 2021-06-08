import java.util.Arrays;
public class AAsort
{
	public static void main(String args[])
	{
		String[] aa = {"Alanine","Glycine","Tryptophan","Lysine","Proline","Isoleucine","Asparagine","Phenylalanine","Leucine","Arginine","Cysteine","Valine","Methionine","Asparagine","Histidine","Glutamine","Serine","Glutamic acid","Tyrosine","Threonine"};
		Arrays.sort(aa); // method that sorts in alphabetical way
		System.out.print("Alphabetical sort of amino acids : ");
		System.out.println( Arrays.toString(aa) ); //converts the data into String datatype and prints it
	}
}