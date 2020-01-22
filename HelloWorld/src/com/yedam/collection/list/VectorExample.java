package com.yedam.collection.list;

import java.util.List;
import java.util.Vector;

import com.board.model.Board;

public class VectorExample {
	public static void main(String[] args) {
		List<Board> list = new Vector<>(); //���� �����忡�� �۾��ϴ� Vector (���� arraylist ����)
		
		list.add(new Board(1,"����1","����1","�ۼ���1"));
		list.add(new Board(2,"����2","����2","�ۼ���2"));
		list.add(new Board(3,"����3","����3","�ۼ���3"));
		list.add(new Board(4,"����4","����4","�ۼ���4"));
		list.add(new Board(5,"����5","����5","�ۼ���5"));
		for(Board b : list) {
			System.out.println(b);
	
		}
		System.out.println("---------------------------------------");
		list.remove(0); // 0��° ����.
		for(Board b : list) {
			System.out.println(b);
	
		}	
	}

}
