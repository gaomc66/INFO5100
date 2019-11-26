/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.user;

import java.util.ArrayList;

/**
 *
 * @author wang.mengh
 */
public class UserDirectory {
    private ArrayList<User> userList;

    public UserDirectory() {
        userList = new ArrayList<>();
    }

    public ArrayList<User> getUserList(){
        return userList;
    }
    
    public User createUser(String name, String userType){
        User user = new User(userType);
        user.setName(name);
        userList.add(user);
        return user;
    }
}
