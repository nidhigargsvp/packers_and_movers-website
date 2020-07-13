package com.wst.bean;

public class SafexQuickQuote {
    private int q_quote_id;
  private String name;
  private String phone;
  private String email;
  private String moving_from;
  private String moving_to;
  private String moving_date;
  private String message;
  private String is_read;
 // private String query_time;

    public SafexQuickQuote() {
    }

    public SafexQuickQuote(int q_quote_id, String name, String phone, String email, String moving_from, String moving_to, String moving_date, String message, String is_read) {
        this.q_quote_id = q_quote_id;
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.moving_from = moving_from;
        this.moving_to = moving_to;
        this.moving_date = moving_date;
        this.message = message;
        this.is_read = is_read;
    //    this.query_time = query_time;
    }

    @Override
    public String toString() {
        return "SafexQueryQuote{" + "q_quote_id=" + q_quote_id + ", name=" + name + ", phone=" + phone + ", email=" + email + ", moving_from=" + moving_from + ", moving_to=" + moving_to + ", moving_date=" + moving_date + ", message=" + message + ", is_read=" + is_read + "}";
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

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMoving_date() {
        return moving_date;
    }

    public void setMoving_date(String moving_date) {
        this.moving_date = moving_date;
    }

    public String getMoving_from() {
        return moving_from;
    }

    public void setMoving_from(String moving_from) {
        this.moving_from = moving_from;
    }

    public String getMoving_to() {
        return moving_to;
    }

    public void setMoving_to(String moving_to) {
        this.moving_to = moving_to;
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

    public int getQ_quote_id() {
        return q_quote_id;
    }

    public void setQ_quote_id(int q_quote_id) {
        this.q_quote_id = q_quote_id;
    }

    /*public String getQuery_time() {
        return query_time;
    }

    public void setQuery_time(String query_time) {
        this.query_time = query_time;
    }*/
  
    
}
