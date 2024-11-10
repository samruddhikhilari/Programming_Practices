class Addition
{
 int a,b,c;
 void getdata()
{
 a=100;
 b=50;
}
  void display()
 { 
   c=a+b;
   System.out.println("addition="+c);
  }
 public static void main(String args[])
  Addition a1=new Addition();
  a1.getdata();
  a1.display();
}