//Mateo Seijo 309095
//Bruno Acosta 313080
package domain;

import java.io.Serializable;
import java.util.ArrayList;

public class Position implements Serializable {

    private String positionName;
    private char positionModality;
    private ArrayList<Topic> topics;

    public Position(String postionName, char positionModality, ArrayList<Topic> topics) {
        this.positionName = postionName;
        this.positionModality = positionModality;
        this.topics = topics;
    }

    public String getPostionName() {
        return positionName;
    }

    public void setPostionName(String postionName) {
        this.positionName = postionName;
    }

    public char getPositionModality() {
        return positionModality;
    }

    public void setPositionModality(char positionModality) {
        this.positionModality = positionModality;
    }

    public ArrayList<Topic> getTopics() {
        return topics;
    }

    public void addTopics(Topic topics) {
        this.getTopics().add(topics);
    }

    public String writeModality() {
        String ret = "";
        if (this.getPositionModality() == 'H') {
            ret = "Híbrida";
        } else {
            if (this.getPositionModality() == 'R') {
                ret = "Remota";
            } else {
                ret = "Presencial";
            }
        }
        return ret;
    }

    @Override
    public String toString() {
        return positionName + " con modalidad " + writeModality() + ".";
    }

}
