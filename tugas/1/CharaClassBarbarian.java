
public class CharaClassBarbarian extends CharaClass 
{
	public static String getClassDetail()
	{
		return
		CharaClass.setClassName("Barbarian\n\n") + 
		CharaClass.setClassDesc("Barbarians can be excellent warriors."
				+ "While not as disciplined or as skilled as a normal fighter, \n"
				+ "the barbarian can willingly throw himself into a berserker rage, becoming a tougher and stronger opponent. \n"
				+ "Barbarians can't use plate mail armor, like the other warrior classes.\n\n"
				+ "Barbarians have +4 bonus to Strength.");
	}
}
