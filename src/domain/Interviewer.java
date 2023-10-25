//Mateo Seijo 309095
//Bruno Acosta 313080

package domain;

public class Interviewer extends People{
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
