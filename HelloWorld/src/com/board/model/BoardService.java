package com.board.model;

import java.util.List;

public interface BoardService {
	// 글쓰기
	public void writeBoard(Board board, Board[] boards);
	// 글삭제.
	public void deleteBoard(int boardNo, Board[] boards);
	public Board getBoard(int boardNo, Board[] boards);
	public Board[] getBoardList(Board[] boards);
	// 변경하기.
	public void updateBoard(Board board, Board[] boards);
	public void updateTitleBoard(Board board, Board[] boards);
	public void updateWriterBoard(Board board, Board[] boards);

}
