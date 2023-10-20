package exercisesOnComposition.authorAndBook2;

public class Author {
    public String getName() {
        return name;
    }

    public char getGender() {
        return gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    private String name;
    private String email;
    private char gender;

    Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        if (gender == 'f' || gender == 'm') {
            this.gender = gender;
        }else {
            System.out.println("gender mush be m or f");
        }
    }

    public String toString() {
        String s = String.format("Author[name=%s,email=%s,gender=%s]", this.name, this.email, this.gender);
        return s;
    }
}
