class Marksdemo
  { 
    public static void main (String args[])
{
   int s1,s2,s3,s4,s5,total;
   float avg;
  s1=Integer.parseInt (args[0]);
  s2=Integer.parseInt (args[1]);
  s3=Integer.parseInt (args[2]);
  s4=Integer.parseInt (args[3]);
  s5=Integer.parseInt (args[4]);
total=(s1+s2+s3+s4+s5);
avg=total/5;
System.out.println("Total subject marks="+total);

}
}