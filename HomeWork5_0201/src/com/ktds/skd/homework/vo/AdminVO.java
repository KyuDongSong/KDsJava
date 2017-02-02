package com.ktds.skd.homework.vo;

import static com.ktds.skd.homework.GradeConst.*;

public class AdminVO {

	public String name;
	public String part;
	public String grade;
	public int salary;

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		if (grade.equals(WORKER)) {
			this.grade = grade;
		} else if (grade.equals(MANAGER)) {
			this.grade = grade;
		} else if (grade.equals(TEAM_CHIEF)) {
			this.grade = grade;
		} else if (grade.equals(DEPART_CHIEF)) {
			this.grade = grade;
		} else if (grade.equals(HEAD_CHIEF)) {
			this.grade = grade;
		} else if (grade.equals(BOSS)) {
			this.grade = grade;
		} 
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getPart() {
		return part;
	}

	public void setPart(String part) {
		this.part = part;
	}

}
