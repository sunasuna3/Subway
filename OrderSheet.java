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
	// �ֹ� ������ ������ġ �̰ŷ� ������ ��
	void setSandwich(Sandwich sandwich)
	{
		this.sandwich = sandwich;
	}

	
	// �ֹ� ���� ���̵� �޴� ��½� �̰� ���� ��
	ArrayList<Side> getSide()
	{
		return side;
	}
	// ���̵� �ֹ� ������ ���̵� ��ü�� �ϳ��� ���̵� ArrayList�� ������
	void addSide(Side side)
	{
		this.side.add(side);
	}
	void setSide(ArrayList<Side> side)
	{
		this.side = side;
	}

	// �Ѿ� ���()
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
		// ������ġ ��ü�� ���� �����ͼ� ���ϱ�
		sum += this.sandwich.getPrice();
		// ������ġ ��ü���� ArrayList<subTopping> �����ͼ� ���� �� �ҷ��ͼ� ���ϱ�
		
	}
}