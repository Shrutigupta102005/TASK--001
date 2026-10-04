package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        OrderCalculator obj = new OrderCalculator();
        double t1 = obj.calculateTotal(100,3);
        double t2 = obj.calculateTotal(50,2);
        double t3 = obj.calculateTotal(10,-2);

        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);
    }
}