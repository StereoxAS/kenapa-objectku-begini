import java.util.Scanner;

public class Selection
{
	public static void getSelect() 
	{
		int opt1;
		
		Scanner Select = new Scanner(System.in);
	
		opt1 = Select.nextInt();
		switch (opt1) 
		{
		case 1:
			System.out.println("Available Games :\n");
			System.out.println("1. Minecraft");
			System.out.println("2. Mobile Legends\n");	
		case 2:
			System.out.println("Available Apps :\n");
			System.out.println("1. App 1");
			System.out.println("2. App 2\n");	
		case 3:
			System.out.println("Available Music :\n");
			System.out.println("1. Music 1");
			System.out.println("2. Music 2\n");	
		}
		Select.close();
	}
}