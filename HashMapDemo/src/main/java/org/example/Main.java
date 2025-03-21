package org.example;


import org.example.hospital.Client;
import org.example.hospital.ClientLookup;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ClientLookup lookup = new ClientLookup();

        // Client 1
        Client c1 = new Client("123-45-6789", "Jane", "Smith", 3, 14, 1985, new ArrayList<>());
        c1.addComment("Regular checkup.");
        c1.addComment("Blood pressure is high but not a significantly.");
        c1.addComment("Advised client to exercise more.");
        lookup.addClient(c1);

        // Client 2
        Client c2 = new Client("987-65-4321", "Mark", "Johnson", 7, 22, 1978, new ArrayList<>());
        c2.addComment("Annual DOT physical completed.");
        lookup.addClient(c2);

        // Client 3
        Client c3 = new Client("555-55-5555", "Emily", "Davis", 12, 5, 1992, new ArrayList<>());
        c3.addComment("Client fell asleep in lobby and missed appointment.");
        c3.addComment("Follow-up visit next week.");
        lookup.addClient(c3);

        // Client 4
        Client c4 = new Client("111-22-3333", "Carlos", "Lopez", 9, 10, 2000, new ArrayList<>());
        c4.addComment("Customer has great insurance.");
        c4.addComment("Took several unnecessary tests.");
        lookup.addClient(c4);

        // Lookup and print some clients
        System.out.println("A Few Recent Clients:");
        for (String ssn : new String[]{"123-45-6789", "987-65-4321", "555-55-5555"}) {
            Client client = lookup.lookUpClient(ssn);
            if (client != null) {
                System.out.println(client.toString(1));
            }
        }
    }
}

