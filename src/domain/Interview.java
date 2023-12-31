//Mateo Seijo 309095
//Bruno Acosta 313080
package domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;

public class Interview implements Serializable {

    private static int autoid = 1;
    private int id;
    private int puntuation;
    private Interviewer interviewer;
    private Postulant postulant;
    private String observation;

    public Interview(Interviewer interviewer, Postulant postulant, int puntuation, String observation) {
        //TODO VALIDAR TEMA AUTONUMBER
        this.puntuation = puntuation;
        this.interviewer = interviewer;
        this.postulant = postulant;
        this.observation = observation;
        this.id = autoid;
        autoid++;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Interview interview = (Interview) o;
        return Objects.equals(observation, interview.observation);
    }

    public static int getAutoid() {
        return autoid;
    }

    public int getId() {
        return id;
    }

    public static void setAutoid(int autoid) {
        Interview.autoid = autoid;
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
