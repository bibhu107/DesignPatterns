package com.company;


import com.company.entities.User;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hi from TrueCaller");
        User user = getUserDetails();

        System.out.println("Bye");
    }

    private static User getUserDetails() {
        String name = "Bibhu";
        String number = "9439196381";
        HashMap<String, String> contactDetails = getContactDetails(name);
        return User.builder().contactList(contactDetails).number(number).userName(name).build();
    }

    private static HashMap<String, String> getContactDetails(String name) {
        HashMap<String, String> contactDetails = new HashMap<>();
        if (name == "Bibhu") {
            contactDetails.put("Akash", "111");
            contactDetails.put("Aditya", "112");
            contactDetails.put("Sony", "113");
            contactDetails.put("Bikash", "114");
            contactDetails.put("Bunty", "115");
            contactDetails.put("Mac", "116");
        } else if (name == "Abhi") {
            contactDetails.put("Aditya", "112");
            contactDetails.put("Mac", "116");
        }
        return contactDetails;
    }
}
