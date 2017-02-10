package com.ktds.skd.hr.vo;

import com.ktds.skd.dao.support.annotation.Types;

public class RegionsVO {
	
	@Types
	public int regionId;
	
	@Types
	public String regionName;
	

	public int getRegionId() {
		return regionId;
	}

	public void setRegionId(int regionId) {
		this.regionId = regionId;
	}

	public String getRegionName() {
		return regionName;
	}

	public void setRegionName(String regionName) {
		this.regionName = regionName;
	}
}
