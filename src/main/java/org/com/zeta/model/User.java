package org.com.zeta.model;

public class User {
    private Integer userId;
    private String username;
    private String orgId;
    private Permission permission;

    public User(Integer userId, String username, String orgId, Permission permission) {
        this.userId = userId;
        this.username = username;
        this.orgId = orgId;
        this.permission = permission;
    }

    public Integer getUserId() {
        return userId;
    }

    public String getUsername() {
        return username;
    }

    public String getOrgId() {
        return orgId;
    }
}
