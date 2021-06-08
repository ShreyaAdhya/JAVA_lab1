public class AAmw
{
    public static void main(String[] args) 
    {

        String[] aa = {"alanine", "cysteine", "aspartic acid", "glutamic acid", "phenylalanine",
                "glycine", "histidine", "isoleucine", "lysine", "leucine",
                "methionine", "asparagine", "glutamine", "arginine", "serine",
                "threonine", "valine", "tryptophan", "tyrosine", "proline"};

        double[] mw = {89.1, 121.2, 133.1, 	147.1, 	165.2, 	75.1, 	155.2, 	131.2, 	146.2, 	131.2,
                      149.2, 132.1, 146.2, 	174.2, 	105.1, 	119.1, 	117.1, 	204.2, 	181.2, 	115.1};
                      
        int l= aa.length;               
        System.out.println("The total length is "+l+"\n");
        
        
        for(int i = 0; i < l; i++)
        {
            System.out.println("The molecular weight of "+aa[i] + " is " + mw[i]+" Da");
        }
    }
}