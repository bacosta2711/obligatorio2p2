//Mateo Seijo 309095
//Bruno Acosta 313080

package domain;

public class Topic {
    private String name;
    private String description;

    public Topic(String name, String description) {
        this.name = name;
        this.description = description;
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
        Topic otherTopic = (Topic) obj;
        if (this.getName().trim().equalsIgnoreCase(otherTopic.getName().trim())){
            result = true; 
        }
        return result;
    }

    @Override
    public String toString() {
        return "Topic{" + "name=" + name + ", description=" + description + '}';
    }
}
