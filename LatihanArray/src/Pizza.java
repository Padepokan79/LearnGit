import java.util.Scanner;

public class Pizza {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in) ;
		int total = 0;
		
		String [] listPizza = {"Meat Lover", "Tuna Melt", "American Fav", "Sayuran"};
		int [] hargaPizza = {78000,76000,90000,50000};
		
		for (int i = 0; i < listPizza.length; i++) {
			System.out.println(i+1+": "+ listPizza[i] + " " + hargaPizza[i] );
		}
		
		System.out.println("Masukan pilihan anda ? ");
		int pilihan = sc.nextInt();
		System.out.println("anda memilih "+listPizza[pilihan-1] + " Seharga Rp." + hargaPizza[pilihan-1]);
		total = total + hargaPizza[pilihan-1];
		
		
		// add
		
		
		
		
		System.out.println("Total Yang harus dibayarkan Rp."+total);
		
		
		
		//return
		
//		int [] hargaPizza = {78000,76000,90000};
//		System.out.println("Menu");
//		for (int i = 0; i < listPizza.length; i++) {
//			System.out.println(i+1+": "+ listPizza[i] + " : "+hargaPizza[i]);
//		}
//		System.out.println("Silahkan pilih");
//		int pilihan = sc.nextInt();
//		
//		System.out.println("Nama Pizza "+ listPizza[pilihan] + "Seharga : Rp."+hargaPizza[pilihan]);
//	
		}

}
