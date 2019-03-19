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
		System.out.println("결제메소드 진입");

		System.out.print("얼마있음?\n>>");

		int customerPay = customerInput();

		if (customerPay >= orderTotal)
		{
			System.out.println("결제 정상 완료!");
			
		}
		else
		{
			System.out.println("잔액 부족!");			
		}

	}

}