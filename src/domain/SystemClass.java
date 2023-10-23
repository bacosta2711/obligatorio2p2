//Mateo Seijo 309095
//Bruno Acosta 313080

package domain;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.ArrayList;

public class SystemClass {
    private ArrayList<Interview> interviews;
    private ArrayList<Topic> topics;
    private ArrayList<Position> positions;
    private ArrayList<Postulant> postulants;
    private ArrayList<Interviewer> interviewers;

    private PropertyChangeSupport handler;

    public SystemClass() {
        this.handler = new PropertyChangeSupport(this);
        this.interviewers = new ArrayList<Interviewer>();
        this.interviews = new ArrayList<Interview>();
        this.positions = new ArrayList<Position>();
        this.postulants = new ArrayList<Postulant>();
        this.topics = new ArrayList<Topic>();
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
    public Interview createInterview(){
        
    }
    public Interviewer createInterviewer (){
        
    }
    public void addInterviewer(Interviewer interviewer){
        //ToDo Implementrs unique control
        ArrayList<Interviewer> previousData = this.getInterviewers();
        this.interviewers.add(interviewer);
        this.handler.firePropertyChange("interviewers",previousData,this.getInterviewers());
    }
    
    public boolean addPostulant(Postulant postulant){
        //ToDo Implementrs unique control
        boolean result=false;
        if(!this.getPostulants().contains(postulant)){
            ArrayList<Postulant> previousData = this.getPostulants();
            this.getPostulants().add(postulant);
            this.handler.firePropertyChange("postulants",previousData,this.getPostulants());
            
            result = true;
        }
        return result;
    }
    
    public boolean createTopic(String name, String description){
        Topic topic = new Topic(name,description);
        return addTopic(topic); 
    }
    
    public void removePostulant(Postulant postulant){
        this.getPostulants().remove(postulant);
        //Remove de las interviews
    }
    
    public void addPosition(Position position){
        //ToDo Implementrs unique control
        ArrayList<Position> previousData = this.getPositions();
        this.getPositions().add(position);
        this.handler.firePropertyChange("positions",previousData,this.getPositions());
    }
    
    public boolean addTopic(Topic topic){
        //ToDo Implementrs unique control
        boolean result = false;
        if(!this.getTopics().contains(topic)){
            ArrayList<Topic> previousData = this.getTopics();
            this.getTopics().add(topic);
            this.handler.firePropertyChange("topics",previousData,this.getTopics());
            
            result = true;
        }
        
        return result;
    }
    
    public void addPropertyChangeLisener(PropertyChangeListener listener){
        this.handler.addPropertyChangeListener(listener);
    }
    
    public void removePropertyChangeLisener(PropertyChangeListener listener){
        this.handler.removePropertyChangeListener(listener);
    }
    
     public Postulant getPostulantByDocument(String document){
         Postulant result = new Postulant();
         for (Postulant p : this.getPostulants()) {
             if(p.getDocument()==document){
                 result=p;
             }
         }
        return result;
    }
}
