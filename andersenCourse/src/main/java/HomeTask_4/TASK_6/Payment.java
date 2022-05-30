package HomeTask_4.TASK_6;

public class Payment {

    private int id;
    private String paymentDate;
    private Product product;


    public Payment(int id, String paymentDate, int prodId, String prodName, String manufacture, String city, String country, String street) {
        this.id = id;
        this.paymentDate = paymentDate;
        product = new Product(prodId, prodName, manufacture, city, country, street);
    }

    class Product {
        private int id;
        private String name;
        private Manufacture manufacture;

        public Product(int id, String name, String manufacureName, String city, String country, String street) {
            this.id = id;
            this.name = name;
            manufacture = new Manufacture(manufacureName, city, country, street);
        }
    }

    class Manufacture {
        private String name;
        private Address address;

        public Manufacture(String name, String city, String country, String street) {
            this.name = name;
            address = new Address(country,city,street);
        }
    }

    class Address {
        private String country;
        private String city;
        private String street;

        public Address(String country, String city, String street) {
            this.country = country;
            this.city = city;
            this.street = street;
        }
    }

    public void info() {
        System.out.println(
                "---------PAYMENT ORDER----------\n" +
                        "Payment id: " + id + "\n" +
                        "Payment date: " + paymentDate + "\n" +
                        "Product name: " + product.name + "\n" +
                        "Product id: " + product.id + "\n" +
                        "Product manufacture: " + product.manufacture.name + "\n" +
                        "Street: " + product.manufacture.address.street + "\n" +
                        "City: " + product.manufacture.address.city + "\n" +
                        "Country: " + product.manufacture.address.country + "\n" +
                        "______________________");
    }
}// end class Payment
