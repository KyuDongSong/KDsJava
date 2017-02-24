package com.ktds.skd.board.board.dao;

import java.util.List;

import com.ktds.skd.board.board.vo.BoardVO;

/**
 * Created by Admin on 2017-02-17.
 * INSERT, UPDATE, DELETE -> Dao�뿉�꽌�뒗 int瑜� 諛섑솚
 */
public interface BoardDao {

    public int insertArticle(BoardVO boardVO);

    public int updateArticle(BoardVO boardVO);

    public List<BoardVO> selectAllArticles();

    public BoardVO selectOneArticle(int boardId);

    public int deleteArticle(int boardId);
    

}
