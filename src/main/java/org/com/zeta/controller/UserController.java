package org.com.zeta.controller;


import org.com.zeta.model.Permission;
import org.com.zeta.model.User;

import org.com.zeta.service.UserService;

public class UserController {

    public UserService userService = new UserService();

    public void AddUser(Integer id, String userName, String orgId, Permission permission)
    {
        User user = new User(id, userName, orgId, permission);
        userService.AddUser(user);
    }
}
