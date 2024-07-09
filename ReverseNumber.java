public class ReverseNumber 
{
 public static void main(String args[])
 {
  int n1=Integer.parseInt(args[0]);
  int rev=0,rem;
  while(n1>0)
  {
   rem=n1%10;
   rev=rev*10 + rem;
   n1=n1/10;
  }
  System.out.println("The reverse is "+rev);
 }
}
