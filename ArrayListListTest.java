import java.util.ArrayList;

public class ArrayListListTest
{	
	static final int BREAD = 0;
	static final int VEGE = 1;
    static final int CHEESE = 2;
    static final int NECTOPPING = 3;
	static final int SUBTOPPING = 4;
	static final int SAUCE = 5;
	static final int SIDE = 6;
    
	public static void main(String[] args)
	{	
		/*
		String[] list = new String[4];
		list[0] = "빵";
		list[1] = "야채";
		list[2] = "치즈";
		list[3] = "토핑";
		System.out.println(list[BREAD]);
		*/
		
		ArrayList<ArrayList<Ingredient>> list = new ArrayList<ArrayList<Ingredient>>();
		list.add(new ArrayList<Ingredient>());
		list.get(0).add(new Bread("화이트", 10));
		list.get(0).add(new Bread("하티", 10));
		
		list.add(new ArrayList<Ingredient>());
		list.get(1).add(new Vege("양상추", 10));
		list.get(1).add(new Vege("피망", 10));
		
		list.add(new ArrayList<Ingredient>());
		list.get(2).add(new Cheese("아메리칸치즈", 10));
		list.get(2).add(new Cheese("슈레드치즈", 10));
		
		list.add(new ArrayList<Ingredient>());
		list.get(3).add(new NecTopping("터키", 10));
		list.get(3).add(new NecTopping("미트볼", 10));
		
		list.add(new ArrayList<Ingredient>());
		list.get(4).add(new SubTopping("오믈렛", 10, 900));
		list.get(4).add(new SubTopping("아보카도", 10, 900));
		
		list.add(new ArrayList<Ingredient>());
		list.get(5).add(new Sauce("랜치", 10));
		list.get(5).add(new Sauce("마요네즈", 10));
		
		list.add(new ArrayList<Ingredient>());
		list.get(6).add(new Side("라즈베리 치즈케익", 10, 1000));
		list.get(6).add(new Side("화이트 초코마카다미아", 10, 1000));
		
		System.out.println(list.get(BREAD).get(0).getName());
	}
}