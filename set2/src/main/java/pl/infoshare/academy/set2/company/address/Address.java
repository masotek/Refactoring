package pl.infoshare.academy.set2.company.address;

/**
 * Created by Karol Lotkowski
 * Organization: infoShare Academy
 */
public class Address {

    private final String street;
    private final int number;
    private final String city;

    private Address(String street, int number, String city) {
        this.street = street;
        this.number = number;
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public int getNumber() {
        return number;
    }

    public String getCity() {
        return city;
    }

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", number=" + number +
                ", city='" + city + '\'' +
                '}';
    }

    public static class AddressBuilder {

        private String street;
        private int number;
        private String city;

        public AddressBuilder withStreet(String street) {
            this.street = street;
            return this;
        }

        public AddressBuilder withNumber(int number) {
            this.number = number;
            return this;
        }

        public AddressBuilder withCity(String city) {
            this.city = city;
            return this;
        }

        public Address build() {
            return new Address(street, number, city);
        }
    }
}
