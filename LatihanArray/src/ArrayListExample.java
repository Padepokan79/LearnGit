import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> listPizza = new ArrayList<String>();
		listPizza.add("Meat Lover");
		listPizza.add("American Fav");
		listPizza.add("Italian Meatballs");
		listPizza.add("Super Supreme");
		listPizza.add("Supreme");
		
		listPizza.add("Sundanes Pizza");
		listPizza.add("Steak Cikawao");
		
		showIsiArrayList(listPizza);
		System.out.println(" ----------- ");
		System.out.println(listPizza.get(3));
		
		listPizza.set(0, "ikan");
		showIsiArrayList(listPizza);
		listPizza.add(0, "AAAAA");
		showIsiArrayList(listPizza);
		listPizza.add(3, "BBB");
		showIsiArrayList(listPizza);

		
		listPizza.add(1, "cabrul");//add by sandi
		showIsiArrayList(listPizza);//add by sandi

		
		listPizza.remove("ikan");
		showIsiArrayList(listPizza);	
		listPizza.remove(0);
		showIsiArrayList(listPizza);
		
		ArrayList<Double> hargaPizza = new ArrayList<Double>();
		
		hargaPizza.add(5.01);
		
		double hasil = (Double) hargaPizza.get(0);
		
		System.out.println(hasil);
		
	}

	public static void showIsiArrayList(ArrayList<String> listPizza) {
		System.out.println(" ----------- ");
		for (String dataPizza : listPizza) {
			System.out.println(dataPizza);
		}
	}

}
