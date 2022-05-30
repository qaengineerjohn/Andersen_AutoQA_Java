package HomeTask_4.TASK_7;

public class Park {

    private String name;
    private Double square;
    public Address address;
    public ContactInfo contactInfo;
    public СrouselsInfo crouselsInfo;

    public Park(String name, Double square, String country, String city, String street, int postCode, String email, String phoneNumber, String skype) {
        this.name = name;
        this.square = square;
        address = new Address(country, city, street);
        contactInfo = new ContactInfo(postCode, email, phoneNumber, skype);
        crouselsInfo = new СrouselsInfo();
    }

    public void info() {
        System.out.println("-------\n" + "PARK INFO: \n" + "Park name: " + name + "\n" +
                "Park square: " + square);
    }

    public class Address {
        private String country;
        private String city;
        private String street;

        public Address(String country, String city, String street) {
            this.country = country;
            this.city = city;
            this.street = street;
        }

        public void info() {
            System.out.println("-------\n" + "PARK " + name + " Address INFO: \n" + "Country: " + country + "\n" +
                    "city: " + city + "\n" +
                    "Street: " + street);
        }
    }// end Address class

    public class ContactInfo {
        private int postCode;
        private String email;
        private String phoneNumber;
        private String skype;

        public ContactInfo(int postCode, String email, String phoneNumber, String skype) {
            this.postCode = postCode;
            this.email = email;
            this.phoneNumber = phoneNumber;
            this.skype = skype;
        }

        public void info() {
            System.out.println("-------\n" + "PARK " + name + " Contact INFO: \n" + "Post code: " + postCode + "\n" +
                    "Email: " + email + "\n" +
                    "Phone: " + phoneNumber + "\n" +
                    "Skype: " + skype
            );
        }
    }// end ContactInfo class

    public class СrouselsInfo {
        private String workingTime = "from 9.00 - till 18.00";
        private PricesUSD prices;

        public СrouselsInfo() {
            System.out.println("Время работы аттракционов: " + workingTime);
            prices = new PricesUSD();
        }

        public class PricesUSD {
            public int singleChildTiket = 5;
            public int multyEntryChildTket = 15;
            public int singleAdultTiket = 15;
            public int multyEntryAdultTket = 45;

            public PricesUSD(){
                getSingleChildTiket();
                getMultyEntryChildTket();
                getsingleAdultTiket();
                getmultyEntryAdultTket();
            }

            public int getSingleChildTiket() {
                System.out.println("Детский одноразовый билет: " + singleChildTiket + " USD");
                return singleChildTiket;
            }

            public int getMultyEntryChildTket() {
                System.out.println("Детский многоразовый билет: " + multyEntryChildTket + " USD");
                return multyEntryChildTket;
            }

            public int getsingleAdultTiket() {
                System.out.println("Взрослый одноразовый билет: " + singleAdultTiket + " USD");
                return singleAdultTiket;
            }

            public int getmultyEntryAdultTket() {
                System.out.println("Взрослый многоразовый билет: " + multyEntryAdultTket + " USD");
                return multyEntryAdultTket;
            }

        }
    }


}// end Park class
