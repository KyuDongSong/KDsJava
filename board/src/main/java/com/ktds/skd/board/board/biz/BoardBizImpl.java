package com.ktds.skd.board.board.biz;

import java.util.List;

import com.ktds.skd.board.board.dao.BoardDao;
import com.ktds.skd.board.board.dao.BoardDaoImpl;
import com.ktds.skd.board.board.vo.BoardVO;

/**
 * Created by Admin on 2017-02-17.
 */
public class BoardBizImpl implements BoardBiz {

	private BoardDao boardDao;

	public BoardBizImpl() {
		this.boardDao = new BoardDaoImpl();
	}

	@Override
	public boolean deleteArticle(int boardId) {
		return boardDao.deleteArticle(boardId) > 0;
	}

	@Override
	public BoardVO getOneArticle(int boardId) {
		return boardDao.selectOneArticle(boardId);
	}

	@Override
	public boolean writeArticle(BoardVO boardVO) {
		return boardDao.insertArticle(boardVO) > 0;
	}

	@Override
	public List<BoardVO> getAllArticles() {
		return boardDao.selectAllArticles();
	}

	@Override
	public boolean updateArticle(BoardVO boardVO) {
		return boardDao.updateArticle(boardVO) > 0;
	}
}
