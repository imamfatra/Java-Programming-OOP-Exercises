package moreExercisesonOOP.discountSystem;

import java.util.Date;

public class Visit {
    private Customer customer;
    private Date date;

    private double serviceExpense;
    private double productExpense;

    public Visit(String name, Date date) {
        this.customer = new Customer(name);
        this.date = date;
    }
    public String getName(){
        return customer.getName();
    }
    public double getServiceExpense() {
        return serviceExpense;
    }

    public void setServiceExpense(double serviceExpense) {
        this.serviceExpense = serviceExpense;
    }

    public double getProductExpense() {
//        double discount = DiscountRate.getProductDiscountRate(customer.getMemberType());
//        productExpense -= (productExpense * discount);
        return productExpense;
    }

    public void setProductExpense(double productExpense) {
        this.productExpense = productExpense;
    }

    public double getTotalExpense() {
        return this.productExpense + this.serviceExpense;
    }

    @Override
    public String toString() {
        return "Visit{" +
                "customer=" + customer +
                ", date=" + date +
                ", serviceExpense=" + serviceExpense +
                ", productExpense=" + productExpense +
                '}';
    }
}
