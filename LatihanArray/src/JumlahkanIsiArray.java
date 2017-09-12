
// test Push Wandi
public class JumlahkanIsiArray {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] missmissan = {18,28,28,12};
		int sumMissMissan=0;
		boolean isUseMKB=false;
		boolean isHit = isHit(missmissan, sumMissMissan, isUseMKB);

		if(!isHit){
			System.out.println("Anda Aman"); //add by siska
		}else{
			System.out.println("Anda Kena Damage"); //add by siska
		}
	}
// test comment line 19
	public static boolean isHit(int[] missmissan, int sumMissMissan, boolean isUseMKB) {
		for (int i = 0; i < missmissan.length; i++) {
			sumMissMissan = sumMissMissan + missmissan[i];
		}
		boolean isHit=true;
		System.out.println(sumMissMissan);
		if (!isUseMKB){
			for (int i = 0; i < missmissan.length; i++) {
				int  random = (int)(Math.random() *100);
				if ( random >= sumMissMissan) {
					System.out.println(sumMissMissan+ " -> " +random +" Kena pukul");
				}else{
					System.out.println(sumMissMissan+ " -> " +random +" Ga Kena pukul");
					isHit=false; // isHit = not isHit
				}
			}
		}else{
			isHit= true;
		}
		return isHit;
	}
	
}