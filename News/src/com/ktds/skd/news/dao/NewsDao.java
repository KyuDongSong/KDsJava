package com.ktds.skd.news.dao;

import java.util.List;

import com.ktds.skd.news.vo.NewsVO;

public interface NewsDao {
	public List<NewsVO> queryAllNews();

	public void addNewsNews(NewsVO newNews);

}
