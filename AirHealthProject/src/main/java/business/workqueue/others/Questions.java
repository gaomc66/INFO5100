/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.workqueue.others;

import static business.organization.Organization.Type.Patients;
import business.user.doctor.Doctor;
import business.user.patients.Patients;
import business.workqueue.WorkRequest;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author gaomc
 */
public class Questions extends WorkRequest{
    Patients ask_patient;
    Doctor answer_doctor;
    QuestionEntity questionEntity;
    HashMap<QuestionEntity, LocalDateTime> question_answer_flow;
    LocalDateTime time;
    
    
    public Questions(Patients patient,String question){
        super();
        this.ask_patient = patient;
        this.questionEntity = new QuestionEntity(question,patient);
        this.time = LocalDateTime.now();
        this.question_answer_flow = new HashMap<>();
        this.question_answer_flow.put(this.questionEntity, time);
    }
    
    public void answerQuestion(Doctor doctor, String answer){
        
        this.question_answer_flow.put(new QuestionEntity(answer, doctor), LocalDateTime.now());
    }
    
    public Map<QuestionEntity, LocalDateTime> getQuestionFlow(){
        return this.question_answer_flow;
    }
    
    
}
