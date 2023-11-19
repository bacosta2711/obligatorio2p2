//Mateo Seijo 309095
//Bruno Acosta 313080
package domain;

import java.io.Serializable;

public class Topic implements Serializable {

    private String name;
    private String description;

    public Topic(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public Topic() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object obj) {
        boolean result = false;
        if (obj != null) {
            Topic otherTopic = (Topic) obj;
            if (this.getName().trim().equalsIgnoreCase(otherTopic.getName().trim())) {
                result = true;
            }
        }
        return result;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public int hashCode() {
        // Cálculo del código hash basado en los campos relevantes de la clase
        int resultado = name != null ? name.hashCode() : 0;
        return resultado;
    }
}
