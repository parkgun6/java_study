package io4;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.keroro.store.Menu;

import com.google.gson.Gson;

public class MenuTest {

	public static void main(String[] args) throws Exception{
		
		List<Menu> menuList = new ArrayList<>();
		menuList.add(new Menu("빅맥",5000));
		menuList.add(new Menu("1빅맥",1000));
		menuList.add(new Menu("2빅맥",2000));
		menuList.add(new Menu("3빅맥",3000));
		
		Gson gson = new Gson();
		String jsonStr = gson.toJson(menuList);
		
		System.out.println(jsonStr);
		
		Class clz =menuList.getClass();
		
		
		
		Menu[] arr = gson.fromJson(jsonStr,Menu[].class);
		System.out.println(Arrays.toString(arr));
	}
}
