//Mateo Seijo 309095
//Bruno Acosta 313080

package domain;

import java.io.Serializable;

public class Interviewer extends People implements Serializable{
    private int joinedYear;

    public Interviewer(String name, String document, String adress, int joinedYear) {
        this.joinedYear = joinedYear;
        this.setName(name);
        this.setAddress(adress);
        this.setDocument(document);
    }

    public int getJoinedYear() {
        return joinedYear;
    }

    public void setJoinedYear(int joinedYear) {
        this.joinedYear = joinedYear;
    }
}
