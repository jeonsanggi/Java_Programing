package com.jremind.exam04;

public class PairMain {
	public static void main(String[] args) {
//		Pair<Integer, String> p1 = new Pair<Integer, String>(1, "JAVA");
//		Pair<Integer, String> p2 = new Pair<Integer, String>(1, "JAVA");
//		
//		
//		p1.setKey(key);
//		boolean result1 = Util.<Integer, String> compare(p1,p2);
//		if(result1)
//			System.out.println("������ ��ü");
//		else
//			System.out.println("�������� ���� ��ü");
//		
//		Pair<String, String> p3 = new Pair<String, String>("ȫ�浿", "Java");
//		Pair<String, String> p4 = new Pair<String, String>("ȫ�浿", "Java");
//		boolean result2 = Util.compare(p3, p4);
//		
//		if(result2)
//			System.out.println("������ ��ü");
//		else
//			System.out.println("�������� ���� ��ü");
		
		
		int result1 = Util2.compare(10, 20);
		System.out.println(result1);
		
		int result2 = Util2.compare(4.5, 3);
		System.out.println(result2);

	}

}
