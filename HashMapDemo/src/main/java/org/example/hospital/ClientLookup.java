package org.example.hospital;

import java.util.HashMap;
import java.util.Map;

public class ClientLookup {
    private final Map<String, Client> clientMap;

    public ClientLookup() {
        this.clientMap = new HashMap<>();
    }

    public void addClient(Client client) {
        clientMap.put(client.ssn(), client);
    }

    public Client lookUpClient(String ssn) {
        return clientMap.get(ssn);
    }
}
