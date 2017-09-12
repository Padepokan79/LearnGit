import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Validation {
	
	
	public static int getPrice(ArrayList<String> menu, ArrayList<Integer> daftarHarga){
		int harga = 0;
		// tulis "Menu :"
		for (int i = 0; i < menu.size(); i++) {
			// tampikan menu menuget(i) + "" + daftarHargaget(i)
		}
		int pilihan =-1;
		// scanner 
		// pilihan
		//cek pilihan
		// validasi // exception
		harga = daftarHarga.get(pilihan);
		return harga;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> menu = new ArrayList<String>();
		menu.add("Meat Lover");
		menu.add("American Fav");
		menu.add("Italian Meatballs");
		menu.add("Super Supreme");
		menu.add("Supreme");
		ArrayList<Integer> daftarHarga = new ArrayList<Integer>();
		
		
		

		ArrayList<String> optionTopping = new ArrayList<String>();
		optionTopping.add("1. Vegetables");
		optionTopping.add("2. Meat");
		optionTopping.add("3. Cheese");
		optionTopping.add("4. Selesai pilih topping");
		
		// scanner
		// ambil pilihanMenu
		int pilihanMenu = 0;
		int hargaTotal = 0;
		switch (pilihanMenu) {
		case 1:
			hargaTotal += getPrice(menu, daftarHarga);
			break;
		case 2:
			hargaTotal += getPrice(menu, daftarHarga);
			break;
		case 3:
			hargaTotal += getPrice(menu, daftarHarga);
			break;
		case 4:
			// exit
			break;

		default:
			break;
		}
		
		int inpit = 0;
		do{	
			int i = 1;
			for (String pizza : menu) {
				System.out.println(i + " "+pizza);
				i++;
			}
			
			System.out.print(" Silahkan inputkan pilihan anda : ");
			try{
				Scanner sc = new Scanner(System.in);
				inpit = sc.nextInt();
				String coba1 = sc.next();
				double coba2 = sc.nextDouble();
				inpit = sc.nextInt();
				
			}catch(Exception e){
				inpit = 0;
				//System.out.println(e.get());
			}


			if(inpit>menu.size() || inpit<=0){
				System.out.println(" Inputan salah ");
			}

		}while( inpit>menu.size() || inpit<=0 );
		System.out.println("Berhasil !");


	}

}
