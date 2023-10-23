
package domain;

public class Interview {
    private static int autoid = 1;
    private int id;
    private int puntuation;
    private Interviewer interviewer;
    private Postulant postulant;
    private String observation;

    public Interview(Interviewer interviewer,Postulant postulant,int puntuation, String observation) {
        //TODO VALIDAR TEMA AUTONUMBER
        this.puntuation = puntuation;
        this.interviewer = interviewer;
        this.postulant = postulant;
        this.observation = observation;
        this.id = autoid;
        autoid++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPuntuation() {
        return puntuation;
    }

    public void setPuntuation(int puntuation) {
        this.puntuation = puntuation;
    }

    public Interviewer getInterviewer() {
        return interviewer;
    }

    public void setInterviewer(Interviewer interviewer) {
        this.interviewer = interviewer;
    }

    public Postulant getPostulant() {
        return postulant;
    }

    public void setPostulant(Postulant postulant) {
        this.postulant = postulant;
    }

    public String getObservation() {
        return observation;
    }

    public void setObservation(String observation) {
        this.observation = observation;
    }
}
