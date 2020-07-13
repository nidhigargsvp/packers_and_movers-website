package com.wst.bean;

public class SafexQuery {
    private int query_id;
 private String name;
 private String email;
 private String phone;
 private String subject;
 private String query;
 private String is_read;
 //private String query_time;

    public SafexQuery() {
    }

    public SafexQuery(int query_id, String name, String email, String phone, String subject, String query, String is_read) {
        this.query_id = query_id;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.subject = subject;
        this.query = query;
        this.is_read = is_read;
        //this.query_time = query_time;
    }

    @Override
    public String toString() {
        return "SafexQuery{" + "query_id=" + query_id + ", name=" + name + ", email=" + email + ", phone=" + phone + ", subject=" + subject + ", query=" + query + ", is_read="+ is_read +"}";
    }

 
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getIs_read() {
        return is_read;
    }

    public void setIs_read(String is_read) {
        this.is_read = is_read;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public int getQuery_id() {
        return query_id;
    }

    public void setQuery_id(int query_id) {
        this.query_id = query_id;
    }

  /*  public String getQuery_time() {
        return query_time;
    }

    public void setQuery_time(String query_time) {
        this.query_time = query_time;
    }*/

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
 
    
}
