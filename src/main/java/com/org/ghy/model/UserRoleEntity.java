package com.org.ghy.model;

public class UserRoleEntity {
    private int id;
    private int userId;
    private int roleId;
//    private UserEntity userByUserId;
//    private RoleEntity roleByRoleId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserRoleEntity that = (UserRoleEntity) o;

        if (id != that.id) return false;
        if (userId != that.userId) return false;
        if (roleId != that.roleId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + userId;
        result = 31 * result + roleId;
        return result;
    }

//    public UserEntity getUserByUserId() {
//        return userByUserId;
//    }
//
//    public void setUserByUserId(UserEntity userByUserId) {
//        this.userByUserId = userByUserId;
//    }
//
//    public RoleEntity getRoleByRoleId() {
//        return roleByRoleId;
//    }
//
//    public void setRoleByRoleId(RoleEntity roleByRoleId) {
//        this.roleByRoleId = roleByRoleId;
//    }
}
