// 각 재료들의 상위 클래스인 Ingredient 클래스와 재료들 클래스 있음
// SubTopping과 Side만 name, qty, price가 있고
// 나머지 재료들은 name과 qty만 있음
// 메서드는 모두 각 속성에 대한 getter, setter들만 있음
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