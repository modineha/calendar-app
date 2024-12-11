package org.com.zeta.service;

import org.com.zeta.model.User;

import java.util.HashMap;
import java.util.Map;

public class UserService {
    public Map<Integer, User> UserData = new HashMap<>();

    public void AddUser(User user)
    {
        if(user == null)
        {
            System.out.println("user is null");
            return;
        }
        UserData.put(user.getUserId(), user);
    }
}
