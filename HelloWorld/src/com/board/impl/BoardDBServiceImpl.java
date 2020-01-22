package com.board.impl;

import java.util.List;

import com.board.common.BoardDBDAO;
import com.board.model.BoardDB;
import com.board.model.BoardDBService;

public class BoardDBServiceImpl implements BoardDBService{
	BoardDBDAO dbdao= new BoardDBDAO();
	
	@Override
	public String loginCheck(String id, String passwd) {
		
		String name =dbdao.getUserName(id, passwd);
		return name;
	}

	@Override
	public void insertBoard(BoardDB board) {
		dbdao.insertBoard(board);
	
	}

	@Override
	public List<BoardDB> getBoardList() { //전체 조회ㅇ
		List<BoardDB> list=dbdao.getBoardList();
		return list;
	}

	
	@Override
	public BoardDB getBoard(int boardNo) {
		BoardDB board = dbdao.getBoard(boardNo);
		return board;
	}

	@Override
	public List<BoardDB> getReply(int boardNo) {
		List<BoardDB> list = dbdao.getReplyList(boardNo);
		return list;
	}

	
	@Override
	public void insertReply(BoardDB board) {//원본글에 댓글달기.
		dbdao.insertReply(board);
	}

	@Override
	public void updateBoard(BoardDB board) {	//내용수정
		//해당글에 대한 권한 확인.
		if(dbdao.checkResponsibility(board)) {
			dbdao.updateBoard(board);
			System.out.println("변경되었습니다.");
		}
		else
			System.out.println("해당글에 대한 수정 권한이 없습니다.");
	}

	@Override
	public void deleteBoard(BoardDB board) {
		
			if (dbdao.checkResponsibility(board)) { //권한체크
				if(dbdao.checkForReply(board.getBoardNo())){//댓글 유무 체크
					dbdao.deleteBoard2(board);
				}else {
					System.out.println("댓글이 존재합니다.");
				}
				
			} else
				System.out.println("해당글에 대한 삭제 권한이 없습니다.");

			
			
	}
	

}
