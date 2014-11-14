package com.pwittchen.lombok.boilerplate;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.fest.assertions.Assertions.assertThat;

/**
 * This is dummy test for presentation purposes
 * In real-life, we should not test setters and getters, etc. Here we're just library behaviour.
 * Please note: CustomerWithBuilderTest is identical as this one, but with different objects
 * It shows, that code written by hand has the same behavior as auto-generated code
 */
public class CustomerWithBuilderRefactoredTest extends TestCase {

    private int id;
    private String name;
    private String surname;
    private String phone;
    private String email;
    private String address;
    private List<String> products;

    @Before
    public void setUp() {
        id = 1;
        name = "John";
        surname = "Doe";
        phone = "+48123456789";
        email = "john@doe.com";
        address = "Gliwice, Poland";
        products = Arrays.asList("Shiny Sofa", "Flying Drone", "Nerdy Mug");
    }

    @Test
    public void testShouldCompareValuesReturnedByGettersWithGivenValues() {
        // given
        // data defined in setUp() method

        // when
        CustomerWithBuilderRefactored customer = CustomerWithBuilderRefactored.builder()
                .id(id)
                .name(name)
                .surname(surname)
                .phone(phone)
                .email(email)
                .address(address)
                .products(products)
                .build();

        // then
        assertThat(customer.getName()).isEqualTo(name);
        assertThat(customer.getSurname()).isEqualTo(surname);
        assertThat(customer.getPhone()).isEqualTo(phone);
        assertThat(customer.getEmail()).isEqualTo(email);
        assertThat(customer.getAddress()).isEqualTo(address);
        assertThat(customer.getProducts()).isEqualTo(products);
    }

    @Test
    public void testShouldReturnNameInUpperCase() {
        // given
        // data defined in setUp() method

        // when
        CustomerWithBuilderRefactored customer = CustomerWithBuilderRefactored.builder()
                .id(id)
                .name(name)
                .surname(surname)
                .phone(phone)
                .email(email)
                .address(address)
                .products(products)
                .build();

        // then
        assertThat(customer.getNameWithUpperCase()).isEqualTo(name.toUpperCase());
    }
}