import java.io.IOException;

class Team2Tool
{
	static void threeClear(String s)
	{
		try 
		{
			System.out.printf("%s�Ϸ� 3�ʵ� ���� ������ �����~~\n",s);

			Thread.sleep(1000);			

			System.out.printf("%s�Ϸ� 2�ʵ� ���� ������ �����~~\n",s);

			Thread.sleep(1000);	

			System.out.printf("%s�Ϸ� 1�ʵ� ���� ������ �����~~\n",s);

			Thread.sleep(1000);	

			new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

		}
		catch (InterruptedException e)
		{
		}
		catch (IOException e)
		{
		}
	}

	static void clear()
	{
		try 
		{
			new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

		}
		catch (InterruptedException e)
		{
		}
		catch (IOException e)
		{
		}
	}
}