//Mateo Seijo 309095
//Bruno Acosta 313080

package domain;

public class Interviewer extends People{
    private int joinedYear;

    public Interviewer(int joinedYear) {
        this.joinedYear = joinedYear;
    }

    public int getJoinedYear() {
        return joinedYear;
    }

    public void setJoinedYear(int joinedYear) {
        this.joinedYear = joinedYear;
    }
}
