
public class Fraction {
private int a;
private int b;
public Fraction()
{
	
}
public Fraction (int x,int f)
{
a=x;
b=f;
}
public void set (int x1,int f1)
{
a=x1;
b=f1;
}
public void get()
{
System.out.println("Value if 1st int is: "+a);
System.out.println("Value if 2nd int is: "+b);
}
public boolean equals(int c,int v)
{
	if(a/b==c/v)
	{
		return true;
	}

	return false;
}
}
