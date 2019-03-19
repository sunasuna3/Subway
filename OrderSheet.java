import java.util.ArrayList;

public class OrderSheet 
{
    OrderSheet() 
	{
		side = new ArrayList<Side>();
    }

    private Sandwich sandwich;

    private ArrayList<Side> side;

    private int priceTot;

	Sandwich getSandwich()
	{
		return sandwich;
	}
	// 주문 받을때 샌드위치 이거로 받으면 됨
	void setSandwich(Sandwich sandwich)
	{
		this.sandwich = sandwich;
	}

	
	// 주문 받은 사이드 메뉴 출력시 이거 쓰면 됨
	ArrayList<Side> getSide()
	{
		return side;
	}
	// 사이드 주문 받을때 사이드 객체를 하나씩 사이드 ArrayList에 더해줌
	void addSide(Side side)
	{
		this.side.add(side);
	}
	void setSide(ArrayList<Side> side)
	{
		this.side = side;
	}

	// 총액 얻기()
	int getPriceTot()
	{
		return priceTot;
	}
	void setPriceTot(int priceTot)
	{
		this.priceTot= priceTot;
	}
	void calPriceTot()
	{
		int sum = 0;
		// 샌드위치 객체의 가격 가져와서 더하기
		sum += this.sandwich.getPrice();
		// 샌드위치 객체에서 ArrayList<subTopping> 가져와서 가격 다 불러와서 더하기
		
	}
}