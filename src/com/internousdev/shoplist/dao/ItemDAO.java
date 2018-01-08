package com.internousdev.shoplist.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdev.shoplist.dto.ItemDTO;
import com.internousdev.shoplist.util.DBConnector;

public class ItemDAO {

	private DBConnector dbConnector = new DBConnector ();
	private Connection connection = dbConnector.getConnection ();




	public ItemDTO getItem(int moreId){
		ItemDTO getItem=new ItemDTO ();

		String sql=""
				+ "SELECT * "
				+ "FROM more_info "
				+ "INNER JOIN m_category "
				+ "ON more_info.category_id = m_category.category_id "
				+ "WHERE more_id = ?";

		try{
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, moreId);
			ResultSet resultSet = preparedStatement.executeQuery();

			if(resultSet.next()){

				getItem.setId(resultSet.getInt("more_info.id"));
				getItem.setMoreId(resultSet.getInt("more_id"));
				getItem.setMoreName(resultSet.getString("more_name"));
				getItem.setMoreNameKana(resultSet.getString("more_name_kana"));
				getItem.setMoreDescription(resultSet.getString("more_description"));
				getItem.setCategoryId(resultSet.getInt("more_info.category_id"));
				getItem.setCategoryName(resultSet.getString("category_name"));
				getItem.setCategoryDescription(resultSet.getString("category_description"));
				getItem.setPrice(resultSet.getInt("price"));
				getItem.setImageFilePath(resultSet.getString("image_file_path"));
				getItem.setImageFileName(resultSet.getString("image_file_name"));
				getItem.setReleaseDate (resultSet.getString("release_date"));
				getItem.setReleaseCompany(resultSet.getString("release_company"));
			}
		}catch(Exception e){
			e.printStackTrace();
		}
			return getItem;

	}





	public ArrayList<ItemDTO> getItemList() throws SQLException{
		ArrayList<ItemDTO> list = new ArrayList<ItemDTO> ();
		String sql = ""
				+ "SELECT * "
				+ "FROM more_info "
				+ "INNER JOIN m_category "
				+ "ON more_info.category_id = m_category.category_id ";

		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		ResultSet resultSet = preparedStatement.executeQuery();

		while(resultSet.next()){
			ItemDTO dto = new ItemDTO();
			dto.setId(resultSet.getInt("more_info.id"));
			dto.setMoreId(resultSet.getInt("more_id"));
			dto.setMoreName(resultSet.getString("more_name"));
			dto.setMoreNameKana(resultSet.getString("more_name_kana"));
			dto.setMoreDescription(resultSet.getString("more_description"));
			dto.setCategoryId(resultSet.getInt("more_info.category_id"));
			dto.setCategoryName(resultSet.getString("category_name"));
			dto.setCategoryDescription(resultSet.getString("category_description"));
			dto.setPrice(resultSet.getInt("price"));
			dto.setImageFileName(resultSet.getString("image_file_name"));
			dto.setImageFilePath(resultSet.getString("image_file_path"));
			dto.setReleaseDate(resultSet.getString("release_date"));
			dto.setReleaseCompany(resultSet.getString("release_company"));
			list.add(dto);
		}
		return list;
	}






}
