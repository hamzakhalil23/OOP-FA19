
public class Distance_runner {

	public static void main(String[] args) {
		Distance c=new Distance();
		Distance c1=new Distance(9.8,8.4);
		System.out.println("Getter Inches: "+c1.getinches());
		System.out.println("Getter Feets: "+c1.getfeets());
		Distance c3=new Distance();
		c3=c.add(c1);
		c3.display();
		
		
	}

}
