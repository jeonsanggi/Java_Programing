package com.jremind.exam04;

public class WrapperMain {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//auto ¹Ú½Ì
		Integer obj1 = 100;
		Integer obj2 = 200;
		// ¹Ú½Ì
		Integer obj3 = Integer.valueOf("300");
		
		//¾ð¹Ú½Ì
		int val1 = obj1.intValue();
		int val2 = obj2.intValue();
		int val3 = obj3.intValue();
	
		System.out.println(val1);
		System.out.println(val2);
		System.out.println(val3);
		
		Integer obj = 100;
		System.out.println(obj.intValue());
		
		
		//auto ¾ð¹Ú½Ì
		int val = obj;
		System.out.println(val);
		
		//auto ¾ð¹Ú½Ì ÇÏ°í 100ÀÌ¶û ´õÇØÁÜ
		int result = obj + 100;
		System.out.println(result);
		
	}

}
