class Address {
  String prov;
  String kabKota;
  String kec;
  String kel;
  String detail;

  Address () {
    this.prov = "-";
    this.kabKota = "-";
    this.kec = "-";
    this.kel = "-";
    this.detail = "-";
  }

  Address (String detail, String kel, String kec, String kabKota, String prov) {
    this.prov = prov;
    this.kabKota = kabKota;
    this.kec = kec;
    this.kel = kel;
    this.detail = detail;
  }

  String getDetail () {
    return 
    "Detail         : " + detail + "\n" +
    "Kelurahan      : " + kel + "\n" +
    "Kecamatan      : " + kec + "\n" +
    "Kabupaten/Kota : " + kabKota + "\n" +
    "Provinsi       : " + prov + "\n";
  }
  
}