package com.org.ghy.model;

import java.util.Collection;

public class RoleEntity {
    private int roleId;
    private String roleName;
    private Integer status;
    private Collection<UserRoleEntity> userRolesByRoleId;

    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RoleEntity that = (RoleEntity) o;

        if (roleId != that.roleId) return false;
        if (roleName != null ? !roleName.equals(that.roleName) : that.roleName != null) return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = roleId;
        result = 31 * result + (roleName != null ? roleName.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        return result;
    }

    public Collection<UserRoleEntity> getUserRolesByRoleId() {
        return userRolesByRoleId;
    }

    public void setUserRolesByRoleId(Collection<UserRoleEntity> userRolesByRoleId) {
        this.userRolesByRoleId = userRolesByRoleId;
    }
}
