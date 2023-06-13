package com.mit.trainingDayFive;

import java.util.ArrayList;

public class AddressOperations {
    public static void main(String[] args) {
        PersonAddress addresses = new PersonAddress();
        ArrayList<PersonAddress> addressList = new ArrayList<PersonAddress>();

        addresses.setAddressLineOne("308 Negra Arroyo Lane");
//        addresses.setAddressLineTwo("");  // Not needed, so commented out
        addresses.setCity("Albuquerque");
        addresses.setState("New Mexico");
        addresses.setZipCode(87104);
        addresses.setResidenceType("Primary");
        addressList.add(addresses);

        addresses = new PersonAddress();    // Add second address

        addresses.setAddressLineOne("177A Bleeker Street");
        addresses.setAddressLineTwo("P.O. Box 90201");
        addresses.setCity("New York City");
        addresses.setState("New York");
        addresses.setZipCode(10012);
        addresses.setResidenceType("Secondary");
        addressList.add(addresses);


        // Display Results
        System.out.println("\n" + addresses.firstName + " " + addresses.lastName + "'s List of Known Addresses: ");
        System.out.println("------------------------------------------");
        for (PersonAddress address : addressList) {    // Prints each address out
            System.out.println(address.getResidenceType() + " Residence:");
            System.out.println("\t" + address.getAddressLineOne());

            if (!(address.getAddressLineTwo() == null)) {   // Only prints second line if there is a second line
                System.out.println("\t" + address.getAddressLineTwo());
            }

            System.out.print("\t" + address.getCity() + ", ");
            System.out.print(address.getState() + ", ");
            System.out.println(address.getZipCode());
            System.out.println("------------------------------------------");

        }

    }
}
