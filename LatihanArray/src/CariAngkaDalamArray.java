import java.util.Scanner;

public class CariAngkaDalamArray {
	public static void main(String[] args) {
		
		int [] arr1 = {8,9,6,6,8,6};
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Masukan angka yang dicari : ");
		int yangDicari = sc.nextInt();
		int index = -1;
		boolean ketemu=false;
		
		for (int i = 0; i < arr1.length; i++) {
			if(yangDicari==arr1[i]) {
				ketemu = true;
				index =i;
				System.out.println("Hoorey");;
			}
		}
		if(ketemu){
			System.out.println("unch");
		}else{
			System.out.println("Jagoan si ijal kyprox");
		}
		sc.close();
		
	}
}