package com.jremind.exam04;

public class WrapperMain {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//auto �ڽ�
		Integer obj1 = 100;
		Integer obj2 = 200;
		// �ڽ�
		Integer obj3 = Integer.valueOf("300");
		
		//��ڽ�
		int val1 = obj1.intValue();
		int val2 = obj2.intValue();
		int val3 = obj3.intValue();
	
		System.out.println(val1);
		System.out.println(val2);
		System.out.println(val3);
		
		Integer obj = 100;
		System.out.println(obj.intValue());
		
		
		//auto ��ڽ�
		int val = obj;
		System.out.println(val);
		
		//auto ��ڽ� �ϰ� 100�̶� ������
		int result = obj + 100;
		System.out.println(result);
		
	}

}
