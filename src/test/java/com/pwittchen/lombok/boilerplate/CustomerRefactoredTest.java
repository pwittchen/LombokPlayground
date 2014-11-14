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
 * Please note: CustomerTest is identical as this one, but with different objects
 * It shows, that code written by hand has the same behavior as auto-generated code
 */
public class CustomerRefactoredTest extends TestCase {

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
        // test data in setUp() method

        // when
        CustomerRefactored customer = new CustomerRefactored(id, name, surname, phone, email, address, products);

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
        // test data in setUp() method

        // when
        CustomerRefactored customer = new CustomerRefactored(id, name, surname, phone, email, address, products);

        // then
        assertThat(customer.getNameWithUpperCase()).isEqualTo(name.toUpperCase());
    }

    @Test
    public void testTwoDifferentInstancesOfTheSameClassShouldBeEqual() {
        // given
        // test data in setUp() method

        // when
        CustomerRefactored customerOne = new CustomerRefactored(id, name, surname, phone, email, address, products);
        CustomerRefactored customerTwo = new CustomerRefactored(id, name, surname, phone, email, address, products);

        // then
        assertThat(customerOne.equals(customerTwo)).isTrue();
    }

    @Test
    public void testHashcodesOfTwoDifferentInstancesOfTheSameClassShouldBeEqual() {
        // given
        // test data in setUp() method

        // when
        CustomerRefactored customerOne = new CustomerRefactored(id, name, surname, phone, email, address, products);
        CustomerRefactored customerTwo = new CustomerRefactored(id, name, surname, phone, email, address, products);

        // then
        assertThat(customerOne.hashCode()).isEqualTo(customerTwo.hashCode());
    }
}