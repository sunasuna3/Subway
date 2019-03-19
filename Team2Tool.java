import java.io.IOException;

class Team2Tool
{
	static void threeClear(String s)
	{
		try 
		{
			System.out.printf("%s완료 3초뒤 종료 끝나면 비워짐~~\n",s);

			Thread.sleep(1000);			

			System.out.printf("%s완료 2초뒤 종료 끝나면 비워짐~~\n",s);

			Thread.sleep(1000);	

			System.out.printf("%s완료 1초뒤 종료 끝나면 비워짐~~\n",s);

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