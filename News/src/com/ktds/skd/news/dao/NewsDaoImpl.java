package com.ktds.skd.news.dao;

import java.util.ArrayList;
import java.util.List;

import com.ktds.skd.news.vo.NewsVO;

public class NewsDaoImpl implements NewsDao {
	
	private List<NewsVO> newsList;
	
	public NewsDaoImpl(){
		newsList = new ArrayList<NewsVO>();
	}

	@Override
	public List<NewsVO> queryAllNews() {
		return newsList;
	}

	@Override
	public void addNewsNews(NewsVO newNews) {
		newsList.add(newNews);
	}

}
