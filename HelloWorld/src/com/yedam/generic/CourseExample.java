package com.yedam.generic;

import java.util.Arrays;

public class CourseExample {
	public static void main(String[] args) {
		Course<Person> personCourse = new Course<>("�Ϲ��ΰ���",5);
		personCourse.add(new Person("�Ϲ���1"));
		personCourse.add(new Worker("������1"));
		personCourse.add(new Student("�л�1"));
		personCourse.add(new HighStudent("����л�1"));
		
		Course<Worker> workerCourse = new Course<>("�����ΰ���",5);
		workerCourse.add(new Worker("������2"));
		
		Course<Student> studentCourse = new Course<>("�л�����",5);
		studentCourse.add(new Student("�л�3"));
		studentCourse.add(new HighStudent("����л�3"));
		
		Course<HighStudent> highCourse = new Course<>("����л�����",5);
		highCourse.add(new HighStudent("����л�4"));
		
		registerCourse(personCourse);
		registerCourse(workerCourse);
		registerCourse(studentCourse);
		registerCourse(highCourse);

//		registerStudent(personCourse); error  å 666p����
//		registerStudent(workerCourse); error ���ϵ�ī�� Ȯ��
		registerStudent(studentCourse);
		registerStudent(highCourse);
		
		registerWorker(personCourse);
		registerWorker(workerCourse);
//		registerWorker(studentCourse); error
//		registerWorker(highCourse); error ���ϵ�ī�� Ȯ��

	}
	
	public static Course<? extends Student> getCourse(){
		Course<Person> coursePerson = new Course<>("�Ϲ���",5);
		Course<Worker> courseWorker = new Course<>("�����ΰ���",5);
		Course<Student> courseStudent = new Course<>("�л�����",5);
		Course<HighStudent> courseHigh = new Course<>("����л�����",5);
		return courseStudent;
	}
	
	public static void registerWorker(Course<? super Worker> course) {
		System.out.println("������: "+course.getName()+ 
				", ������: " + Arrays.toString(course.getStudents()));
	}
	
	public static void registerStudent(Course<? extends Student> course) {
		System.out.println("������: "+course.getName()+ 
				", ������: " + Arrays.toString(course.getStudents()));
	}
	public static void registerCourse(Course<?> course) {
		System.out.println("������: "+course.getName()+ 
				", ������: " + Arrays.toString(course.getStudents()));
	}

}
