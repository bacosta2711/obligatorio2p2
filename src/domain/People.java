//Mateo Seijo 309095
//Bruno Acosta 313080
package domain;

import java.io.Serializable;
import java.util.Objects;

public class People implements Serializable {

    private String name;
    private String document;
    private String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    /*
    @Override
    public boolean equals(Object obj) {
        boolean result = false;
        People otherPeople = (People) obj;
        if (this.getDocument().trim().equalsIgnoreCase(otherPeople.getDocument().trim())){
            result = true; 
        }
        return result;*/
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final People other = (People) obj;
        return Objects.equals(this.document, other.document);
    }

    @Override
    public String toString() {
        String ret = "";
        if (this.getDocument() == null) {
            ret = this.getName();
        } else {
            ret = this.getName() + "-" + this.getDocument();
        }
        return ret;
    }
}
