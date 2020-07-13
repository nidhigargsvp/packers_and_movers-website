package com.wst.dao;

import com.wst.bean.SafexLoginDetails;
import java.util.ArrayList;

public interface SafexLoginDetailsDAOI {
    public int registerUser(SafexLoginDetails obj);
	public ArrayList<SafexLoginDetails> getAllRecords();
	//public SafexLoginDetails getRecordById(SafexLoginDetails obj);
	public SafexLoginDetails loginCheck(SafexLoginDetails obj);
}
