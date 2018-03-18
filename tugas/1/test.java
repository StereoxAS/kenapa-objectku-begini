public class test {
	public static void main(String[] args) {
		Chara chara1 = new Chara("Wawan", CharaGender.MALE, CharaJobEnum.BARBARIAN, CharaRaceEnum.ARGONIAN);
		System.out.println(chara1.getCharaDescription());
		chara1.getAttributes().addCharisma(10);
  	}
}