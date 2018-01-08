package com.internousdev.shoplist.dto;

public class ItemDTO extends CategoryDTO {

	private int id;
	private int moreId;
	private String moreName;
	private String moreNameKana;
	private String moreDescription;
	private int price;
	private String imageFilePath;
	private String imageFileName;
	private String releaseDate;
	private String releaseCompany;




	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getMoreId() {
		return moreId;
	}
	public void setMoreId(int moreId) {
		this.moreId = moreId;
	}
	public String getMoreName() {
		return moreName;
	}
	public void setMoreName(String moreName) {
		this.moreName = moreName;
	}
	public String getMoreNameKana() {
		return moreNameKana;
	}
	public void setMoreNameKana(String moreNameKana) {
		this.moreNameKana = moreNameKana;
	}
	public String getMoreDescription() {
		return moreDescription;
	}
	public void setMoreDescription(String moreDescription) {
		this.moreDescription = moreDescription;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getImageFilePath() {
		return imageFilePath;
	}
	public void setImageFilePath(String imageFilePath) {
		this.imageFilePath = imageFilePath;
	}
	public String getImageFileName() {
		return imageFileName;
	}
	public void setImageFileName(String imageFileName) {
		this.imageFileName = imageFileName;
	}
	public String getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}
	public String getReleaseCompany() {
		return releaseCompany;
	}
	public void setReleaseCompany(String releaseCompany) {
		this.releaseCompany = releaseCompany;
	}

}
