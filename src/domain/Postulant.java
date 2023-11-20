//Mateo Seijo 309095
//Bruno Acosta 313080
package domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;

import java.util.Map;

public class Postulant extends People implements Serializable, Comparable<Postulant> {

    private String contact;
    private String email;
    private String linkedin;
    private char jobModality;
    private HashMap<Topic, Integer> skills;
    private ArrayList<Interview> interviews;

    public Postulant() {
        skills = new HashMap<Topic, Integer>();
        this.interviews = new ArrayList<>();
    }

    public Postulant(String name) {
        this.setName(name);
        skills = new HashMap<Topic, Integer>();
        this.interviews = new ArrayList<>();
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
        this.getSkills().remove(topic);

    }

    public void addInterviews(Interview interviews) {
        this.getInterviews().add(interviews);
    }

    public ArrayList<Interview> getInterviews() {
        return interviews;
    }

    public void setInterviews(ArrayList<Interview> interviews) {
        this.interviews = interviews;
    }

    public int compareTo(Postulant other) {
        return this.getDocument().compareTo(other.getDocument());
    }

}
