import java.util.*;

public class test 
{
	
	public static void main(String[] args) 
	{
		/*
		 * Buat character creation-nya.
		 * Nama 	-> Input
		 * Gender	-> Pilihan
		 * Job 		-> Pilihan
		 * Race 	-> Pilihan
		 * Max. 8 characters.
		 * 
		 * Race description belum ada class-nya. 
		 * Gender description juga belum ada
		 */
		
		String nama = "Undefined";
		String genderString;
		String jobString;
		String raceString;
		CharaGender gender = null;
		CharaJobEnum job = null;
		CharaRaceEnum race = null;
		String yes;
		boolean bool = false;
		int i;
		
		Scanner scan = new Scanner(System.in);
		List<Chara> newChara = new ArrayList<Chara>();
		System.out.println("Dungeon and Dragons Character Creation\n\n\n");
		for(i = 1; i < 2; i++) 
		{
			while(bool == false)
			{
				System.out.print("Enter your name : ");
				nama = scan.next();
				System.out.println("\n" + nama + ", is that true ? [Y/N]");
				yes = scan.next();
				if(yes.equalsIgnoreCase("Y"))
				{
					bool = true;
				}
				else
				{
					bool = false;
				}
			}
			
			
			System.out.println("1. MALE");
			System.out.println("   Males of the Realm can excel in whatever profession\n"
					         + "   they choose, whether wizardry, thievery, or the arts of war.\n"
					         + "   All males have +1 bonus to Strength.\n");
			System.out.println("2. FEMALE");
			System.out.println("   Females of the Realm can excel in any areas they wish\n"
							 + "   and are easily the equal of their male counterparts\n"
							 + "   in every skill or respect."
							 + "   All females have +1 bonus to Intelligence.\n\n");
			System.out.println("Select your gender : ");
			genderString = scan.next();
			bool = false;
			while(bool == false)
			{
				if(genderString.equalsIgnoreCase("Male") || genderString.equalsIgnoreCase("1"))
				{
					gender = CharaGender.MALE;
					break;
				}
				else if(genderString.equalsIgnoreCase("Female") || genderString.equalsIgnoreCase("2"))
				{
					gender = CharaGender.FEMALE;
					break;
				}
				else
				{
					System.out.println("There's no such gender.");
				}
			}
			
			System.out.println("\n\n"
							 + "1. Human\n"
							 + "2. Elves\n"
							 + "3. Orcs\n"
							 + "4. Goblin\n"
							 + "5. Gnome\n"
							 + "6. Halfling\n"
							 + "7. Dwarves\n"
							 + "8. Khajiit\n"
							 + "9. Argonian\n");
			
			while(bool == false)
			{
				System.out.print("Select your Race : ");
				raceString = scan.next();
				System.out.println("\n");
				if(raceString.equalsIgnoreCase("Human") || genderString.equals("1"))
				{
					race = CharaRaceEnum.HUMAN;
					System.out.println("Humans are the most common race and rule most of "
							+ "\nthe civilizations of Faerûn. They are generally considered the scale against "
							+ "\nwhich the traits of other races are measured as weaker or stronger. "
							+ "\nUnlike all other races, humans can pursue any course in life. "
							+ "\nThey could well be defined as privileged over other races, especially outcasts "
							+ "\nsuch as half-orcs whose options in life are severely limited. Despite their "
							+ "\nprivilege, individual humans are no better or worse than members of any other "
							+ "\nrace and are generally kind and hospitable to their own and others."
							+ "\n\n All Human get +2 bonus to Vitality and Charisma.");
				}
				else if(raceString.equalsIgnoreCase("Elves") || genderString.equals("2"))
				{
					race = CharaRaceEnum.ELF;
					System.out.println("Elves are generally considered one of the most beautiful races. "
							+ "\nThey are slightly shorter and more delicate than humans and are not as "
							+ "\nhardy. Elves are a rare sight on the sword coast perhaps because they "
							+ "\nprefer the wild to human cities. While they are well known as a cheerful "
							+ "\nand frolicsome race many elves, especially drow, are as surly as dwarves "
							+ "\nor as prideful as humans. "
							+ "\n\nThere are many racial divisions of elves: Gold elves, drow "
							+ "\n(aka dark elves), moon elves, sea elves, wild elves, and winged elves "
							+ "\n(aka avariel). Elves are generally liked and even admired by humans "
							+ "\nand are easily accepted into their society. The same cannot be said "
							+ "\nfor dwarves some of whom despise elves on principle."
							+ "\n\n All Elves get +2 bonus to Intelligence and Charisma.");

				}
				else if(raceString.equalsIgnoreCase("Orcs") || genderString.equals("3"))
				{
					race = CharaRaceEnum.ORC;
					System.out.println("Orcs are violent, primitive humanoids that have plagued Faerûn "
							+ "\nfor aeons, though the Orcgate Wars brought to Toril the fearsome gray "
							+ "\norcs which, while more civilized than their mountain orc kin, are just "
							+ "\nas proficient and savage in combat. Interbreeding often results in "
							+ "\nhalf-orc offspring among both humans and orc tribes, with the former "
							+ "\noften being outcasts and the latter being even more harshly-treated, "
							+ "\noften resulting in a poor outlook regarding civilization."
							+ "\n\n All Orcs get +3 bonus to Strength and +1 bonus to Dexterity.");

				}
				else if(raceString.equalsIgnoreCase("Goblin") || genderString.equals("4"))
				{
					race = CharaRaceEnum.GOBLIN;
					System.out.println("Goblins are small, humanoid creatures that live across Tamriel. "
							+ "\nThey are often found living in clans, and appear to be somewhat related "
							+ "\nto mer."
							+ "\n\nVarious cultures in Tamriel have enslaved Goblins from time to time "
							+ "\nthroughout history. The Tsaesci of Akavir reportedly brought goblins along "
							+ "\nduring their invasion of Tamriel as servants and Cannon Fodder. "
							+ "\nThe Altmer have similarly employed Goblins in this fashion at different "
							+ "\npoints in history."
							+ "\n\n All Goblins get +2 bonus to Dexterity and Intelligence.");

				}
				else if(raceString.equalsIgnoreCase("Gnome") || genderString.equals("5"))
				{
					race = CharaRaceEnum.GNOME;
					System.out.println("Gnomes are a small race, almost as short as halflings and more "
							+ "\nfinely built than dwarves. Gnomes have dark to tan skin and dark hair. "
							+ "\nDwarves are their distant cousins and they share the love of glittering "
							+ "\nthings though gnomes have more affection and respect for the natural world "
							+ "\nthan dwarves do. Gnomes love jokes and are very clever; some might even "
							+ "\ncall them devious. Gnomes can be anything from fighters to illusionists "
							+ "\nand are far more capable than they appear."
							+ "\n\n All Gnomes get +2 bonus to Dexterity and Wisdom.");

				}
				else if(raceString.equalsIgnoreCase("Halfling") || raceString.equalsIgnoreCase("Hobbit") || genderString.equals("6"))
				{
					race = CharaRaceEnum.HALFLING;
					System.out.println("Halflings are short, generally plump people, very much like "
							+ "\nsmall humans. Their faces are round and broad, and often quite florid. "
							+ "\nTheir hair is typically curly, and the tops of their feet are covered "
							+ "\nwith coarse hair. Overall they prefer the comforts of home to dangerous "
							+ "\nadventuring. They enjoy good living, rough humor, and homespun tales. "
							+ "\nThere are three racial divisions of halflings within "
							+ "\nthe Realms: the hairfoot, tallfellow, and stout."
							+ "\n\n All Halflings get +4 bonus to Dexterity.");

				}
				else if(raceString.equalsIgnoreCase("Dwarves") || genderString.equals("7"))
				{
					race = CharaRaceEnum.DWARF;
					System.out.println("Dwarves are short and stocky, easily identifiable by their size "
							+ "\nand shape. They have ruddy cheeks, dark eyes, and dark hair. "
							+ "\nDwarves tend to be dour and taciturn. They are given to hard work, "
							+ "\nand care little for most humor. They enjoy beer, ale, mead, but most of all, "
							+ "\nthey love gold. There are four racial divisions of dwarves within "
							+ "\nthe Realms: shield dwarves, gold dwarves, wild dwarves, and duergar."
							+ "\n\n All Dwarves get +3 bonus to Vitality and +1 bonus to Strength.");

				}
				else if(raceString.equalsIgnoreCase("Khajiit") || genderString.equals("8"))
				{
					race = CharaRaceEnum.KHAJIIT;
					System.out.println("Khajiit are one of the ten default playable races in The Elder Scrolls. "
							+ "\nThey are one of the beast races which inhabit the continent of Tamriel, primarily "
							+ "\ntheir home province of Elsweyr. They are known for their natural agility, stealth,"
							+ "\n and their production of Moon Sugar, which can be refined into skooma. "
							+ "\nThey travel around selling their wares but are not usually trusted, due to "
							+ "\nthe racial prejudice of many of the races in Tamriel, resulting possibly from "
							+ "\nthe belief that most Khajiit are thieves."
							+ "\n\n All Khajiit get +3 bonus to Charisma and +1 bonus to Wisdom.");

				}
				else if(raceString.equalsIgnoreCase("Argonian") || genderString.equals("9"))
				{
					race = CharaRaceEnum.ARGONIAN;
					System.out.println("Argonians or Saxhleel are an oviparous race of reptilian people native to "
							+ "\nthe large and marshy province known as Black Marsh, a region of Tamriel. They can "
							+ "\nbe found in smaller numbers throughout the continent, and have been featured in "
							+ "\nevery one of the main games thus far. Argonians are one of the few races completely "
							+ "\nunrelated to men and mer, being descended directly from the Hist."
							+ "\n\n All Argonian get +3 bonus to Strength and +1 bonus to Vitality.");
				}
				else
				{
					System.out.println("There's no such race.\n");
				}
				System.out.println("\nSelect " + raceString + "? [Y/N]");
				yes = scan.next();
				if(yes.equalsIgnoreCase("Y"))
				{
					bool = true;
				}
			}
			
			System.out.println("\nClass : \n"
							 + "1. Barbarian\n"
							 + "2. Bard\n"
							 + "3. Cleric\n"
							 + "4. Druid\n"
							 + "5. Fighter\n"
							 + "6. Mage\n"
							 + "7. Monk\n"
							 + "8. Paladin\n"
							 + "9. Ranger\n"
							 + "10. Sorcerer\n"
							 + "11. Thief\n");
			bool = false;
			while(bool == false)
			{
				System.out.print("Select your class : ");
				jobString = scan.next();
				if(jobString.equalsIgnoreCase("Barbarian") || genderString.equalsIgnoreCase("1"))
				{
					job = CharaJobEnum.BARBARIAN;
					break;
				}
				else if(jobString.equalsIgnoreCase("Bard") || genderString.equalsIgnoreCase("2"))
				{
					job = CharaJobEnum.BARD;
					break;
				}
				else if(jobString.equalsIgnoreCase("Cleric") || genderString.equalsIgnoreCase("3"))
				{
					job = CharaJobEnum.CLERIC;
					break;
				}
				else if(jobString.equalsIgnoreCase("Druid") || genderString.equalsIgnoreCase("4"))
				{
					job = CharaJobEnum.DRUID;
					break;
				}
				else if(jobString.equalsIgnoreCase("Fighter") || genderString.equalsIgnoreCase("5"))
				{
					job = CharaJobEnum.FIGHTER;
					break;
				}
				else if(jobString.equalsIgnoreCase("Mage") || genderString.equalsIgnoreCase("6"))
				{
					job = CharaJobEnum.MAGE;
					break;
				}
				else if(jobString.equalsIgnoreCase("Monk") || genderString.equalsIgnoreCase("7"))
				{
					job = CharaJobEnum.MONK;
					break;
				}
				else if(jobString.equalsIgnoreCase("Paladin") || genderString.equalsIgnoreCase("8"))
				{
					job = CharaJobEnum.PALADIN;
					break;
				}
				else if(jobString.equalsIgnoreCase("Ranger") || genderString.equalsIgnoreCase("9"))
				{
					job = CharaJobEnum.RANGER;
					break;
				}
				else if(jobString.equalsIgnoreCase("Sorcerer") || genderString.equalsIgnoreCase("10"))
				{
					job = CharaJobEnum.SORCERER;
					break;
				}
				else if(jobString.equalsIgnoreCase("Thief") || genderString.equalsIgnoreCase("11"))
				{
					job = CharaJobEnum.THIEF;
					break;
				}
				else
				{
					System.out.println("There's no such class.");
				}
				
			}
			
			newChara.add(new Chara(nama, gender, job, race));
			break;
		}
		
		for(i = 1; i < 2; i++)
		{
			System.out.println(newChara.get(i).getCharaDescription());
		}
		
		
//		Chara chara1 = new Chara("Wawan", CharaGender.MALE, CharaJobEnum.BARD, CharaRaceEnum.ARGONIAN);
//		System.out.println(chara1.getCharaDescription());
//		
//		Chara chara2 = new Chara("Setyadi", CharaGender.FEMALE, CharaJobEnum.MAGE, CharaRaceEnum.ELF);	
//		System.out.println(chara2.getCharaDescription());

		scan.close();
//		System.out.println("\n\n\n\n© 2018 Anton R S & Krishna Aji S");
  	}
}