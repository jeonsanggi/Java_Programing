package com.jremind.exam05;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateMain {
	private static List<Student> list = Arrays.asList(
			new Student("ȫ�浿", "����", 90),
			new Student("�迵��", "����", 90),
			new Student("��ö��", "����", 85),
			new Student("������", "����", 87)
	);
	
	public static double avg(Predicate<Student> predicate) {
		int count = 0, sum = 0;
		for(Student student : list) {
			if(predicate.test(student)) {
				count++;
				sum += student.getScore();
			}
		}
		return (double)sum/count;
	}
	
	public static void main(String[] args) {
		double maleAvg = avg(t -> t.getSex().equals("����"));
		System.out.println("���� ��� ����: " + maleAvg);
		
		double femaleAvg = avg(t -> t.getSex().equals("����"));
		System.out.println("���� �������: " + femaleAvg);
	}

}
