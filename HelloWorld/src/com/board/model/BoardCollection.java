package com.board.model;

import java.util.List;

public interface BoardCollection {
		//글쓰기
		public void writeBoard(Board board, List<Board> boards);
		//글삭제.
		public void deleteBoard(int boardNo,List<Board> boards);
		public Board getBoard(int boardNo,List<Board> boards);
		public List<Board> getBoardList(List<Board> boards);
		//변경하기.
		public void updateBoard(Board board,List<Board> boards);
		public void updateTitleBoard(Board board,List<Board> boards);
		public void updateWriterBoard(Board board,List<Board> boards);
	}