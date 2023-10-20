//Mateo Seijo 309095
//Bruno Acosta 313080

package domain;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.ArrayList;

public class system {
    private ArrayList<Interview> interviews;
    private ArrayList<Topic> topics;
    private ArrayList<Position> positions;
    private ArrayList<Postulant> postulants;
    private ArrayList<Interviewer> interviewers;

    private PropertyChangeSupport handler;

    public system() {
        this.handler = new PropertyChangeSupport(this);
    }
    
    public ArrayList<Interview> getInterviews() {
        return interviews;
    }

    public ArrayList<Topic> getTopics() {
        return topics;
    }

    public ArrayList<Position> getPositions() {
        return positions;
    }

    public ArrayList<Postulant> getPostulants() {
        return postulants;
    }

    public ArrayList<Interviewer> getInterviewers() {
        return interviewers;
    }
    
    public void addInterview(Interview interview){
        ArrayList<Interview> previousData = this.getInterviews();
        this.getInterviews().add(interview);
        this.handler.firePropertyChange("interviews",previousData,this.getInterviews());
    }
    
    public void addInterviewer(Interviewer interviewer){
        //ToDo Implementrs unique control
        ArrayList<Interviewer> previousData = this.getInterviewers();
        this.interviewers.add(interviewer);
        this.handler.firePropertyChange("interviewers",previousData,this.getInterviewers());
    }
    
    public void addPostulant(Postulant postulant){
        //ToDo Implementrs unique control
        
        ArrayList<Postulant> previousData = this.getPostulants();
        this.getPostulants().add(postulant);
        this.handler.firePropertyChange("postulants",previousData,this.getPostulants());
    }
    
    public void addPosition(Position position){
        //ToDo Implementrs unique control
        ArrayList<Position> previousData = this.getPositions();
        this.getPositions().add(position);
        this.handler.firePropertyChange("positions",previousData,this.getPositions());
    }
    
    public void addTopic(Topic topic){
        //ToDo Implementrs unique control
        ArrayList<Topic> previousData = this.getTopics();
        this.getTopics().add(topic);
        this.handler.firePropertyChange("topics",previousData,this.getTopics());
    }
    
    public void addPropertyChangeLisener(PropertyChangeListener listener){
        this.handler.addPropertyChangeListener(listener);
    }
    
    public void removePropertyChangeLisener(PropertyChangeListener listener){
        this.handler.removePropertyChangeListener(listener);
    }
}
