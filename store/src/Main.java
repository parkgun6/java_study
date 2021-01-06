import java.util.Scanner;

import org.store.domain.DeliveryStore;
import org.store.domain.Store;
import org.store.service.StoreService;
import org.store.ui.StoreUI;

public class Main {

	public static void main(String[] args) {
		
		Store[] arr = {
				new Store("멘야시노기",     37.503888, 127.020795)	,
				new Store("다시 사랑한다면", 37.499964, 127.044027),
				new DeliveryStore("BBQ", 37.503888,127.020795, true),
				new Store("사이공리",      37.507080, 126.939729),
				new Store("창신동 매운족발", 37.612990, 127.064718),
				new Store("홍보성",        37.484009, 127.125127),
				new DeliveryStore("도미노피자", 37.509471, 127.026648, true),
				new Store("스시야",    37.363279, 127.106347),
				new Store("불불이족발", 37.456393, 126.899672),
				new DeliveryStore("맥도날드", 37.504998, 127.023773, true),
				new Store("영동족발", 37.484775, 127.037959)
				};
			StoreService service = new StoreService(arr);
			StoreUI ui = new StoreUI(new Scanner(System.in),service);
			ui.find();
			
		}
}
