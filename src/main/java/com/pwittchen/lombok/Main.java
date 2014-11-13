package com.pwittchen.lombok;

import com.pwittchen.lombok.boilerplate.Customer;

import java.util.Arrays;

/**
 * Customer class contains class with a Java boilerplate code
 * CustomerRefactored class contains class without Java boilerplate code and Lombok annotations
 * Behavior of the CustomerRefactored is exactly the same as Customer class
 */
public class Main {
    private static Customer customer;

    private static void initCustomer() {
        customer = Customer.builder()
                .id(2)
                .name("John")
                .surname("Doe")
                .address("Gliwice, Poland")
                .email("john@doe.com")
                .phone("+48123456789")
                .products(Arrays.asList("Shiny Sofa", "Coffee Maker", "Nerdy Mug"))
                .build();
    }

    public static void main(String[] args) {
        System.out.println("Lombok Playground");
        initCustomer();
        printCustomerDetails();
    }

    private static void printCustomerDetails() {
        System.out.println("Details of the Customer:");
        System.out.println(customer.toString());
        System.out.println(String.format("Customer name with upper case: %s", customer.getNameWithUpperCase()));
    }
}
