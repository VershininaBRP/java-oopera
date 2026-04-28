import java.util.Objects;

public class Actor extends Person{
    private int height;

    public Actor(String name, String surname, Gender gender,int height) {
        super(name, surname, gender);
        this.height = height;
    }

    @Override
    public String toString() {
        return "Actor{" +
                "name='" + getName() + "\'" +
                ", surname='" + getSurname() + "\'" +
                ", height='" + height + "\'" +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Actor actor = (Actor) o;
        return height == actor.height && Objects.equals(name,actor.name) && Objects.equals(surname,actor.surname) ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(height, name, surname);
    }
}
