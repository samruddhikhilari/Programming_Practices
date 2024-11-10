 import java.util.*;
class leapyear
{
   public static void main(String args[])
   {
     int year;
    Scanner sc=new Scanner(System.in);
   System.out.println("Enter any Year=");
     year=sc.nextInt();

     if(year%4==0)
       {
         System.out.println("leap year");
       }
     else
       {
       System.out.println("not leap year");
       }
   }

}