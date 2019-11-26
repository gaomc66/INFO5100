/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.useraccount;

import java.util.ArrayList;
import business.role.Role;
import business.user.User;

/**
 *
 * @author xinlu
 */
public class UserAccountDirectory {
    private ArrayList<UserAccount> userAccountList;

    public UserAccountDirectory() {
        userAccountList = new ArrayList();
    }

    public ArrayList<UserAccount> getUserAccountList() {
        return userAccountList;
    }
    
    public UserAccount authenticateUser(String userName, String password, String role) {
        for (UserAccount ua : userAccountList)
            if (ua.getUsername().equals(userName) && ua.getPassword().equals(password) && ua.getRole().toString().equals(role)){
                return ua;
            }
        return null;
    }
    
    public UserAccount createUserAccount(String username, String password, User user, Role role){
        UserAccount userAccount = new UserAccount();
        userAccount.setUsername(username);
        userAccount.setPassword(password);
        userAccount.setUser(user);
        userAccount.setRole(role);
        userAccountList.add(userAccount);
        return userAccount;
    }
    
    public boolean checkIfUsernameIsUnique(String username){
        for (UserAccount ua : userAccountList){
            if (ua.getUsername().equals(username))
                return false;
        }
        return true;
    }



    
}
