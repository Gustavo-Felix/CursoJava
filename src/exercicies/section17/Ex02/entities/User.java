package exercicies.section17.Ex02.entities;

import java.util.Objects;

public class User {
    private Integer Id;

    public User(Integer id) {
        Id = id;
    }

    public Integer getId() {
        return Id;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(Id, user.Id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(Id);
    }
}
