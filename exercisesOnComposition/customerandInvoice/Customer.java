package exercisesOnComposition.customerandInvoice;

public class Customer {
    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    private String name;
    private int id;
    private int discount;

    Customer(int id, String name, int discount) {
        this.name = name;
        this.id = id;
        this.discount = discount;
    }

    public String toString() {
        return "name(" + id + ")(" + discount + "%)";
    }
}
