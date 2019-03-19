public class ExtendsTest
{
	public static void main(String[] args)
	{
		Bread bread = new Bread("허니오트", 10);
		Side coke = new Side("콜라", 10, 1000);
		Ingredient newBread = bread;
		Ingredient newCoke = coke;
		System.out.println(((Side)newCoke).getPrice());
        
	}
}