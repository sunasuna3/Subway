import java.util.ArrayList;
import java.util.HashMap;

public class Stock 
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
	
	private HashMap<Integer, ArrayList<Ingredient>> ingrListMap;

    Stock() 
	{	
		ingrListMap = new HashMap<Integer, ArrayList<Ingredient>>();
		
		// �ؽ� �ʿ� 1�� Key��, �� ArrayList�� Value�� put��
		ingrListMap.put(1, new ArrayList<Ingredient>());
		// �ؽ� �ʿ� 2�� Key��, ��ä ArrayList�� Value�� put��
		ingrListMap.put(2, new ArrayList<Ingredient>());
		// �ؽ� �ʿ� 3�� Key��, ġ�� ArrayList�� Value�� put��
		ingrListMap.put(3, new ArrayList<Ingredient>());
		// �ؽ� �ʿ� 4�� Key��, �ʼ����� ArrayList�� Value�� put��
		ingrListMap.put(4, new ArrayList<Ingredient>());
		// �ؽ� �ʿ� 5�� Key��, �������� ArrayList�� Value�� put��
		ingrListMap.put(5, new ArrayList<Ingredient>());
		// �ؽ� �ʿ� 6�� Key��, �ҽ� ArrayList�� Value�� put��
		ingrListMap.put(6, new ArrayList<Ingredient>());
		// �ؽ� �ʿ� 7�� Key��, ���̵� ArrayList�� Value�� put��
		ingrListMap.put(7, new ArrayList<Ingredient>());
	}
	
	// stock.addQty(VEGE, 1, 3)
	// final���� �Ἥ stock.addQty(BREAD, 2, 3)�̷������� �� �� ����. ��� ��/���� �Ҷ� ���
	// --> stock�� ingrListMap���� Key BREAD==1�� Value�� ArrayList�� ã��, �ű��� 2��° index�� ���� 3 �������Ѷ�
	void addQty(int finalIndex, int index, int n)
	{
		int temp = ingrListMap.get(finalIndex).get(index).getQty() + n;
		ingrListMap.get(finalIndex).get(index).setQty(temp);
	}
	
	// stock.getList(VEGE)���� �Ἥ �Է¹����� Key�� �ؼ�
	// �� �׷��� ArrayList�� ��ȯ��(���� ����ϴ� �޼��带 ����� ������ ���� ��� ����� �ٸ� ���� ������ ���� �ϴ� �迭��ȯ�� �ص�)
	ArrayList<Ingredient> getList(int finalIndex)
	{
		return ingrListMap.get(finalIndex);
	}
}