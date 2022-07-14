package com.day5;

public class MuridWali implements Fungsi{

	public static void main(String[] args) {
		
		MuridWali mw = new MuridWali();
		
		String[] listmurid = {"Subastian", "Bastian", "Bernanda", "Marvel", "Marcell", "Sintia"};
		String[] listwali = {"Barno", "Sutjiwo", "Setyawan", "Sri Handayani", "Bambang", "Swijaya"};
		
		for(int i=0; i<6; i++)
		{
			System.out.println(mw.wali(listmurid[i] + " / " + listwali[i]));
		}
		

	}

	@Override
	public String murid(String dm) {
		// TODO Auto-generated method stub
		return dm;
	}

	@Override
	public String wali(String dw) {
		// TODO Auto-generated method stub
		return dw;
	}

}
