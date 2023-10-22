//Mateo Seijo 309095
//Bruno Acosta 313080

package domain;

public class Interviewer extends People{
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
