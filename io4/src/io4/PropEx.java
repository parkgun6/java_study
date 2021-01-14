package io4;

import java.io.FileInputStream;
import java.util.Properties;

public class PropEx {

	// bad code
	public static void main(String[] args) throws Exception {

		Properties prop = new Properties();
		prop.load(new FileInputStream("C:\\zzz\\job.properties"));

		System.out.println(prop);

		String str = prop.getProperty("/menu");

		System.out.println(str);
		Class clz = Class.forName(str);

		System.out.println(clz);

		// 0번째의 클래스를 불러온다.
		Job obj = (Job) (clz.getConstructors()[0].newInstance(null));

		System.out.println(obj);

		obj.doJob();

	}
}
