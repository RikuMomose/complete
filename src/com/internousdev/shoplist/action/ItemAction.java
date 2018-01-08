package com.internousdev.shoplist.action;

import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.shoplist.dao.ItemDAO;
import com.internousdev.shoplist.dto.CategoryDTO;
import com.internousdev.shoplist.dto.ItemDTO;
import com.opensymphony.xwork2.ActionSupport;

public class ItemAction extends ActionSupport implements SessionAware{

private static final long serialVersionUID = 1L;

public Map<String, Object> session;

private ArrayList<CategoryDTO> categoryList;

private ArrayList<ItemDTO> itemDTOList;

private String emptyMessage;

public String execute(){
	String result = SUCCESS;
	ItemDAO itemDAO = new ItemDAO();

	try{
		setItemDTOList(itemDAO.getItemList());

		if(itemDTOList.size() == 0) {
			setEmptyMessage("è§ïiÇ™Ç†ÇËÇ‹ÇπÇÒ");
		}
	}catch (Exception e){
		e.printStackTrace();
		result = ERROR;
	}
	return result;
}

public Map<String, Object> getSession() {
	return session;
}
public void setSession(Map<String, Object> session) {
	this.session = session;
}

public ArrayList<CategoryDTO> getCategoryList() {
	return categoryList;
}

public void setCategoryList(ArrayList<CategoryDTO> categoryList) {
	this.categoryList = categoryList;
}

public ArrayList<ItemDTO> getItemDTOList() {
	return itemDTOList;
}
public void setItemDTOList(ArrayList<ItemDTO> itemDTOList) {
	this.itemDTOList = itemDTOList;
}


public String getEmptyMessage() {
	return emptyMessage;
}

public void setEmptyMessage(String emptyMessage) {
	this.emptyMessage = emptyMessage;
}


}
