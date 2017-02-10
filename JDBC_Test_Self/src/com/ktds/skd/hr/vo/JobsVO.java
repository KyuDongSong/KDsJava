package com.ktds.skd.hr.vo;

import com.ktds.skd.dao.support.annotation.Types;

public class JobsVO {
	
	
	@Types
	public int jobId;
	
	@Types
	public int maxSalary;
	
	@Types
	public int minSalary;
	
	
	@Types
	public String jobTitle;
	
	
	public int getJobId() {
		return jobId;
	}


	public void setJobId(int jobId) {
		this.jobId = jobId;
	}


	public int getMaxSalary() {
		return maxSalary;
	}


	public void setMaxSalary(int maxSalary) {
		this.maxSalary = maxSalary;
	}


	public int getMinSalary() {
		return minSalary;
	}


	public void setMinSalary(int minSalary) {
		this.minSalary = minSalary;
	}


	public String getJobTitle() {
		return jobTitle;
	}


	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	
}
