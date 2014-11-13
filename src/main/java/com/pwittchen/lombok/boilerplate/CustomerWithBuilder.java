package com.pwittchen.lombok.boilerplate;

import java.util.List;

public class CustomerWithBuilder {
    private int id;
    private String name;
    private String surname;
    private String phone;
    private String email;
    private String address;
    private List<String> products;

    public CustomerWithBuilder(int id, String name, String surname, String phone, String email, String address, List<String> products) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.phone = phone;
        this.email = email;
        this.address = address;
        this.products = products;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getNameWithUpperCase() {
        return name.toUpperCase();
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<String> getProducts() {
        return products;
    }

    public void setProducts(List<String> products) {
        this.products = products;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        } else if (!(o instanceof Customer)) {
            return false;
        } else {
            Customer other = (Customer) o;
            if (this.getId() != other.getId()) {
                return false;
            } else {
                label83:
                {
                    String oneName = this.getName();
                    String otherName = other.getName();
                    if (oneName == null) {
                        if (otherName == null) {
                            break label83;
                        }
                    } else if (oneName.equals(otherName)) {
                        break label83;
                    }

                    return false;
                }

                String oneSurname = this.getSurname();
                String otherSurname = other.getSurname();
                if (oneSurname == null) {
                    if (otherSurname != null) {
                        return false;
                    }
                } else if (!oneSurname.equals(otherSurname)) {
                    return false;
                }

                String onePhone = this.getPhone();
                String otherPhone = other.getPhone();
                if (onePhone == null) {
                    if (otherPhone != null) {
                        return false;
                    }
                } else if (!onePhone.equals(otherPhone)) {
                    return false;
                }

                label62:
                {
                    String oneEmail = this.getEmail();
                    String otherEmail = other.getEmail();
                    if (oneEmail == null) {
                        if (otherEmail == null) {
                            break label62;
                        }
                    } else if (oneEmail.equals(otherEmail)) {
                        break label62;
                    }

                    return false;
                }

                label55:
                {
                    String oneAddress = this.getAddress();
                    String otherAddress = other.getAddress();
                    if (oneAddress == null) {
                        if (otherAddress == null) {
                            break label55;
                        }
                    } else if (oneAddress.equals(otherAddress)) {
                        break label55;
                    }

                    return false;
                }

                List oneProducts = this.getProducts();
                List otherProducts = other.getProducts();
                if (oneProducts == null) {
                    if (otherProducts != null) {
                        return false;
                    }
                } else if (!oneProducts.equals(otherProducts)) {
                    return false;
                }

                return true;
            }
        }
    }

    @Override
    public int hashCode() {
        byte result = 1;
        int result1 = result * 59 + this.getId();
        String name1 = this.getName();
        result1 = result1 * 59 + (name1 == null ? 0 : name1.hashCode());
        String surname1 = this.getSurname();
        result1 = result1 * 59 + (surname1 == null ? 0 : surname1.hashCode());
        String phone1 = this.getPhone();
        result1 = result1 * 59 + (phone1 == null ? 0 : phone1.hashCode());
        String email1 = this.getEmail();
        result1 = result1 * 59 + (email1 == null ? 0 : email1.hashCode());
        String address1 = this.getAddress();
        result1 = result1 * 59 + (address1 == null ? 0 : address1.hashCode());
        List products1 = this.getProducts();
        result1 = result1 * 59 + (products1 == null ? 0 : products1.hashCode());
        return result1;
    }

    @Override
    public String toString() {
        return "Customer(id=" + this.getId()
                + ", name=" + this.getName()
                + ", surname=" + this.getSurname()
                + ", phone=" + this.getPhone()
                + ", email=" + this.getEmail()
                + ", address=" + this.getAddress()
                + ", products=" + this.getProducts() + ")";
    }

    public static Customer.CustomerBuilder builder() {
        return new Customer.CustomerBuilder();
    }

    public static class CustomerWithBuilderBuilder {
        private int id;
        private String name;
        private String surname;
        private String phone;
        private String email;
        private String address;
        private List<String> products;

        public CustomerWithBuilderBuilder() {
        }

        public CustomerWithBuilder.CustomerWithBuilderBuilder id(int id) {
            this.id = id;
            return this;
        }

        public CustomerWithBuilder.CustomerWithBuilderBuilder name(String name) {
            this.name = name;
            return this;
        }

        public CustomerWithBuilder.CustomerWithBuilderBuilder surname(String surname) {
            this.surname = surname;
            return this;
        }

        public CustomerWithBuilder.CustomerWithBuilderBuilder phone(String phone) {
            this.phone = phone;
            return this;
        }

        public CustomerWithBuilder.CustomerWithBuilderBuilder email(String email) {
            this.email = email;
            return this;
        }

        public CustomerWithBuilder.CustomerWithBuilderBuilder address(String address) {
            this.address = address;
            return this;
        }

        public CustomerWithBuilder.CustomerWithBuilderBuilder products(List<String> products) {
            this.products = products;
            return this;
        }

        public CustomerWithBuilder build() {
            return new CustomerWithBuilder(this.id, this.name, this.surname, this.phone, this.email, this.address, this.products);
        }

        public String toString() {
            return "CustomerWithBuilder.CustomerWithBuilderBuilder (id=" + this.id + ", name=" + this.name + ", surname=" + this.surname + ", phone=" + this.phone + ", email=" + this.email + ", address=" + this.address + ", products=" + this.products + ")";
        }
    }
}
