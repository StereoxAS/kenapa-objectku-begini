package pbo;

import java.util.Scanner;

public class Playstore {
	

	public static void main(String[] args) 
	{
		System.out.println("Masukkan UserName dan Password");
		Scanner Login= new Scanner(System.in);
		
		User NewUser1 = new User(Login.next(),Login.next());
		
		System.out.println("You Logged in as"+" "+NewUser1.getUserName()+"\n");
		
		Game Minecraft= new Game("Minecraft","Mojang",99000,"Arcade");
		Game MobileLegend= new Game("Mobile Legend","Moonton",0,"Action");
		
		Scanner Select= new Scanner(System.in);
		Scanner GameChoice = new Scanner(System.in);
		int opt1;
		boolean ok=false;
		
		while (ok==false) {
		Choice.getChoice();
		
		opt1=Select.nextInt();
		
		switch (opt1) 
		{
		case 1:
			System.out.println("Available Games :\n");
			System.out.println("1. Minecraft");
			System.out.println("2. Mobile Legends\n");
			
			int opt;
			opt=GameChoice.nextInt();
			switch(opt) 
			{
			case 1:
				Game.getGameDetail(Minecraft);
				System.out.println("You have bought this game, back to menu");
				ok=false;
				break;
			case 2:
				Game.getGameDetail(MobileLegend);
				break;
			}
		}
			
			
			GameChoice.close();		
		}
		
		
		Pembelian.getDetailPembelian();
		Login.close();
		
	}
//		Selection.getSelect();
//		Minecraft.getGameDetail(Minecraft);
//		MobileLegend.getGameDetail(MobileLegend);	//	public String getListGame() {
//		int opt;
//		System.out.println("1. Minecraft");
//		System.out.println("2. Mobile Legends");
//		Scanner GameChoice = new Scanner(System.in);
//		opt=GameChoice.nextInt();
//		System.out.println("Choose Your Game");
//		switch(opt) {
//		case 1:
//			getGameDetail(Minecraft);
//			break;
//		case 2:
//			getGameDetail(MobileLegend);
//			break;
//		}
//		
//		return ;
//	}	
}

