public class test1 {
	public static void main(String[] args) {
		Chara chara1 = new Chara("Wiwin", CharaGender.FEMALE, CharaJob.SORCERER, CharaRace.ELF);
		Chara chara2 = new Chara("Wawan", CharaGender.MALE, CharaJob.MONK, CharaRace.ORC);

		System.out.println(chara1.getCharaDescription());
		//System.out.println(chara1.getAtributeDetails());
		
		System.out.println(chara2.getCharaDescription());
		//System.out.println(chara2.getAtributeDetails());
  }
}