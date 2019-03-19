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

	private Wallet changeWallet;        // �ܵ� ����
	private Wallet incomeWallet;        // ���� ����
	private Stock stock;                // ��� â��
	private ArrayList<Sandwich> menu;   // ���� �޴���
	private OrderSheet orderSheet;      // �ֹ���(1ȸ��)
	private ArrayDeque orderSheetList;  // �ֹ�, ���� ������ �ֹ� ���� �״� ��

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
		Admin admin = new Admin();  // << () �� �ȿ� ���� �ڷᱸ�� �ֱ�
		Customer customer = new Customer(); // << 

		admin.start(); // �ʱ� ������ ������ ȭ��
		Team2Tool.clear();

		while (true) // ������ ȭ�� ���� �� while�� ����
		{
			//   ����ȭ�� �ȳ��� ���
			System.out.print("\n  [ ����ȭ�� ��� ] \n\n��Ʈ�� �ƹ��ų� = �Һ��ڸ�� , 0 �Է� = �����ڸ��\n>>");

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
		System.out.print("  [�������] \n�մ�ȭ�� ����1 ����2\n>>");

		if (customer.customerInput()==1)
		{
			easyOrder(customer); // ���� �ֹ� �б�
		}
		else
		{
			basicOrder(customer); // ���� �ֹ� �б�
		}

		int orderTotal = 10000;  // 10000���� �մ��� �ֹ��� �ֹ����� ����ؼ� �����ϴ� ��ɾ� �ֱ� ~

		customer.payment(orderTotal); // �ӽ÷� ���� ��, orderTotal(�Ѿ�) �մԿ��� 

		printReceipt();

		Team2Tool.threeClear("����");

	}

	void easyOrder(Customer customer)
	{	
		Team2Tool.clear();
		System.out.print("�����ֹ���~\n�޴��Է¾ƹ��ų�\n>>");	
		customer.customerInput();
	}

	void basicOrder(Customer customer)
	{
		Team2Tool.clear();
		System.out.print("�����ֹ���~\n ����Է¾ƹ��ų�\n>>");
		customer.customerInput();
	}

	void printReceipt()
	{
		// ������ ����Ʈ ���ִ� �޼ҵ� ~~ �ڷᱸ�� �ϼ��Ǹ� ����~~
	}

	void setDefault()
	{
		stock.getList(1).add(new Bread("ȭ��Ʈ", 10));
		stock.getList(1).add(new Bread("��Ƽ", 10));
		stock.getList(1).add(new Bread("�ĸ����������", 10));
		stock.getList(1).add(new Bread("��Ʈ", 10));
		stock.getList(1).add(new Bread("��Ͽ�Ʈ", 10));
		stock.getList(1).add(new Bread("�÷��극��", 10));

		stock.getList(2).add(new Vege("�����", 10));
		stock.getList(2).add(new Vege("�Ǹ�", 10));
		stock.getList(2).add(new Vege("����", 10));
		stock.getList(2).add(new Vege("�丶��", 10));
		stock.getList(2).add(new Vege("����", 10));
		stock.getList(2).add(new Vege("��Ŭ", 10));
		stock.getList(2).add(new Vege("�Ҷ��Ǵ�", 10));
		stock.getList(2).add(new Vege("�ø���", 10));

		stock.getList(3).add(new Cheese("�Ƹ޸�ĭġ��", 10));
		stock.getList(3).add(new Cheese("������ġ��", 10));
		// �ʼ����� ���ϴ°� �ʿ�
		stock.getList(4).add(new NecTopping("��Ű", 10));
		stock.getList(4).add(new NecTopping("��Ʈ��", 10));
		stock.getList(4).add(new NecTopping("��ġ", 10));

		stock.getList(5).add(new SubTopping("������", 10, 900));
		stock.getList(5).add(new SubTopping("���׸���", 10, 900));
		stock.getList(5).add(new SubTopping("���ɷ�", 10, 900));
		stock.getList(5).add(new SubTopping("�ƺ�ī��", 10, 900));
		stock.getList(5).add(new SubTopping("������", 10, 900));
		stock.getList(5).add(new SubTopping("���۷δ�", 10, 900));
		stock.getList(5).add(new SubTopping("����ġ��", 10, 900));

		stock.getList(6).add(new Sauce("������ν���", 10)); //0
		stock.getList(6).add(new Sauce("��Ż���ȵ巹��", 10));//1
		stock.getList(6).add(new Sauce("��ġ", 10));//2
		stock.getList(6).add(new Sauce("�������", 10));//3
		stock.getList(6).add(new Sauce("��콺����Ʈ", 10));//4
		stock.getList(6).add(new Sauce("��������Ϸ���", 10));//5
		stock.getList(6).add(new Sauce("Ȧ������", 10));//6
		stock.getList(6).add(new Sauce("�ұ�", 10));//7
		stock.getList(6).add(new Sauce("����", 10));//8
		stock.getList(6).add(new Sauce("��ϸӽ�Ÿ��", 10));//9
		stock.getList(6).add(new Sauce("ĥ��", 10));//10
		stock.getList(6).add(new Sauce("�ͻ�����", 10));//11

		stock.getList(7).add(new Side("��������Ĩ", 10, 1000));
		stock.getList(7).add(new Side("����Ĩ", 10, 1000));
		stock.getList(7).add(new Side("��Ʈ�� ������", 10, 1000));
		stock.getList(7).add(new Side("����� ġ������", 10, 1000));
		stock.getList(7).add(new Side("ȭ��Ʈ ���ڸ�ī�ٹ̾�", 10, 1000));
		stock.getList(7).add(new Side("����ݸ�ġ�����", 10, 2000));
		stock.getList(7).add(new Side("�����������������", 10, 2000));
		stock.getList(7).add(new Side("�ؽú���", 10, 1000));
		stock.getList(7).add(new Side("Ĩ", 10, 1000));
		stock.getList(7).add(new Side("�ݶ�", 10, 1500));
		stock.getList(7).add(new Side("���̴�", 10, 1500));
		stock.getList(7).add(new Side("Ŀ��", 10, 1500));
		stock.getList(7).add(new Side("��", 10, 1500));

		// ����
		Sandwich vegeSandwich = new Sandwich();
		vegeSandwich.setName("����");
		vegeSandwich.setQty(0);
		vegeSandwich.setPrice(5000);
		vegeSandwich.setBread((Bread)(stock.getList(BREAD).get(0))); // ���� �⺻��
		// ��ä �ֱ�
		Iterator it = stock.getList(VEGE).iterator();
		while (it.hasNext())
		{
			vegeSandwich.addIngr(VEGE, (Ingredient)(it.next()));
		}
		// ġ�� �ֱ�
		vegeSandwich.addIngr(CHEESE, stock.getList(CHEESE).get(0));
		// �ҽ� �ֱ�
		vegeSandwich.addIngr(SAUCE, stock.getList(SAUCE).get(0));
		vegeSandwich.addIngr(SAUCE, stock.getList(SAUCE).get(1));
		vegeSandwich.addIngr(SAUCE, stock.getList(SAUCE).get(7));
		
		// �ϼ��� ���� �߰�
		menu.add(vegeSandwich);


		// ��Ű
		Sandwich turkeySandwich = new Sandwich();
		turkeySandwich.setName("��Ű");
		turkeySandwich.setQty(0);
		turkeySandwich.setPrice(8000);
		turkeySandwich.setBread((Bread)(stock.getList(BREAD).get(0))); // ���� �⺻��
		it = stock.getList(VEGE).iterator();
		while (it.hasNext())
		{
			turkeySandwich.addIngr(VEGE, (Ingredient)(it.next()));
		}
		// �ʼ� ����
		turkeySandwich.addIngr(NECTOPPING, stock.getList(NECTOPPING).get(0));
		// ġ�� �ֱ�
		turkeySandwich.addIngr(CHEESE, stock.getList(CHEESE).get(0));
		// �ҽ� �ֱ�
		turkeySandwich.addIngr(SAUCE, stock.getList(SAUCE).get(2));
		turkeySandwich.addIngr(SAUCE, stock.getList(SAUCE).get(3));
		turkeySandwich.addIngr(SAUCE, stock.getList(SAUCE).get(4));
		turkeySandwich.addIngr(SAUCE, stock.getList(SAUCE).get(5));

		// �ϼ��� ��Ű �߰�
		menu.add(turkeySandwich);

		// ��ġ
		Sandwich tunaSandwich = new Sandwich();
		tunaSandwich.setName("��ġ");
		tunaSandwich.setQty(0);
		tunaSandwich.setPrice(7000);
		tunaSandwich.setBread((Bread)(stock.getList(BREAD).get(0))); // ���� �⺻��
		it = stock.getList(VEGE).iterator();
		while (it.hasNext())
		{
			tunaSandwich.addIngr(VEGE, (Ingredient)(it.next()));
		}
		// �ʼ� ����
		tunaSandwich.addIngr(NECTOPPING, stock.getList(NECTOPPING).get(2));
		// ġ�� �ֱ�
		tunaSandwich.addIngr(CHEESE, stock.getList(CHEESE).get(0));
		// �ҽ� �ֱ�
		tunaSandwich.addIngr(SAUCE, stock.getList(SAUCE).get(6));
		tunaSandwich.addIngr(SAUCE, stock.getList(SAUCE).get(9));

		// �ϼ��� ��ġ �߰�
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