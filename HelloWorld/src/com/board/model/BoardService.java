package com.board.model;

import java.util.List;

public interface BoardService {
	// �۾���
	public void writeBoard(Board board, Board[] boards);
	// �ۻ���.
	public void deleteBoard(int boardNo, Board[] boards);
	public Board getBoard(int boardNo, Board[] boards);
	public Board[] getBoardList(Board[] boards);
	// �����ϱ�.
	public void updateBoard(Board board, Board[] boards);
	public void updateTitleBoard(Board board, Board[] boards);
	public void updateWriterBoard(Board board, Board[] boards);

}
