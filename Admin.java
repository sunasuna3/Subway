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
			System.out.print("[관리자 모드]  \n1메뉴셋팅 \n2정산 \n3재료관리 \n4모드선택으로가기\n>>");
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
		System.out.println("메뉴 셋팅 진입");
		Team2Tool.threeClear("메뉴");

	}

	void counting()
	{
		System.out.println("정산 화면 진입");	

		Team2Tool.threeClear("정산");
	}

	void ingrSetting()
	{
		System.out.println("재료관리했음~");

		Team2Tool.threeClear("재료관리");
	}

}

