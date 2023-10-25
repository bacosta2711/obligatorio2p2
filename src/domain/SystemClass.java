//Mateo Seijo 309095
//Bruno Acosta 313080
package domain;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.ArrayList;
import javax.swing.JFrame;

import java.util.Observable;

  public class SystemClass extends Observable{
    private Postulant postulantMemory;
    private ArrayList<Interview> interviews;
    private ArrayList<Topic> topics;
    private ArrayList<Position> positions;
    private ArrayList<Postulant> postulants;
    private ArrayList<Interviewer> interviewers;

    //private PropertyChangeSupport handler;

    public SystemClass() {
      //  this.handler = new PropertyChangeSupport(this);
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

    public void addInterview(Interview interview) {
        ArrayList<Interview> previousData = this.getInterviews();
        this.getInterviews().add(interview);

       setChanged();
       notifyObservers();
    }

    public Boolean createInterview(Interviewer interviewer, Postulant postulant, int point, String comments) {
        boolean r = true;
        Interview I = new Interview(interviewer, postulant, point, comments);
        return true;

    }

    public boolean createInterviewer(String name, String direction, String document, String year) {
        boolean c = false;
        boolean result = false;

        Interviewer I = new Interviewer(name, document, direction, year);
        addInterviewer(I);
        /*}else {
            JOptionPane.showMessageDialog(null, "Documento no disponible", "Error", JOptionPane.ERROR_MESSAGE);
        }*/
        return true;
    }

    public void addInterviewer(Interviewer interviewer) {
        //ToDo Implementrs unique control
        ArrayList<Interviewer> previousData = this.getInterviewers();
        this.interviewers.add(interviewer);

        setChanged();
        notifyObservers();
    }
     public boolean createPostulant(String name,String addres,String document, String mail, String linkedin, String contact){
         Postulant postulant = new Postulant();
         return false;
     }
    

    public boolean addPostulant(Postulant postulant) {

        //ToDo Implementrs unique control
        boolean result = false;
        if (!this.getPostulants().contains(postulant)) {
            ArrayList<Postulant> previousData = this.getPostulants();
            this.getPostulants().add(postulant);

          //  this.handler.firePropertyChange("postulant", previousData,this.getPostulants());
          setChanged();
          notifyObservers();
            result = true;
        }
        return result;
    }

    public boolean createTopic(String name, String description) {
        Topic topic = new Topic(name, description);
        return addTopic(topic);
    }

    public void removePostulant(Postulant postulant){
        

        //Remove de las interviews
        ArrayList<Postulant> previousData = this.getPostulants();
        this.getPostulants().remove(postulant);
        setChanged();
        notifyObservers();
        
    }

    public boolean addPosition(Position position) {
        //ToDo Implementrs unique control
        ArrayList<Position> previousData = this.getPositions();
        this.getPositions().add(position);

     setChanged();
          notifyObservers();
        return true;
    }
    public boolean createPosition(String name, char type, ArrayList<Topic> topics ){
        Position pos = new Position (name,type,topics);
        return addPosition(pos);

    }
    public boolean addTopic(Topic topic) {
        //ToDo Implementrs unique control
        boolean result = false;
        if (!this.getTopics().contains(topic)) {
            ArrayList<Topic> previousData = this.getTopics();
            this.getTopics().add(topic);

            result = true;
        }
        setChanged();
          notifyObservers();
        return result;
    }
    

     public Postulant getPostulantByDocument(String document){
         Postulant result = new Postulant();
         for (Postulant p : this.getPostulants()) {
             if(p.getDocument()==document){
                 result=p;
             }
         }

            result = true;
        }

        return result;
    }

   
    public void removeInterviewsFromPostulant (Postulant postulant){
        postulant.setInterviews(null);
    }
    public Postulant getPostulantByDocument(String document) {
        Postulant result = new Postulant();
        for (Postulant p : this.getPostulants()) {
            if (p.getDocument() == document) {
                result = p;
            }
        }

        return result;
    }
    public void resetPostulantMemory(){
       this.setPostulantMemory(new Postulant());
    }
    
    public ArrayList<Topic> getTopicsNotInMemory(){
        ArrayList<Topic> result = new ArrayList<Topic>();
        
        for (Topic t : this.getTopics()) {
            if(!this.getPostulantMemory().getSkills().containsKey(t)){
                result.add(t);
            }
        }
        
        return result;
    } 
    
    public Topic getTopicByName(String topicName){
        Topic topic = new Topic();
        for (Topic t : this.getTopics()) {
            if(t.getName().equalsIgnoreCase(topicName)){
                topic.setName(t.getName());
                topic.setDescription(t.getDescription());
            }
        }

        return topic;        
    }
    
    public Postulant getPostulantMemory() {
        return postulantMemory;
    }

    public void setPostulantMemory(Postulant postulantMemory) {
        this.postulantMemory = postulantMemory;
    }
}
