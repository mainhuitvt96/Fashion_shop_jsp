package com.e_shop.model.Entity;

public class Account {
    private long id;
    private String username;
    private String password;
    private String fullName;
    private String emaill;
    private String phone;
    private long wallet;
    private long roleId;
    private boolean isDelete;

    public Account(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public Account(String username, String password, String fullName, String emaill, String phone,
                   long wallet, long roleId, boolean isDelete) {
        this.username = username;
        this.password = password;
        this.fullName = fullName;
        this.emaill = emaill;
        this.phone = phone;
        this.wallet = wallet;
        this.roleId = roleId;
        this.isDelete = isDelete;
    }

    public Account(long id, String username, String password, String fullName, String emaill,
                   String phone, long wallet, long roleId, boolean isDelete) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.fullName = fullName;
        this.emaill = emaill;
        this.phone = phone;
        this.wallet = wallet;
        this.roleId = roleId;
        this.isDelete = isDelete;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmaill() {
        return emaill;
    }

    public void setEmaill(String emaill) {
        this.emaill = emaill;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public long getWallet() {
        return wallet;
    }

    public void setWallet(long wallet) {
        this.wallet = wallet;
    }

    public long getRoleId() {
        return roleId;
    }

    public void setRoleId(long roleId) {
        this.roleId = roleId;
    }

    public boolean isDelete() {
        return isDelete;
    }

    public void setDelete(boolean delete) {
        isDelete = delete;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", fullName='" + fullName + '\'' +
                ", emaill='" + emaill + '\'' +
                ", phone='" + phone + '\'' +
                ", wallet=" + wallet +
                ", roleId=" + roleId +
                ", isDelete=" + isDelete +
                '}';
    }
}
