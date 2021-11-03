package io.turntabl;

import java.util.*;
import java.util.stream.Collectors;

public class Register {
    private List<Client> clients;

    public Register(List<Client> clients) {
        this.clients = clients;
    }

    public List<String> contactNamesForGoldClients(){
        return clients.stream()
                .filter(client -> client.getServiceLevel() == ServiceLevel.GOLD)
                .map(Client::getClientContactName)
                .collect(Collectors.toList());
    }

    public Optional<String> getClientNameById(String clientId){
        return clients.stream()
                .filter(clt -> clt.getId().equals(clientId))
                .map(Client::getName)
                .collect(Collectors.toList()).stream().findAny();
    }

    public Map<ServiceLevel, Long> countOfAllClientsAtEveryLevel(){
        Map<ServiceLevel, Long> countOfClients = new HashMap<>();
        for (ServiceLevel level: ServiceLevel.values()){
            countOfClients.put(level,clients.stream().filter(client -> client.getServiceLevel() == level).count());
        }
        return countOfClients;
    }


    @Override
    public String toString() {
        return "Register{" +
                "clients=" + clients +
                '}';
    }
}
