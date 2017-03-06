package com.ktds.skd.board.board.biz;

import java.util.ArrayList;
import java.util.List;

import com.ktds.skd.board.board.dao.BoardDao;
import com.ktds.skd.board.board.dao.BoardDaoImpl;
import com.ktds.skd.board.board.vo.BoardSearchVO;
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
	public List<BoardVO> getAllArticles(BoardSearchVO boardSearchVO) {
		
		// TODO �Խñ��� ������ ��ȸ�� Pager ��ü�� �Ҵ��Ѵ�
		// �Խñ��� ������ 0 �̶��, ����ִ� ����Ʈ�� �����ϰ�,
		// �׷��� �ʴٸ�, getAllArticles()�� ����
		int articleCount = boardDao.getAllArticlesCount(boardSearchVO);
		boardSearchVO.getPager().setTotalArticleCount(articleCount);
		
		if(articleCount == 0){
			return new ArrayList<BoardVO>();
		} else {
			return boardDao.selectAllArticles(boardSearchVO);			
		}
		
	}

	@Override
	public boolean updateArticle(BoardVO boardVO) {
		return boardDao.updateArticle(boardVO) > 0;
	}
}
