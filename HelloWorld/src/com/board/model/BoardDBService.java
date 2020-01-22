package com.board.model;

import java.util.List;

public interface BoardDBService {
	public String loginCheck(String id,String passwd); //로그인 ㅇ
	public void insertBoard(BoardDB board);//게시글 작성 ㅇ
	public List<BoardDB> getBoardList();//전체 게시글 리스트  ㅇ
	public BoardDB getBoard(int boardNo); //한건 조회  ㅇ
	public List<BoardDB> getReply(int boardNo); //원본글 밑 댓글조회 (조인으로?)  ㅇ
	public void insertReply(BoardDB board);//댓글 추가  ㅇ
	public void updateBoard(BoardDB board);//수정 (update table_name set 열 = 변경할값 where=조건  ㅇ
	
	public void deleteBoard(BoardDB board); // 삭제

}
