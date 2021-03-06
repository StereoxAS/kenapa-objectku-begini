public class CharaClass 
{
	private static String className;
	private static String classDesc;
	int bonusStr;
	int bonusDex;
	int bonusVit;
	int bonusInt;
	int bonusWis;
	int bonusCha;
	int bonusAll;
	
	CharaClass(String className, String classDesc, CharaAttributes attributes)
	{
		CharaClass.className = className;
		CharaClass.classDesc = classDesc;
	}
	CharaClass()
	{
		CharaClass.className = "Undefined";
		CharaClass.classDesc = "Undefined";
	}
	public static String setClassName(String className) 
	{
		CharaClass.className = className;
		return className;
	}
	public static String setClassDesc(String classDesc) 
	{
		CharaClass.classDesc = classDesc;
		return classDesc;
	}
	
	public static void setBonusAttributes(CharaJobEnum job)
	{
		switch(job)
		{
		case BARBARIAN : 
			CharaAttributes.addStrength(4);
			break;
		case BARD : 
			CharaAttributes.addDexterity(1);
			CharaAttributes.addInteligence(1);
			CharaAttributes.addCharisma(2);
			break;
		case CLERIC : 
			CharaAttributes.addWisdom(4);
			break;
		case DRUID : 
			CharaAttributes.addDexterity(2);
			CharaAttributes.addWisdom(2);
			break;
		case FIGHTER : 
			CharaAttributes.addStrength(2);
			CharaAttributes.addVitality(2);
			break;
		case MAGE : 
			CharaAttributes.addInteligence(4);
			break;
		case MONK : 
			CharaAttributes.addDexterity(2);
			CharaAttributes.addVitality(2);
			break;
		case PALADIN : 
			CharaAttributes.addStrength(2);
			CharaAttributes.addCharisma(2);
			break;
		case RANGER : 
			CharaAttributes.addStrength(1);
			CharaAttributes.addDexterity(1);
			CharaAttributes.addWisdom(1);
			CharaAttributes.addVitality(1);
			break;
		case SORCERER : 
			CharaAttributes.addCharisma(4);
			break;
		case THIEF : 
			CharaAttributes.addDexterity(4);
			break;
		}
		//System.out.println("Class bonuses applied.");
	}
	
	public int getBonusAttributes()
	{
		return bonusAll;
	}
	
	public static String getClassDescription(CharaJobEnum job)
	{
		switch(job)
		{
		case BARBARIAN :
			return
			CharaClassBarbarian.getClassDetail();
			
		case BARD :
			return
			CharaClassBard.getClassDetail();
			
		case CLERIC :
			return
			CharaClassCleric.getClassDetail();
			
		case DRUID :
			return
			CharaClassDruid.getClassDetail();
			
		case FIGHTER :
			return
			CharaClassFighter.getClassDetail();
			
		case MAGE : 
			return
			CharaClassMage.getClassDetail();
			
		case MONK :
			return
			CharaClassMonk.getClassDetail();
			
		case PALADIN : 
			return
			CharaClassPaladin.getClassDetail();
			
		case RANGER : 
			return
			CharaClassRanger.getClassDetail();
			
		case SORCERER : 
			return
			CharaClassSorcerer.getClassDetail();
			
		case THIEF : 
			return
			CharaClassThief.getClassDetail();
			
		}
		return classDesc;
	}
}
