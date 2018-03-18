public class Chara {
  private String name;
  private CharaJobEnum job;
  private CharaRaceEnum race;
  private CharaAttributes attributes;
  
  public Chara(String name, CharaJobEnum job, CharaRaceEnum race) {
    this.name = name;
    this.job = job;
    this.race = race;
    this.attributes = new CharaAttributes();
  }
}