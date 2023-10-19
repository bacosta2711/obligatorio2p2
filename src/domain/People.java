//Mateo Seijo 309095
//Bruno Acosta 313080

package domain;

import java.util.List;


abstract class People {
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


}
