import java.util.LinkedHashMap;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

// ���⿣ MoneyŬ������
// MoneyŬ������ ��Ƴ��� Wallet Ŭ������ ����

class Money
{
	private String name;
	private int value;
	private int qty;
	
	Money(String name, int value, int qty)
	{
		this.name = name;
		this.value = value;
		this.qty = qty;
	}
	void setName(String name)
	{
		this.name = name;
	}
	String getName()
	{
		return name;
	}
	void setValue(int value)
	{
		this.value = value;
	}
	int getValue()
	{
		return value;
	}
	void setQty(int qty)
	{
		this.qty = qty;
	}
	int getQty()
	{
		return qty;
	}
}

class Wallet
{	
	// �ٸ� ��������� �ٸ��� ������ �� 10000, 5000 ���� String�� �Է� �ޱ�� �ؼ�
	// Wallet���� HashMap�� ���ϴ�.
	LinkedHashMap<String, Money> money;
	
	Wallet()
	{
		money = new LinkedHashMap<String, Money>();
		money.put("10000", new Money("10000", 10000, 0));
		money.put("5000", new Money("5000", 5000, 0));
		money.put("1000", new Money("1000", 1000, 0));
		money.put("500", new Money("500", 500, 0));
		money.put("100", new Money("100", 100, 0));
	}
	
	// ������ int 5���� �ָ� ���ʴ�� ���� �Է�����
	Wallet(int man, int ocheon, int cheon, int obaek, int baek)
	{
		money = new LinkedHashMap<String, Money>();
		money.put("10000", new Money("10000", 10000, man));
		money.put("5000", new Money("5000", 5000, ocheon));
		money.put("1000", new Money("1000", 1000, cheon));
		money.put("500", new Money("500", 500, obaek));
		money.put("100", new Money("100", 100, baek));
	}
	
	// String�� name�� ������ �� qty�� �Է� �޾� ���� ������(������ ������ ������)
	void addQty(String name, int qty)
	{	
		this.money.get(name).setQty(this.getQty(name)+qty);
	}

	// name�� �ش��ϴ� ������ ������ ��ȯ
	int getQty(String name)
	{
		return this.money.get(name).getQty();
	}

	// name�� �ش��ϴ� ������ ��(��ġ)�� ��ȯ
	int getValue(String name)
	{
		return this.money.get(name).getValue();
	}
	
	// name�� qty�� �޾� ����(���� �ƴ�)
	void setQty(String name, int qty)
	{
		this.money.get(name).setQty(qty);
	}
	
	// ���� ������ �Ѿ��� ��ȯ
	int calSum()
	{
		Set<String> set = this.money.keySet();
		Iterator it = set.iterator();
		int sum =0;
		while (it.hasNext())
		{	
			String temp = (String)it.next();
			sum += this.getQty(temp) * this.getValue(temp);
		}
		return sum;
	}
	
	// ���� ���� ����
	void setRandom()
	{
		Random rd = new Random();
		this.setQty("����", rd.nextInt(2));
		this.setQty("��õ��", rd.nextInt(4));
		this.setQty("õ��", rd.nextInt(3));
		this.setQty("�����", rd.nextInt(2));
		this.setQty("���", rd.nextInt(5));
	}
}
