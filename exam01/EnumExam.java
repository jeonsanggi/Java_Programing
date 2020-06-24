package com.jremind.exam01;

import java.util.Calendar;

public class EnumExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Week today = null;
//		
//		Calendar cal = Calendar.getInstance();
//		int week = cal.get(Calendar.DAY_OF_WEEK);
////		System.out.print(week);
//		
//		switch(week) {
//		case 1:
//			today = Week.SUNDAY;
//			break;
//		case 2:
//			today = Week.MONDAY;
//			break;
//		case 3:
//			today = Week.TUESDAY;
//			break;
//		case 4:
//			today = Week.WEDNESDAY;
//			break;
//		case 5:
//			today = Week.THURSDAY;
//			break;
//		case 6:
//			today = Week.FRIDAY;
//			break;
//		case 7:
//			today = Week.SATURDAY;
//			break;
//		}
//		
//		System.out.println("오늘은 " + today + "입니다.");
//		
//		if(today == Week.SUNDAY || today == Week.SATURDAY) {
//			System.out.println("주말은 쉽니다.");
//		}else {
//			System.out.println("평일은 공부합니다.");
//		}
		
		
		//name() 메소드
		Week today = Week.SUNDAY;
		String name = today.name();
		System.out.println(name);
		
		//ordinal() 메소드
		int oridinal = today.ordinal();
		System.out.println(oridinal);
		
		// compareTo() 메소드
		Week day1 = Week.MONDAY;
		Week day2 = Week.WEDNESDAY;
		int result1 = day1.compareTo(day2);
		int result2 = day2.compareTo(day1);
		System.out.println(result1);
		System.out.println(result2);
		
		// valueOf
		String strDay = "SATURDAY";
		Week weekDay = Week.valueOf(strDay);
		if(weekDay == Week.SATURDAY || weekDay == Week.SUNDAY) {
			System.out.println("주말 이군요");
		}else {
			System.out.println("평일 이군요");
		}
		
		//  values() 메소드
		Week[] days = Week.values();
		
		for(Week day : days) {
			System.out.println(day);
		}
		
	}

}
