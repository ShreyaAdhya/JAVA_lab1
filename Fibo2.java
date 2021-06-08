public class Fibo2
{
 //prints till the number less than 50
    public static void main(String[] args) 
     {
      int s[] = new int[20]; 
      int n=0;
       s[0] = 0;
       s[1] = 1;
     
    for(int i = 2; s[i-1]<50; i++)
      {
        System.out.println(s[i]);
        s[i] = s[i-1] + s[i-2];    
      }   
  }
}
