package com.pwittchen.lombok.boilerplate;

import junit.framework.TestCase;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.fest.assertions.Assertions.assertThat;

public class CustomerWithBuilderTest extends TestCase {

    @Test
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
        Customer customer = CustomerWithBuilder.builder()
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
        int id = 1;
        String name = "John";
        String surname = "Doe";
        String phone = "+48123456789";
        String email = "john@doe.com";
        String address = "Gliwice, Poland";
        List<String> products = Arrays.asList("Shiny Sofa", "Flying Drone", "Nerdy Mug");

        // when
        Customer customer = CustomerWithBuilder.builder()
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