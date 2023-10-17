class Program
{
  int method1(int a,int b)
  {
    System.out.println("Method1 is called");
    int c = a+b;
    method2();
    return c;
  }
  void method2()
   {
    System.out.println("Method2 is called");
   }
  public static void main(String args[])
   {
     int a=20;
     int b=30;
     int c=0;
     System.out.println("Value of a is "+a);
     System.out.println("Value of b is "+b);
     Program p = new Program();
     int result=p.method1(5,10);
     System.out.println(result);
     System.out.println(c);
     
   }
}