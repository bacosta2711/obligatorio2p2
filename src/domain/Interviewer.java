//Mateo Seijo 309095
//Bruno Acosta 313080

package domain;

import java.io.Serializable;

public class Interviewer extends People implements Serializable{
    private String joinedYear;

    public Interviewer(String name, String document, String adress, String joinedYear) {
        this.joinedYear = joinedYear;
        this.setName(name);
        this.setAddress(adress);
        this.setDocument(document);
    }

    public String getJoinedYear() {
        return joinedYear;
    }

    public void setJoinedYear(String joinedYear) {
        this.joinedYear = joinedYear;
    }
}
