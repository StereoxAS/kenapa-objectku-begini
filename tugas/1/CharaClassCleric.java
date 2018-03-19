
public class CharaClassCleric extends CharaClass 
{
	public static String getClassDetail()
	{
		return
		CharaClass.setClassName("Cleric\n\n") +
		CharaClass.setClassDesc("The Cleric is a generic priest (of any mythos) who tends to the spiritual needs of a community. "
				+ "\nThough Clerics are both protectors and healers, they are not purely defensive - when evil threatens, "
				+ "\nthe Clerics are well suited to seek ti out an its own ground and destroy it. "
				+ "\nThe opposite is true of evil Clerics as well, and there re also many variations in between."
				+ "\nClerics have +4 bonus to Wisdom.");
	}
}
