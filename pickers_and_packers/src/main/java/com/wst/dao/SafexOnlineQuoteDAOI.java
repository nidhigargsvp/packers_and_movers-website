package com.wst.dao;

import com.wst.bean.SafexOnlineQuote;
import java.util.ArrayList;


public interface SafexOnlineQuoteDAOI  {
    public int registerUser(SafexOnlineQuote obj);
	public ArrayList<SafexOnlineQuote> getAllRecords();
	//public SafexOnlineQuote getRecordById(SafexOnlineQuote obj);
	public SafexOnlineQuote LoginCheck(SafexOnlineQuote obj);
    
}
