//Mateo Seijo 309095
//Bruno Acosta 313080

package domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Postulant extends People implements Serializable{
    private String contact;
    private String email;
    private String linkedin;
    private char jobModality;
    private HashMap<Topic, Integer> skills;
    private List<Interview> interviews;

    public Postulant(){
        skills = new HashMap<Topic, Integer>();
        interviews = new ArrayList<>();
    }
    
    public Postulant(String name){
        this.setName(name);
        skills = new HashMap<Topic, Integer>();
    }
    
    
    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLinkedin() {
        return linkedin;
    }

    public void setLinkedin(String linkedin) {
        this.linkedin = linkedin;
    }

    public char getJobModality() {
        return jobModality;
    }

    public void setJobModality(char jobModality) {
        this.jobModality = jobModality;
    }

    public Map<Topic, Integer> getSkills() {
        return skills;
    }

    public void addSkills(Topic topic, int level) {
        this.getSkills().put(topic, level);
    }
     
    public void removeSkills(Topic topic) {
        
        System.out.println("PEDILO "+topic);
        this.getSkills().remove(topic);
    }
    
    public void addInterviews(Interview interviews) {
        this.getInterviews().add(interviews);
    }

   
    public List<Interview> getInterviews() {
        return interviews;
    }

    public void setInterviews(List<Interview> interviews) {
        this.interviews = interviews;
    }

    /*@Override
    public String toString() {
        String ret = "";
        if(this.getDocument()==null){
        ret = this.getName();}else{ret = this.getName()+ "-"+this.getDocument();}
        return ret;
    }*/
    
   

}
