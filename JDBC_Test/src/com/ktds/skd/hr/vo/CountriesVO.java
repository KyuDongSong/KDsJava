package com.ktds.skd.hr.vo;

public class CountriesVO {

	private String countryId;
	private String countryName;

	private int regionId;

	private RegionsVO regions;

	public String getCountryId() {
		return countryId;
	}

	public void setCountryId(String countryId) {
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

	public RegionsVO getRegions() {
		if (regions == null) {
			regions = new RegionsVO();
		}
		return regions;
	}

	public void setRegions(RegionsVO regionsVO) {
		this.regions = regionsVO;
	}
}
