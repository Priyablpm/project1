class Strong 
{
int num=145;
int sum=0;
int copy=num;
while(num!=0)
	{
	int d=num%10;
	sum=sum+factorial(d);
	num=num/10;
	}
	if (copy==sum)
	{
		System.out.println(copy+" is a strong number....");
	}
    else
	{
		System.out.println(copy+" is not a strong number...");
	}
	public static int factorial(int x)
	{
		int fact=1;
		for (int i=1;i<=x;i++)
		{
			fact=fact*i;
		}
		return fact;
	}
}