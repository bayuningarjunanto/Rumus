import java.util.Scanner;

class rumus{

	public static void main(String[] args) {
		
		int alas,tinggi,luas,pilihan;
		Scanner pencet = new Scanner(System.in);
		
		System.out.print("Masukkan Nilai Alas : ");
		alas = pencet.nextInt();
		
		System.out.print("Masukkan Nilai Tinggi : ");
		tinggi = pencet.nextInt();
		
		System.out.print("Rumus Yang Digunakan 1. Segitiga     2.Kubus ? ");
		pilihan= pencet.nextInt();
		
		if(pilihan==1) {
			luas=alas*tinggi/2;
			System.out.println("Luas Segitiga : " + luas);
		}else{
			luas=alas*tinggi;
			System.out.println("Luas Persegi: " + luas);
		}
		
	}
	
}