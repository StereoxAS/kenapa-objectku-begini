public class Chara
{
	private String name;
	private CharaGender gender;
	private CharaJobEnum job;
	private CharaRaceEnum race;
	private CharaAttributes attributes;

	public Chara(String name, CharaGender gender, CharaJobEnum job, CharaRaceEnum race) {
	    this.gender = gender;
	    this.race = race;
	    this.job = job;
	    this.name = name;
		this.attributes = new CharaAttributes();

	    if (gender.equals(CharaGender.MALE)) //Gender advantages, SJW Alert
	    {
	    	attributes.addStrength(1);
	    }
	    else
	    {
	    	attributes.addInteligence(1);
		}

	    switch(race)
	    {
			case HUMAN:
				attributes.addVitality(2);
				attributes.addCharisma(2);
				break;
			case ELF:
				attributes.addInteligence(2);
				attributes.addCharisma(2);
				break;
			case ORC:
				attributes.addStrength(3);
				attributes.addDexterity(1);
				break;
			case GOBLIN:
				attributes.addInteligence(2);
				attributes.addDexterity(2);
				break;
			case GNOME:
				attributes.addDexterity(2);
				attributes.addWisdom(2);
				break;
			case HALFLING:
				attributes.addDexterity(4);
				break;
			case DWARF:
				attributes.addVitality(3);
				attributes.addStrength(1);
				break;
			case KHAJIIT:
				attributes.addCharisma(3);
				attributes.addWisdom(1);
				break;
			case ARGONIAN:
				attributes.addStrength(3);
				attributes.addVitality(1);
				break;
	    }
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public CharaGender getGender()
	{
		return gender;
	}

	public void setGender(CharaGender gender)
	{
		this.gender = gender;
	}

	public CharaJobEnum getJob()
	{
		return job;
	}

	public void setJob(CharaJobEnum job)
	{
		this.job = job;
	}

	public CharaRaceEnum getRace()
	{
		return race;
	}

	public void setRace(CharaRaceEnum race)
	{
		this.race = race;
	}

	public CharaAttributes getAttributes()
	{
		return attributes;
	}

	public void setAttributes(CharaAttributes attributes)
	{
		this.attributes = attributes;
	}

	public String getCharaDescription()
	{
		return
		"Name   : " + this.name + "\n" +
		"Gender : " + Utils.capitalizeFirstChar(this.gender.name()) + "\n" +
		"Job    : " + Utils.capitalizeFirstChar(this.job.name()) + "\n" +
		"Race   : " + Utils.capitalizeFirstChar(this.race.name()) + "\n" +
		"Attributes \n" + 
		this.attributes.getAttributeDescription() + "\n";
	}
}