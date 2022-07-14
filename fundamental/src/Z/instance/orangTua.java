package Z.instance;

public class orangTua {
	
	String nama;
	int usia;
	
	public void printorangTua() {
		System.out.println("Nama: " + nama + "\nUsia: "+ usia);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		orangTua obj = new orangTua();
		
		obj.nama = "Dani";
		obj.usia = 56;
		
		obj.printorangTua();
	}

}