// �� ������ ���� Ŭ������ Ingredient Ŭ������ ���� Ŭ���� ����
// SubTopping�� Side�� name, qty, price�� �ְ�
// ������ ������ name�� qty�� ����
// �޼���� ��� �� �Ӽ��� ���� getter, setter�鸸 ����
public class Ingredient 
{
    private String name;
    private int qty;
	
	{
		qty =1;
	}
	Ingredient()
	{
	}

	Ingredient(String name, int qty)
	{
		this.name = name;
		this.qty = qty;
	}

    String getName() 
	{
        return name;
    }
    void setName(String name) 
	{
        this.name = name;
    }

    int getQty() 
	{
        return qty;
    }
    void setQty(int qty) 
	{
        this.qty = qty;
    }
}

class Bread extends Ingredient
{
	Bread()
	{}
	Bread(String name, int qty)
	{
		super(name, qty);
	}
}

class Vege extends Ingredient
{
	Vege()
	{}
	Vege(String name, int qty)
	{
		super(name, qty);
	}
}

class Cheese extends Ingredient
{
	Cheese()
	{}
	Cheese(String name, int qty)
	{
		super(name, qty);
	}
}

class Sauce extends Ingredient
{
	Sauce()
	{}
	Sauce(String name, int qty)
	{
		super(name, qty);
	}
}

class NecTopping extends Ingredient
{
	NecTopping()
	{}
	NecTopping(String name, int qty)
	{
		super(name, qty);
	}
}

class SubTopping extends Ingredient
{
	private int price;

	SubTopping()
	{}
	SubTopping(String name, int qty, int price)
	{
		super(name, qty);
		this.price = price;
	}
	
	int getPrice()
	{
		return price;
	}
	void setPrice(int price)
	{
		this.price = price;
	}
}

class Side extends Ingredient
{
	private int price;

	Side()
	{}
	Side(String name, int qty, int price)
	{
		super(name, qty);
		this.price = price;
	}
	
	int getPrice()
	{
		return price;
	}
	void setPrice(int price)
	{
		this.price = price;
	}
}