import java.util.Scanner;
class Calculator
{
public static void main(String[] args)
{
boolean flag=true;
while(flag)
{
Scanner sc=new Scanner(System.in);
System.out.println("1.Add\n 2.Sub\n 3.Div\n 4.mul\n 5.exit");
System.out.println("enter the valid option");
int opt=sc.nextInt();
switch(opt)
{
case 1:
  { 
  System.out.println("enter the 1st number");
  int a=sc.nextInt();
  System.out.println("enter the 2nd number");
  int b=sc.nextInt();
  int result=a+b;
  System.out.println("Result is: "+result);
  }
break;
case 2:
  {
  System.out.println("enter the 1st number");
  int a=sc.nextInt();
  System.out.println("enter the 2nd number");
  int b=sc.nextInt();
  int result=a-b;
  System.out.println("Result is: "+result);
  }
break;
case 3:
  {
  System.out.println("enter the 1st number");
  double a=sc.nextDouble();
  System.out.println("enter the 2nd number");
  double b=sc.nextDouble();
  double result=a/b;
  System.out.println("Result is: "+result);
  }
break;
case 4:
  {
  System.out.println("enter the 1st number");
  int a=sc.nextInt();
  System.out.println("enter the 2nd number");
  int b=sc.nextInt();
  int result=a*b;
  System.out.println("Result is: "+result);
  }
break;
case 5:
  {
  flag=false;
  System.out.println("Thank you");
  }
break;
default:
  {
  System.out.println("Invalid option");
  }
}
}
}
}