import java.util.ArrayList;
import java.util.HashMap;

public class Sandwich 
{
	
	// �� final �������� VM�� �ٰ���. ���� ��������� �����
	// �̰� ���� ����: �ڵ� ¥�� ������.�ؿ� �޼ҵ�� ����.
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
    private String description; // ���߿� �޴� ���� ������ ������ ���⵵ �ؼ� �ϴ� �־� ����

	// �޼��带 �����ϸ� �����ڸ� ���� �� ArrayList�� �������ش�.
	// name, price, qty, bread, description�� ���� �Է����ָ� ������
	// ArrayList�� ������� �Ӽ����� ���� �Է��� �ƴ϶� ArrayList�� add�޼��带 ���� ����Ʈ�� �߰������ �ϱ� ������ ArrayList�� �ν��Ͻ��� �����ϴ� ���̴�.
    Sandwich() 
	{	
		exceptBreadMap = new HashMap<Integer, ArrayList<Ingredient>>();

		// ��ä ArrayList�� exceptBreadMap HashMap�� Key=2�� ����
		exceptBreadMap.put(2, new ArrayList<Ingredient>());
		// ġ�� ArrayList�� exceptBreadMap HashMap�� Key=3�� ����
		exceptBreadMap.put(3, new ArrayList<Ingredient>());
		// �ʼ����� ArrayList�� exceptBreadMap HashMap�� Key=4�� ����
		exceptBreadMap.put(4, new ArrayList<Ingredient>());
		// �������� ArrayList�� exceptBreadMap HashMap�� Key=5�� ����
		exceptBreadMap.put(5, new ArrayList<Ingredient>());
		// �ҽ� AArrayList�� exceptBreadMap HashMap�� Key=6�� ����
		exceptBreadMap.put(6, new ArrayList<Ingredient>());
    }

	// ������ġ �����ÿ� ��� �߰��ϴ� �޼���
	// sandwich.addIngr(VEGE, ��ä��ü1) -> VEGE�� Key�� ��ä ArrayList�� ã�� �ű⿡ ��ä��ü1�� ����.
	void addIngr(int finalIndex, Ingredient ingr)
	{
		exceptBreadMap.get(finalIndex).add(ingr);
	}



	// �Ʒ��� �׳� getter setter��
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