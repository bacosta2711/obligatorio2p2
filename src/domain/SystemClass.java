//Mateo Seijo 309095
//Bruno Acosta 313080
package domain;

import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.Observable;

public class SystemClass extends Observable implements Serializable {

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
        this.getInterviews().add(interview);
        setChanged();
        notifyObservers();
    }

    public Boolean createInterview(Interviewer interviewer, Postulant postulant, int point, String comments) {
        boolean ret = false;
        if (point >= 1 && point <= 100) {
            Interview I = new Interview(interviewer, postulant, point, comments);
            addInterview(I);
            postulant.addInterviews(I);
            ret = true;
        }

        return ret;

    }

    public boolean isDocumentUnique(String document) {
        boolean unique = true;
        ArrayList<Interviewer> I = new ArrayList<>();
        ArrayList<Postulant> J = new ArrayList<>();
        I = this.getInterviewers();
        J = this.getPostulants();

        for (Interviewer r : I) {
            if (r.getDocument().equals(document)) {
                unique = false;
            }
        }
        for (Postulant r : J) {
            if (r.getDocument().equals(document)) {
                unique = false;
            }
        }
        return unique;
    }

    public boolean createInterviewer(String name, String direction, String document, int year) {
        boolean ret = true;
        Interviewer I = new Interviewer(name, document, direction, year);
        if (isDocumentUnique(I.getDocument()) && year <= 2023 && year >= 1970) {
            addInterviewer(I);
        } else {
            ret = false;
        }
        return ret;
    }

    public void addInterviewer(Interviewer interviewer) {
        //ToDo Implementrs unique control
        ArrayList<Interviewer> previousData = this.getInterviewers();
        this.interviewers.add(interviewer);

        setChanged();
        notifyObservers();
    }

    public boolean createPostulant(String name, String addres, String document, String mail, String linkedin, String contact) {
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
        boolean ret = true;
        for (Topic t : this.getTopics()) {
            if (t.equals(topic)) {
                ret = false;
            }
        }
        if (ret) {
            addTopic(topic);
        }
        return ret;
    }

    public void removePostulant(Postulant postulant) {

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

    public boolean createPosition(String name, char type, ArrayList<Topic> topics) {
        Position pos = new Position(name, type, topics);
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

    public Postulant getPostulantByDocument(String document) {
        Postulant result = new Postulant();
        for (Postulant p : this.getPostulants()) {
            if (p.getDocument() == document) {
                result = p;
            }
        }

        return result;
    }

    public void removeInterviewsFromPostulant(Postulant postulant) {
        postulant.setInterviews(null);
    }

    public Topic getTopicByName(String topicName) {
        Topic topic = new Topic();
        for (Topic t : this.getTopics()) {
            if (t.getName().equalsIgnoreCase(topicName)) {
                topic.setName(t.getName());
                topic.setDescription(t.getDescription());
            }
        }

        return topic;
    }

    public int getPostulantRiseSkill(Topic t) {
        int count = 0;
        for (Postulant p : this.getPostulants()) {
            if (p.getSkills().containsKey(t) && p.getSkills().get(t) > 5) {
                count++;
            }
        }

        return count;
    }

    public ArrayList<Postulant> getPostulantsRiseAllTopicLevel(Position position, Integer level) {
        ArrayList<Postulant> res = new ArrayList<Postulant>();
        //System.out.println("El position es:"+position.toString());  
        for (Topic topic : position.getTopics()) {
            //System.out.println("Topic::"+topic.toString());

        }
        for (Postulant p : this.getPostulants()) {
            boolean completeAllConditions = true;
            for (Topic t : position.getTopics()) {

                for (Map.Entry<Topic, Integer> entry : p.getSkills().entrySet()) {
                    if (entry.getKey().equals(t) && entry.getValue() < level) {
                        completeAllConditions = false;
                    }
                }
            }
            if (completeAllConditions) {
                res.add(p);
            }
        }

        return res;
    }

    public ArrayList<Postulant> orderPostulantByInterview(ArrayList<Postulant> arrayPostulantes) {
        ArrayList<Postulant> order = new ArrayList<>(arrayPostulantes);

        Collections.sort(order, new Comparator<Postulant>() {
            @Override
            public int compare(Postulant one, Postulant two) {
                Interview lastInterviewOne = one.getInterviews().getLast();
                Interview lastInterviewTwo = two.getInterviews().getLast();

                return Integer.compare(lastInterviewTwo.getPuntuation(), lastInterviewOne.getPuntuation());
            }
        });

        return order;
    }

    public void exportPositionQuery(Position p, ArrayList<Postulant> postulants) {
        FileWriting filewriting = new FileWriting("Consulta.txt");
        filewriting.grabarLinea(p.getPostionName());

        for (int i = 0; i < postulants.size(); i++) {
            String toPrint = postulants.get(i).getName() + " - " + postulants.get(i).getDocument() + " - " + postulants.get(i).getEmail();
            filewriting.grabarLinea(toPrint);
        }
        filewriting.cerrar();

    }

    public int getPositionWithSkill(Topic t) {
        int count = 0;

        for (Position p : this.getPositions()) {
            for (Topic to : p.getTopics()) {
                if (to.equals(t)) {
                    count++;
                }
            }

        }
        return count;
    }

    public void writeFile(SystemClass s) {

        try {
            FileOutputStream ff = new FileOutputStream("archivo.ser");
            BufferedOutputStream b = new BufferedOutputStream(ff);
            ObjectOutputStream so = new ObjectOutputStream(b);
            so.writeObject(s);
            so.close();
        } catch (FileNotFoundException ex) {
            java.util.logging.Logger.getLogger(SystemClass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IOException e) {
            java.util.logging.Logger.getLogger(SystemClass.class.getName()).log(java.util.logging.Level.SEVERE, null, e);
        }

    }

    public void setAutoId() {
        Interview.setAutoid(this.getInterviews().size() + 1);
    }

}
