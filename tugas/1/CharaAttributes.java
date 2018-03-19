public class CharaAttributes
{
	/*
	 * Enum Attribute please
	 */
	private static int strength;
	private static int dexterity;
	private static int vitality;
	private static int inteligence;
	private static int wisdom;
	private static int charisma;

	public static void adjustRacialAttributes(CharaRaceEnum race)
	{
		switch(race)
	    {
			case HUMAN:
				CharaAttributes.addVitality(2);
				CharaAttributes.addCharisma(2);
				break;
			case ELF:
				CharaAttributes.addInteligence(2);
				CharaAttributes.addCharisma(2);
				break;
			case ORC:
				CharaAttributes.addStrength(3);
				CharaAttributes.addDexterity(1);
				break;
			case GOBLIN:
				CharaAttributes.addInteligence(2);
				CharaAttributes.addDexterity(2);
				break;
			case GNOME:
				CharaAttributes.addDexterity(2);
				CharaAttributes.addWisdom(2);
				break;
			case HALFLING:
				CharaAttributes.addDexterity(4);
				break;
			case DWARF:
				CharaAttributes.addVitality(3);
				CharaAttributes.addStrength(1);
				break;
			case KHAJIIT:
				CharaAttributes.addCharisma(3);
				CharaAttributes.addWisdom(1);
				break;
			case ARGONIAN:
				CharaAttributes.addStrength(3);
				CharaAttributes.addVitality(1);
				break;
	    }
		//System.out.println("Racial bonuses applied.");
	}
	
	public static void adjustGenderAttributes(CharaGender gender)
	{
		if (gender.equals(CharaGender.MALE)) //Gender advantages, SJW Alert
	    {
			CharaAttributes.addStrength(1);
	    }
	    else
	    {
	    	CharaAttributes.addInteligence(1);
		}
		//System.out.println("Gender bonuses applied.");
	}
	
	public static void addStrength(int addStrength)
	{
		strength += addStrength;
	}

	public static void addDexterity(int addDexterity)
	{
		dexterity += addDexterity;
	}

	public static void addVitality(int addVitality)
	{
		vitality += addVitality;
	}

	public static void addInteligence(int addInteligence)
	{
		inteligence += addInteligence;
	}

	public static void addWisdom(int addWisdom)
	{
		wisdom += addWisdom;
	}

	public static void addCharisma(int addCharisma)
	{
		charisma += addCharisma;
	}


	public CharaAttributes()
	{
		// Default base attributes
    	CharaAttributes.strength = 10;
	    CharaAttributes.dexterity = 10;
	    CharaAttributes.vitality = 10;
	    CharaAttributes.inteligence = 10;
	    CharaAttributes.wisdom = 10;
	    CharaAttributes.charisma = 10;
	}

	public CharaAttributes(int strength, int dexterity, int vitality, int inteligence, int wisdom, int charisma)
	{
		CharaAttributes.strength = strength;
		CharaAttributes.dexterity = dexterity;
		CharaAttributes.vitality = vitality;
		CharaAttributes.inteligence = inteligence;
		CharaAttributes.wisdom = wisdom;
		CharaAttributes.charisma = charisma;
	}

	private String getNegValueErrorMessage(String attribute)
	{
		return
	    attribute + " must be a non negative integer number, " +
	    attribute + " unchanged.";
	}

	public void setStrength(int strength)
	{
	    if (strength >= 0)
	    {
	      CharaAttributes.strength = strength;
	    }
	    else
	    {
	      System.out.println(getNegValueErrorMessage("Strength"));
	    }
	}

	public int getStrength()
	{
		return CharaAttributes.strength;
	}

	public void setDexterity(int dexterity)
	{
	    if (dexterity >= 0)
	    {
	      CharaAttributes.dexterity = dexterity;
	    }
	    else
	    {
	      System.out.println(getNegValueErrorMessage("Dexterity"));
	    }
	}

	public int getDexterity()
	{
	    return CharaAttributes.dexterity;
	}

	public void setVitality(int vitality)
	{
	    if (vitality >= 0)
	    {
	      CharaAttributes.vitality = vitality;
	    }
	    else
	    {
	      System.out.println(getNegValueErrorMessage("Vitality"));
	    }
	}

	public int getVitality()
	{
	    return CharaAttributes.vitality;
	}

	public void setInteligence(int inteligence)
	{
	    if (inteligence >= 0)
	    {
	      CharaAttributes.inteligence = inteligence;
	    }
	    else
	    {
	      System.out.println(getNegValueErrorMessage("Inteligence"));
	    }
	}

	public int getInteligence()
	{
	    return CharaAttributes.inteligence;
	}

	public void setWisdom(int wisdom)
	{
	    if (wisdom >= 0)
	    {
	      CharaAttributes.wisdom = wisdom;
	    }
	    else
	    {
	      System.out.println(getNegValueErrorMessage("Wisdom"));
	    }
	}

	public int getWisdom()
	{
	    return CharaAttributes.wisdom;
	}

	public void setCharisma(int charisma)
	{
	    if (charisma >= 0)
	    {
	      CharaAttributes.charisma = charisma;
	    }
	    else
	    {
	      System.out.println(getNegValueErrorMessage("Charisma"));
	    }
	}

	public int getCharisma()
	{
	    return CharaAttributes.charisma;
	}

	public String getAttributeDescription()
	{
		return
			"Strength   :" + CharaAttributes.strength + "\n" +
			"Dexterity  :" + CharaAttributes.dexterity + "\n" +
			"Vitality   :" + CharaAttributes.vitality + "\n" +
			"Inteligence:" + CharaAttributes.inteligence + "\n" +
			"Wisdom     :" + CharaAttributes.wisdom + "\n" +
			"Charisma   :" + CharaAttributes.charisma;
	}
}