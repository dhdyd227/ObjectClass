package com.yedam.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.ToIntFunction;

class Student {
	String name;
	int engScore;
	int matScore;

	public Student(String name, int engScore, int matScore) {
		super();
		this.name = name;
		this.engScore = engScore;
		this.matScore = matScore;
	}

	public String getName() {
		return name;
	}

	public int getEngScore() {
		return engScore;
	}

	public int getMatScore() {
		return matScore;
	}
}

public class FunctionExample {
	static List<Student> list = Arrays.asList(new Student("hong", 80, 92), new Student("Kang", 85, 93));

	public static void printString(Function<Student, String> func) {
		for (Student student : list) {
			System.out.println(func.apply(student));
		}
	}

	public static void printInt(ToIntFunction<Student> func) {
		for (Student student : list) {
			System.out.println(func.applyAsInt(student));
		}
	}
	
	public static double avg(ToIntFunction<Student> func) {
		int sum=0, cnt =0;
		for(Student student: list) {
			cnt++;
			sum += func.applyAsInt(student);
		}
		return (double)sum/cnt;
	}

	/////////////////////////////////////////////////////////////////////////
	public static void main(String[] args) {
		Function<Student, String> func = new Function<Student, String>() {
			@Override
			public String apply(Student t) {
				return t.getName();
			}
		};

		Function<Student, String> func2 = (t) -> {
			return t.getName();
		};

		printString(func);

		printString((t) -> {
			return t.getName() + "입니다.";
		});
		///////////////////////////////////////////////////////////////
		ToIntFunction<Student> func3 = new ToIntFunction<Student>() {
			@Override
			public int applyAsInt(Student value) {
				return value.getEngScore();
			}

		};
		System.out.println("영어점수");
		printInt(func3);

		System.out.println("수학점수");
		printInt((t) -> {
			return t.getMatScore();
		});
		
		System.out.println("영어평균: ");
		double result =avg(func3);
		System.out.println(result);
		
		ToIntFunction<Student> func4 = new ToIntFunction<Student>() {
			@Override
			public int applyAsInt(Student value) {
				return value.getMatScore();
			}

		};
		ToIntFunction<Student> func5 =(t)->{
			return t.getMatScore();
		};
		
		System.out.println("수학평균: ");
		double result2 =avg(func5);
		System.out.println(result2);
	}

}
