import java.util.Scanner;

class Customer
{
	int customerInput()
	{
		Scanner sc = new Scanner(System.in);
		return sc.nextInt();		
	}

	void payment(int orderTotal)
	{
		System.out.println("�����޼ҵ� ����");

		System.out.print("������?\n>>");

		int customerPay = customerInput();

		if (customerPay >= orderTotal)
		{
			System.out.println("���� ���� �Ϸ�!");
			
		}
		else
		{
			System.out.println("�ܾ� ����!");			
		}

	}

}