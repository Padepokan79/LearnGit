
public class PrintIsiArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr1 = {8,9,3,4,5,6};
		int tmp = arr1[5];
		int maxArray = 6;

		//for (batas awal; kondisi u/ exit loop; stepper/maju u/ setiap elemen)

		for (int i=0;i<arr1.length;i++){
				System.out.println(i + " "+ arr1[i]);

		}
		System.out.println(" ******** ");
		for (int i=arr1.length-1;i>=0;i--){
			System.out.println(i + " "+ arr1[i]);
		}	
		System.out.println(" ******** ");
		int i = 1;
		
		while(i<arr1.length){
			
			System.out.println(i + " "+ arr1[i]);
			i++;
		}
		i = arr1.length-1;
		
		System.out.println(" ******** ");
		
		while(i>=0){
			
			System.out.println(i + " "+ arr1[i]);
			i--;
		}
		System.out.println("\n KIKI QUOTE : SOLO MID THANK YOU, 2 TANGO PLEASE HAHAHAHA ");
	}
}
