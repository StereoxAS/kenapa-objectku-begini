public class CharaRace 
{
	private CharaRaceEnum HUMAN;
	private CharaRaceEnum ELVES;
	private CharaRaceEnum ORC;
	private CharaRaceEnum GOBLIN;
	private CharaRaceEnum GNOME;
	private CharaRaceEnum HALFLING;
	private CharaRaceEnum DWARF;
	private CharaRaceEnum KHAJIIT;
	private CharaRaceEnum ARGONIAN;
	
	private String raceName;
	private String raceDesc;
	
	public void addHUMAN(CharaRaceEnum hUMAN) 
	{
		HUMAN = hUMAN;
	}
	public void addELVES(CharaRaceEnum eLVES) 
	{
		ELVES = eLVES;
	}
	public void addORC(CharaRaceEnum oRC) 
	{
		ORC = oRC;
	}
	public void addGOBLIN(CharaRaceEnum gOBLIN) 
	{
		GOBLIN = gOBLIN;
	}
	public void addGNOME(CharaRaceEnum gNOME) 
	{
		GNOME = gNOME;
	}
	public void addHALFLING(CharaRaceEnum hALFLING) 
	{
		HALFLING = hALFLING;
	}
	public void addDWARF(CharaRaceEnum dWARF) 
	{
		DWARF = dWARF;
	}
	public void addKHAJIIT(CharaRaceEnum kHAJIIT) 
	{
		KHAJIIT = kHAJIIT;
	}
	public void addARGONIAN(CharaRaceEnum aRGONIAN) 
	{
		ARGONIAN = aRGONIAN;
	}
}