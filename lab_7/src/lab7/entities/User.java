/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7.entities;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author harshalneelkamal
 */
public class User {
    private int id;
    private String firstName;
    private String lastName;
    private List<Comment> comments;

    public User(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.comments = new ArrayList<>();
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getId() {
        return id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    @Override
    public String toString() {
        return "User{" + "id = " + id + ", firstName = " + firstName + ", lastName = " + lastName + ", no. of comments = " + comments.size() + '}';
    }
    
    /**
     * Get the number of comments that the user has
     * @author Menghui Wang
     * @return the number of comments of the user
     */
    public int getCommentsNum(){
        return comments.size();
    }
    
    /**
     * Calculate all the likes of comments that the user has
     * @author Menghui Wang
     * @return the sum of likes from all the comments of the user
     */
    public int getLikesNum(){
        int num = 0;
        for(Comment c : comments){
            num+=c.getLikes();
        }
        return num;
    }
    
    
    
}
