package com.thinkful.app;

public class DeclareAndPrint {
    public static void main (String[] args) {
        Integer temp = 79;
        String highTemp = "highest temperature in June in New York is %d °F  \n";
        System.out.printf(highTemp, temp);

        String course = "the name of this course is \"Java/Spring programming\" \n";
        System.out.println(course);

        String phone = "the phone number of the bus service is 555-5555 \n";
        System.out.println(phone);

        Double price = 39.98;
        String shoe = "the price of the shoe is $%f \n";
        System.out.printf(shoe, price);

        String mass =  "1.89813 × 10²⁷";
        String jupiter = "the mass of the planet Jupiter is %s kilograms \n";
        System.out.printf(jupiter, mass);

    }

}