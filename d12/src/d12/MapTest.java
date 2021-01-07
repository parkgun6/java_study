package d12;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
	public static void main(String[] args) {
		//키,값
		Map<String, String> map = new HashMap<>();
		map.put("banana", "바나나");
		map.put("apple", "사과");
		
		String value = map.get("apple");
		
		System.out.println(value);
	}
}
