package com.jremind.exam01;

public class ArrayExam02 {

	public static void main(String[] args) {
//		String[] oldStrArray = {"java", "array", "copy"};
//		String[] newStrArray = new String[5];
//		
//		System.arraycopy(oldStrArray, 0, newStrArray, 0, oldStrArray.length);
//		
//		newStrArray[1] = "python";
//		
//		for(int i=0; i< newStrArray.length; i++) {
//			System.out.print(newStrArray[i]+ ", ");
//		}
//		System.out.println();
//		for(int i=0; i<oldStrArray.length; i++ ) {
//			System.out.print(oldStrArray[i]+ ", ");
//		}
		
		
		int[] scores = {89, 90, 75,94,88};
		int sum = 0;
		for(int score: scores) {
			sum+=score;
		}
		System.out.println("총합= "+ sum);
		
		double avg = (double)sum / scores.length;
		System.out.println("평균= " + avg);
	}

}
