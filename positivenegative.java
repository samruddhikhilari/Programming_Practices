 import java.util.*;
class positivenegative
{
   public static void main(String args[])
   {
     int no;
    Scanner sc=new Scanner(System.in);
   System.out.println("Enter any Number=");
     no=sc.nextInt();

     if(no>0)
       {
         System.out.println("Number is Positive");
       }
     else
       {
       System.out.println("Number is Negative");
       }
   }

}