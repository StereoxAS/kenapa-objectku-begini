package pbo;

import java.util.Scanner;

public class Selection
{
	private static final String Minecraft = null;
	private static final String MobileLegend = null;
	private static Game game;

	public static void getSelect() 
	{
		Scanner Select= new Scanner(System.in);
		int opt1;
		
		opt1=Select.nextInt();
		switch (opt1) 
		{
		case 1:
			System.out.println("Available Games :\n");
			System.out.println("1. Minecraft");
			System.out.println("2. Mobile Legends\n");
			
			
			Scanner GameChoice = new Scanner(System.in);
			int opt;
			opt=GameChoice.nextInt();
//			switch(opt) 
//			{
//			case 1:
//				Selection.getGameDetail(Minecraft);
//				break;
//			case 2:
//				Selection.getGameDetail(MobileLegend);
//				break;
//			}
//			
			
			GameChoice.close();		
		}
	}
}