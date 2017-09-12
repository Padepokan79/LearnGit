
public class CopyArray {
	public static void main(String[] args) {

		int [] arr = {8,9,6,6,8,6};
		int [] dup = new int[6];
		int [] a = new int[6];
		int [] b = new int[6];
		int [] c = new int[6];
				
		copyAndShow(arr, dup);
//		destination = copyArray(source, destination);
//		tampil(destination);
		copyAndShow(dup, a);
//		destination = copyArray(source, destination);
//		tampil(destination);
		copyAndShow(a, b);
		copyAndShow(b, c);
	}

	public static void copyAndShow(int[] source, int[] destination) {
		destination = copyArray(source, destination);
		tampil(destination);
	}

	public static void tampil(int[] source) {
		System.out.println(" -------------- ");
		for (int i = 0; i < source.length; i++) {
			System.out.println("Bilangan ke-"+(i+1)+ " adalah : " +source[i]);
		}
	}

	public static int [] copyArray(int[] source, int[] destination) {
		for (int i = 0; i < source.length; i++) {
			destination[i] = source[i]; 
		}
		return destination;
	}
	
	
}
