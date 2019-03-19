import java.util.ArrayList;
import java.util.HashMap;

public class Stock 
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
	
	private HashMap<Integer, ArrayList<Ingredient>> ingrListMap;

    Stock() 
	{	
		ingrListMap = new HashMap<Integer, ArrayList<Ingredient>>();
		
		// 해쉬 맵에 1을 Key로, 빵 ArrayList를 Value로 put함
		ingrListMap.put(1, new ArrayList<Ingredient>());
		// 해쉬 맵에 2을 Key로, 야채 ArrayList를 Value로 put함
		ingrListMap.put(2, new ArrayList<Ingredient>());
		// 해쉬 맵에 3을 Key로, 치즈 ArrayList를 Value로 put함
		ingrListMap.put(3, new ArrayList<Ingredient>());
		// 해쉬 맵에 4을 Key로, 필수토핑 ArrayList를 Value로 put함
		ingrListMap.put(4, new ArrayList<Ingredient>());
		// 해쉬 맵에 5을 Key로, 서브토핑 ArrayList를 Value로 put함
		ingrListMap.put(5, new ArrayList<Ingredient>());
		// 해쉬 맵에 6을 Key로, 소스 ArrayList를 Value로 put함
		ingrListMap.put(6, new ArrayList<Ingredient>());
		// 해쉬 맵에 7을 Key로, 사이드 ArrayList를 Value로 put함
		ingrListMap.put(7, new ArrayList<Ingredient>());
	}
	
	// stock.addQty(VEGE, 1, 3)
	// final변수 써서 stock.addQty(BREAD, 2, 3)이런식으로 쓸 수 있음. 재고 증/차감 할때 사용
	// --> stock의 ingrListMap에서 Key BREAD==1의 Value인 ArrayList를 찾고, 거기의 2번째 index의 값을 3 증가시켜라
	void addQty(int finalIndex, int index, int n)
	{
		int temp = ingrListMap.get(finalIndex).get(index).getQty() + n;
		ingrListMap.get(finalIndex).get(index).setQty(temp);
	}
	
	// stock.getList(VEGE)같이 써서 입력받은걸 Key로 해서
	// 각 그룹의 ArrayList를 반환함(직접 출력하는 메서드를 만드려 했으나 각각 출력 방식이 다를 수도 있을거 같아 일단 배열반환만 해둠)
	ArrayList<Ingredient> getList(int finalIndex)
	{
		return ingrListMap.get(finalIndex);
	}
}