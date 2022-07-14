package soalNo2B;

public class Saya_No2C {
	
	
	public String nama = "Krisna";
	public String npm = "14.125.781.101";
	public int mtk = 70;
	public int bindo = 60;
	public int pbo = 65;
	
	public void pelajaran()
	{
		Saya pel = new Saya();
		int[] nilai = new int[3];
		nilai[0] = pel.mtk;
		nilai[1] = pel.bindo;
		nilai[2] = pel.pbo;
		
		int total =0;
		for(int i=0; i<3; i++)
		{
			total+=nilai[i];
		}
		
		System.out.println(total/3);
	}
	
	public void a() {
		
	}
	
	public static void main(String[] args) {
		
		Saya_No2C s = new Saya_No2C();
		
		System.out.print("Nama:\t" + s.nama);
		
		System.out.print("\nNPM:\t" + s.nama);
		
		System.out.print("\nNilai Matematika\t:" + s.mtk);
		
		System.out.print("\nNilai Bahasa Indonesia\t:" + s.bindo);
		
		System.out.print("\nNilai PBO\t\t:" + s.pbo);
		
		System.out.print("\nNilai Rata-rata\t\t:");
		s.pelajaran();
		

	}
	

}
