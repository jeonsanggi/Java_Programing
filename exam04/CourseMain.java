package com.jremind.exam04;

import java.util.Arrays;

public class CourseMain {

	public static void registerCourse(Course<?> course) {
		System.out.println(course.getName() + " ������: " + Arrays.toString(course.getStudents()));
	}
	
	public static void registerCourseStudent(Course<? extends Student> course) {
		System.out.println(course.getName() + " ������: " + Arrays.toString(course.getStudents()));
	}
	
	public static void registerCourseWorker(Course<? super Worker> course) {
		System.out.println(course.getName() + " ������: " + Arrays.toString(course.getStudents()));
	}


	public static void main(String[] args) {
		Course<Person> personCourse = new Course<Person>("�Ϲ��ΰ���", 5);
		personCourse.add(new Person("�Ϲ���"));
		personCourse.add(new Worker("������"));
		personCourse.add(new Student("�л�"));
		personCourse.add(new GraduateStudent("���п���"));
		
		Course<Worker> workerCourse = new Course<Worker>("�����ΰ���", 5);
		workerCourse.add(new Worker("������"));
		
		Course<Student> studentCourse = new Course<Student>("�л�����", 5);
		studentCourse.add(new Student("�л�"));
		studentCourse.add(new GraduateStudent("���п���"));
		
		Course<GraduateStudent> graduateStudentCourse = new Course<GraduateStudent>("���п�����", 5);
		graduateStudentCourse.add(new GraduateStudent("���п���"));
		
		registerCourse(personCourse);
		registerCourse(workerCourse);
		registerCourse(studentCourse);
		registerCourse(graduateStudentCourse);
		System.out.println();
		
		registerCourseStudent(studentCourse);
		registerCourseStudent(graduateStudentCourse);
//		registerCourseStudent(personCourse);
//		registerCourseStudent(workerCourse);
		System.out.println();
		
		registerCourseWorker(personCourse);
		registerCourseWorker(workerCourse);
//		registerCourseWorker(studentCourse);
//		registerCourseWorker(graduateStudentCourse);

	}

}
