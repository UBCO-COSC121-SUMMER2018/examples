package exampes;

public class sorty implements Comparable<sorty> {

	private String nameOfCoffee;
	private int rating;
	
	public sorty(String s, int r){
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
		sorty[] coffeeRatings = {
				new sorty("Starbucks",2),
				new sorty("Timmies",10),
				new sorty("McDonalds", 7),
				new sorty("Bean Scene", 0),
				new sorty("Green Bean", 6)
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
	public int compareTo(sorty s) {
		// TODO Auto-generated method stub
		//int difference = this.rating - s.getRating();
		return this.getName().compareTo(s.getName());
	
	}

}
