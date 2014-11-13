package com.pwittchen.lombok.boilerplate;

import junit.framework.TestCase;

import java.util.Arrays;
import java.util.List;

import static org.fest.assertions.Assertions.assertThat;

public class CustomerTest extends TestCase {

    public void testShouldCompareValuesReturnedByGettersWithGivenValues() {
        // given
        int id = 1;
        String name = "John";
        String surname = "Doe";
        String phone = "+48123456789";
        String email = "john@doe.com";
        String address = "Gliwice, Poland";
        List<String> products = Arrays.asList("Shiny Sofa", "Flying Drone", "Nerdy Mug");

        // when
        Customer customer = new Customer(id, name, surname, phone, email, address, products);

        // then
        assertThat(customer.getName()).isEqualTo(name);
        assertThat(customer.getSurname()).isEqualTo(surname);
        assertThat(customer.getPhone()).isEqualTo(phone);
        assertThat(customer.getEmail()).isEqualTo(email);
        assertThat(customer.getAddress()).isEqualTo(address);
        assertThat(customer.getProducts()).isEqualTo(products);

    }

}