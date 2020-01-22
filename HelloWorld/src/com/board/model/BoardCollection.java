package com.board.model;

import java.util.List;

public interface BoardCollection {
		//�۾���
		public void writeBoard(Board board, List<Board> boards);
		//�ۻ���.
		public void deleteBoard(int boardNo,List<Board> boards);
		public Board getBoard(int boardNo,List<Board> boards);
		public List<Board> getBoardList(List<Board> boards);
		//�����ϱ�.
		public void updateBoard(Board board,List<Board> boards);
		public void updateTitleBoard(Board board,List<Board> boards);
		public void updateWriterBoard(Board board,List<Board> boards);
	}