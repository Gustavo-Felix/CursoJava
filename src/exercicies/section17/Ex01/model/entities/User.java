package exercicies.section17.Ex01.model.entities;

import java.time.Instant;
import java.util.Objects;

public class User {

    private String username;
    private Instant lastaccess;

    public User(String username, Instant lastaccess) {
        this.username = username;
        this.lastaccess = lastaccess;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Instant getLastaccess() {
        return lastaccess;
    }

    public void setLastaccess(Instant lastaccess) {
        this.lastaccess = lastaccess;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(username, user.username);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(username);
    }
}
