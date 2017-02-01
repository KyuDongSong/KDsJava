package com.ktds.skd.homework.vo;

import static com.ktds.skd.homework.GradeConst.*;

public class AdminVO {

	public String name;
	public int salary;
	public String part;
	public String grade;

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		if (grade == WORKER) {
			this.grade = grade;
		} else if (grade == MANAGER) {
			this.grade = grade;
		} else if (grade == TEAM_CHIEF) {
			this.grade = grade;
		} else if (grade == DEPART_CHIEF) {
			this.grade = grade;
		} else if (grade == HEAD_CHIEF) {
			this.grade = grade;
		} else if (grade == BOSS) {
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
