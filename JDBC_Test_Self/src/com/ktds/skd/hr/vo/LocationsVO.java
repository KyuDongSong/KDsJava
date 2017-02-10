package com.ktds.skd.hr.vo;

import com.ktds.skd.dao.support.annotation.Types;

public class LocationsVO {

	@Types
	public int loacationId;

	@Types
	public int countryId;

	@Types
	public String strreAddress;

	@Types
	public String postalCode;

	@Types
	public String city;

	public RegionsVO regions;

	public RegionsVO getRegions() {
		if (regions == null) {
			regions = new RegionsVO();
		}
		return regions;
	}

	public void setRegions(RegionsVO regions) {
		this.regions = regions;
	}

	public int getLoacationId() {
		return loacationId;
	}

	public void setLoacationId(int loacationId) {
		this.loacationId = loacationId;
	}

	public int getCountryId() {
		return countryId;
	}

	public void setCountryId(int countryId) {
		this.countryId = countryId;
	}

	public String getStrreAddress() {
		return strreAddress;
	}

	public void setStrreAddress(String strreAddress) {
		this.strreAddress = strreAddress;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

}
