import java.util.Scanner;
import java.io.IOException;

class Admin
{
	//HashMap<Integer,Object> ob2;
	//Admin(HashMap<Integer,Object> ob1)
	//{
		//ob2 = ob1;
	//}
	
	void start()
	{		
		while (true)
		{
			System.out.print("[������ ���]  \n1�޴����� \n2���� \n3������ \n4��弱�����ΰ���\n>>");
			switch (adminInput())
			{		
			case 1: menuSetting(); break;
			case 2: counting(); break;
			case 3: ingrSetting(); break;
			case 4: return;		
			
			}			
		}		
	}

	int adminInput()
	{
		Scanner sc = new Scanner(System.in);
		return sc.nextInt();
	}

	void menuSetting()
	{
		System.out.println("�޴� ���� ����");
		Team2Tool.threeClear("�޴�");

	}

	void counting()
	{
		System.out.println("���� ȭ�� ����");	

		Team2Tool.threeClear("����");
	}

	void ingrSetting()
	{
		System.out.println("����������~");

		Team2Tool.threeClear("������");
	}

}

