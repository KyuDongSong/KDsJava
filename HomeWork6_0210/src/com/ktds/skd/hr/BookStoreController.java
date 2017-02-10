package com.ktds.skd.hr;

import com.ktds.skd.hr.biz.BookStoreBiz;
import com.ktds.skd.hr.biz.BookStoreBizImpl;

public class BookStoreController {
	BookStoreBiz bookStoreBiz = new BookStoreBizImpl();

	public void start() {
		bookStoreBiz.showBookStore();
	}

	public static void main(String[] args) {
		new BookStoreController().start();
	}
}
