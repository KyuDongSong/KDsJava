package com.ktds.skd.board.board.biz;

import java.util.List;

import com.ktds.skd.board.board.vo.BoardSearchVO;
import com.ktds.skd.board.board.vo.BoardVO;

/**
 * Created by Admin on 2017-02-17.
 * INSERT , UPDATE, DELETE => Biz�뿉�꽌�뒗 boolean 諛섑솚
 */
public interface BoardBiz {
	
	public List<BoardVO> getAllArticles(BoardSearchVO searchVO);

	public boolean writeArticle(BoardVO boardVO);

    public boolean deleteArticle(int boardId);
    
    public boolean updateArticle(BoardVO boardVO);

    public BoardVO getOneArticle(int boardId);

}
