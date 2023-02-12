package Trash;

import java.util.Objects;

public class Actor {
    String firstName;
    String lastName;

    public Actor(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    @Override
    public boolean equals(Object obj){
        if (obj == this) return true;
        if (obj == null) return false;
        if (this.getClass() != obj.getClass()) return false;
        Actor actor = (Actor) obj;
        return Objects.equals(actor.firstName,firstName) && Objects.equals(actor.lastName,lastName);
    }
    @Override
    public int hashCode(){
        int hash = 17;
        if (firstName!=null){
            hash+=firstName.hashCode();
        }
        hash*=31;
        if (lastName != null){
            hash+=lastName.hashCode();
        }
        return hash;
    }
}