package model.dao;

import db.DB;
import model.dao.impl.SellerDaoImJDBC;

public class DaoFactory {
	public static SellerDao createSellerDao() {
		return new SellerDaoImJDBC(DB.getConnection());
	}
}
