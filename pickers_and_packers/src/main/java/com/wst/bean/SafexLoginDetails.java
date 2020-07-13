package com.wst.bean;

public class SafexLoginDetails {
    
    private int user_id;
  private String email;
  private String password;
  private String name;
  private String user_type;
  private String status;
    public SafexLoginDetails() {
    }

    public SafexLoginDetails(int user_id, String email, String password, String name, String user_type, String status) {
        this.user_id = user_id;
        this.email = email;
        this.password = password;
        this.name = name;
        this.user_type = user_type;
        this.status = status;
    }
  

    @Override
    public String toString() {
        return "LoginDetails{" + "user_id=" + user_id + ", email=" + email + ", password=" + password + ", name=" + name + ", user_type=" + user_type + ", status=" + status + '}';
    }
  

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getUser_type() {
        return user_type;
    }

    public void setUser_type(String user_type) {
        this.user_type = user_type;
    }
}
