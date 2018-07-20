package examples;

public class Sorty implements Comparable<Sorty> {

	private String nameOfCoffee;
	private int rating;
	
	public Sorty(String s, int r){
		this.nameOfCoffee = s;
		this.rating = r;
	}
	
	public String getName()
	{
		return this.nameOfCoffee;
	}
	public int getRating()
	{
		return this.rating;
	}
	
	public String toString()
	{
		return nameOfCoffee + ": " + rating;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sorty[] coffeeRatings = {
				new Sorty("Starbucks",2),
				new Sorty("Timmies",10),
				new Sorty("McDonalds", 7),
				new Sorty("Bean Scene", 0),
				new Sorty("Green Bean", 6)
			};
		
		
		for(int i = 0; i < coffeeRatings.length; i++)
		{
			System.out.println(coffeeRatings[i]);
		}

		java.util.Arrays.sort(coffeeRatings);
		System.out.println("New Order:");
		for(int i = 0; i < coffeeRatings.length; i++)
		{
			System.out.println(coffeeRatings[i]);
		}
	}

	@Override
	public int compareTo(Sorty s) {
		// TODO Auto-generated method stub
		//int difference = this.rating - s.getRating();
		return this.getName().compareTo(s.getName());
	
	}

}
