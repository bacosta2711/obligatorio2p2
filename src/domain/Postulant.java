//Mateo Seijo 309095
//Bruno Acosta 313080

package domain;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Postulant extends People{
    private String contact;
    private String email;
    private String linkedin;
    private char jobModality;
    private HashMap<Topic, Integer> skills;
    private List<Interview> interviews;

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

    public void addInterviews(Interview interviews) {
        this.getInterviews().add(interviews);
    }

   
    public List<Interview> getInterviews() {
        return interviews;
    }

    public void setInterviews(List<Interview> interviews) {
        this.interviews = interviews;
    }
    
   

}
