package com.board.impl;

import java.util.ArrayList;
import java.util.List;

import com.board.model.Board;
import com.board.model.BoardCollection;

public class BoardCollectionImpl  implements BoardCollection{

	@Override //추가
	public void writeBoard(Board board, List<Board> boards) {
		boards.add(board);
	}

	@Override //삭제
	public void deleteBoard(int boardNo, List<Board> boards) {
		try {
			boards.remove(boardNo);
		}catch(IndexOutOfBoundsException e) {
			System.out.println("존재하지않습니다.");
		}
	}

	@Override //단건조회
	public Board getBoard(int boardNo, List<Board> boards) {
		try {
			Board get = boards.get(boardNo);
			return get;
		}catch(IndexOutOfBoundsException e) {
			System.out.println("존재하지않습니다.");
			return null;
		}
		
	}

	@Override  //전체조회
	public List<Board> getBoardList(List<Board> boards) {
//		List<Board> boardAry = new ArrayList<>();
//		for(int i = 0;i < boards.size(); i++) {
//			boardAry.add(boards.get(i));
//	}
		return boards;
	}

	@Override //4내용변경
	public void updateBoard(Board board, List<Board> boards) {
		Board get = new Board(board.getBoardNo(),
				"",board.getContents(),
				""); 
//		boards.get(board.getBoardNo()).getTitle()
//		boards.get(board.getBoardNo()).getWriter()
		try {
			boards.add(board.getBoardNo(),get);
			
		}catch(IndexOutOfBoundsException e) {
			System.out.println("존재하지않습니다.");
			
		}
	}

	@Override //5제목변경
	public void updateTitleBoard(Board board, List<Board> boards) {
		
	}

	@Override //6작성자변경
	public void updateWriterBoard(Board board, List<Board> boards) {
		
	}

}
