public class ExtendsTest
{
	public static void main(String[] args)
	{
		Bread bread = new Bread("��Ͽ�Ʈ", 10);
		Side coke = new Side("�ݶ�", 10, 1000);
		Ingredient newBread = bread;
		Ingredient newCoke = coke;
		System.out.println(((Side)newCoke).getPrice());
        
	}
}