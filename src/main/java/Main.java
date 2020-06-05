package src.main.java;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

import src.main.java.classes.*;

public class Main {
    public static void main(String[] args) {
        List<Money> piggyBank = new ArrayList<>();
        
        piggyBank.add(new Quarter());
        piggyBank.add(new Dime());
        piggyBank.add(new Dollar(5));
        piggyBank.add(new Nickel(3));
        piggyBank.add(new Dime(7));
        piggyBank.add(new Dollar());
        piggyBank.add(new Penny(10));

        float total = 0f;
        for (Money m : piggyBank) {
            total += m.getTotal();
            System.out.println(m.toString());
        }

        DecimalFormat formatter = new DecimalFormat("#0.00");
        System.out.println("The piggy bank holds $" + formatter.format(total));
    }
}