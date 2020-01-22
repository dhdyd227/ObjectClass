package com.yedam.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

class HighStudent{
	String name;
	String sex;
	int score;
	
	public HighStudent(String name, String sex, int score) {
		super();
		this.name = name;
		this.sex = sex;
		this.score = score;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	
}

public class PredicateExmple {
	static List<HighStudent> list = Arrays.asList(
				new HighStudent("ȫ�浿","����",90),
				new HighStudent("�����","����",90), 
				new HighStudent("�ڱ浿","����",85), 
				new HighStudent("�ڼ���","����",92)
				);
	static double avg(Predicate<HighStudent> pred) {
		boolean bool = false;
		int cnt = 0, sum=0;
		
		for(HighStudent student : list) {
			bool = pred.test(student); //����
			if(bool) {
				cnt++;
				sum += student.getScore();
			}
		}
		return (double) sum/cnt;
	}
	
	public static void main(String[] args) {
		Predicate<HighStudent> pred = new Predicate<HighStudent>() {

			@Override
			public boolean test(HighStudent t) {
				return t.getSex().equals("����");
			}
			
		};
		
		double avg = avg(pred);
		System.out.println("�������: "+avg);
		
		avg = avg((t)->{
			return t.getSex().equals("����");
		});
		System.out.println("�������: "+avg);
		
	}

}
