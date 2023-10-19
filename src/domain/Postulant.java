//Mateo Seijo 309095
//Bruno Acosta 313080

package domain;

import java.util.List;
import java.util.Map;

public class Postulant extends People{
    private String contact;
    private String email;
    private String linkedin;
    private char jobModality;
    private Map<Topic, Integer> skills;
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

    public void setSkills(Map<Topic, Integer> skills) {
        this.skills = skills;
    }
        public List<Interview> getIntervies() {
        return interviews;
    }

    public void setIntervies(List<Interview> intervies) {
        this.interviews = intervies;
    }
}
