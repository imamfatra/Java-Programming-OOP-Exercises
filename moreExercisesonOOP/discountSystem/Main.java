package moreExercisesonOOP.discountSystem;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Customer c1 = new Customer("Sam");
        c1.setMember(true);
        c1.setMemberType("Premium");
        System.out.println(c1);

        Date currentDate = new Date();

        Visit v1 = new Visit("Sam", currentDate);
        v1.getName();
        v1.setProductExpense(100000);
        v1.setServiceExpense(100000);
        System.out.println(v1.getTotalExpense());
        double discount = DiscountRate.getProductDiscountRate("Gold");
        double totalDiscount = v1.getProductExpense() * discount;
        v1.setProductExpense(v1.getProductExpense() - totalDiscount);
        System.out.println(v1.getTotalExpense());

    }
}
