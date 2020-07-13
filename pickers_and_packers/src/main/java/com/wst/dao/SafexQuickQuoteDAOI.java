package com.wst.dao;


import com.wst.bean.SafexQuickQuote;
import java.util.ArrayList;


public interface SafexQuickQuoteDAOI {
    public int registerUser(SafexQuickQuote obj);
 public ArrayList<SafexQuickQuote> getAllRecord();

 public SafexQuickQuote LoginCheck(SafexQuickQuote obj);
    
}
