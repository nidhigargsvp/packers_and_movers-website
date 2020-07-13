package com.wst.dao;

import com.wst.bean.SafexQuery;
import java.util.ArrayList;


public interface SafexQueryDAOI {
    public int registerUser(SafexQuery obj);
	public ArrayList<SafexQuery> getAllRecords();
	//public SafexQuery getRecordById(SafexQuery obj);
	public SafexQuery LoginCheck(SafexQuery obj);
    
}
