import java.util.Scanner;

class test {
  public static void main (String args[]){
    Orang o = new Orang();
    System.out.println(o.getFullDetail());
    

    // Aku bisa edit langsung di dalem
		Orang o1 = new Orang();
		o1.name = "I Made Something";
    o1.id = 1;
    
    o1.address.detail = "RT 01, RW 03";
    o1.address.kel = "Bojongrejo";
    o1.address.kec = "Malongkidul";
    o1.address.kabKota = "Logawa";
    o1.address.prov = "Jawa Selatan";
    
    // Aku pake constructor, tapi addressnya langsung didalem
    Orang o2 = new Orang("Budi", 2);
    o2.address = new Address("RT 01, RW 03", "Bojongrejo", "Malongkidul", "Logawa", "Jawa Selatan");

    // Aku pake full constructor
    Address a = new Address("RT 01, RW 03", "Bojongrejo", "Malongkidul", "Logawa", "Jawa Selatan");
    Orang o3 = new Orang("Caca", 3, a);

    // Print
    System.out.println(o.getFullDetail());
    System.out.println(o1.getFullDetail());
    System.out.println(o2.getFullDetail());
    System.out.println(o3.getFullDetail());
	}
}