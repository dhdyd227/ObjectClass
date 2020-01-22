package com.board.model;

import java.util.List;

public interface BoardDBService {
	public String loginCheck(String id,String passwd); //�α��� ��
	public void insertBoard(BoardDB board);//�Խñ� �ۼ� ��
	public List<BoardDB> getBoardList();//��ü �Խñ� ����Ʈ  ��
	public BoardDB getBoard(int boardNo); //�Ѱ� ��ȸ  ��
	public List<BoardDB> getReply(int boardNo); //������ �� �����ȸ (��������?)  ��
	public void insertReply(BoardDB board);//��� �߰�  ��
	public void updateBoard(BoardDB board);//���� (update table_name set �� = �����Ұ� where=����  ��
	
	public void deleteBoard(BoardDB board); // ����

}
