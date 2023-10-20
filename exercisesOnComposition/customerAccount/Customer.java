package exercisesOnComposition.customerAccount;

public class Customer {
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public char getGender() {
        return gender;
    }

    private int id;
    private String name;
    private char gender;

    Customer(int id, String name, char gender) {
        this.id = id;
        this.name = name;
        if (gender == 'm' || gender == 'f') {
            this.gender = gender;
        } else {
            System.out.println("gender mush be m or f");
        }
    }

    public String toString() {
        return "name(" + id + ")";
    }
}
