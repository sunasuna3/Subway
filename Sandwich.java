import java.util.ArrayList;
import java.util.HashMap;

public class Sandwich 
{
	
	// 이 final 변수들을 VM에 줄거임. 여긴 참고용으로 써놓음
	// 이걸 쓰는 이유: 코드 짜기 편해짐.밑에 메소드들 참고.
	static final int BREAD = 1;
	static final int VEGE = 2;
    static final int CHEESE = 3;
    static final int NECTOPPING = 4;
	static final int SUBTOPPING = 5;
	static final int SAUCE = 6;
	static final int SIDE = 7;
	
	private String name;
    private int price;
    private int qty;
    private Bread bread;
	private HashMap<Integer, ArrayList<Ingredient>> exceptBreadMap;
    private String description; // 나중에 메뉴 설명도 있으면 좋을거 같기도 해서 일단 넣어 놓음

	// 메서드를 생성하면 생성자를 통해 빈 ArrayList를 생성해준다.
	// name, price, qty, bread, description은 직접 입력해주면 되지만
	// ArrayList로 만들어진 속성들은 직접 입력이 아니라 ArrayList의 add메서드를 통해 리스트에 추가해줘야 하기 때문에 ArrayList의 인스턴스를 생성하는 것이다.
    Sandwich() 
	{	
		exceptBreadMap = new HashMap<Integer, ArrayList<Ingredient>>();

		// 야채 ArrayList를 exceptBreadMap HashMap에 Key=2로 넣음
		exceptBreadMap.put(2, new ArrayList<Ingredient>());
		// 치즈 ArrayList를 exceptBreadMap HashMap에 Key=3로 넣음
		exceptBreadMap.put(3, new ArrayList<Ingredient>());
		// 필수토핑 ArrayList를 exceptBreadMap HashMap에 Key=4로 넣음
		exceptBreadMap.put(4, new ArrayList<Ingredient>());
		// 서브토핑 ArrayList를 exceptBreadMap HashMap에 Key=5로 넣음
		exceptBreadMap.put(5, new ArrayList<Ingredient>());
		// 소스 AArrayList를 exceptBreadMap HashMap에 Key=6로 넣음
		exceptBreadMap.put(6, new ArrayList<Ingredient>());
    }

	// 샌드위치 구성시에 재료 추가하는 메서드
	// sandwich.addIngr(VEGE, 야채객체1) -> VEGE을 Key로 야채 ArrayList를 찾고 거기에 야채객체1을 넣음.
	void addIngr(int finalIndex, Ingredient ingr)
	{
		exceptBreadMap.get(finalIndex).add(ingr);
	}



	// 아래는 그냥 getter setter들
    String getName() 
	{
        return name;
    }

    void setName(String name) 
	{
		this.name = name;
    }

    int getPrice() 
	{
		return price;
    }

    void setPrice(int price) 
	{
		this.price = price;
	}

    int getQty() 
	{
        return qty;
    }

    void setQty(int qty) 
	{
		this.qty = qty;
    }

    Bread getBread() 
	{
        return bread;
    }

    void setBread(Bread bread) 
	{
		this.bread = bread;
    }

	HashMap<Integer, ArrayList<Ingredient>> getExceptBreadMap()
	{
		return exceptBreadMap;
	}
}