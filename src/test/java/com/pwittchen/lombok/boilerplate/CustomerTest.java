package com.pwittchen.lombok.boilerplate;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.fest.assertions.Assertions.assertThat;

public class CustomerTest extends TestCase {

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
        Customer customer = new Customer(id, name, surname, phone, email, address, products);

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
        Customer customer = new Customer(id, name, surname, phone, email, address, products);

        // then
        assertThat(customer.getNameWithUpperCase()).isEqualTo(name.toUpperCase());
    }

    @Test
    public void testTwoDifferentInstancesOfTheSameClassShouldBeEqual() {
        // given
        // test data in setUp() method

        // when
        Customer customerOne = new Customer(id, name, surname, phone, email, address, products);
        Customer customerTwo = new Customer(id, name, surname, phone, email, address, products);

        // then
        assertThat(customerOne.equals(customerTwo)).isTrue();
    }

    @Test
    public void testHashcodesOfTwoDifferentInstancesOfTheSameClassShouldBeEqual() {
        // given
        // test data in setUp() method

        // when
        Customer customerOne = new Customer(id, name, surname, phone, email, address, products);
        Customer customerTwo = new Customer(id, name, surname, phone, email, address, products);

        // then
        assertThat(customerOne.hashCode()).isEqualTo(customerTwo.hashCode());
    }

}