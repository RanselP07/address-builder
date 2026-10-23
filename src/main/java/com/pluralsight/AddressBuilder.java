package com.pluralsight;

import java.util.Scanner;

public class AddressBuilder {

    static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);
        StringBuilder billing = new StringBuilder();
        StringBuilder shipping = new StringBuilder();

        System.out.print("Please provide the following information: \n");

        System.out.print("Enter your name: ");
        String name = myScanner.nextLine();

        System.out.println();

        System.out.print("Billing Street: ");
        String billingStreet = myScanner.nextLine();
        billing.append(billingStreet).append("\n");

        System.out.print("Billing City: ");
        String billingCity = myScanner.nextLine();
        billing.append(billingCity).append(", ");

        System.out.print("Billing State: ");
        String billingState = myScanner.nextLine();
        billing.append(billingState).append(" ");

        System.out.print("Billing Zip: ");
        String billingZip = myScanner.nextLine();
        billing.append(billingZip).append(" ");

        System.out.println();

        System.out.print("Shipping Street: ");
        String shippingStreet = myScanner.nextLine();
        shipping.append(shippingStreet).append("\n");

        System.out.print("Shipping City: ");
        String shippingCity = myScanner.nextLine();
        shipping.append(shippingCity).append(", ");

        System.out.print("Shipping State: ");
        String shippingState = myScanner.nextLine();
        shipping.append(shippingState).append(" ");

        System.out.print("Shipping Zip: ");
        String shippingZip = myScanner.nextLine();
        shipping.append(shippingZip).append(" ");

        String billingInfo = billing.toString();
        String shippingInfo = shipping.toString();

        System.out.print(name + "\n\n");
        System.out.print("Billing Address:\n");
        System.out.print(billingInfo + "\n\n");
        System.out.print("Shipping Address:\n");
        System.out.print(shippingInfo);



        myScanner.close();
    }

}
