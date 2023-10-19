//Mateo Seijo 309095
//Bruno Acosta 313080

package domain;

import java.util.ArrayList;

public class Position {
    private String postionName;
    private char positionModality;
    private ArrayList<Topic> topics;

    public String getPostionName() {
        return postionName;
    }

    public void setPostionName(String postionName) {
        this.postionName = postionName;
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

    public void setTopics(ArrayList<Topic> topics) {
        this.topics = topics;
    }
}
