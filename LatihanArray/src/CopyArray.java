
//indra ganteng
public class CopyArray {
	public static void main(String[] args) {

		int [] arr = {8,9,6,6,8,6};
		int [] dup = new int[arr.length]; // digantidariselfi dari 6 jadi arr.length
		int [] a = new int[arr.length]; // digantidariselfi
		int [] b = new int[arr.length];
		int [] c = new int[arr.length];
		int [] d = new int[arr.length];
				
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
	
//nonaSlangit	
}
//indra ganteng :) hehe
