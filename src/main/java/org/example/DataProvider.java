package org.example;

public class DataProvider {

    public static class UserInfo {
        private static String firstName = "Something";
        private static String lastName = "New";
        private static String userEmailName = "fname.lname";
        private static String companyName = "itsoft";
        private static String testmail = "@testmail.com";
        private static String prodmail = "@gmail.com";

        public static String getFirstName() {
            return firstName;
        }

        public static String getLastName() {
            return lastName;
        }

        public static String getUserEmailName() {
            return userEmailName;
        }

        public static String getCompanyName() {
            return companyName;
        }

        public static String getTestmail() {
            return testmail;
        }

        public static String getProdmail() {
            return prodmail;
        }
    }

    public static class billingInfo {
        public static String getFirstName() {
            return firstName;
        }

        public static String getLastName() {
            return lastName;
        }

        public static String getCardNumber() {
            return cardNumber;
        }

        public static String getExpirationDate() {
            return expirationDate;
        }

        public static String getCvv() {
            return cvv;
        }

        private static String firstName = "Something";
        private static String lastName = "New";
        private static String cardNumber = "4111123412341234";
        private static String expirationDate = "0523";
        private static String cvv = "111";
    }

    public static class US {
        private static String country = "United States";
        private static String state = "South Carolina";
        private static String address = "45 Shore Line Drive";
        private static String city = "Pawleys Island";
        private static String zip = "29585-6479";
        private static String phone = "1(510)544";

        public static String getCountry() {
            return country;
        }

        public static String getState() {
            return state;
        }

        public static String getAddress() {
            return address;
        }

        public static String getCity() {
            return city;
        }

        public static String getZip() {
            return zip;
        }

        public static String getPhone() {
            return phone;
        }
    }
    public static class CA {
        private static String country = "Canada";
        private static String state = "Ontario";
        private static String address = "45 Kensington Avenue";
        private static String city = "Toronto";
        private static String zip = "M5T 2J8";
        private static String phone = "1(416) 449";

        public static String getCountry() {
            return country;
        }

        public static String getState() {
            return state;
        }

        public static String getAddress() {
            return address;
        }

        public static String getCity() {
            return city;
        }

        public static String getZip() {
            return zip;
        }

        public static String getPhone() {
            return phone;
        }
    }
    public static class UK {
        private static String country = "United Kingdom";
        private static String state = "London";
        private static String address = "16 North End Road";
        private static String city = "London";
        private static String zip = "NW11 7PH";
        private static String phone = "44(20) 8320";

        public static String getCountry() {
            return country;
        }

        public static String getState() {
            return state;
        }

        public static String getAddress() {
            return address;
        }

        public static String getCity() {
            return city;
        }

        public static String getZip() {
            return zip;
        }

        public static String getPhone() {
            return phone;
        }
    }
}
