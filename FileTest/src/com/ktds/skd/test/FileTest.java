package com.ktds.skd.test;

import java.io.File;

public class FileTest {
	public static void main(String[] args) {
		String folderPath = "\\D:\\Languages"; // windows
		// String folderPath = "/D:/Languages"; // Linux

		// folderPath 경로를 읽어온다.
		File languagesFolder = new File(folderPath);

		// languagesFolder의 경로가 폴더(디렉토리)인지, 파일인지 구분
		if (languagesFolder.isDirectory()) {
			// System.out.println(folderPath + " is Folder Directory");
			// System.out.println(languagesFolder.getPath() + " is Folder
			// Directory");
			System.out.println(languagesFolder.getAbsolutePath() + " is Folder Directory");
		} else {
			// System.out.println(folderPath + " is File");
			System.out.println(languagesFolder.getAbsolutePath() + " is File");
		}
		File javaFolder = new File(languagesFolder.getAbsolutePath() + File.separator + "Java");

		if (javaFolder.isDirectory()) {

			System.out.println(javaFolder.getAbsolutePath() + " is Folder Directory");
		} else {
			// System.out.println(folderPath + " is File");
			System.out.println(javaFolder.getAbsolutePath() + " is File");
		}
		
		//javaFolder 안에 있는 내용물들을 가져온다.
		String[] contents = javaFolder.list();
		for(String content : contents){
			System.out.println(content);
		}
	}
}
