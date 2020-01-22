package com.board.impl;

import com.board.model.Board;
import com.board.model.BoardService;

public class BoardServiceImpl implements BoardService {

	@Override
	public void writeBoard(Board board, Board[] boards) {
		for(int i = 0; i<boards.length;i++) {
			if(boards[i] ==null) {
				boards[i]=board;
				break;
			}
		}
		
	}

	@Override
	public Board getBoard(int boardNo,Board[] boards) { //게시물 검색(게시물번호로)
		Board board = null;
		
		for(int i=0;i<boards.length;i++){
			if(boards[i] !=null && boards[i].getBoardNo() == boardNo) {
				board=boards[i];
			}
		}
		return board;
	}

	@Override
	public Board[] getBoardList(Board[] boards) { //전체 게시물조회
		Board[] boardAry = new Board[boards.length];
		for(int i=0;i<boards.length;i++) {
				boardAry[i]=boards[i];
		}
		
		return boardAry;
	}

	@Override
	public void deleteBoard(int boardNo, Board[] boards) {
	
		for (int i = 0; i < boards.length; i++) {
				if (boards[i] != null && boards[i].getBoardNo() == boardNo) {
					for (int j = i; j < boards.length; j++) {
						boards[j] = boards[j + 1];
						if((j+1) == (boards.length-1))
							break;
					}
					break;
				}
		}
	}

	@Override
	public void updateBoard(Board board, Board[] boards) {
		for(int i=0;i<boards.length;i++){
			if(boards[i] !=null && boards[i].getBoardNo() == board.getBoardNo()) {
				boards[i].setContents(board.getContents());;
			}
		}

	}

	@Override
	public void updateTitleBoard(Board board, Board[] boards) {
		for(int i=0;i<boards.length;i++){
			if(boards[i] !=null && boards[i].getBoardNo() == board.getBoardNo()) {
				boards[i].setTitle(board.getTitle());;
			}
		}
	}

	@Override
	public void updateWriterBoard(Board board, Board[] boards) {
		for(int i=0;i<boards.length;i++){
			if(boards[i] !=null && boards[i].getBoardNo() == board.getBoardNo()) {
				boards[i].setWriter(board.getWriter());;
			}
		}
	}

}
