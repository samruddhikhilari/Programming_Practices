
import java.util.*;
 class SwapVariable
{
   public static void main(String args[])
{
   int a,b,temp;
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter value of a=");
   a=sc.nextInt();
   System.out.println("Enter value of b=");
   b=sc.nextInt();

  System.out.println("***befor swaping variable");
  System.out.println("a="+a+ "\tb="+b);
   temp=a;
   b=a;
   a=temp;
   System.out.println("***After swaping variable***");
  System.out.println("a="+a+ "\tb="+b);
}
}









