
public class Distance {
	public double feets;
	public double inches;
	public Distance()
	{
		feets=1.0;
		inches=1.0;
		
	}

	public Distance(double f,double i)
	{
		feets=f;
		inches=i;
		
		
	}
	public void setter(double f,double i)
	{
		feets=f;
		inches=i;
		
	}
	public double getinches()
	{
		return inches;
	}

	public double getfeets()
	{
		return feets;
	}
public Distance add(Distance d)
{
	Distance x = new Distance (feets + d.feets, inches+ d.inches);
	return x;
}
public void display()
{
	System.out.println("Feets are: "+ feets);

	System.out.println("Inches are: "+ inches);
}
}
