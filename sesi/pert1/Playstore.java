import java.util.Scanner;

public class Playstore {
	

	public static void main(String[] args) 
	{
		int 	opt1;
		int 	opt2;
		boolean ok	= false;
		
		Scanner Login = new Scanner(System.in);
		//Login form
		System.out.println("Masukkan Username dan Password : ");
		User newUser = new User(Login.next(),Login.next());
		System.out.println("You successfully logged in as " + newUser.getUserName() + "\n");
		
		//Game creation
		Game Minecraft= new Game("Minecraft","Mojang",99000,"Arcade");
		Game MobileLegend= new Game("Mobile Legend","Moonton",0,"Action");
		
		
		
		while (ok==false) 
		{
			Choice.getChoice();
			
			opt1 = Login.nextInt();
			switch (opt1) 
			{
				case 1:
				System.out.println("Available Games		:\n"
								 + "1. Minecraft\n"
								 + "2. Mobile Legends\n");
				
				opt2 = Login.nextInt();
				switch(opt2) 
				{
					case 1:
						Game.getGameDetail(Minecraft);
						System.out.println("You have bought this game, back to menu.");
						break;
					case 2:
						Game.getGameDetail(MobileLegend);
						System.out.println("You have bought this game, back to menu.");
						break;
				}
			}		
		}
		
		
		Pembelian.getDetailPembelian();
		Login.close();
		
	}
}