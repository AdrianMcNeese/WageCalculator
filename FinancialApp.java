/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package financialapp;

/**
 *
 * @author TyiseArrington
 */import java.util.Scanner;
public class FinancialApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String eid;
        int  hours;
        double payRate, fedTax, stateTax, gross, net;
        payRate = 7.25;
        fedTax = .08;
        stateTax = .07;
        System.out.println("What is your Employee ID?");
        eid = scan.nextLine();
        System.out.println("How many hours did you work this week?");
        hours = scan.nextInt();
        gross = payRate*hours;
        net = gross - (gross*fedTax)-(gross*stateTax);
        System.out.println("\t\tEmployee ID: " + eid);
        System.out.println("\t\tHours worked this week: " + hours);
        System.out.println("\t\tHourly Pay Rate: " + payRate);
        System.out.println("\t\tFederal Tax Withholding Rate: " + fedTax);
        System.out.println("\t\tState Tax Withholding Rate: " + stateTax);
        System.out.println("\t\tGross Income: " + gross);
        System.out.println("\t\tNet Income: " + net);
    }
    
}
