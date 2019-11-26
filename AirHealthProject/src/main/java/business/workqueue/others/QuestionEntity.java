/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.workqueue.others;

import business.user.User;

/**
 *
 * @author gaomc
 */
public class QuestionEntity {
    String question_answer;
    User holder;
    
    public QuestionEntity(String que_ans, User holder){
        this.question_answer = que_ans;
        this.holder = holder;
    }
    
    public QuestionEntity getEntity(){
        return this;
    }
    
    @Override
    public String toString(){
        return this.question_answer + " ; " + this.holder;
    }
}
