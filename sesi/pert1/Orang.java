class Orang {
  String name;
	int id;
	Address address = new Address();

	Orang () {
		this.name = "-";
		this.id = 0;
	}

	Orang (String name, int id) {
		this.name = name;
		this.id = id;
	}

	Orang (String name, int id, Address address) {
		this.name = name;
		this.id = id;
		this.address = address;
	}

	String getDetail () {
		return 
		"Nama   : " + name + "\n" +
		"Id     : " + id + "\n" +
		"Alamat :\n";
	}

	String getFullDetail () {
		return 
		this.getDetail() +
		address.getDetail();
	}
}