package com.internousdev.shoplist.action;

import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.shoplist.dao.ItemDAO;
import com.internousdev.shoplist.dto.CategoryDTO;
import com.internousdev.shoplist.dto.ItemDTO;
import com.opensymphony.xwork2.ActionSupport;

public class ReturnbuyAction extends ActionSupport implements SessionAware {

	private static final long serialVersionUID = 1L;

	private String searchText;

	private int moreId;

	private ItemDTO itemDTO;

	private Map<String, Object> session;

	private ArrayList<CategoryDTO> categoryList;




	public String execute (){

		String result = SUCCESS;

		try{

			ItemDAO itemDAO = new ItemDAO();

			setItemDTO(itemDAO.getItem(moreId));

		}catch(Exception e) {
			e.printStackTrace();
			result = ERROR;
		}
		return result;

	}


	public int getMoreId() {
		return moreId;
	}
	public void setMoreId(int moreId) {
		this.moreId = moreId;
	}

	public ItemDTO getItemDTO() {
		return itemDTO;
	}

	public void setItemDTO(ItemDTO itemDTO) {
		this.itemDTO = itemDTO;
	}

	public Map<String, Object> getSession() {
		return session;
	}
	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}


	public ArrayList<CategoryDTO> getCategoryList() {
		return categoryList;
	}
	public void setCategoryList(ArrayList<CategoryDTO> categoryList) {
		this.categoryList = categoryList;
	}


	public String getSearchText() {
		return searchText;
	}


	public void setSearchText(String searchText) {
		this.searchText = searchText;
	}


}

