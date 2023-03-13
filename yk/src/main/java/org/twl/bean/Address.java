package org.twl.bean;

public class Address {
    private int userId;
    private String address;
    private int state;

    public int getUserid() {
        return userId;
    }

    public void setUserid(int userId) {
        this.userId = userId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }
}
