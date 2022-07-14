package soalNo2B;

public class Saya {

	protected String nama = "Krisna";
	protected String npm = "14.125.781.101";
	protected int mtk = 70;
	protected int bindo = 60;
	protected int pbo = 65;
	
	protected void pelajaran()
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
	
	protected void tampil() {
		System.out.print("Nama:\t" + nama);
		
		System.out.print("\nNPM:\t" + npm);
		
		System.out.print("\nNilai Matematika\t:" + mtk);
		
		System.out.print("\nNilai Bahasa Indonesia\t:" + bindo);
		
		System.out.print("\nNilai PBO\t\t:" + pbo);
		
		System.out.print("\nNilai Rata-rata\t\t:");
		pelajaran();
	}

}
