
package domain;

public class Interview {
    private int id;
    private int puntuation;
    private Interviewer interviewer;
    private Postulant postulant;
    private String observation;

    public Interview(int puntuation, Interviewer interviewer, Postulant postulant, String observation) {
        //TODO VALIDAR TEMA AUTONUMBER
        this.puntuation = puntuation;
        this.interviewer = interviewer;
        this.postulant = postulant;
        this.observation = observation;
        
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
