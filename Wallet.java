import java.util.LinkedHashMap;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

// 여기엔 Money클래스와
// Money클래스를 담아놓은 Wallet 클래스가 있음

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
	// 다른 선택지들과 다르게 결제할 땐 10000, 5000 같이 String을 입력 받기로 해서
	// Wallet에선 HashMap을 씁니다.
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
	
	// 생성시 int 5개를 주면 차례대로 갯수 입력해줌
	Wallet(int man, int ocheon, int cheon, int obaek, int baek)
	{
		money = new LinkedHashMap<String, Money>();
		money.put("10000", new Money("10000", 10000, man));
		money.put("5000", new Money("5000", 5000, ocheon));
		money.put("1000", new Money("1000", 1000, cheon));
		money.put("500", new Money("500", 500, obaek));
		money.put("100", new Money("100", 100, baek));
	}
	
	// String의 name과 조정할 양 qty를 입력 받아 양을 조절함(음수를 받으면 차감됨)
	void addQty(String name, int qty)
	{	
		this.money.get(name).setQty(this.getQty(name)+qty);
	}

	// name에 해당하는 지폐의 갯수를 반환
	int getQty(String name)
	{
		return this.money.get(name).getQty();
	}

	// name에 해당하는 지폐의 값(가치)을 반환
	int getValue(String name)
	{
		return this.money.get(name).getValue();
	}
	
	// name과 qty를 받아 셋팅(증감 아님)
	void setQty(String name, int qty)
	{
		this.money.get(name).setQty(qty);
	}
	
	// 현재 지갑의 총액을 반환
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
	
	// 랜덤 지갑 생성
	void setRandom()
	{
		Random rd = new Random();
		this.setQty("만원", rd.nextInt(2));
		this.setQty("오천원", rd.nextInt(4));
		this.setQty("천원", rd.nextInt(3));
		this.setQty("오백원", rd.nextInt(2));
		this.setQty("백원", rd.nextInt(5));
	}
}
