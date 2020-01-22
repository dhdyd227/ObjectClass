package com.board.impl;

import java.util.ArrayList;
import java.util.List;

import com.board.model.Board;
import com.board.model.BoardCollection;

public class BoardCollectionImpl  implements BoardCollection{

	@Override //�߰�
	public void writeBoard(Board board, List<Board> boards) {
		boards.add(board);
	}

	@Override //����
	public void deleteBoard(int boardNo, List<Board> boards) {
		try {
			boards.remove(boardNo);
		}catch(IndexOutOfBoundsException e) {
			System.out.println("���������ʽ��ϴ�.");
		}
	}

	@Override //�ܰ���ȸ
	public Board getBoard(int boardNo, List<Board> boards) {
		try {
			Board get = boards.get(boardNo);
			return get;
		}catch(IndexOutOfBoundsException e) {
			System.out.println("���������ʽ��ϴ�.");
			return null;
		}
		
	}

	@Override  //��ü��ȸ
	public List<Board> getBoardList(List<Board> boards) {
//		List<Board> boardAry = new ArrayList<>();
//		for(int i = 0;i < boards.size(); i++) {
//			boardAry.add(boards.get(i));
//	}
		return boards;
	}

	@Override //4���뺯��
	public void updateBoard(Board board, List<Board> boards) {
		Board get = new Board(board.getBoardNo(),
				"",board.getContents(),
				""); 
//		boards.get(board.getBoardNo()).getTitle()
//		boards.get(board.getBoardNo()).getWriter()
		try {
			boards.add(board.getBoardNo(),get);
			
		}catch(IndexOutOfBoundsException e) {
			System.out.println("���������ʽ��ϴ�.");
			
		}
	}

	@Override //5���񺯰�
	public void updateTitleBoard(Board board, List<Board> boards) {
		
	}

	@Override //6�ۼ��ں���
	public void updateWriterBoard(Board board, List<Board> boards) {
		
	}

}
