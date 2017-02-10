package com.ktds.skd.hr.vo;

import com.ktds.skd.dao.support.annotation.Types;

public class CountriesVO {

	@Types
	public int countryId;

	@Types
	public String countryName;

	@Types
	public int regionId;

	public int getCountryId() {
		return countryId;
	}

	public void setCountryId(int countryId) {
		this.countryId = countryId;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public int getRegionId() {
		return regionId;
	}

	public void setRegionId(int regionId) {
		this.regionId = regionId;
	}
	
	
}
