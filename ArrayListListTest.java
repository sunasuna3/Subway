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
		list[0] = "��";
		list[1] = "��ä";
		list[2] = "ġ��";
		list[3] = "����";
		System.out.println(list[BREAD]);
		*/
		
		ArrayList<ArrayList<Ingredient>> list = new ArrayList<ArrayList<Ingredient>>();
		list.add(new ArrayList<Ingredient>());
		list.get(0).add(new Bread("ȭ��Ʈ", 10));
		list.get(0).add(new Bread("��Ƽ", 10));
		
		list.add(new ArrayList<Ingredient>());
		list.get(1).add(new Vege("�����", 10));
		list.get(1).add(new Vege("�Ǹ�", 10));
		
		list.add(new ArrayList<Ingredient>());
		list.get(2).add(new Cheese("�Ƹ޸�ĭġ��", 10));
		list.get(2).add(new Cheese("������ġ��", 10));
		
		list.add(new ArrayList<Ingredient>());
		list.get(3).add(new NecTopping("��Ű", 10));
		list.get(3).add(new NecTopping("��Ʈ��", 10));
		
		list.add(new ArrayList<Ingredient>());
		list.get(4).add(new SubTopping("���ɷ�", 10, 900));
		list.get(4).add(new SubTopping("�ƺ�ī��", 10, 900));
		
		list.add(new ArrayList<Ingredient>());
		list.get(5).add(new Sauce("��ġ", 10));
		list.get(5).add(new Sauce("�������", 10));
		
		list.add(new ArrayList<Ingredient>());
		list.get(6).add(new Side("����� ġ������", 10, 1000));
		list.get(6).add(new Side("ȭ��Ʈ ���ڸ�ī�ٹ̾�", 10, 1000));
		
		System.out.println(list.get(BREAD).get(0).getName());
	}
}