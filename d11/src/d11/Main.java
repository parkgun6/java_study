package d11;

public class Main {

	public static void main(String[] args) {

		Store store1 = new SeoulStore();
		Store store2 = new BusanStore();
		
		Store[] arr = {store1, store2 };
		
		
		store1.MakeZzazang();
		store2.MakeZzazang();
	}
}
