package kiosk.order;

import java.io.File;
import java.util.Scanner;

public class OrderDAO {
	
	public String coupon() {
	
		try {
			File coupon = new File("D:\\geonstudy\\coupon.txt");
			Scanner scanner = new Scanner(coupon,"UTF-8");
			
			
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
		return null;
	}

}
