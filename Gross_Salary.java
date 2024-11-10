/* Write a java program to acepet basic salary form user and claculate is gross salary
   on the basic no componnents (HRA=15%,TA=5%,DA=7%)
*/ 
 import java.util.*;
 class Gross_Salary
{
  public static void main(String args[])

{
   int basic_salary,HRA,TA,DA,Gross_Salary;

   Scanner sc=new Scanner(System.in);


   System.out.println("Enter Basic Salary=");
   basic_salary=sc.nextInt();

   HRA=(basic_salary*15)/100;
   TA=(basic_salary*5)/100;
   DA=(basic_salary*7)/100;
   Gross_Salary=(basic_salary + HRA +TA +DA);
   System.out.println("your Gross_Salary="+Gross_Salary);

}



}