package exercisesOnComposition.authorAndBook3;

public class Author {
    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    private String name;
    private String email;

    Author(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String toString() {
        String s = String.format("Author[name=%s,email=%s]", this.name, this.email);
        return s;
    }
}
