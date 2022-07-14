package soalNo2A;

public class Saya {
	
	private String nama = "Krisna";
	private String npm = "14.125.781.101";
	private int mtk = 70;
	private int bindo = 60;
	private int pbo = 65;
	
	private void pelajaran()
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
	
	private void tampil() {
		System.out.print("Nama:\t" + nama);
		
		System.out.print("\nNPM:\t" + npm);
		
		System.out.print("\nNilai Matematika\t:" + mtk);
		
		System.out.print("\nNilai Bahasa Indonesia\t:" + bindo);
		
		System.out.print("\nNilai PBO\t\t:" + pbo);
		
		System.out.print("\nNilai Rata-rata\t\t:");
		pelajaran();
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Saya s = new Saya();
		s.tampil();
		
		
		

	}
	
	

}
