class Product
{
public static void main(String[] args)
{
int num=1234;
int product=1;
while(num!=0)
{
int d=num%10;
product=product*d;
num=num/10;
}
System.out.println(product);
}
}
