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
	public List<BoardDB> getBoardList() { //��ü ��ȸ��
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
	public void insertReply(BoardDB board) {//�����ۿ� ��۴ޱ�.
		dbdao.insertReply(board);
	}

	@Override
	public void updateBoard(BoardDB board) {	//�������
		//�ش�ۿ� ���� ���� Ȯ��.
		if(dbdao.checkResponsibility(board)) {
			dbdao.updateBoard(board);
			System.out.println("����Ǿ����ϴ�.");
		}
		else
			System.out.println("�ش�ۿ� ���� ���� ������ �����ϴ�.");
	}

	@Override
	public void deleteBoard(BoardDB board) {
		
			if (dbdao.checkResponsibility(board)) { //����üũ
				if(dbdao.checkForReply(board.getBoardNo())){//��� ���� üũ
					dbdao.deleteBoard2(board);
				}else {
					System.out.println("����� �����մϴ�.");
				}
				
			} else
				System.out.println("�ش�ۿ� ���� ���� ������ �����ϴ�.");

			
			
	}
	

}
