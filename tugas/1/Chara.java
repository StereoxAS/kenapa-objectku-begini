public class Chara 
{
	private String name;
	private CharaGender gender;
	private CharaJobEnum job;
	private CharaRaceEnum race;
	private CharaAttributes attributes;
  
	public Chara(String name, CharaGender gender, CharaJobEnum job, CharaRaceEnum race) 
	{
	    this.gender = gender;
	    this.race = race;
	    this.job = job;
	    this.name = name;
	    this.attributes = new CharaAttributes();
	    if (gender.equals(CharaGender.MALE)) //Gender advantages, SJW Alert
	    {
	    	attributes.AddStrength(1);
	    }
	    else
	    {
	    	attributes.AddInteligence(1);
	    }	
	    switch(race)
	    {
	    case HUMAN:
	    	attributes.AddVitality(2);
	    	attributes.AddCharisma(2);
	    	break;
	    case ELF:
	    	attributes.AddInteligence(2);
	    	attributes.AddCharisma(2);
	    	break;
	    case ORC:
	    	attributes.AddStrength(3);
	    	attributes.AddDexterity(1);
	    	break;
	    case GOBLIN:
	    	attributes.AddInteligence(2);
	    	attributes.AddDexterity(2);
	    	break;
	    case GNOME:
	    	attributes.AddDexterity(2);
	    	attributes.AddWisdom(2);
	    	break;
	    case HALFLING:
	    	attributes.AddDexterity(4);
	    	break;
	    case DWARF:
	    	attributes.AddVitality(3);
	    	attributes.AddStrength(1);
	    	break;
	    case KHAJIIT:
	    	attributes.AddCharisma(3);
	    	attributes.AddWisdom(1);
	    	break;
	    case ARGONIAN:
	    	attributes.AddStrength(3);
	    	attributes.AddVitality(1);
	    	break;
	    
	    }
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public CharaGender getGender() {
		return gender;
	}

	public void setGender(CharaGender gender) {
		this.gender = gender;
	}

	public CharaJobEnum getJob() {
		return job;
	}

	public void setJob(CharaJobEnum job) {
		this.job = job;
	}

	public CharaRaceEnum getRace() {
		return race;
	}

	public void setRace(CharaRaceEnum race) {
		this.race = race;
	}

	public CharaAttributes getAttributes() {
		return attributes;
	}

	public void setAttributes(CharaAttributes attributes) {
		this.attributes = attributes;
	}
	
}