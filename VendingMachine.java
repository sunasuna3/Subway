import java.util.ArrayDeque;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

class VendingMachine
{
	static final int BREAD = 1;
	static final int VEGE = 2;
    static final int CHEESE = 3;
    static final int NECTOPPING = 4;
	static final int SUBTOPPING = 5;
	static final int SAUCE = 6;
	static final int SIDE = 7;

	private Wallet changeWallet;        // 잔돈 돈통
	private Wallet incomeWallet;        // 수입 돈통
	private Stock stock;                // 재고 창고
	private ArrayList<Sandwich> menu;   // 현재 메뉴들
	private OrderSheet orderSheet;      // 주문서(1회용)
	private ArrayDeque orderSheetList;  // 주문, 결제 끝나면 주문 내역 쌓는 곳

	VendingMachine()
	{
		changeWallet = new Wallet();
		incomeWallet = new Wallet();
		stock = new Stock();
		menu = new ArrayList<Sandwich>();
		orderSheet = new OrderSheet();
		orderSheetList = new ArrayDeque();
	}

	void start()
	{
		//HashMap<Integer,Object> ob1 = new HashMap<Integer,Object>();
		Admin admin = new Admin();  // << () 이 안에 보낼 자료구조 넣기
		Customer customer = new Customer(); // << 

		admin.start(); // 초기 실행은 관리자 화면
		Team2Tool.clear();

		while (true) // 관리자 화면 종료 시 while문 진입
		{
			//   메인화면 안내문 출력
			System.out.print("\n  [ 메인화면 출력 ] \n\n인트값 아무거나 = 소비자모드 , 0 입력 = 관리자모드\n>>");

			if (admin.adminInput()==0)
			{
				Team2Tool.clear();
				admin.start();				
				
			}
			else
			{
				Team2Tool.clear();
				order(customer);				
			}
			
		}
	}

	void order(Customer customer)
	{		
		System.out.print("  [어서오세요] \n손님화면 쉬운1 보통2\n>>");

		if (customer.customerInput()==1)
		{
			easyOrder(customer); // 쉬운 주문 분기
		}
		else
		{
			basicOrder(customer); // 보통 주문 분기
		}

		int orderTotal = 10000;  // 10000에는 손님이 주문한 주문서를 계산해서 산출하는 명령어 넣기 ~

		customer.payment(orderTotal); // 임시로 넣은 값, orderTotal(총액) 손님에게 

		printReceipt();

		Team2Tool.threeClear("결제");

	}

	void easyOrder(Customer customer)
	{	
		Team2Tool.clear();
		System.out.print("쉬운주문임~\n메뉴입력아무거나\n>>");	
		customer.customerInput();
	}

	void basicOrder(Customer customer)
	{
		Team2Tool.clear();
		System.out.print("보통주문임~\n 재료입력아무거나\n>>");
		customer.customerInput();
	}

	void printReceipt()
	{
		// 영수증 프린트 해주는 메소드 ~~ 자료구조 완성되면 쉬움~~
	}

	void setDefault()
	{
		stock.getList(1).add(new Bread("화이트", 10));
		stock.getList(1).add(new Bread("하티", 10));
		stock.getList(1).add(new Bread("파마산오레가노", 10));
		stock.getList(1).add(new Bread("위트", 10));
		stock.getList(1).add(new Bread("허니오트", 10));
		stock.getList(1).add(new Bread("플랫브레드", 10));

		stock.getList(2).add(new Vege("양상추", 10));
		stock.getList(2).add(new Vege("피망", 10));
		stock.getList(2).add(new Vege("양파", 10));
		stock.getList(2).add(new Vege("토마토", 10));
		stock.getList(2).add(new Vege("오이", 10));
		stock.getList(2).add(new Vege("피클", 10));
		stock.getList(2).add(new Vege("할라피뇨", 10));
		stock.getList(2).add(new Vege("올리브", 10));

		stock.getList(3).add(new Cheese("아메리칸치즈", 10));
		stock.getList(3).add(new Cheese("슈레드치즈", 10));
		// 필수토핑 정하는거 필요
		stock.getList(4).add(new NecTopping("터키", 10));
		stock.getList(4).add(new NecTopping("미트볼", 10));
		stock.getList(4).add(new NecTopping("참치", 10));

		stock.getList(5).add(new SubTopping("쉬림프", 10, 900));
		stock.getList(5).add(new SubTopping("에그마요", 10, 900));
		stock.getList(5).add(new SubTopping("오믈렛", 10, 900));
		stock.getList(5).add(new SubTopping("아보카도", 10, 900));
		stock.getList(5).add(new SubTopping("베이컨", 10, 900));
		stock.getList(5).add(new SubTopping("페퍼로니", 10, 900));
		stock.getList(5).add(new SubTopping("더블치즈", 10, 900));

		stock.getList(6).add(new Sauce("레드와인식초", 10)); //0
		stock.getList(6).add(new Sauce("이탈리안드레싱", 10));//1
		stock.getList(6).add(new Sauce("랜치", 10));//2
		stock.getList(6).add(new Sauce("마요네즈", 10));//3
		stock.getList(6).add(new Sauce("사우스웨스트", 10));//4
		stock.getList(6).add(new Sauce("사우전아일랜드", 10));//5
		stock.getList(6).add(new Sauce("홀스래디쉬", 10));//6
		stock.getList(6).add(new Sauce("소금", 10));//7
		stock.getList(6).add(new Sauce("후추", 10));//8
		stock.getList(6).add(new Sauce("허니머스타드", 10));//9
		stock.getList(6).add(new Sauce("칠리", 10));//10
		stock.getList(6).add(new Sauce("와사비소이", 10));//11

		stock.getList(7).add(new Side("더블초코칩", 10, 1000));
		stock.getList(7).add(new Side("초코칩", 10, 1000));
		stock.getList(7).add(new Side("오트밀 레이즌", 10, 1000));
		stock.getList(7).add(new Side("라즈베리 치즈케익", 10, 1000));
		stock.getList(7).add(new Side("화이트 초코마카다미아", 10, 1000));
		stock.getList(7).add(new Side("브로콜리치즈수프", 10, 2000));
		stock.getList(7).add(new Side("베이컨포테이토수프", 10, 2000));
		stock.getList(7).add(new Side("해시브라운", 10, 1000));
		stock.getList(7).add(new Side("칩", 10, 1000));
		stock.getList(7).add(new Side("콜라", 10, 1500));
		stock.getList(7).add(new Side("사이다", 10, 1500));
		stock.getList(7).add(new Side("커피", 10, 1500));
		stock.getList(7).add(new Side("물", 10, 1500));

		// 베지
		Sandwich vegeSandwich = new Sandwich();
		vegeSandwich.setName("베지");
		vegeSandwich.setQty(0);
		vegeSandwich.setPrice(5000);
		vegeSandwich.setBread((Bread)(stock.getList(BREAD).get(0))); // 베지 기본빵
		// 야채 넣기
		Iterator it = stock.getList(VEGE).iterator();
		while (it.hasNext())
		{
			vegeSandwich.addIngr(VEGE, (Ingredient)(it.next()));
		}
		// 치즈 넣기
		vegeSandwich.addIngr(CHEESE, stock.getList(CHEESE).get(0));
		// 소스 넣기
		vegeSandwich.addIngr(SAUCE, stock.getList(SAUCE).get(0));
		vegeSandwich.addIngr(SAUCE, stock.getList(SAUCE).get(1));
		vegeSandwich.addIngr(SAUCE, stock.getList(SAUCE).get(7));
		
		// 완성한 베지 추가
		menu.add(vegeSandwich);


		// 터키
		Sandwich turkeySandwich = new Sandwich();
		turkeySandwich.setName("터키");
		turkeySandwich.setQty(0);
		turkeySandwich.setPrice(8000);
		turkeySandwich.setBread((Bread)(stock.getList(BREAD).get(0))); // 베지 기본빵
		it = stock.getList(VEGE).iterator();
		while (it.hasNext())
		{
			turkeySandwich.addIngr(VEGE, (Ingredient)(it.next()));
		}
		// 필수 토핑
		turkeySandwich.addIngr(NECTOPPING, stock.getList(NECTOPPING).get(0));
		// 치즈 넣기
		turkeySandwich.addIngr(CHEESE, stock.getList(CHEESE).get(0));
		// 소스 넣기
		turkeySandwich.addIngr(SAUCE, stock.getList(SAUCE).get(2));
		turkeySandwich.addIngr(SAUCE, stock.getList(SAUCE).get(3));
		turkeySandwich.addIngr(SAUCE, stock.getList(SAUCE).get(4));
		turkeySandwich.addIngr(SAUCE, stock.getList(SAUCE).get(5));

		// 완성한 터키 추가
		menu.add(turkeySandwich);

		// 참치
		Sandwich tunaSandwich = new Sandwich();
		tunaSandwich.setName("참치");
		tunaSandwich.setQty(0);
		tunaSandwich.setPrice(7000);
		tunaSandwich.setBread((Bread)(stock.getList(BREAD).get(0))); // 베지 기본빵
		it = stock.getList(VEGE).iterator();
		while (it.hasNext())
		{
			tunaSandwich.addIngr(VEGE, (Ingredient)(it.next()));
		}
		// 필수 토핑
		tunaSandwich.addIngr(NECTOPPING, stock.getList(NECTOPPING).get(2));
		// 치즈 넣기
		tunaSandwich.addIngr(CHEESE, stock.getList(CHEESE).get(0));
		// 소스 넣기
		tunaSandwich.addIngr(SAUCE, stock.getList(SAUCE).get(6));
		tunaSandwich.addIngr(SAUCE, stock.getList(SAUCE).get(9));

		// 완성한 참치 추가
		menu.add(tunaSandwich);
	}

	void setTest()
	{
		System.out.println("setTest");
		System.out.println(menu.get(1).getName());
		System.out.println(menu.get(1).getExceptBreadMap().get(VEGE).get(0).getName());
		System.out.println(menu.get(1).getExceptBreadMap().get(VEGE).get(1).getName());
		System.out.println(menu.get(1).getExceptBreadMap().get(VEGE).get(2).getName());
		System.out.println(menu.get(1).getExceptBreadMap().get(VEGE).get(3).getName());
	}
}