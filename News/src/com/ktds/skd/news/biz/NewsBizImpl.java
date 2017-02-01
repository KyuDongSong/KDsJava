package com.ktds.skd.news.biz;

import java.util.List;
import java.util.Scanner;

import com.ktds.skd.news.dao.NewsDao;
import com.ktds.skd.news.dao.NewsDaoImpl;
import com.ktds.skd.news.vo.NewsVO;

public class NewsBizImpl implements NewsBiz {

	private NewsDao newsDao;

	private Scanner input = new Scanner(System.in);

	public NewsBizImpl() {
		newsDao = new NewsDaoImpl();
	}

	@Override
	public void queryAllNews() {
		List<NewsVO> newsList = newsDao.queryAllNews();
		showList(newsList);
	}

	private void showList(List<NewsVO> newsList) {
		for (NewsVO news : newsList) {
			System.out.println("제목: " + news.getTitle() + "언론사: " + news.getPressCenter() + "기자: " + news.getName());
		}
	}

	@Override
	public void addNewsNews() {
		System.out.println("뉴스 기사 입력");
		System.out.println("제목: ");
		String tempTitle = input.next();

		System.out.println("언론사: ");
		String tempPress = input.next();

		System.out.println("기자: ");
		String tempName = input.next();

		NewsVO newsVO = new NewsVO();

		newsVO.setTitle(tempTitle);
		newsVO.setPressCenter(tempPress);
		newsVO.setName(tempName);

		newsDao.addNewsNews(newsVO);
	}

}
